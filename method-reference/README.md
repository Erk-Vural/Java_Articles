## What is method reference ? Could u give sample ?

[Functional Interfaces](https://github.com/Erk-Vural/turkcell-java-articles/tree/main/functional-interfaces) in Java
and [lambda expressions](https://github.com/Erk-Vural/turkcell-java-articles/tree/main/lambda-expressions) are
prerequisites required in order to grasp grip over method references in Java. Methods are allowed us to reduce code
duplication.

In Java 8 we can use the method as if they were objects or primitive values, and we can treat them as a variable.

```
Function<Integer, Integer> getSquare = i -> i * i; 

// Using method as a variable
SomeFunction(a, b, getSquare); 
```

Method references are a special type of lambda expressions. They're often used to create simple lambda expressions when
referencing existing methods.

There are 4 types of method references:

- Static methods
- Instance methods of particular object
- Instance methods of an arbitrary object of a particular type
- Constructor

## Method Reference to a Static Method

```
// Lambda calling a static method of a Class
(args) -> Class.staticMethod(args)

// If use method reference we can shortened statement to
Class::staticMethod
```

```java
import java.util.Collections;

public class Person {

    private String name;
    private Integer age;

    // Constructor Getters Setters
}

public class Main {
    public static int compareByName(Person a, Person b) {
        return a.getName().compareTo(b.getName());
    }

    public static void main(String[] args) {
        List<Person> personList = new ArrayList<>();

        personList.add(new Person("luke", 20));
        personList.add(new Person("obi1", 56));

        // Since we only needed compareByName static method from Main class
        // We used method reference to that static method
        List.sort(personList, Main::compareByName);
    }
}
}
```

## Method Reference to Instance methods of particular object

```
(args) -> obj.instanceMethod(args) 

// If use method reference we can shortened statement to
obj::instanceMethod 
```

```java
public class Person {

    private String name;
    private Integer age;

    // Constructor Getters Setters
}

// Example object for getting instance method
public class PersonComparator implements Comparator {
    @Override
    public int compare(Person a, Person b) {
        return a.getAge().compareTo(b.getAge());
    }

}

public class Main {
    public static void main(String[] args) {
        // Created object intance
        PersonComparator personComparator = new PersonComparator();

        // Using lambda for compare persons
        createPersonList().stream()
                .sorted((a, b) -> personComparator.compare(a, b));

        // Using method reference for compare persons, compiler handles parameter passing for us
        createPersonList().stream()
                .sorted(personComparator::compare);
    }
}
```

## Method Reference to Instance methods of an arbitrary object of a particular type

```
(args) -> obj.instanceMethod(args) 

// If use method reference we can shortened statement to
obj::instanceMethod 
```

```java
public class Main {
    public static void main(String[] args) {
        List<Person> personList = new ArrayList<>();

        personList.add(new Person("luke", 20));
        personList.add(new Person("obi1", 56));

        // Method Reference to String type
        List.sort(personList, String::compareToIgnoreCase);

        // Printing the elements(names) on console
        personList.forEach(System.out::println);
    }
}
```

## Method Reference to Constructor

```
(args) -> new ClassName(args) 

// If use method reference we can shortened statement to
ClassName::new
```

```java

public class Person {

    private String name;
    private Integer age;

    // Constructor Getters Setters
}

public class Main {
    public static void main(String[] args) {
        List<Person> personList = new ArrayList<>();

        personList.add(new Person("luke", 20));
        personList.add(new Person("obi1", 56));

        // We called both Bicycle and Array constructors using new
        personList.stream.map(Person::new).toArray(Person[]::new)
    }
}
```

## Resources

- Method References in Java

  https://www.baeldung.com/java-method-references


- Method References in Java with examples

  https://www.geeksforgeeks.org/method-references-in-java-with-examples


- Understanding Java 8 Method References

  https://moandjiezana.com/blog/2014/understanding-method-references/