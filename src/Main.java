import com.attireshop.controller.Shop;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Shop shop = new Shop();
        System.out.println(shop.getShop_name());

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Your Choose \n" +
                "1. Insert\n" +
                "2. Delete\n" +
                "3. Update\n" +
                "4. Read All\n" +
                "5. Read By Id\n" +
                "6. Read By Email\n");
        shop.executingShop();
    }
}