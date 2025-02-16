package com.attireshop.controller;


import com.attireshop.threads.ShirtThread;
import com.attireshop.threads.TShirtThread;

import java.util.Scanner;

public class Application implements Runnable {

    public Application() {
        super();
        // default constructor
    }

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
        Thread threadShirt = new Thread(new ShirtThread());
        Thread threadTShirt = new Thread(new TShirtThread());
        Scanner sc = new Scanner(System.in);

        System.out.println("App Shop Run method");
        System.out.print("1:Shirt\n2:T-Shit\n");

        int a = sc.nextByte();

        switch (a){
            case 1:
                threadShirt.start();
             break;

            case 2:
                threadTShirt.start();
             break;
            default:System.exit(0);
        }
    }
}
