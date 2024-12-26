package com.attireshop.controller;


import com.attireshop.entity.Admins;
import com.attireshop.entity.imp.Admin;
import com.attireshop.service.*;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Scanner;

public class Shop {

    ProductService productService = new ProductService();
    AdminService adminService = new AdminService();
    SellerService sellerService = new SellerService();
    CustomerService customerService = new CustomerService();
    Scanner scanner = new Scanner(System.in);

    public Shop() {
        super();
        // default constructor
    }

    // company Name
    final public String getShop_name() {
        return "RedBerry PVT LTD Company";
    }

    // Shop Executing
    final public void executingShop(String close_OR_Open){
        System.out.println("Shop "+close_OR_Open);
    }

    public String getRandomId(){
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyyMMddHHmmss");
        return now.format(formatter);
    }

    final public void registerAdmin(String name, String email, String password, String phone,String role){
        // Admin admin = new Admin(123,"Md Mohsin","mohsinhaider@gmail.com","101mohsin","8084527631","Manager");
        Admins admin = adminService.saveAdminService(new Admin(getRandomId(),name,email,password,phone,role));

        if (admin!= null){
            System.out.println("Successful register admin");
            System.out.println(admin);
        }
        else {
            System.out.println("Not successful register admin");
            System.exit(0);
        }
    }


    final public void adminById(){
        System.out.print("Enter admin Id : ");
        String adminID = scanner.next();
        Admins admin = adminService.getAdminByIdService(adminID);
        System.out.println(admin);
    }

    final public void adminAll(){
        List<Admins> adminList = adminService.getAllAdminsService();
        for (Admins admin : adminList){
            System.out.println(admin);
        }
    }

    final public void adminUpdate(){
        System.out.print("Enter admin Id  : ");
        String id = scanner.next();
        System.out.print("Enter name : ");
        String name = scanner.nextLine();
        System.out.print("Enter email : ");
        String email = scanner.next();
        System.out.print("enter password : ");
        String password = scanner.next();
        System.out.print("Enter phone number : ");
        String phone = scanner.next();
        System.out.print("Enter role  (e.g., SuperAdmin, Manager) : ");
        String role = scanner.next();

//          Admin admin = new Admin("101","Md Mohsin","mohsinhaider@gmail.com","101mohsin","8084527630","Manager");
        Admins admin = new Admin(id,name,email,password,phone,role);
        Admins admin1 = adminService.updateAdminService(id,admin);
        System.out.println(admin1);
    }

    final public void adminDelete(){
        System.out.print("Enter admin Id : ");
        String adminID = scanner.next();
        boolean deletedAdmin = adminService.deleteAdmin(adminID);
        String msg =  deletedAdmin?"admin delete "+adminID:"Admin not deleted "+adminID;
        System.out.println(msg);
    }

    final public void adminLogIn(String admin_email_input_ui, String admin_password_input_ui){
        // If true, then

            // Admin(manager) shows their own Details
            // Admin(manager) Delete
            // Admin(manager) update
            // Admin(manager) verify product.
            // Admin(manager) can Show All Products.
            // Admin(manager) can delete Product
            // Admin(manager) can show Seller.
            // Admin(manager) can Delete Seller.
            // Admin(manager) can show All customers.
            // Admin(manager) can delete Customer.

            // if SuperAdmin true
                // Admin(Super) Show all the Admin and as well as Product, Customer, Seller.
                // Admin(Super) Deletes all the Admin and as well as Product, Customer, Seller.
                // Admin(Super) Updates all the Admin and as well as Product, Customer, Seller.
    }


    /*
    *
    * Seller Area
    * */

    public void registerSeller() {
    }

    public void sellerLogIn(String seller_email_input_ui, String seller_password_input_ui) {
    }

    /*
     *
     * Customer Area
     * */
    public void registerCustomer() {
    }


    public void customerLogIn(String customer_email_input_ui, String customer_password_input_ui) {
    }
}
