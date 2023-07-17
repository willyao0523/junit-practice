package org.example;

public class Calculator {

    public double add(double number1, double number2) {
        return number1 + number2;
    }

    public double sqrt(double number) {
        if (number < 0) {
            throw new IllegalArgumentException("Cannot extreact the square root of a negative value");
        }
        return Math.sqrt(number);
    };

    public double divide(double number1, double number2) {
        if (number2 == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        }
        return number1 / number2;
    }
}
