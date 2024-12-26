package com.attireshop.service;

import com.attireshop.dao.AdminsDao;
import com.attireshop.dao.imp.AdminDao;
import com.attireshop.entity.Admins;

import java.util.List;

public class AdminService {
    AdminsDao adminDaoInterface = new AdminDao();

    public Admins saveAdminService(Admins admin) {
        return adminDaoInterface.saveAdmin(admin);
    }

    public Admins getAdminByIdService(String adminID) {
        return adminDaoInterface.getAdminById(adminID);
    }

    public List<Admins> getAllAdminsService() {
        return adminDaoInterface.getAllAdmins();
    }

    public Admins updateAdminService(String adminID, Admins admin) {
        return adminDaoInterface.updateAdmin(adminID, admin);
    }

    public boolean deleteAdmin(String adminID) {
        return adminDaoInterface.deleteAdmin(adminID);
    }
}
