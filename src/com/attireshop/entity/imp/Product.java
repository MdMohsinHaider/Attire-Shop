package com.attireshop.entity.imp;

import com.attireshop.entity.Products;

import java.io.Serializable;
import java.util.Objects;

public class Product implements Serializable, Products {

    // Common attributes
    private String productID;          // Unique identifier for the product
    private String name;               // Name of the product
    private String brand;              // Brand of the product
    private String description;        // Description of the product
    private String category;           // Category (e.g., Casual, Formal)
    private String size;               // Size of the product (e.g., S, M, L)
    private String fit;                // Fit type (e.g., Slim, Regular)
    private String material;           // Material or fabric
    private String pattern;            // Pattern (e.g., Solid, Striped)
    private String color;              // Color of the product
    private double price;              // Price of the product
    private double discount;           // Discount on the product
    private int stockQuantity;         // Available stock quantity

    // Specific to pants
    private double waist;              // Waist measurement
    private double length;             // Inseam length
    private int pocketCount;           // Number of pockets
    private String closureType;        // Closure type (e.g., Zipper, Button)
    private boolean beltLoops;         // Indicates if the pants have belt loops

    // Common to specific categories
    private String gender;             // Target gender (e.g., Men, Women, Unisex)
    private String season;             // Suitable season (e.g., Summer, Winter)
    private String styleCode;          // Unique style code
    private String careInstructions;   // Care instructions


    // Constructor
    public Product(String productID, String name, String brand, String description, String category,
                   String size, String fit, String material, String pattern, String color,
                   double price, double discount, int stockQuantity, double waist, double length,
                   int pocketCount, String closureType, boolean beltLoops, String gender,
                   String season, String styleCode, String careInstructions) {
        this.productID = productID;
        this.name = name;
        this.brand = brand;
        this.description = description;
        this.category = category;
        this.size = size;
        this.fit = fit;
        this.material = material;
        this.pattern = pattern;
        this.color = color;
        this.price = price;
        this.discount = discount;
        this.stockQuantity = stockQuantity;
        this.waist = waist;
        this.length = length;
        this.pocketCount = pocketCount;
        this.closureType = closureType;
        this.beltLoops = beltLoops;
        this.gender = gender;
        this.season = season;
        this.styleCode = styleCode;
        this.careInstructions = careInstructions;
    }

    // Overloaded constructor for products without specific attributes
    public Product(String productID, String name, String brand, String description, String category,
                   String size, String fit, String material, String pattern, String color,
                   double price, double discount, int stockQuantity) {
        this.productID = productID;
        this.name = name;
        this.brand = brand;
        this.description = description;
        this.category = category;
        this.size = size;
        this.fit = fit;
        this.material = material;
        this.pattern = pattern;
        this.color = color;
        this.price = price;
        this.discount = discount;
        this.stockQuantity = stockQuantity;
    }



    @Override
    public String getProductID() {
        return "";
    }

    @Override
    public String getName() {
        return "";
    }

    @Override
    public String getBrand() {
        return "";
    }

    @Override
    public String getDescription() {
        return "";
    }

    @Override
    public String getCategory() {
        return "";
    }

    @Override
    public String getSize() {
        return "";
    }

    @Override
    public String getFit() {
        return "";
    }

    @Override
    public String getMaterial() {
        return "";
    }

    @Override
    public String getPattern() {
        return "";
    }

    @Override
    public String getColor() {
        return "";
    }

    @Override
    public double getPrice() {
        return 0;
    }

    @Override
    public double getDiscount() {
        return 0;
    }

    @Override
    public int getStockQuantity() {
        return 0;
    }

    @Override
    public String getGender() {
        return "";
    }

    @Override
    public String getSeason() {
        return "";
    }

    @Override
    public String getStyleCode() {
        return "";
    }

    @Override
    public String getCareInstructions() {
        return "";
    }

    @Override
    public void setProductID(String productID) {

    }

    @Override
    public void setName(String name) {

    }

    @Override
    public void setBrand(String brand) {

    }

    @Override
    public void setDescription(String description) {

    }

    @Override
    public void setCategory(String category) {

    }

    @Override
    public void setSize(String size) {

    }

    @Override
    public void setFit(String fit) {

    }

    @Override
    public void setMaterial(String material) {

    }

    @Override
    public void setPattern(String pattern) {

    }

    @Override
    public void setColor(String color) {

    }

    @Override
    public void setPrice(double price) {

    }

    @Override
    public void setDiscount(double discount) {

    }

    @Override
    public void setStockQuantity(int stockQuantity) {

    }

    @Override
    public void setGender(String gender) {

    }

    @Override
    public void setSeason(String season) {

    }

    @Override
    public void setStyleCode(String styleCode) {

    }

    @Override
    public void setCareInstructions(String careInstructions) {

    }

    @Override
    public double getWaist() {
        return 0;
    }

    @Override
    public double getLength() {
        return 0;
    }

    @Override
    public int getPocketCount() {
        return 0;
    }

    @Override
    public String getClosureType() {
        return "";
    }

    @Override
    public boolean hasBeltLoops() {
        return false;
    }

    @Override
    public void setWaist(double waist) {

    }

    @Override
    public void setLength(double length) {

    }

    @Override
    public void setPocketCount(int pocketCount) {

    }

    @Override
    public void setClosureType(String closureType) {

    }

    @Override
    public void setBeltLoops(boolean beltLoops) {

    }

    @Override
    public double calculateFinalPrice() {
        return 0;
    }

    @Override
    public boolean isInStock() {
        return false;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Double.compare(price, product.price) == 0 && Double.compare(discount, product.discount) == 0 && stockQuantity == product.stockQuantity && Double.compare(waist, product.waist) == 0 && Double.compare(length, product.length) == 0 && pocketCount == product.pocketCount && beltLoops == product.beltLoops && Objects.equals(productID, product.productID) && Objects.equals(name, product.name) && Objects.equals(brand, product.brand) && Objects.equals(description, product.description) && Objects.equals(category, product.category) && Objects.equals(size, product.size) && Objects.equals(fit, product.fit) && Objects.equals(material, product.material) && Objects.equals(pattern, product.pattern) && Objects.equals(color, product.color) && Objects.equals(closureType, product.closureType) && Objects.equals(gender, product.gender) && Objects.equals(season, product.season) && Objects.equals(styleCode, product.styleCode) && Objects.equals(careInstructions, product.careInstructions);
    }

    @Override
    public int hashCode() {
        return Objects.hash(productID, name, brand, description, category, size, fit, material, pattern, color, price, discount, stockQuantity, waist, length, pocketCount, closureType, beltLoops, gender, season, styleCode, careInstructions);
    }

    @Override
    public String toString() {
        return "Product{" +
                "productID='" + productID + '\'' +
                ", name='" + name + '\'' +
                ", brand='" + brand + '\'' +
                ", description='" + description + '\'' +
                ", category='" + category + '\'' +
                ", size='" + size + '\'' +
                ", fit='" + fit + '\'' +
                ", material='" + material + '\'' +
                ", pattern='" + pattern + '\'' +
                ", color='" + color + '\'' +
                ", price=" + price +
                ", discount=" + discount +
                ", stockQuantity=" + stockQuantity +
                ", waist=" + waist +
                ", length=" + length +
                ", pocketCount=" + pocketCount +
                ", closureType='" + closureType + '\'' +
                ", beltLoops=" + beltLoops +
                ", gender='" + gender + '\'' +
                ", season='" + season + '\'' +
                ", styleCode='" + styleCode + '\'' +
                ", careInstructions='" + careInstructions + '\'' +
                '}';
    }
}
