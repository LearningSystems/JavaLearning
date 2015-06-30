package com.javalearning.calculations;

public class Calculator {

    public int add(int var1, int var2) {
        return var1 + var2;
    }

    public static void main(String[] args) {
        int var1 = 5;
        int var2 = 6;

        Calculator calculator = new Calculator();

        int result = calculator.add(var1, var2);
        System.out.println(result);
    }
    }
