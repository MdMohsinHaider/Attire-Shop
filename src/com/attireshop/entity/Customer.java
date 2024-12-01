package com.attireshop.entity;

import java.util.Objects;

/**
 * The Customer class represents a customer in the system.
 * It contains customer details such as ID, name, email, phone, address,
 * membership level, and total purchases. This class provides getter
 * and setter methods for all fields, and overrides the equals, hashCode,
 * and toString methods for proper handling of customer objects.
 */
public class Customer {
    // Unique identifier for the customer
    private String customerID;

    // Full name of the customer
    private String name;

    // Email address of the customer
    private String email;

    // Contact the phone number of the customer
    private String phone;

    // Residential address of the customer
    private String address;

    // Membership level of the customer (e.g., Regular, Silver, Gold, Platinum)
    private String membershipLevel;

    // Total monetary value of purchases made by the customer
    private double totalPurchases;

    /**
     * Default constructor for creating an empty Customer object.
     */
    public Customer() {
        super();
    }

    /**
     * Parameterized constructor for creating a Customer object with all details.
     *
     * @param customerID      Unique identifier for the customer
     * @param name            Full name of the customer
     * @param email           Email address of the customer
     * @param phone           Contact the phone number of the customer
     * @param address         Residential address of the customer
     * @param membershipLevel Membership level of the customer
     * @param totalPurchases  Total purchases made by the customer
     */
    public Customer(String customerID, String name, String email, String phone, String address, String membershipLevel, double totalPurchases) {
        this.customerID = customerID;
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.address = address;
        this.membershipLevel = membershipLevel;
        this.totalPurchases = totalPurchases;
    }

    // Getter and setter methods for each field

    public String getCustomerID() {
        return customerID;
    }

    public void setCustomerID(String customerID) {
        this.customerID = customerID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getMembershipLevel() {
        return membershipLevel;
    }

    public void setMembershipLevel(String membershipLevel) {
        this.membershipLevel = membershipLevel;
    }

    public double getTotalPurchases() {
        return totalPurchases;
    }

    public void setTotalPurchases(double totalPurchases) {
        this.totalPurchases = totalPurchases;
    }

    /**
     * Compares this Customer object with another object for equality.
     *
     * @param o The object to compare with
     * @return true if the objects are equal, false otherwise
     */
    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Customer customer = (Customer) o;
        return Double.compare(totalPurchases, customer.totalPurchases) == 0
                && Objects.equals(customerID, customer.customerID)
                && Objects.equals(name, customer.name)
                && Objects.equals(email, customer.email)
                && Objects.equals(phone, customer.phone)
                && Objects.equals(address, customer.address)
                && Objects.equals(membershipLevel, customer.membershipLevel);
    }

    /**
     * Generates a hash code for the Customer object.
     *
     * @return The hash code
     */
    @Override
    public int hashCode() {
        return Objects.hash(customerID, name, email, phone, address, membershipLevel, totalPurchases);
    }

    /**
     * Returns a string representation of the Customer object.
     *
     * @return A string containing the customer's details
     */
    @Override
    public String toString() {
        return "Customer{" +
                "customerID='" + customerID + '\'' +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", address='" + address + '\'' +
                ", membershipLevel='" + membershipLevel + '\'' +
                ", totalPurchases=" + totalPurchases +
                '}';
    }
}
