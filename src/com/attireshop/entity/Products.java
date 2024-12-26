package com.attireshop.entity;

public interface Products {
    // Getters
    String getProductID();
    String getName();
    String getBrand();
    String getDescription();
    String getCategory();
    String getSize();
    String getFit();
    String getMaterial();
    String getPattern();
    String getColor();
    double getPrice();
    double getDiscount();
    int getStockQuantity();
    String getGender();
    String getSeason();
    String getStyleCode();
    String getCareInstructions();

    // Setters
    void setProductID(String productID);
    void setName(String name);
    void setBrand(String brand);
    void setDescription(String description);
    void setCategory(String category);
    void setSize(String size);
    void setFit(String fit);
    void setMaterial(String material);
    void setPattern(String pattern);
    void setColor(String color);
    void setPrice(double price);
    void setDiscount(double discount);
    void setStockQuantity(int stockQuantity);
    void setGender(String gender);
    void setSeason(String season);
    void setStyleCode(String styleCode);
    void setCareInstructions(String careInstructions);

    // Specific to pants
    double getWaist();
    double getLength();
    int getPocketCount();
    String getClosureType();
    boolean hasBeltLoops();

    void setWaist(double waist);
    void setLength(double length);
    void setPocketCount(int pocketCount);
    void setClosureType(String closureType);
    void setBeltLoops(boolean beltLoops);

    // Utility Methods
    double calculateFinalPrice(); // Calculate price after discount
    boolean isInStock();          // Check if the product is in stock

}
