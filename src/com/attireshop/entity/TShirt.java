package com.attireshop.entity;

import java.io.Serializable;
import java.util.Objects;

/**
 * Represents a T-Shirt entity with attributes such as name, brand, size, and other details.
 * Implements encapsulation by keeping fields private and providing public getters and setters.
 */
public class TShirt implements Serializable {

    // Private fields to ensure encapsulation
    private String t_shirtID;
    private String name;
    private String brand;
    private String description;
    private String category;
    private String size;         // e.g., S, M, L, XL
    private String fit;          // e.g., Slim, Regular
    private String material;     // e.g., Cotton, Polyester
    private String pattern;      // e.g., Plain, Striped
    private String color;
    private double price;
    private double discount;     // Discount as a percentage
    private int stockQuantity;   // Available quantity in stock

    // Default constructor
    public TShirt() {
        super();
    }

    /**
     * Parameterized constructor to initialize TShirt fields.
     *
     * @param t_shirtID      Unique identifier for the TShirt.
     * @param name           Name of the TShirt.
     * @param brand          Brand of the TShirt.
     * @param description    Short description of the TShirt.
     * @param category       Category (e.g., Casual, Sports).
     * @param size           Size of the TShirt.
     * @param fit            Fit of the TShirt.
     * @param material       Material used in the TShirt.
     * @param pattern        Design pattern of the TShirt.
     * @param color          Color of the TShirt.
     * @param price          Price of the TShirt.
     * @param discount       Discount on the TShirt.
     * @param stockQuantity  Available quantity in stock.
     */
    public TShirt(String t_shirtID, String name, String brand, String description, String category, String size, String fit, String material, String pattern, String color, double price, double discount, int stockQuantity) {
        this.t_shirtID = t_shirtID; // Updated field
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

    // Getters and setters for encapsulation

    public String getTShirtID() { // Updated getter method
        return t_shirtID;
    }

    public void setTShirtID(String t_shirtID) { // Updated setter method
        this.t_shirtID = t_shirtID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getFit() {
        return fit;
    }

    public void setFit(String fit) {
        this.fit = fit;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getPattern() {
        return pattern;
    }

    public void setPattern(String pattern) {
        this.pattern = pattern;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price >= 0) { // Validation to ensure non-negative price
            this.price = price;
        } else {
            System.err.println("Price cannot be negative.");
        }
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        if (discount >= 0 && discount <= 100) { // Validation for valid discount percentage
            this.discount = discount;
        } else {
            System.err.println("Discount must be between 0 and 100.");
        }
    }

    public int getStockQuantity() {
        return stockQuantity;
    }

    public void setStockQuantity(int stockQuantity) {
        if (stockQuantity >= 0) { // Validation to ensure non-negative stock
            this.stockQuantity = stockQuantity;
        } else {
            System.err.println("Stock quantity cannot be negative.");
        }
    }

    // Utility methods

    /**
     * Calculates the final price after applying the discount.
     *
     * @return Final price after discount.
     */
    public double calculateDiscountedPrice() {
        return price - (price * discount / 100);
    }

    /**
     * Provides a string representation of the T-Shirt object.
     *
     * @return String representation.
     */
    @Override
    public String toString() {
        return "TShirt{" +
                "t_shirtID='" + t_shirtID + '\'' + // Updated field
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
                '}';
    }

    @Override
    public boolean equals(Object o) {
        // Check if the passed object is null or if it is not of the same class as the current object.
        if (o == null || getClass() != o.getClass()) return false;

        // Cast the object to a T-Shirt type for comparison.
        TShirt tShirt = (TShirt) o;

        // Compare all relevant fields for equality.
        // Using Double.compare ensures proper comparison of floating-point numbers (price and discount).
        // Objects.equals is used for null-safe comparisons of string and object fields.
        return Double.compare(price, tShirt.price) == 0 &&
                Double.compare(discount, tShirt.discount) == 0 &&
                stockQuantity == tShirt.stockQuantity &&
                Objects.equals(t_shirtID, tShirt.t_shirtID) &&
                Objects.equals(name, tShirt.name) &&
                Objects.equals(brand, tShirt.brand) &&
                Objects.equals(description, tShirt.description) &&
                Objects.equals(category, tShirt.category) &&
                Objects.equals(size, tShirt.size) &&
                Objects.equals(fit, tShirt.fit) &&
                Objects.equals(material, tShirt.material) &&
                Objects.equals(pattern, tShirt.pattern) &&
                Objects.equals(color, tShirt.color);
    }

    @Override
    public int hashCode() {
        // Generate a hash code for the T-Shirt object based on all its fields.
        // The Objects.hash method creates a composite hash code using the provided fields.
        // This ensures that two T-Shirt objects with the same data produce the same hash code.
        return Objects.hash(
                t_shirtID, name, brand, description, category, size, fit, material, pattern, color, price, discount, stockQuantity
        );
    }

}
