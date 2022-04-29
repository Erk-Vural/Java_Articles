# What is functional interface ? What is it used for ?

Java is an Object-Oriented-Programming language(OOP). So apart from some primitive methods and data types, for all
functions (methods as we called in Java) in order to use these methods we have to use their classes or objects.

Functional interface is an interface that only contains **_one abstract method_** **SAM** (Single Abstract Method)
. They can have only one functionality to
exhibit. [Lambda expressions](https://github.com/Erk-Vural/turkcell-java-articles/tree/main/lambda-expressions) can be
used as
its implementation. A functional interface can have multiple default methods.

Functional Interfaces are Included in Java with Java SE 8 with **_Lambda Expressions_** and **_Method References_** to
makethe code more readable, clean and straightforward. Functional interfaces can only contain one abstract method, to
ensure the interface is satisfying the conditions we can use _**@FunctionalInterface**_ annotation for clearly
communicate the purpose of the interface. This annatotation also allows compiler to generate an error message if
interface does not satisfy required conditions.

In Functional interfaces we don't have to use **_abstact_** keyword because, by default the method defined inside the
interface is abstract only. We can call Lambda expressions as the instance of functional interface as before Java 8 (
Where Lambda expressions are introduced) we had to
create [anonymous inner class](https://www.geeksforgeeks.org/difference-between-anonymous-inner-class-and-lambda-expression)
objects or implement these interface.

```java
interface Student {
    void getEnrollDate();
}

class Main {
    public static void main(String[] args) {
        // Impl class is implementation class of Student interface.
        ImplClass obj = new ImplClass(2022);

        // Calling getEnrollDate at ImplClass
        obj.getEnrollDate();
    }
}

class ImplClass(int enrollDate) implements Student {
    @Override
    public getEnrollDate() {
        System.out.println("Enroll date is " + enrollDate);
    }
}
```

In above example we demonstrated **anonymous inner class**, where in order to use our interface we need to implement it
in a class(can be abstract or concrete).

```java

@FunctionalInterface
interface Student {
    abstract void getEnrollDate();
}

class Main {
    public static void main(String[] args) {
        Student student = (int enrollDate) -> System.out.println("Enroll date is " + enrollDate);

        student.getEnrollDate(2022);
    }
}
```

In above example we demonstrated the use of **lambda expression**. In addition, of**lambda expression** we also used
**@FunctionalInterface** annotation which ensures that interface can't have more than one abstract method otherwise
complier flags **‘Unexpected @FunctionalInterface annotation’** message. And an abstract keyword to remind the reader
that Functional Interface can only have one abstract method. However, both additions are not mandotory to create a
Functional Interface.

The main differences from **anonymous inner class** are:

- Enable to treat functionality as a method argument.
- A function that can be created without belonging to any class(since in Java every funtion needs to belong a class, as
  explained start of the article).
- A lambda expression can be passed around as if it was an object and executed on demand.

## Built-in Java Functional Interfaces

Since Java SE 1.8 onwards, there are many interfaces that are converted into functional interface. All these interfaces
are annotated with **@FunctionalInterface**.

- [Runnable](https://docs.oracle.com/javase/7/docs/api/java/lang/Runnable.html) –> This interface only contains the
  run() method.
- [Comparable](https://docs.oracle.com/javase/8/docs/api/java/lang/Comparable.html)–> This interface only contains the
  compareTo() method.
- [ActionListener](https://docs.oracle.com/javase/8/docs/api/java/lang/Comparable.html) –> This interface only contains
  the actionPerformed() method.
- [Callable](https://docs.oracle.com/javase/7/docs/api/java/util/concurrent/Callable.html) –> This interface only
  contains the call() method.

With Java SE 8 there are four main kinds of functional interfaces which can applided to multiple situations. For detail
visit [Difference between Predicate and Consumer , Supplier functional interfaces?](https://github.com/Erk-Vural/turkcell-java-articles/tree/main/predicate-supplier-consumer)

- Consumer
- Predicate
- Function
- Supplier

## Resources

- Functional Interfaces in Java

  https://www.geeksforgeeks.org/functional-interfaces-java


- Functional Interfaces in Java 8

  https://www.baeldung.com/java-8-functional-interfaces


- Functional Interfaces in a nutshell for Java developers

  https://piyush5807.medium.com/functional-interfaces-in-a-nutshell-for-java-developers-54268e25324


- Difference between Anonymous Inner Class and Lambda Expression

  https://www.geeksforgeeks.org/difference-between-anonymous-inner-class-and-lambda-expression
