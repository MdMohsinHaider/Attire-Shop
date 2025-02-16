package com.attireshop.threads;

import com.attireshop.entity.Shirt;
import com.attireshop.service.ShirtService;

import java.util.List;
import java.util.Scanner;

public class ShirtThread implements Runnable{


    /**
     * When an object implementing interface {@code Runnable} is used
     * to create a thread, starting the thread causes the object's
     * {@code run} method to be called in that separately executing
     * thread.
     * <p>
     * The general contract of the method {@code run} is that it may
     * take any action whatsoever.
     *
     * @see Thread#run()
     */
    @Override
    public void run() {

        ShirtService service = new ShirtService();

        System.out.print("""
                Enter Option\
                
                1:save\
                
                2:delete\
                
                3:GetAll\
                
                4:GetById\
                
                5:GetByBrand\
                
                6:GetByCategory\
                
                7:GetByColor\
                
                8:GetByMinPrice\
                
                9:GetByMaxPrice\
                
                10:UpdateShirtById\
                
                """);
        Scanner sc = new Scanner(System.in);

        int option = sc.nextByte();

        switch (option){
            case 1:{
                System.out.println("Save Shirt");
                Shirt shirt = new Shirt(104,"lives", 200, "formal", 32, "red");
                Shirt shirt1 = service.saveShirtDao(shirt);
                System.out.println(shirt1);
            } break;

            case 2:{
                System.out.println("Delete Shirt");
                boolean b = service.deleteAdminById(104);
                System.out.println(b);
            } break;

            case 3:{
                System.out.println("Get All Shirt");
                List<Shirt> shirtList = service.getAllShirt();
                shirtList.forEach(System.out::println);
            } break;

            case 4:{
                System.out.println("Get Shirt by Id");
                Shirt shirt = service.getShirtById(102);
                System.out.println(shirt);
            }

            case 5:{
                System.out.println("Get Shirt By Brand");
                List<Shirt> shirtList = service.getShirtByBrand("lives");
                if (shirtList.isEmpty()) System.out.println("Not Available brand or Out Of Stock");
                shirtList.forEach(System.out::println);
            }break;

            case 6:{
                System.out.println("Get Shirt By Category");
                List<Shirt> shirtList = service.getShirtByCategory("formals");
                if (shirtList.isEmpty()) System.out.println("Not Available Category or Out Of Stock");
                shirtList.forEach(System.out::println);
            } break;

            case 7:{
                System.out.println("Get Shirt By Color");
                List<Shirt> shirtList = service.getShirtByColor("reds");
                if (shirtList.isEmpty()) System.out.println("Not Available Color or Out Of Stock");
                shirtList.forEach(System.out::println);
            } break;

            case 8:{
                System.out.println("Get Shirt By Min Price");
                List<Shirt> shirtList = service.getShirtByMinPrice(180);
                if (shirtList.isEmpty()) System.out.println("Not Available Min Price or Out Of Stock");
                shirtList.forEach(System.out::println);
            } break;

            case 9:{
                System.out.println("Get Shirt By Max Price");
                List<Shirt> shirtList = service.getShirtByMaxPrice(320);
                if (shirtList.isEmpty()) System.out.println("Not Available Max Price or Out Of Stock");
                shirtList.forEach(System.out::println);
            } break;

            case 10:{ // String brand, double price, String category, int size, String color
                System.out.println("Update Shirt By Id");
                Shirt shirt = service.updateShirtById(104,new Shirt("RedTap",459,"casual",34,"Black"));
                System.out.println(shirt);
            }
        }
    }
}
