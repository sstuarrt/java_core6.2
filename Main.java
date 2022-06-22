package com.company.java_core.homework5.task1;

import com.company.java_core.homework5.task1.interface2.Calculator;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        calculator.plus(2.6, 5.9);
        calculator.minus(8.3, 1.6);
        calculator.multiply(9.3, 3.7);
        calculator.divide(4.5, 2.7);
    }
}
