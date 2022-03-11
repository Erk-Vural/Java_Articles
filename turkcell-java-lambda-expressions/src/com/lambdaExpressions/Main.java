package com.lambdaExpressions;

public class Main {
    public static void main(String[] args) {
        // No parameter Lambda expression () -> expression
        SimpleGreeter greeter = () -> System.out.println("Hello there!");

        greeter.greet();

        // Single parameter Lambda expression parameter -> expression
        StandardGreeter greeter1 = name -> System.out.println("Hello there " + name);

        greeter1.greet("Kenobi");

        // Multiple parameter Lambda expression (parameter1, parameter2) -> expression
        AdvanceGreeter greeter2 = (rank, name) -> System.out.println("Hello there " + rank + " " + name);

        greeter2.greet("Master", "Kenobi");

        // Multiple function implementations using single interface.

        // Multiple parameter without curly braces.
        Calculator sum = (int num1, int num2) -> num1 + num2;

        // Multiple parameter without type declarations.
        Calculator subtract = (num1, num2) -> num1 - num2;

        // Multiple parameter with return statement and curly braces.
        Calculator multiply = (int num1, int num2) -> {
            return num1 * num2;
        };

        Calculator divide = (int num1, int num2) -> num1 / num2;


        System.out.println(operator(30, 20, sum));

        System.out.println(operator(30, 20, subtract));

        System.out.println(operator(30, 20, multiply));

        System.out.println(operator(30, 20, divide));

    }


    // Performs operations for Calculator Interface.
    private static int operator(int a, int b, Calculator operation) {
        return operation.calculate(a, b);
    }

    // Functional Interface ( An Interface with single abstract method) implementations.

    // No parameter interface
    interface SimpleGreeter {
        public void greet();
    }

    // One parameter interface
    interface StandardGreeter {
        public void greet(String name);
    }

    // Multiple parameter interface
    interface AdvanceGreeter {
        public void greet(String rank, String name);
    }

    // Multiple function implementations using single interface
    interface Calculator {
        public int calculate(int num1, int num2);
    }
}
