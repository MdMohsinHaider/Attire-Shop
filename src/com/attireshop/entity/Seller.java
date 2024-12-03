package com.attireshop.entity;

import java.util.Objects;

public class Seller {
    // Private fields for encapsulation
    private String sellerID;
    private String name;
    private String email;
    private String phone;
    private String address;
    private String companyName;
    private double totalSales;
    private String accountStatus; // e.g., Active, Suspended, Pending

    public Seller() {
        // default Constructor of this Class.
        super();
    }

    public Seller(String sellerID, String name, String email, String phone, String address, String companyName, double totalSales, String accountStatus) {
        this.sellerID = sellerID;
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.address = address;
        this.companyName = companyName;
        this.totalSales = totalSales;
        this.accountStatus = accountStatus;
    }

    public Seller(String name, String email, String phone, String address, String companyName, double totalSales, String accountStatus) {
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.address = address;
        this.companyName = companyName;
        this.totalSales = totalSales;
        this.accountStatus = accountStatus;
    }

    public String getSellerID() {
        return sellerID;
    }

    public void setSellerID(String sellerID) {
        this.sellerID = sellerID;
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

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public double getTotalSales() {
        return totalSales;
    }

    public void setTotalSales(double totalSales) {
        this.totalSales = totalSales;
    }

    public String getAccountStatus() {
        return accountStatus;
    }

    public void setAccountStatus(String accountStatus) {
        this.accountStatus = accountStatus;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Seller seller = (Seller) o;
        return Double.compare(totalSales, seller.totalSales) == 0 && Objects.equals(sellerID, seller.sellerID) && Objects.equals(name, seller.name) && Objects.equals(email, seller.email) && Objects.equals(phone, seller.phone) && Objects.equals(address, seller.address) && Objects.equals(companyName, seller.companyName) && Objects.equals(accountStatus, seller.accountStatus);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sellerID, name, email, phone, address, companyName, totalSales, accountStatus);
    }

    @Override
    public String toString() {
        return "Seller{" +
                "sellerID='" + sellerID + '\'' +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", address='" + address + '\'' +
                ", companyName='" + companyName + '\'' +
                ", totalSales=" + totalSales +
                ", accountStatus='" + accountStatus + '\'' +
                '}';
    }
}
