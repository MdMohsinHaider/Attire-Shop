package com.attireshop.controller;

import com.attireshop.dao.ShirtDao;
import com.attireshop.entity.Shirt;
import com.attireshop.service.ShirtService;

public class AppShop implements Runnable {

    public AppShop() {
        super();
        // default constructor
    }

    @Override
    public void run() {
        System.out.println("App Shop Run method");

        ShirtService service = new ShirtService();

        Shirt shirt = new Shirt(103,"lives", 200, "formal", 32, "red");
        Shirt shirt1 = service.saveShirtDao(shirt);
        System.out.println(shirt1);
    }
}
