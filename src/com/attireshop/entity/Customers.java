package com.attireshop.entity;
/**
 * This interface defines the contract for the Customer class.
 * It includes methods for accessing and modifying Customer details,
 * as well as utility methods for equality and string representation.
 */
public interface Customers {
    // Getters
    String getCustomerID();
    String getName();
    String getEmail();
    String getPassword();
    String getPhone();
    String getAddress();
    String getMembershipLevel();
    double getTotalPurchases();

    // Setters
    void setCustomerID(String customerID);
    void setName(String name);
    void setEmail(String email);
    void setPassword(String password);
    void setPhone(String phone);
    void setAddress(String address);
    void setMembershipLevel(String membershipLevel);
    void setTotalPurchases(double totalPurchases);

    // Utility methods
    @Override
    boolean equals(Object o);

    @Override
    int hashCode();

    @Override
    String toString();

}
