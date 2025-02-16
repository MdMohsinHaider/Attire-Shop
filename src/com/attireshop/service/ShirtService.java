package com.attireshop.service;

import com.attireshop.dao.ShirtDao;
import com.attireshop.entity.Shirt;

import java.util.List;

public class ShirtService {

    ShirtDao dao = new ShirtDao();

    public Shirt saveShirtDao(Shirt shirt){
        return dao.saveShirtDao(shirt);
    }

    public boolean deleteAdminById(int shirtId) {
        return dao.deleteAdminByIdDao(shirtId);
    }

    public List<Shirt> getAllShirt(){
        return dao.getAllShirtDao();
    }

    public Shirt getShirtById(int shirtId){
        return dao.getShirtByIdDao(shirtId);
    }

    public List<Shirt> getShirtByBrand(String shirtBrand){
        return dao.getShirtByBrandDao(shirtBrand);
    }

    public List<Shirt> getShirtByCategory(String shirtCategory){
        return dao.getShirtByCategoryDao(shirtCategory);
    }

    public List<Shirt> getShirtByColor(String shirtColor){
        return dao.getShirtByColorDao(shirtColor);
    }

    public List<Shirt> getShirtByMinPrice(double shirtMinPrice){
        return dao.getShirtByMinPriceDao(shirtMinPrice);
    }

    public List<Shirt> getShirtByMaxPrice(double shirtMaxPrice){
        return dao.getShirtByMaxPriceDao(shirtMaxPrice);
    }

    public Shirt updateShirtById(int shirtId, Shirt shirt){
        return dao.updateShirtByIdDao(shirtId,shirt);
    }
}
