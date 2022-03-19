# What is Pointcut and Advice

AOP(Aspect Oriented Programming) and DI(Dependency Injection) are 2 core concepts of Spring framework.

## What is Spring AOP

For enterprise level projects reusability and modularity are important concerns. With OOP(Object-Oriented Programming)
these concerns are achieved via classes but with ever-growing requirements and needs our project can become too
complicated so readability and maintainability of the project is under risk. So AOP complements OOP and aims to increase
modularity by separating cross-cutting concerns and does this by adding additional behavior(aspects) to code without
modifying existing code.

![Alt text](example.jpg?raw=true "Program Execution with AOP")

### Main Concepts of Spring AOP

### 1. Aspect

> An aspect is a modularization of a concern that cuts across multiple objects.

In Spring AOP, aspects are implemented using regular classes(schema-based approach) or regular classes annotated with
the @Aspect annotation (@AspectJ style).

### 2. Join point

Jointpoint is a point that represents a method execution or handling of an exception.

### 3. Pointcut

Pointcut helps Advice to be applied by an Ascept at a particular Jointpoint.

### 4. Advice

Advice is an action(method) that taken by aspect at a point specified by a Pointcut. It has different types such as "
around", "before", "after".

## Resources

- Spring AOP Example Tutorial – Aspect, Advice, Pointcut, JoinPoint, Annotations, XML Configuration

  https://www.journaldev.com/2583/spring-aop-example-tutorial-aspect-advice-pointcut-joinpoint-annotations


- Spring AOP - Annotation Based PointCut

  https://www.tutorialspoint.com/springaop/springaop_pointcut_methods1.htm


- Aspect Oriented Programming with Spring

  https://docs.spring.io/spring-framework/docs/2.0.x/reference/aop.html#:~:text=Advice%20is%20associated%20with%20a,AspectJ%20pointcut%20language%20by%20default


- Introduction to Spring AOP

  https://www.baeldung.com/spring-aop