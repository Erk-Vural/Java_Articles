# What is dependency injection

## Introduction

### What's a Dependency

> Dependency or dependent means relying on something for support. Like if I say we are relying too much on mobile phones than it means we are dependent on them.

Dependency in programming is when class A uses some functionality from class B.Therefore, class A relies on class B to
function properly. In Java, in order to use methods of other classes we need to create an instance of class.

```java
public class Service {
    public String greeting(Object user) {
        return "Hello " + user.name;
    }
}

public class main() {
    Service service;

    public void greetUser(Object user) {
        service.greeting(user);
    }
}
```

## What is Dependency Injection

With Dependency Injection creating dependency objects are handled by a middleman(DI) so class A can use the dependencies
directly. This abstraction allows project to be updated on fly (dependencies can be injected a runtime rather than
compile time). With this class A can use several dependencies without worried about managing it.

### Pros of Dependency Injection

Code is loosely coupled which helps with:

- Performing unit tests
- Reusability of components.
- Extending existing components and applications.
- Maintainability of the project.
- Reduces boiler plate code.

### Cons of Dependency Injection

- Overusing it can lead to management and complexity problems.
- Error that will be detected normally in compile time are pushed to runtime.
- Navigate through code becomes harder and causes loss of developers time.

### Types of Dependency Injection

### 1. Constructor-Based Injection

> Constructor Injection is the act of statically defining the list of required Dependencies by specifying them as parameters to the class’s constructor.

Dependencies are provided through a class constructor. With this way we can guarantee that dependency is always
available for our class because supplying the dependency using this method enables it to be stored for future use.

```java
public class ExampleController {
    // Private instance field to store supplied Dependency
    private ItemService itemService;

    // Constructor statically defines the dependency, requires it as an argument then storing it in a private field for later use.
    public ExampleController(ItemService itemService) {
        this.itemService = itemService;
    }
}
```

### 2. Setter-Based Injection

> The client exposes a setter method that the injector uses to inject the dependency.

Spring Docs recommends this type of DI for optional dependencies and constructor based one for mandatory ones.

 ```java
public class ExampleClass {
    // Private instance field to store supplied Dependency
    private Item item;

    public void setItem(Item item) {
        this.item = item;
    }
}
```

### 3. Interface Injection

The dependency provides an injector method that will inject the dependency into any client passed to it. Clients must
implement an interface that exposes a setter method that accepts the dependency.

## Resources:

- Dependency Injection

  https://www.youtube.com/watch?v=IKD2-MAkXyQ


- A quick intro to Dependency Injection: what it is, and when to use it

  https://www.freecodecamp.org/news/a-quick-intro-to-dependency-injection-what-it-is-and-when-to-use-it-7578c84fa88f/


- Understanding Constructor Injection

  https://freecontent.manning.com/understanding-constructor-injection/


- Intro to Inversion of Control and Dependency Injection with Spring

  https://www.baeldung.com/inversion-control-and-dependency-injection-in-spring


- The 6 Benefits of Dependency Injection

  https://betterprogramming.pub/the-6-benefits-of-dependency-injection-7802b207ec69