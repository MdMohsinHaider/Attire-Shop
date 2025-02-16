import com.attireshop.controller.Application;


public class AttireShop {
    public static void main(String[] args) {

        // Creating a new thread for Application
        Thread threadShop = new Thread(new Application());
        threadShop.start();
    }
}