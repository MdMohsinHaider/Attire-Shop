package com.attireshop.dao;

import com.attireshop.entity.Customers;
import java.util.List;

/**
 * DAO Interface for Customer Entity
 * Provides standard CRUD operations and additional query methods for customers.
 */
public interface CustomersDao {

    /**
     * Adds a new customer to the database.
     * @param customer The customer to be added.
     * @return True if the operation was successful, false otherwise.
     */
    boolean addCustomer(Customers customer);

    /**
     * Updates an existing customer in the database.
     * @param customer The customer with updated details.
     * @return True if the operation was successful, false otherwise.
     */
    boolean updateCustomer(Customers customer);

    /**
     * Deletes a customer from the database based on their ID.
     * @param customerId The ID of the customer to be deleted.
     * @return True if the operation was successful, false otherwise.
     */
    boolean deleteCustomer(String customerId);

    /**
     * Retrieves a customer by their ID.
     * @param customerId The ID of the customer to retrieve.
     * @return The customer if found, otherwise null.
     */
    Customers getCustomerById(String customerId);

    /**
     * Retrieves all customers from the database.
     * @return A list of all customers.
     */
    List<Customers> getAllCustomers();

    /**
     * Retrieves customers by their membership level.
     * @param membershipLevel The membership level to filter customers.
     * @return A list of customers with the specified membership level.
     */
    List<Customers> getCustomersByMembershipLevel(String membershipLevel);

    /**
     * Retrieves customers who have made purchases above a certain threshold.
     * @param minPurchases The minimum total purchase amount.
     * @return A list of customers with total purchases greater than or equal to the threshold.
     */
    List<Customers> getCustomersByTotalPurchases(double minPurchases);

    /**
     * Checks if a customer exists in the database based on their email.
     * @param email The email of the customer.
     * @return True if the customer exists, false otherwise.
     */
    boolean isCustomerExistsByEmail(String email);

    /**
     * Counts the total number of customers in the database.
     * @return The total number of customers.
     */
    int countTotalCustomers();

    /**
     * Retrieves customers by their phone number.
     * @param phone The phone number to filter customers.
     * @return A list of customers with the specified phone number.
     */
    List<Customers> getCustomersByPhone(String phone);

    /**
     * Retrieves customers by their address.
     * @param address The address to filter customers.
     * @return A list of customers with the specified address.
     */
    List<Customers> getCustomersByAddress(String address);

    /**
     * Retrieves customers by multiple criteria such as membership level and total purchases.
     * @param membershipLevel The membership level to filter by.
     * @param minPurchases The minimum total purchase amount to filter by.
     * @return A list of customers matching the specified criteria.
     */
    List<Customers> getCustomersByFilters(String membershipLevel, double minPurchases);
}
