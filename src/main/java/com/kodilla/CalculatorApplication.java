package com.kodilla;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CalculatorApplication {
    private double a;
    private double b;

    public CalculatorApplication(double a, double b) {
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
        CalculatorApplication calculator = new CalculatorApplication(51.2, 26.4);
        calculator.addAToB();
        calculator.substractAFromB();
    }
}
