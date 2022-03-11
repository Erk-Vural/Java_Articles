# Java Lambda Expressions 

Lambda Expressions are added in Java 8 for expressing instances of Funtional Interfaces(An Interface with single abstract method).

Main advantages of using Lambda Expressions are:
- Lambda expressions implements abstract function in functional interfaces.
- It requires less coding.
- Functions can created without belonging classes.
- Lambda expression can be passes around like objects.

## Lambda Expressions can have different kind of implementations

### 1 ) No parameters Lambda expression

    // No parameter interface
    interface SimpleGreeter {
        public void greet();
    }
    
    // No parameter Lambda expression () -> expression
    SimpleGreeter greeter = () -> System.out.println("Hello there!");

    greeter.greet();


### 2 ) Single parameter Lambda expression 

    // Single parameter interface
    interface StandardGreeter {
        public void greet(String name);
    }
    
    // Single parameter Lambda expression parameter -> expression
    StandardGreeter greeter1 = name -> System.out.println("Hello there " + name);

    greeter1.greet("Kenobi");

### 3 ) Multiple parameters Lambda expression

     // Multiple parameter interface
     interface AdvanceGreeter {
          public void greet(String rank, String name);
     }
     
     // Multiple parameters Lambda expression (parameter1, parameter2) -> expression
     AdvanceGreeter greeter2 = (rank, name) -> System.out.println("Hello there " + rank + " " + name);

     greeter2.greet("Master", "Kenobi");

### A simple calculator example for demonstrate multiple function implementations using single interface

    //Multiple function implementations using single interface
    
    interface Calculator {
        public int calculate(int num1, int num2);
    }
    
    // Performs operations for Calculator Interface.
    private static int operator(int a, int b, Calculator operation) {
        return operation.calculate(a, b);
    }
    
     // Multiple parameter without curly braces.
     Calculator sum = (int num1, int num2) -> num1 + num2;

     // Multiple parameter without type declarations.
     Calculator subtract = (num1, num2) -> num1 - num2;

     // Multiple parameter with return statement and curly braces.
     Calculator multiply = (int num1, int num2) -> {
         return num1 * num2;
     };
     
      System.out.println(operator(30, 20, sum));

      System.out.println(operator(30, 20, subtract));

      System.out.println(operator(30, 20, multiply));

      System.out.println(operator(30, 20, divide));
      
### Notes:
- When there is one statement in implementation it can be used without curly braces and statement returns from function.
- When there is multiple statements in implementation it requires curly braces and if not void it reqires a return statement.
- Parameter types are defined in interface so Lambda expression doesn't require parameter type definations.
- An interface can be used to implement multiple functions using a oparator to navigate (like in calculator example).


**Resources:**
- https://www.geeksforgeeks.org/lambda-expressions-java-8
- https://www.javatpoint.com/java-lambda-expressions
