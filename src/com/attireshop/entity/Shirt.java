package com.attireshop.entity;

import java.io.Serializable;
import java.util.Objects;

/**
 * Represents a Shirt entity with details such as name, brand, size, and other attributes.
 * This class is used to encapsulate all the details about a shirt and provides getter, setter,
 * and utility methods for manipulation and comparison.
 */
public class Shirt implements Serializable {

    // Unique identifier for the shirt.
    private String shirtID;

    // Name of the shirt (e.g., product name).
    private String name;

    // Brand of the shirt.
    private String brand;

    // Description of the shirt (e.g., features, highlights).
    private String description;

    // Category of the shirt (e.g., Casual, Formal, Party wear).
    private String category;

    // Size of the shirt (e.g., Small, Medium, Large).
    private String size;

    // Fit of the shirt (e.g., Slim fit, Regular fit).
    private String fit;

    // Material used for the shirt (e.g., Cotton, Polyester).
    private String material;

    // Pattern on the shirt (e.g., Plain, Striped, Checked).
    private String pattern;

    // Color of the shirt.
    private String color;

    // Price of the shirt.
    private double price;

    // Discount on the shirt in percentage.
    private double discount;

    // Quantity of the shirt available in stock.
    private int stockQuantity;

    /**
     * Default constructor.
     * Creates an instance of Shirt with default values.
     */
    public Shirt() {
        super();
    }

    /**
     * Parameterized constructor.
     * Initializes the Shirt instance with specific values.
     *
     * @param shirtID       Unique ID for the shirt.
     * @param name          Name of the shirt.
     * @param brand         Brand of the shirt.
     * @param description   Description of the shirt.
     * @param category      Category of the shirt.
     * @param size          Size of the shirt.
     * @param fit           Fit of the shirt.
     * @param material      Material of the shirt.
     * @param pattern       Pattern of the shirt.
     * @param color         Color of the shirt.
     * @param price         Price of the shirt.
     * @param discount      Discount on the shirt.
     * @param stockQuantity Quantity in stock.
     */
    public Shirt(String shirtID, String name, String brand, String description, String category, String size, String fit, String material, String pattern, String color, double price, double discount, int stockQuantity) {
        this.shirtID = shirtID;
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

    // Getters and Setters for each field.
    // These allow controlled access and modification of the private fields.

    public String getShirtID() {
        return shirtID;
    }

    public void setShirtID(String shirtID) {
        this.shirtID = shirtID;
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
        this.price = price;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public int getStockQuantity() {
        return stockQuantity;
    }

    public void setStockQuantity(int stockQuantity) {
        this.stockQuantity = stockQuantity;
    }

    /**
     * Checks if two Shirt objects are equal by comparing all attributes.
     *
     * @param o Object to compare with the current Shirt instance.
     * @return true if the objects are equal; false otherwise.
     */
    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Shirt shirt = (Shirt) o;
        return Double.compare(price, shirt.price) == 0 &&
                Double.compare(discount, shirt.discount) == 0 &&
                stockQuantity == shirt.stockQuantity &&
                Objects.equals(shirtID, shirt.shirtID) &&
                Objects.equals(name, shirt.name) &&
                Objects.equals(brand, shirt.brand) &&
                Objects.equals(description, shirt.description) &&
                Objects.equals(category, shirt.category) &&
                Objects.equals(size, shirt.size) &&
                Objects.equals(fit, shirt.fit) &&
                Objects.equals(material, shirt.material) &&
                Objects.equals(pattern, shirt.pattern) &&
                Objects.equals(color, shirt.color);
    }

    /**
     * Generates a hash code for the Shirt object based on its attributes.
     *
     * @return Hash code as an integer.
     */
    @Override
    public int hashCode() {
        return Objects.hash(shirtID, name, brand, description, category, size, fit, material, pattern, color, price, discount, stockQuantity);
    }

    /**
     * Provides a string representation of the Shirt object.
     *
     * @return String representation of the Shirt object.
     */
    @Override
    public String toString() {
        return "Shirt{" +
                "shirtID='" + shirtID + '\'' +
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
}

