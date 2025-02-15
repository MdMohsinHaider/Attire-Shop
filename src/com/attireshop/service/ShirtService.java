package com.attireshop.service;

import com.attireshop.dao.ShirtDao;
import com.attireshop.entity.Shirt;

public class ShirtService {
    ShirtDao shirtDao = new ShirtDao();

    public Shirt saveShirtDao(Shirt shirt){
        return shirtDao.saveShirtDao(shirt);
    }
}
