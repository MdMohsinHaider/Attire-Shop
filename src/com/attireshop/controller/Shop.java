package com.attireshop.controller;


import com.attireshop.service.PantsService;
import com.attireshop.service.SellerService;
import com.attireshop.service.ShirtService;
import com.attireshop.service.TShirtService;

public class Shop {

    TShirtService tShirtService = new TShirtService();
    ShirtService shirtService = new ShirtService();
    PantsService pantsService = new PantsService();
    SellerService sellerService = new SellerService();

    public Shop() {
        super();
    }

    public String getShop_name() {
        return "RedBerry PVT LTD Company";
    }
}
