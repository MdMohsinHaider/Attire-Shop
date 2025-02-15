package com.attireshop.entity;

import java.io.Serial;
import java.io.Serializable;
import java.util.Objects;

public class Shirt extends Product implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;  // Added for serialization
    private int size;
    private String color;

    public Shirt(int id, String brand, double price, String category, int size, String color) {
        super(id, brand, price, category);
        this.size = size;
        this.color = color;
    }

    public Shirt(String brand, double price, String category, int size, String color) {
        super(brand, price, category);
        this.size = size;
        this.color = color;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Shirt shirt)) return false; // Fixed issue
        if (!super.equals(o)) return false;
        return size == shirt.size && Objects.equals(color, shirt.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), size, color);
    }

    @Override
    public String toString() {
        return super.toString() + ", Shirt{" +
                "size=" + size +
                ", color='" + color + '\'' +
                '}';
    }
}
