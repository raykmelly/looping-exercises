package com.pluralsight;

public class ForLoop {
    public static void main(String[] args) throws InterruptedException {
        // For loop to count down from 10-1 and print "Launch!" after
        for (int i = 10; i >= 1; i--) {
            System.out.println("Countdown.. [" + i + "]");
            Thread.sleep(1000);
        }

        System.out.println("Launch!");
    }
}
