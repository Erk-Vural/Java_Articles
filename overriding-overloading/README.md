# What Are the Differences Between Overriding and Overloading

# What is Method Overriding

In OOP overriding allows a subclass or child class to provide a specific implementation for one of the methods of its
superclass or parent classes. For overriding a method in a sub-child class, a metod with same name,parameters, return
type shoud be created.

With overriding we achieve Run Time Polymorphism. When overridden method called in sub-child class, overridden method
will be detected and called. We can call parent class method with super() keyword.

```java
class Parent() {
    public String doSomething() {
        return "Parent does something.";
    }
}

class Child() extends Parent {
    @Override
    public void doSomething() {
        return "Child does something.";
    }
}
```

### Rules of Overriding

- Access Modifiers can be more (private -> public) but can't be less.
- Final methods can not be overridden.
- Static methods can not be overridden.
- Private methods can not be overridden.

# What is Method Overloading

Overloading allows different methods have the same name but with different parameters. Overloading achieves compile time
polymorphism.

```java
public class Example() {
    public String greet(String name) {
        return "Hello " + name;
    }

    public String greet(String name1, String name2) {
        return "Hello " + name1 + " and " + name2;
    }

    public String greet(int age) {
        return "Hello there, wise one " + age;
    }
}
```

# Differences

1. Method overloading is a compile-time polymorphism, Method overriding is run-time polymorphism.
2. Method overloading increase the readability, Method overriding is used for defining a specific implemtation for a
   parent class method.
3. Method overloading not always require inheritance, Method overriding is always require inheritance.
4. Method overloading it occurs within class, Method overriding is between parent and child class.
5. Method overloading return type can be same but parameter needs to change, Method overriding return type must same or
   co-variant.

## Resources

- Difference Between Method Overloading and Method Overriding in Java

  https://www.geeksforgeeks.org/difference-between-method-overloading-and-method-overriding-in-java/


- Overloading in Java

  https://www.geeksforgeeks.org/overloading-in-java/


- Overriding in Java

  https://www.geeksforgeeks.org/overriding-in-java/