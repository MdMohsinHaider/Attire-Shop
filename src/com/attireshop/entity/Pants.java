package com.attireshop.entity;

import java.io.Serializable;
import java.util.Objects;

/**
 * Represents a Pants entity with various attributes.
 * This class uses encapsulation principles to ensure data security and controlled access.
 */

public class Pants implements Serializable {

    private String pantID;           // Unique identifier for the pants
    private String name;             // Name of the pants
    private String brand;            // Brand of the pants
    private String description;      // Description of the pants
    private String category;         // Category (e.g., Casual, Formal)
    private String size;             // Size of the pants
    private double waist;            // Waist measurement
    private double length;           // Inseam length
    private String fit;              // Fit type (e.g., Slim, Regular)
    private String material;         // Material or fabric
    private String pattern;          // Pattern (e.g., Solid, Striped)
    private String color;            // Color of the pants
    private double price;            // Price of the pants
    private double discount;         // Discount applied to the pants
    private int stockQuantity;       // Available stock quantity
    private String gender;           // Target gender (e.g., Men, Women, Unisex)
    private String season;           // Suitable season (e.g., Summer, Winter)
    private String styleCode;        // Unique style code
    private int pocketCount;         // Number of pockets
    private String closureType;      // Closure type (e.g., Zipper, Button)
    private boolean beltLoops;       // Indicates if the pants have belt loops
    private String careInstructions; // Care instructions



    /**
     * Default constructor.
     */
    public Pants() {
        super();
    }


    /**
     * Parameterized constructor to initialize a Pants object with all attributes.
     */
    public Pants(String pantID, String name, String brand, String description, String category, String size, double waist, double length, String fit, String material, String pattern, String color, double price, double discount, int stockQuantity, String gender, String season, String styleCode, int pocketCount, String closureType, boolean beltLoops, String careInstructions) {
        this.pantID = pantID;
        this.name = name;
        this.brand = brand;
        this.description = description;
        this.category = category;
        this.size = size;
        this.waist = waist;
        this.length = length;
        this.fit = fit;
        this.material = material;
        this.pattern = pattern;
        this.color = color;
        this.price = price;
        this.discount = discount;
        this.stockQuantity = stockQuantity;
        this.gender = gender;
        this.season = season;
        this.styleCode = styleCode;
        this.pocketCount = pocketCount;
        this.closureType = closureType;
        this.beltLoops = beltLoops;
        this.careInstructions = careInstructions;
    }

    // Getter for the pantID property.
// This method returns the unique identifier for a Pant object.
    public String getPantID() {
        return pantID;
    }

    // Setter for the pantID property.
// This method sets the unique identifier for the Pant object.
// The pantID is used to differentiate between different Pant objects.
    public void setPantID(String pantID) {
        this.pantID = pantID;
    }

    // Getter for the name property.
// This method returns the name of the pant (e.g., "Slim Fit Jeans").
    public String getName() {
        return name;
    }

    // Setter for the name property.
// This method sets the name of the pant, which could be the product name or a descriptive title.
    public void setName(String name) {
        this.name = name;
    }

    // Getter for the brand property.
// This method returns the brand name of the pant (e.g., "Levi's").
    public String getBrand() {
        return brand;
    }

    // Setter for the brand property.
// This method sets the brand of the pant, which indicates the manufacturer or brand name.
    public void setBrand(String brand) {
        this.brand = brand;
    }

    // Getter for the description property.
// This method returns a detailed description of the pant, such as features or fabric type.
    public String getDescription() {
        return description;
    }

    // Setter for the description property.
// This method sets the description of the pant to provide more information about the product.
    public void setDescription(String description) {
        this.description = description;
    }

    // Getter for the category property.
// This method returns the category to which the pant belongs (e.g., "Casual", "Formal").
    public String getCategory() {
        return category;
    }

    // Setter for the category property.
// This method sets the category of the pant, classifying it into a specific group.
    public void setCategory(String category) {
        this.category = category;
    }

    // Getter for the size property.
// This method returns the size of the pant (e.g., "32", "L").
    public String getSize() {
        return size;
    }

