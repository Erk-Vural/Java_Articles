# What is dependency injection

## Introduction

### What's a Dependency

> Dependency or dependent means relying on something for support. Like if I say we are relying too much on mobile phones than it means we are dependent on them.

Dependency in programming is when class A uses some functionality from class B.Therefore, class A relies on class B to
function properly. In Java, in order to use methods of other classes we need to create an instance of class.

`Student studentInstance = new Student();`

### What is Dependency Injection

With Dependency Injection creating dependency objects are handled by a middleman(DI) so class A can use the dependencies
directly. This abstraction allows project to be updated on fly (dependencies can be injected a runtime rather than
compile time). With this class A can use several dependencies without worried about managing it.

### Types of Dependency Injection

1. ### Constructor Injection
  

2. ### Setter Injection

3. ### Interface Injection

### Resources:

- Dependency Injection

  https://www.youtube.com/watch?v=IKD2-MAkXyQ


- A quick intro to Dependency Injection: what it is, and when to use it

  https://www.freecodecamp.org/news/a-quick-intro-to-dependency-injection-what-it-is-and-when-to-use-it-7578c84fa88f/


- Intro to Inversion of Control and Dependency Injection with Spring

  https://www.baeldung.com/inversion-control-and-dependency-injection-in-spring