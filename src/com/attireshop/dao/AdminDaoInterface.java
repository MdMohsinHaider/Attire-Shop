package com.attireshop.dao;

import com.attireshop.entity.Admin;

import java.util.List;

/**
 * Interface defining CRUD operations for Admin entities.
 */
public interface AdminDaoInterface {

    /**
     * Saves a new Admin record to the database.
     *
     * @param admin The Admin objects to be saved.
     * @return The saved Admin object, or null if the save operation fails.
     */
    Admin saveAdmin(Admin admin);

    /**
     * Retrieves an Admin record by its unique ID.
     *
     * @param adminID The ID of the Admin to retrieve.
     * @return The Admin object if found, or null if no Admin exists with the given ID.
     */
    Admin getAdminById(String adminID);

    /**
     * Retrieves all Admin records from the database.
     *
     * @return A list of all Admin objects.
     */
    List<Admin> getAllAdmins();

    /**
     * Updates an existing Admin record in the database.
     *
     * @param adminID The ID of the Admin to update.
     * @param admin   The Admin object containing updated data.
     * @return The updated Admin object, or null if the update operation fails.
     */
    Admin updateAdmin(String adminID, Admin admin);

    /**
     * Deletes an Admin record by its unique ID.
     *
     * @param adminID The ID of the Admin to delete.
     * @return true if the Admin was deleted successfully, false otherwise.
     */
    boolean deleteAdmin(String adminID);
}