    // Setter for the size property.
// This method sets the size of the pant, which is important for selecting the right fit.
    public void setSize(String size) {
        this.size = size;
    }

    // Getter for the waist property.
// This method returns the waist measurement of the pant, typically in inches.
    public double getWaist() {
        return waist;
    }

    // Setter for the waist property.
// This method sets the waist size of the pant, which affects the fit and comfort.
    public void setWaist(double waist) {
        this.waist = waist;
    }

    // Getter for the length property.
// This method returns the length measurement of the pant, typically in inches.
    public double getLength() {
        return length;
    }

    // Setter for the length property.
// This method sets the length of the pant, which impacts the overall length of the pants.
    public void setLength(double length) {
        this.length = length;
    }

    // Getter for the fit property.
// This method returns the fit type of the pant (e.g., "Slim", "Regular").
    public String getFit() {
        return fit;
    }

    // Setter for the fit property.
// This method sets the fit type of the pant, which indicates how the pant conforms to the body.
    public void setFit(String fit) {
        this.fit = fit;
    }

    // Getter for the material property.
// This method returns the material type of the pant (e.g., "Cotton", "Denim").
    public String getMaterial() {
        return material;
    }

    // Setter for the material property.
// This method sets the material of the pant, which affects its feel and durability.
    public void setMaterial(String material) {
        this.material = material;
    }

    // Getter for the pattern property.
// This method returns the pattern or design of the pant (e.g., "Solid", "Striped").
    public String getPattern() {
        return pattern;
    }

    // Setter for the pattern property.
// This method sets the pattern type of the pant, which is related to its visual appearance.
    public void setPattern(String pattern) {
        this.pattern = pattern;
    }

    // Getter for the color property.
// This method returns the color of the pant (e.g., "Blue", "Black").
    public String getColor() {
        return color;
    }

    // Setter for the color property.
// This method sets the color of the pant, which is a basic visual attribute of the product.
    public void setColor(String color) {
        this.color = color;
    }

    // Getter for the price property.
// This method returns the price of the pant.
    public double getPrice() {
        return price;
    }

    // Setter for the price property.
// This method sets the price of the pant, which is important for sales and inventory management.
    public void setPrice(double price) {
        this.price = price;
    }

    // Getter for the discount property.
// This method returns the discount on the pant as a percentage or a fixed amount.
    public double getDiscount() {
        return discount;
    }

    // Setter for the discount property.
// This method sets the discount value for the pant, which is used for pricing calculations.
    public void setDiscount(double discount) {
        this.discount = discount;
    }

    // Getter for the stockQuantity property.
// This method returns the quantity of the pant available in stock.
    public int getStockQuantity() {
        return stockQuantity;
    }

    // Setter for the stockQuantity property.
// This method sets the stock quantity, which is essential for inventory tracking.
    public void setStockQuantity(int stockQuantity) {
        this.stockQuantity = stockQuantity;
    }

    // Getter for the gender property.
// This method returns the target gender for the pant (e.g., "Men", "Women").
    public String getGender() {
        return gender;
    }

    // Setter for the gender property.
// This method sets the target gender for the pant, specifying the intended audience.
    public void setGender(String gender) {
        this.gender = gender;
    }

    // Getter for the season property.
// This method returns the season suitable for wearing the pant (e.g., "Summer", "Winter").
    public String getSeason() {
        return season;
    }

    // Setter for the season property.
// This method sets the season for which the pant is designed or recommended.
    public void setSeason(String season) {
        this.season = season;
    }

    // Getter for the styleCode property.
// This method returns the unique style code for the pant, which is useful for product tracking.
    public String getStyleCode() {
        return styleCode;
    }

    // Setter for the styleCode property.
// This method sets the style code, which can be used for inventory and cataloging.
    public void setStyleCode(String styleCode) {
        this.styleCode = styleCode;
    }

    // Getter for the pocketCount property.
// This method returns the number of pockets the pant has.
    public int getPocketCount() {
        return pocketCount;
    }

