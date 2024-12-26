package com.attireshop.entity.imp;

import com.attireshop.entity.Admins;

import java.io.Serializable;
import java.util.Objects;

/**
 * The Admin class represents an administrator in the system.
 * It contains details such as admin ID, name, email, phone, and role.
 * This class provides getter and setter methods for all fields, and overrides
 * the equals, hashCode, and toString methods for proper handling of admin objects.
 */
public class Admin implements Serializable, Admins {
    // Unique identifier for the admin
    private String adminID;

    // Full name of the admin
    private String name;

    // Email address of the admin
    private String email;

    // password of the admin
    private String password;

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

    public Admin(String msg){
        System.err.println("From Admin : "+msg);
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
    public Admin(String adminID, String name, String email, String password, String phone, String role) {
        this.adminID = adminID;
        this.name = name;
        this.email = email;
        this.password = password;
        this.phone = phone;
        this.role = role;
    }

    // without password.
    public Admin(String adminID,String name, String email, String phone, String role) {
        this.adminID = adminID;
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.role = role;
    }

    public Admin(String email, String password) {
        this.email = email;
        this.password = password;
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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
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

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Admin admin = (Admin) o;
        return Objects.equals(adminID, admin.adminID) && Objects.equals(name, admin.name) && Objects.equals(email, admin.email) && Objects.equals(password, admin.password) && Objects.equals(phone, admin.phone) && Objects.equals(role, admin.role);
    }

    @Override
    public int hashCode() {
        return Objects.hash(adminID, name, email, password, phone, role);
    }

    @Override
    public String toString() {
        if (password != null){
            return "Admin{" +
                    "adminID='" + adminID + '\'' +
                    ", name='" + name + '\'' +
                    ", email='" + email + '\'' +
                    ", password='" + password + '\'' +
                    ", phone='" + phone + '\'' +
                    ", role='" + role + '\'' +
                    '}';
        }
        else{
            return "Admin{" +
                    "adminID='" + adminID + '\'' +
                    ", name='" + name + '\'' +
                    ", email='" + email + '\'' +
                    ", phone='" + phone + '\'' +
                    ", role='" + role + '\'' +
                    '}';
        }
    }
}