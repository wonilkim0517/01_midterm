package com.management.product.controller;

import com.common.SearchCondition;
import com.management.product.model.dto.ProductDTO;
import com.management.product.model.service.ProductService;
import com.management.product.view.ProductPrint;

import java.io.IOException;
import java.util.List;
import java.util.Map;

public class ProductController {

    private final ProductService productService;
    private final ProductPrint productPrint;

    public ProductController() {
        this.productService = new ProductService();
        this.productPrint = new ProductPrint();
    }

    public void selectAllProductList() {
        try {
            List<ProductDTO> productList = productService.selectAllProductList();

            if(productList != null && !productList.isEmpty()) {
                productPrint.printAllProductList(productList);
            } else {
                productPrint.printErrorMessage("조회된 제품 목록이 없습니다.");
            }
        } catch (IOException e) {
            productPrint.printErrorMessage("제품 목록 조회 중 오류가 발생했습니다: " + e.getMessage());
        }
    }

    public void selectProductByCondition(SearchCondition searchCondition) {
        try {
            List<ProductDTO> productList = productService.selectProductByCondition(searchCondition);

            if(productList != null && !productList.isEmpty()) {
                productPrint.printProductList(productList, searchCondition);
            } else {
                productPrint.printErrorMessage("조건에 맞는 제품이 없습니다.");
            }
        } catch (IOException e) {
            productPrint.printErrorMessage("조건부 제품 조회 중 오류가 발생했습니다: " + e.getMessage());
        }
    }

    public void registNewProduct(ProductDTO product) {
        try {
            String releaseDate = product.getReleaseDate().replaceAll("-", "");
            product.setReleaseDate(releaseDate);
            product.setProductionStatus("Y");
            product.setSalesQuantity("0");

            boolean result = productService.registNewProduct(product);

            if(result) {
                productPrint.printSuccessMessage("제품 등록 성공");
            } else {
                productPrint.printErrorMessage("제품 등록 실패");
            }
        } catch (IOException e) {
            productPrint.printErrorMessage("제품 등록 중 오류가 발생했습니다: " + e.getMessage());
        }
    }

    public void modifyProductInfo(ProductDTO product) {
        try {
            String releaseDate = product.getReleaseDate().replaceAll("-", "");
            product.setReleaseDate(releaseDate);

            boolean result = productService.modifyProductInfo(product);

            if(result) {
                productPrint.printSuccessMessage("제품 정보 수정 성공");
            } else {
                productPrint.printErrorMessage("제품 정보 수정 실패");
            }
        } catch (IOException e) {
            productPrint.printErrorMessage("제품 정보 수정 중 오류가 발생했습니다: " + e.getMessage());
        }
    }

    public void deleteProduct(Map<String, String> parameter) {
        try {
            boolean result = productService.deleteProduct(parameter);

            if(result) {
                productPrint.printSuccessMessage("제품 정보 삭제 성공");
            } else {
                productPrint.printErrorMessage("제품 정보 삭제 실패");
            }
        } catch (IOException e) {
            productPrint.printErrorMessage("제품 삭제 중 오류가 발생했습니다: " + e.getMessage());
        }
    }
}