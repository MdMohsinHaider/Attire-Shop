package com.attireshop.dao.imp;

import com.attireshop.dao.SellersDao;
import com.attireshop.entity.Sellers;

import java.util.List;

public class SellerDao implements SellersDao {
    @Override
    public boolean addSeller(Sellers seller) {
        return false;
    }

    @Override
    public boolean updateSeller(Sellers seller) {
        return false;
    }

    @Override
    public boolean deleteSeller(String sellerId) {
        return false;
    }

    @Override
    public Sellers getSellerById(String sellerId) {
        return null;
    }

    @Override
    public List<Sellers> getAllSellers() {
        return List.of();
    }

    @Override
    public List<Sellers> getSellersByAccountStatus(String accountStatus) {
        return List.of();
    }

    @Override
    public List<Sellers> getSellersByTotalSales(double minSales) {
        return List.of();
    }

    @Override
    public boolean isSellerExistsByEmail(String email) {
        return false;
    }

    @Override
    public int countTotalSellers() {
        return 0;
    }

    @Override
    public List<Sellers> getSellersByCompanyName(String companyName) {
        return List.of();
    }

    @Override
    public List<Sellers> getSellersByPhone(String phone) {
        return List.of();
    }

    @Override
    public List<Sellers> getSellersByAddress(String address) {
        return List.of();
    }

    @Override
    public List<Sellers> getSellersByFilters(String accountStatus, double minSales) {
        return List.of();
    }
}