    // Setter for the pocketCount property.
// This method sets the number of pockets on the pant, which can be a design feature.
    public void setPocketCount(int pocketCount) {
        this.pocketCount = pocketCount;
    }

    // Getter for the closureType property.
// This method returns the type of closure used for the pant (e.g., "Button", "Zipper").
    public String getClosureType() {
        return closureType;
    }

    // Setter for the closureType property.
// This method sets the closure type for the pant, which is essential for fastening.
    public void setClosureType(String closureType) {
        this.closureType = closureType;
    }

    // Getter for the beltLoops property.
// This method returns whether the pant has belt loops or not.
    public boolean isBeltLoops() {
        return beltLoops;
    }

    // Setter for the beltLoops property.
// This method sets whether the pant has belt loops, which is a feature for wearing a belt.
    public void setBeltLoops(boolean beltLoops) {
        this.beltLoops = beltLoops;
    }

    // Getter for the careInstructions property.
// This method returns the care instructions for the pant (e.g., "Machine wash cold").
    public String getCareInstructions() {
        return careInstructions;
    }

    // Setter for the careInstructions property.
// This method sets the care instructions for the pant, ensuring proper maintenance.
    public void setCareInstructions(String careInstructions) {
        this.careInstructions = careInstructions;
    }

    // Overrides the equals method to compare two Pants objects for equality.
// This method checks if two Pant objects are equal based on their properties.
    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false; // Check for null or different class type.
        Pants pants = (Pants) o; // Cast to Pants for comparison.
        return Double.compare(waist, pants.waist) == 0 &&
                Double.compare(length, pants.length) == 0 &&
                Double.compare(price, pants.price) == 0 &&
                Double.compare(discount, pants.discount) == 0 &&
                stockQuantity == pants.stockQuantity &&
                pocketCount == pants.pocketCount &&
                beltLoops == pants.beltLoops &&
                Objects.equals(pantID, pants.pantID) &&
                Objects.equals(name, pants.name) &&
                Objects.equals(brand, pants.brand) &&
                Objects.equals(description, pants.description) &&
                Objects.equals(category, pants.category) &&
                Objects.equals(size, pants.size) &&
                Objects.equals(fit, pants.fit) &&
                Objects.equals(material, pants.material) &&
                Objects.equals(pattern, pants.pattern) &&
                Objects.equals(color, pants.color) &&
                Objects.equals(gender, pants.gender) &&
                Objects.equals(season, pants.season) &&
                Objects.equals(styleCode, pants.styleCode) &&
                Objects.equals(closureType, pants.closureType) &&
                Objects.equals(careInstructions, pants.careInstructions); // Check all fields for equality.
    }

    // Overrides the hashCode method to return a hash code for the Pants object.
// This method returns a hash code that is consistent with the equals method, ensuring that equal objects have the same hash code.
    @Override
    public int hashCode() {
        return Objects.hash(pantID, name, brand, description, category, size, waist, length, fit, material, pattern, color, price, discount, stockQuantity, gender, season, styleCode, pocketCount, closureType, beltLoops, careInstructions);
    }

    // Overrides the toString method to provide a string representation of the Pants object.
// This method returns a detailed string that includes all the properties of the pant.
    @Override
    public String toString() {
        return "Pants{" +
                "pantID='" + pantID + '\'' +
                ", name='" + name + '\'' +
                ", brand='" + brand + '\'' +
                ", description='" + description + '\'' +
                ", category='" + category + '\'' +
                ", size='" + size + '\'' +
                ", waist=" + waist +
                ", length=" + length +
                ", fit='" + fit + '\'' +
                ", material='" + material + '\'' +
                ", pattern='" + pattern + '\'' +
                ", color='" + color + '\'' +
                ", price=" + price +
                ", discount=" + discount +
                ", stockQuantity=" + stockQuantity +
                ", gender='" + gender + '\'' +
                ", season='" + season + '\'' +
                ", styleCode='" + styleCode + '\'' +
                ", pocketCount=" + pocketCount +
                ", closureType='" + closureType + '\'' +
                ", beltLoops=" + beltLoops +
                ", careInstructions='" + careInstructions + '\'' +
                '}';
    }
}
