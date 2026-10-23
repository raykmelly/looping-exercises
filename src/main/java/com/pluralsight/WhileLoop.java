package com.pluralsight;

public class WhileLoop {
    public static void main(String[] args) {
        // While loop to display "I love java" 5 times
        int i = 1;
        while (i <= 5) {
            System.out.println("I love java");
            i++;
        }

        // Do while loop to display "I love java" 5 times
        i = 1;
        do {
            System.out.println("I love java");
            i++;
        } while (i < 5);
    }
}