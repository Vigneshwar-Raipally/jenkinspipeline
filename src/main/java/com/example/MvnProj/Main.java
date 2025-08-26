package com.example.MvnProj;

public class Main {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;

        // Assuming you have MyUtils class with static methods
        System.out.println("Addition of " + a + " and " + b + " is: " + MyUtils.add(a, b));
        System.out.println("Subtraction of " + a + " and " + b + " is: " + MyUtils.sub(a, b));
        System.out.println("Multiplication of " + a + " and " + b + " is: " + MyUtils.mul(a, b));
        System.out.println("Division of " + a + " and " + b + " is: " + MyUtils.div(a, b));

        // Example division by zero
        try {
            System.out.println("Division by zero test: " + MyUtils.div(a, 0));
        } catch (ArithmeticException e) {
            System.out.println("Caught Exception: " + e.getMessage());
        }
    }
}
