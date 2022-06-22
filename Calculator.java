package com.company.java_core.homework5.task1.interface2;
import com.company.java_core.homework5.task1.interface1.Numerable;

public class Calculator implements Numerable{
    public double number1;
    public double number2;

    @Override
    public void plus(double number1, double number2) {
        double result = number1 + number2;
        System.out.println("Result of addition: " + result);
    }

    @Override
    public void minus(double number1, double number2) {
        double result = number1 - number2;
        System.out.println("Result of subtraction: " + result);
    }

    @Override
    public void multiply(double number1, double number2) {
        double result = number1 * number2;
        System.out.println("Result of multiplication: " + result);
    }

    @Override
    public void divide(double number1, double number2) {
        double result = number1 / number2;
        System.out.println("Result of division: " + result);
    }
}
