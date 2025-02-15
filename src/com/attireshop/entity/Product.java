package com.attireshop.entity;

import java.io.Serial;
import java.io.Serializable;
import java.util.Objects;

public class Product implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L; // Added for serialization

    private int id;
    private String brand;
    private double price;
    private String category;

    public Product(int id, String brand, double price, String category) {
        this.id = id;
        this.brand = brand;
        this.price = price;
        this.category = category;
    }

    public Product(String brand, double price, String category) {
        this.brand = brand;
        this.price = price;
        this.category = category;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Product product)) return false;  // Fixed issue
        return id == product.id &&
                Double.compare(price, product.price) == 0 &&
                Objects.equals(brand, product.brand) &&
                Objects.equals(category, product.category);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, brand, price, category);
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", brand='" + brand + '\'' +
                ", price=" + price +
                ", category='" + category + '\'' +
                '}';
    }
}
