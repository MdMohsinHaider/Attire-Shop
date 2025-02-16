package com.attireshop.threads;

import java.util.Scanner;

public class TShirtThread implements Runnable{
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
        System.out.println("T-Shirt Soon");
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
    }
}
