package com.attireshop.dao;

import com.attireshop.entity.Products;
import com.attireshop.entity.imp.Product;

import java.util.List;
/**
 * DAO Interface for Product Entity
 * Provides standard CRUD operations and additional query methods.
 */
public interface ProductsDao {
    /**
     * Inserts a new product into the database.
     * @param product The product to be added.
     * @return True if the operation was successful, false otherwise.
     */
    boolean addProduct(Products product);

    /**
     * Updates an existing product in the database.
     * @param product The product with updated details.
     * @return True if the operation was successful, false otherwise.
     */
    boolean updateProduct(Products product);

    /**
     * Deletes a product from the database based on its ID.
     * @param productId The ID of the product to be deleted.
     * @return True if the operation was successful, false otherwise.
     */
    boolean deleteProduct(String productId);

    /**
     * Fetches a product by its ID.
     * @param productId The ID of the product to fetch.
     * @return The product if found, otherwise null.
     */
    Product getProductById(String productId);

    /**
     * Fetches all products from the database.
     * @return A list of all products.
     */
    List<Product> getAllProducts();

    /**
     * Fetches products by category.
     * @param category The category to filter products.
     * @return A list of products in the specified category.
     */
    List<Products> getProductsByCategory(String category);

    /**
     * Fetches products within a price range.
     * @param minPrice The minimum price.
     * @param maxPrice The maximum price.
     * @return A list of products in the specified price range.
     */
    List<Products> getProductsByPriceRange(double minPrice, double maxPrice);

    /**
     * Checks if a product is in stock.
     * @param productId The ID of the product.
     * @return True if the product is in stock, false otherwise.
     */
    boolean isProductInStock(String productId);

    /**
     * Fetches products with discounts greater than the specified value.
     * @param discount The minimum discount percentage.
     * @return A list of products with a discount greater than the specified value.
     */
    List<Product> getProductsByDiscount(double discount);

    /**
     * Fetches products by brand.
     * @param brand The brand name to filter products.
     * @return A list of products from the specified brand.
     */
    List<Products> getProductsByBrand(String brand);

    /**
     * Fetches products by multiple filters such as category, price range, and brand.
     * @param category The category to filter by.
     * @param minPrice The minimum price.
     * @param maxPrice The maximum price.
     * @param brand The brand name to filter by.
     * @return A list of products matching the specified filters.
     */
    List<Products> getProductsByFilters(String category, double minPrice, double maxPrice, String brand);

    /**
     * Counts the total number of products available.
     * @return The total number of products.
     */
    int countTotalProducts();

    /**
     * Fetches products for a specific season.
     * @param season The season to filter products.
     * @return A list of products suitable for the specified season.
     */
    List<Products> getProductsBySeason(String season);
}
