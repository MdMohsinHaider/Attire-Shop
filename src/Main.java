

import com.attireshop.controller.AppShop;

import java.io.Serializable;

public class Main implements Serializable {
    public static void main(String[] args) {
        Thread threadShop = new Thread(new AppShop());
        threadShop.start();
    }
}