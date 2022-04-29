# Java Lambda Expressions

Lambda expressions are added to Java with Java 8 and known to be the biggest feature introduced with the version. They
are used for providing an implementation
for [Functional Interfaces](https://github.com/Erk-Vural/turkcell-java-articles/tree/main/functional-interfaces) (An
interface with only one abstract method) before lambda expressions, functional interfaces needed to be impemented by an
anonymous inner class(which is a class that only implementing functional interface's method). **Lambda expressions**
enable the programmer to write cleaner, more readable code by enabling writing functions without a class and a name. It
is a bit confusing in the concept of Object-Oriented Programming(OOP) because in Java besides primitive data types
everything is an object and belong to a class so lambda expressions changes this by greatly simplifying functional
programming.


![lambda-expression-structure](lambda-expression.jpg)
_**Example Body of a lambda expression**_

**Main advantages of using Lambda Expressions are:**

- Lambda expressions implements abstract function in functional interfaces.
- With using it we get simpler, cleaner more readable code.
- It requires less coding.
- It decreases boilerplate code.
- Functions can create without belonging classes.
- Lambda expression can be passed around like objects.

## Lambda Expressions can have different kind of implementations

### 1 ) No parameters Lambda Expression

```java
// No parameter interface
interface SimpleGreeter {
    void greet();
}

class Main {
    public static void main(String[] args) {
        // No parameter Lambda expression () -> expression
        SimpleGreeter greeter = () -> System.out.println("Hello there!");

        greeter.greet();
    }
}
```

### 2 ) Single parameter Lambda Expression

```java
// Single parameter interface
interface StandardGreeter {
    void greet(String name);
}

class Main {
    public static void main(String[] args) {
        // Single parameter Lambda expression parameter -> expression
        StandardGreeter greeter1 = name -> System.out.println("Hello there " + name);

        greeter1.greet("Kenobi");
    }
}
```

### 3 ) Multiple parameters Lambda Expression

```java
// Multiple parameter interface
interface AdvanceGreeter {
    void greet(String rank, String name);
}

class Main {
    public static void main(String[] args) {
        // Multiple parameters Lambda expression (parameter1, parameter2) -> expression
        AdvanceGreeter greeter2 = (rank, name) -> System.out.println("Hello there " + rank + " " + name);

        greeter2.greet("Master", "Kenobi");
    }
}
```

### A simple calculator example for demonstrate multiple function implementations using single interface

```java
//Multiple function implementations using single interface
interface Calculator {
    int calculate(int num1, int num2);
}

class Main {
    public static void main(String[] args) {
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
    }

    // Performs operations for Calculator Interface.
    private static int operator(int a, int b, Calculator operation) {
        return operation.calculate(a, b);
    }
}
 ```    

### Notes:

- When there is one statement in implementation it can be used without curly braces and statement returns from function.
- When there is multiple statements in implementation it requires curly braces and if not void it requires a return
  statement.
- Parameter types are defined in interface so Lambda expression doesn't require parameter type definations.
- An interface can be used to implement multiple functions using an oparator to navigate (like in calculator example).

## Resources

- Lambda Expressions in Java 8

  https://www.geeksforgeeks.org/lambda-expressions-java-8


- Java Lambda Expressions

  https://www.w3schools.com/java/java_lambda.asp#:~:text=Lambda%20Expressions%20were%20added%20in,the%20body%20of%20a%20method


- Java Lambda Expressions

  https://medium.com/@kasunpdh/java-lambda-expressions-3195f677ed38
