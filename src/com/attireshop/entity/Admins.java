package com.attireshop.entity;

import java.util.Objects;

/**
 * The Admins interface defines the contract for managing administrator entities.
 * It provides methods for accessing and modifying the details of an admin.
 */
public interface Admins {

    // Getters
    String getAdminID();
    String getName();
    String getEmail();
    String getPassword();
    String getPhone();
    String getRole();

    // Setters
    void setAdminID(String adminID);
    void setName(String name);
    void setEmail(String email);
    void setPassword(String password);
    void setPhone(String phone);
    void setRole(String role);

    // Utility methods
    @Override
    boolean equals(Object o);

    @Override
    int hashCode();

    @Override
    String toString();
}
