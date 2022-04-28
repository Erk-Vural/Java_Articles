# What is Optional ? What is it used for ?

Optional is a container object used to contain not-null objects. Optional object is used to
represent null with absent value. This class has various utility methods to facilitate code to handle
values as ‘available’ or ‘not available’ instead of checking null values.
This class is defined under the **_java.util package_**. Optional is a Value-Based Class. We can say
that these classes are final and immutable classes. As it can be understood from here, after the initial
value is assigned to the Optional object, that value cannot be changed.
Optional Class is a very easy and useful method to use. It is a structure that aims to minimize
the NullPointerException errors that occur in the software. Optional Class can also be null, which
makes it easier to check that our classes are null, but if the Optional Class takes a null value, the
management of that class is also easier.Also using Optional improves code readablity.

```java
public class Main {
    public static void main(String[] args) {
        String[] words = new String[10];

        String word = words[5].toLowerCase();

        System.out.println(word);
    }
}
```

In above example returns `Exception in thread "main" java.lang.NullPointerException` to avoid this termination, we can
use Optional class as the example below.

```java
import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        String[] words = new String[10];

        Optiononal<String> checkNull = Optional.ofNullable(words[5]);

        // If a value is present, isPresent() will return true and get() will return the value
        if (checkNull.isPresent()) {
            String word = words[5].toLowerCase();

            System.out.println(word);
        } else {
            System.out.println("word is Null");
        }
    }
}
```

## Creating Optional Object

```java
import java.util.Optional;

class Main {
    public static void main() {
        // Creates an Optional Object
        Optional<String> empty = Optional.empty();

        // Creates an Optional object that can't take null arguments
        String name = "test";
        Optional<String> empty = Optional.of(name);

        // When we expect some null values we can use ofNullable() if we pass mull a null value it returns an empty Optional object 
        String name = "test";
        Optional<String> empty = Optional.ofNullable(name);
    }
}
```

## Checking Value Presence: isPresent() and isEmpty()

```java
import java.util.Optional;

class Main {
    public static void main() {
        Optional<String> optional = Optional.of("Test");

        // Returns true if value is not null
        optional.isPresent();

        // Returns false if value is not null
        optional.isEmpty();

    }
}
```

## Conditional Action With: ifPresent()

```java
import java.util.Optional;

class Main {
    public static void main() {
        String name = "test";

        // Checks if null
        if (name != null) {
            System.out.println(name.length());
        }

        // Above statement refactored using Optional ifPresent()
        Optional<String> optional = Optional.of(name);
        optional.ifPresent(name -> System.out.println(name.length()));
    }
}
```

## Default Value With: orElse(), orElseGet(), orElseThrow()

```java
import java.util.Optional;

class Main {
    public static void main() {
        // If value is null sets a default value for object  
        String nullName = null;
        String name = Optional.ofNullable(nullName).orElse("test");

        // if the Optional value is not present, it takes a supplier functional interface, which is invoked and
        // returns the value of the invocation 
        String nullName = null;
        String name = Optional.ofNullable(nullName).orElseGet(() -> "test");

        // If value nulls it throws NoSuchElementException
        String nullName = null;
        String name = Optional.ofNullable(nullName).orElseThrow();
    }
}
```

Difference between orElse and orElseGet() is when value is null both of them sets a default value but if the value is
not null, and we used a method inside both of them orElseGet() doesn't create the default object but orElse() creates
default object. So when choosing between this two programmer should consider this information.

## Returning Value With get()

```java
class Main {
    public static void main() {
        // If optional is not null then return its value else if value nulls returns no such element exception
        // We should use it cautiously
        Optional<String> optional = Optional.of("test");
        String name = optional.get();
    }
}
```

## filter() and map()

```java
public class Modem {
    private Double price;

    public Modem(Double price) {
        this.price = price;
    }
    // standard getters and setters
}

public class Main {
    // Without Optional filter there is lots of boilerplate code
    public boolean priceIsInRange1(Modem modem) {
        boolean isInRange = false;

        if (modem != null && modem.getPrice() != null
                && (modem.getPrice() >= 10
                && modem.getPrice() <= 15)) {

            isInRange = true;
        }
        return isInRange;
    }

    // Using ofNullable,map, filter, isPresent we achieve same functionalty
    // with simplified the code and improve its readability  
    public boolean priceIsInRange2(Modem modem2) {
        return Optional.ofNullable(modem2)
                .map(Modem::getPrice)
                .filter(p -> p >= 10)
                .filter(p -> p <= 15)
                .isPresent();
    }
}
```

## Resources

- Guide To Java 8 Optional

  https://www.baeldung.com/java-optional


- Java 8 Optional Class

  https://www.geeksforgeeks.org/java-8-optional-class/