package com.attireshop.entity;
/**
 * This interface defines the contract for the Seller class.
 * It includes methods for accessing and modifying Seller details,
 * as well as utility methods for equality and string representation.
 */
public interface Sellers {
    // Getters
    String getSellerID();
    String getName();
    String getEmail();
    String getPassword();
    String getPhone();
    String getAddress();
    String getCompanyName();
    double getTotalSales();
    String getAccountStatus();

    // Setters
    void setSellerID(String sellerID);
    void setName(String name);
    void setEmail(String email);
    void setPassword(String password);
    void setPhone(String phone);
    void setAddress(String address);
    void setCompanyName(String companyName);
    void setTotalSales(double totalSales);
    void setAccountStatus(String accountStatus);

    // Utility methods
    @Override
    boolean equals(Object o);

    @Override
    int hashCode();

    @Override
    String toString();
}
