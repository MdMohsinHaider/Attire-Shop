package com.attireshop.dao.imp;

import com.attireshop.dao.ProductsDao;
import com.attireshop.entity.Products;
import com.attireshop.entity.imp.Product;

import java.util.List;

public class ProductDao implements ProductsDao {

    @Override
    public boolean addProduct(Products product) {
        return false;
    }

    @Override
    public boolean updateProduct(Products product) {
        return false;
    }

    @Override
    public boolean deleteProduct(String productId) {
        return false;
    }

    @Override
    public Product getProductById(String productId) {
        return null;
    }

    @Override
    public List<Product> getAllProducts() {
        return List.of();
    }

    @Override
    public List<Products> getProductsByCategory(String category) {
        return List.of();
    }

    @Override
    public List<Products> getProductsByPriceRange(double minPrice, double maxPrice) {
        return List.of();
    }

    @Override
    public boolean isProductInStock(String productId) {
        return false;
    }

    @Override
    public List<Product> getProductsByDiscount(double discount) {
        return List.of();
    }

    @Override
    public List<Products> getProductsByBrand(String brand) {
        return List.of();
    }

    @Override
    public List<Products> getProductsByFilters(String category, double minPrice, double maxPrice, String brand) {
        return List.of();
    }

    @Override
    public int countTotalProducts() {
        return 0;
    }

    @Override
    public List<Products> getProductsBySeason(String season) {
        return List.of();
    }
}
