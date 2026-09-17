package com.example;

public class Calculator {
    public int calculate(String op, int a, int b) {
        switch (op) {
            case "add":
                return a + b;
            case "subtract":
                return a - b;
            case "multiply":
                return a * b;
            case "divide":
                if (b == 0) {
                    throw new ArithmeticException("Cannot divide by zero");
                } else {
                    return a / b;
                }
            case "mod":
                return a % b;
            default:
                throw new IllegalArgumentException("Unknown operation");
        }
    }
}
