package com.kodilla;

public class Calculator {
    private double a;
    private double b;

    public Calculator(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public void addAToB() {
        double v = a + b;
        System.out.println("Sum of numbers a: " + a + " and b: " + b + " is " + v);
    }

    public void substractAFromB() {
        double g = a - b;
        System.out.println("Number a: " + a + " minus number b: " + b + " is " + g);
    }

    public static void main(String[] args) {
        Calculator calculator1 = new Calculator(51.2, 26.4);
        calculator1.addAToB();
        calculator1.substractAFromB();
    }
}