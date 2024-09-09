package com.management.product.model.service;

import com.common.SearchCondition;
import com.management.product.model.dto.ProductDTO;

import java.util.List;
import java.util.Map;

public class ProductService {

    // * 주석을 지우고 Service 역할에 해당하는 메소드를 작성하세요.

    // 1. 자주 사용할 DAO 객체를 선언하세요.

    public List<ProductDTO> selectAllProductList() {

        // 2. 전체 제품 목록을 조회하는 로직을 작성하세요.
        // 　　아래 작성된 return null은 과제 툴 오류를 제거하고자 임의 작성하였으니 지우고 로직을 작성하세요.
        return null;

    }

    public List<ProductDTO> selectProductByCondition(SearchCondition searchCondition) {

        // 3. 조건에 따른 제품 목록을 조회하는 로직을 작성하세요.
        // 　　아래 작성된 return null은 과제 툴 오류를 제거하고자 임의 작성하였으니 지우고 로직을 작성하세요.
        //    아래 조건을 확인하여 기본 또는 가산점 항목 중 한 가지 조건으로 작성하세요.
        //
        //    <기본> 조건에 따라 호출하는 dao의 매핑 쿼리를 각각 생성하여 작성
        //      ㄴ 제품명으로 조회 시, 쿼리 id가 selectProductByName인 쿼리 호출
        //      ㄴ 이달의 신제품 조회 시, 쿼리 id가 selectNewProduct인 쿼리 호출
        //      ㄴ 생산 중단 제품 조회 시, 쿼리 id가 selectProductByNotSale인 쿼리 호출
        //
        //    <가산점-dynamic query>
        //      ㄴ 조건에 따라 호출하는 dao의 매핑 쿼리를 id가 selectProductByCondition인 것으로 하나만 생성하여 동적 쿼리로 작성
        return null;

    }

    public boolean registNewProduct(ProductDTO product) {

        // 4. 제품 정보를 등록하는 로직을 작성하세요.
        // 　　아래 작성된 return false 과제 툴 오류를 제거하고자 임의 작성하였으니 지우고 로직을 작성하세요.
        return false;

    }

    public boolean modifyProductInfo(ProductDTO product) {

        // 5. 제품 정보를 수정하는 로직을 작성하세요.
        // 　　아래 작성된 return false 과제 툴 오류를 제거하고자 임의 작성하였으니 지우고 로직을 작성하세요.
        return false;

    }

    public boolean deleteProduct(Map<String, String> parameter) {

        // 6. 제품 정보를 삭제하는 로직을 작성하세요.
        // 　　아래 작성된 return false 과제 툴 오류를 제거하고자 임의 작성하였으니 지우고 로직을 작성하세요.
        return false;

    }
}
