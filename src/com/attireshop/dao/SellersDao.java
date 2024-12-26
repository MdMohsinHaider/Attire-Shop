package com.attireshop.dao;

import com.attireshop.entity.Sellers;
import java.util.List;

    /**
     * DAO Interface for Seller Entity
     * Provides standard CRUD operations and additional query methods for sellers.
     */
public interface SellersDao {
    /**
     * Adds a new seller to the database.
     * @param seller The seller to be added.
     * @return True if the operation was successful, false otherwise.
     */
    boolean addSeller(Sellers seller);

    /**
     * Updates an existing seller in the database.
     * @param seller The seller with updated details.
     * @return True if the operation was successful, false otherwise.
     */
    boolean updateSeller(Sellers seller);

    /**
     * Deletes a seller from the database based on their ID.
     * @param sellerId The ID of the seller to be deleted.
     * @return True if the operation was successful, false otherwise.
     */
    boolean deleteSeller(String sellerId);

    /**
     * Retrieves a seller by their ID.
     * @param sellerId The ID of the seller to retrieve.
     * @return The seller if found, otherwise null.
     */
    Sellers getSellerById(String sellerId);

    /**
     * Retrieves all sellers from the database.
     * @return A list of all sellers.
     */
    List<Sellers> getAllSellers();

    /**
     * Retrieves sellers by their account status.
     * @param accountStatus The account status to filter sellers (e.g., Active, Suspended, Pending).
     * @return A list of sellers with the specified account status.
     */
    List<Sellers> getSellersByAccountStatus(String accountStatus);

    /**
     * Retrieves sellers whose total sales exceed a certain threshold.
     * @param minSales The minimum total sales amount.
     * @return A list of sellers with total sales greater than or equal to the threshold.
     */
    List<Sellers> getSellersByTotalSales(double minSales);

    /**
     * Checks if a seller exists in the database based on their email.
     * @param email The email of the seller.
     * @return True if the seller exists, false otherwise.
     */
    boolean isSellerExistsByEmail(String email);

    /**
     * Counts the total number of sellers in the database.
     * @return The total number of sellers.
     */
    int countTotalSellers();

    /**
     * Retrieves sellers by their company name.
     * @param companyName The company name to filter sellers.
     * @return A list of sellers with the specified company name.
     */
    List<Sellers> getSellersByCompanyName(String companyName);

    /**
     * Retrieves sellers by their phone number.
     * @param phone The phone number to filter sellers.
     * @return A list of sellers with the specified phone number.
     */
    List<Sellers> getSellersByPhone(String phone);

    /**
     * Retrieves sellers by their address.
     * @param address The address to filter sellers.
     * @return A list of sellers with the specified address.
     */
    List<Sellers> getSellersByAddress(String address);

    /**
     * Retrieves sellers by multiple criteria such as account status and total sales.
     * @param accountStatus The account status to filter by.
     * @param minSales The minimum total sales amount to filter by.
     * @return A list of sellers matching the specified criteria.
     */
    List<Sellers> getSellersByFilters(String accountStatus, double minSales);
}
