package com.attireshop.dao;

import com.attireshop.entity.Admin;

import java.util.List;

public class AdminDao implements AdminDaoInterface{
    @Override
    public Admin saveAdmin(Admin admin) {
        return null;
    }

    @Override
    public Admin getAdminById(String adminID) {
        return null;
    }

    @Override
    public List<Admin> getAllAdmins() {
        return List.of();
    }

    @Override
    public Admin updateAdmin(String adminID, Admin admin) {
        return null;
    }

    @Override
    public boolean deleteAdmin(String adminID) {
        return false;
    }
}
