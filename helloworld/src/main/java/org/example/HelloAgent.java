package org.example;

public class HelloAgent {
    public static void main(String[] args) {
        System.out.printf("Hello and welcome!");
        for (int i = 1; i <= 5; i++) {
            System.out.println("i = " + i);
        }

        Calculator cal = new Calculator(10, 5);

        System.out.println(cal.sum());
        System.out.println(cal.sub());
        System.out.println(cal.multi());
        System.out.println(cal.div());

    }

}