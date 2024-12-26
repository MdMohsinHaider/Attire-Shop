import com.attireshop.controller.Shop;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Shop shop = new Shop();
        System.out.println(shop.getShop_name());
        shop.executingShop("Open");

//        shop.registerAdmin();
//        shop.adminById();
        shop.adminAll();
//        shop.adminUpdate();
//        shop.adminDelete();
//
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("Enter Your Choose \n" +
//                "1. Login\n" +
//                "2. Register\n");
//        int option = scanner.nextByte();
//
//        switch (option){
//            case 1:
//                System.out.println("Log In Operation");
//                logInOption(scanner, shop);
//                break;
//            case 2:
//                System.out.println("Register operation");
//                registerOption(scanner,shop);
//                break;
//            default:
//                System.err.println("exit || Wrong options !!..");
//        }

    }

    private static void logInOption(Scanner scanner, Shop shop){
        System.out.println("Enter Your Choose \n" +
                "1. Login as Admin\n" +
                "2. Login as Seller\n" +
                "3. Login as Customer");
        int login_option = scanner.nextByte();

        switch (login_option){
            case 1:
                System.out.println("Log in As Admin ");
                System.out.print("Enter Your Login Mail : ");
                String admin_email_input_ui = scanner.next();
                System.out.print("Enter Your Password : ");
                String admin_password_input_ui = scanner.next();
                shop.adminLogIn(admin_email_input_ui,admin_password_input_ui);
                break;
            case 2:
                System.out.println("Log in As Seller");
                System.out.print("Enter Your Login Mail : ");
                String seller_email_input_ui = scanner.next();
                System.out.print("Enter Your Password : ");
                String seller_password_input_ui = scanner.next();
                shop.sellerLogIn(seller_email_input_ui,seller_password_input_ui);
                break;
            case 3:
                System.out.println("Log in as Customer");
                System.out.print("Enter Your Login Mail : ");
                String customer_email_input_ui = scanner.next();
                System.out.print("Enter Your Password : ");
                String customer_password_input_ui = scanner.next();
                shop.customerLogIn(customer_email_input_ui,customer_password_input_ui);
                break;
            default:
                System.out.println("Exit From Login || Wrong option !!...");
        }
    }

    private static void registerOption(Scanner scanner, Shop shop){
        System.out.println("Enter Your Choose \n" +
                "1. Register as Admin\n" +
                "2. Register as Seller\n" +
                "3. Register as Customer");
        int register_option = scanner.nextByte();

        switch (register_option){
            case 1:
                System.out.println("Register As Admin ");
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
                shop.registerAdmin(name,email,password,phone,role);
                break;
            case 2:
                System.out.println("Register As Seller");
                shop.registerSeller();
                break;
            case 3:
                System.out.println("Register as Customer");
                shop.registerCustomer();
                break;
            default:
                System.out.println("Exit From Register || Wrong option!!.. ");
        }
    }
}