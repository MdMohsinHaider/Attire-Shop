package com.attireshop.dao.imp;

import com.attireshop.dao.CustomersDao;
import com.attireshop.entity.Customers;

import java.util.List;

public class CustomerDao implements CustomersDao {
    @Override
    public boolean addCustomer(Customers customer) {
        return false;
    }

    @Override
    public boolean updateCustomer(Customers customer) {
        return false;
    }

    @Override
    public boolean deleteCustomer(String customerId) {
        return false;
    }

    @Override
    public Customers getCustomerById(String customerId) {
        return null;
    }

    @Override
    public List<Customers> getAllCustomers() {
        return List.of();
    }

    @Override
    public List<Customers> getCustomersByMembershipLevel(String membershipLevel) {
        return List.of();
    }

    @Override
    public List<Customers> getCustomersByTotalPurchases(double minPurchases) {
        return List.of();
    }

    @Override
    public boolean isCustomerExistsByEmail(String email) {
        return false;
    }

    @Override
    public int countTotalCustomers() {
        return 0;
    }

    @Override
    public List<Customers> getCustomersByPhone(String phone) {
        return List.of();
    }

    @Override
    public List<Customers> getCustomersByAddress(String address) {
        return List.of();
    }

    @Override
    public List<Customers> getCustomersByFilters(String membershipLevel, double minPurchases) {
        return List.of();
    }
}
