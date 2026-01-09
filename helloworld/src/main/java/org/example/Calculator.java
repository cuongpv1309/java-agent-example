package org.example;

public class Calculator {

    private final int num1;
    private final int num2;

    public Calculator(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public int sum() {
        return num1 + num2;
    }

    public int sub() {
        return num1 - num2;
    }

    public int multi() {
        return num1 * num2;
    }

    public int div() {
        return num1 / num2;
    }

}
