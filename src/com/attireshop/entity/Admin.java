package com.attireshop.entity;

import java.util.Objects;

/**
 * The Admin class represents an administrator in the system.
 * It contains details such as admin ID, name, email, phone, and role.
 * This class provides getter and setter methods for all fields, and overrides
 * the equals, hashCode, and toString methods for proper handling of admin objects.
 */
public class Admin {
    // Unique identifier for the admin
    private String adminID;

    // Full name of the admin
    private String name;

    // Email address of the admin
    private String email;

    // Contact phone number of the admin
    private String phone;

    // Role of the admin in the system (e.g., SuperAdmin, Manager)
    private String role;

    /**
     * Default constructor for creating an empty Admin object.
     */
    public Admin() {
        super();
    }

    /**
     * Parameterized constructor for creating an Admin object with all details.
     *
     * @param adminID Unique identifier for the admin
     * @param name    Full name of the admin
     * @param email   Email address of the admin
     * @param phone   Contact phone number of the admin
     * @param role    Role of the admin in the system
     */
    public Admin(String adminID, String name, String email, String phone, String role) {
        this.adminID = adminID;
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.role = role;
    }

    // Getter and setter methods for each field

    public String getAdminID() {
        return adminID;
    }

    public void setAdminID(String adminID) {
        this.adminID = adminID;
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

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    /**
     * Compares this Admin object with another object for equality.
     *
     * @param o The object to compare with
     * @return true if the objects are equal, false otherwise
     */
    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Admin admin = (Admin) o;
        return Objects.equals(adminID, admin.adminID)
                && Objects.equals(name, admin.name)
                && Objects.equals(email, admin.email)
                && Objects.equals(phone, admin.phone)
                && Objects.equals(role, admin.role);
    }

    /**
     * Generates a hash code for the Admin object.
     *
     * @return The hash code
     */
    @Override
    public int hashCode() {
        return Objects.hash(adminID, name, email, phone, role);
    }

    /**
     * Returns a string representation of the Admin object.
     *
     * @return A string containing the Admin details
     */
    @Override
    public String toString() {
        return "Admin{" +
                "adminID='" + adminID + '\'' +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", role='" + role + '\'' +
                '}';
    }
}