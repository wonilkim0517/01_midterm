package com.management.product.view;

import com.common.SearchCondition;
import com.management.product.model.dto.ProductDTO;

import java.util.List;

public class ProductPrint {

    public void printAllProductList(List<ProductDTO> allProductList) {
        System.out.println("===== 전체 제품 목록 =====");
        for(ProductDTO product : allProductList) {
            System.out.println(product);
        }
        System.out.println("========================");
    }

    public void printProductList(List<ProductDTO> productList, SearchCondition searchCondition) {
        System.out.println("===== 검색 조건에 따른 제품 목록 =====");
        System.out.println("검색 조건: " + searchCondition);
        for(ProductDTO product : productList) {
            System.out.println(product);
        }
        System.out.println("===================================");
    }

    public void printSuccessMessage(String successCode) {
        System.out.println("===== 성공 메시지 =====");
        System.out.println(successCode);
        System.out.println("======================");
    }

    public void printErrorMessage(String errorCode) {
        System.out.println("===== 에러 메시지 =====");
        System.out.println(errorCode);
        System.out.println("======================");
    }
}