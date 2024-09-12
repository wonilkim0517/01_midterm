package com.management.product.model.service;

import com.common.SearchCondition;
import com.common.Template;
import com.management.product.model.dao.ProductDAO;
import com.management.product.model.dto.ProductDTO;
import org.apache.ibatis.session.SqlSession;

import java.io.IOException;
import java.util.List;
import java.util.Map;

public class ProductService {

    private ProductDAO productDAO;

    public List<ProductDTO> selectAllProductList() throws IOException {
        SqlSession sqlSession = Template.getSqlSession();
        productDAO = sqlSession.getMapper(ProductDAO.class);

        List<ProductDTO> productList = productDAO.selectAllProductList();

        sqlSession.close();

        return productList;
    }

    public List<ProductDTO> selectProductByCondition(SearchCondition searchCondition) throws IOException {
        SqlSession sqlSession = Template.getSqlSession();
        productDAO = sqlSession.getMapper(ProductDAO.class);

        List<ProductDTO> productList = productDAO.selectProductByCondition(searchCondition);

        sqlSession.close();

        return productList;
    }

    public boolean registNewProduct(ProductDTO product) throws IOException {
        SqlSession sqlSession = Template.getSqlSession();
        productDAO = sqlSession.getMapper(ProductDAO.class);

        int result = productDAO.insertProduct(product);

        if(result > 0) {
            sqlSession.commit();
        } else {
            sqlSession.rollback();
        }

        sqlSession.close();

        return result > 0;
    }

    public boolean modifyProductInfo(ProductDTO product) throws IOException {
        SqlSession sqlSession = Template.getSqlSession();
        productDAO = sqlSession.getMapper(ProductDAO.class);

        int result = productDAO.updateProduct(product);

        if(result > 0) {
            sqlSession.commit();
        } else {
            sqlSession.rollback();
        }

        sqlSession.close();

        return result > 0;
    }

    public boolean deleteProduct(Map<String, String> parameter) throws IOException {
        SqlSession sqlSession = Template.getSqlSession();
        productDAO = sqlSession.getMapper(ProductDAO.class);

        int result = productDAO.deleteProduct(parameter);

        if(result > 0) {
            sqlSession.commit();
        } else {
            sqlSession.rollback();
        }

        sqlSession.close();

        return result > 0;
    }
}