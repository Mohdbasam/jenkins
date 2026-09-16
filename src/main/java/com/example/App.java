package com.example;

public class App {

    public static void main(String[] args) {
        System.out.println("Hello from Jenkins Maven Pipeline!");

        int result = add(10, 20);
        System.out.println("10 + 20 = " + result);
    }

    public static int add(int a, int b) {
        return a + b;
    }
}
