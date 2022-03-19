# Difference Between ArrayList and Vector

## What is Vector

Vector is a legacy class, can be found java.util package and implements List interface. It's a dynamic array which means
can grow or shrink in size as required and items can be accesses using index. Vector is syncronized which access of
prevents multiple treads due to this is has poor performance.

```java
import java.util.Vector;

Vector:Vector<T> v=new Vector<T>(); 
```

## What is Arraylist

ArrayList is a resizable class, can be found java.util package and implements List interface. ArrayList is an ordered
collection, and it maintains the insertion order and required and items can be accesses using index. The difference from
Array is that array is fixed size.

```java
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> numbersArrayList = new ArrayList<Integer>();

        numbersArrayList.add(1);
        numbersArrayList.add(2);
        // ArrayList is limited to Integer type so string type item can't be added.
        numbersArrayList.add("testString");
    }
}
```

## Differences Between ArrayList and Vector

ArrayList and Vector both implements List interface, both are dynamically resizable arrays.

1. ArrayList is non-synchronized, Vector is synchronized. Which means with multi tread applications treads can access
   ArrayList at the same time but with Vector treads needs to wait for their turn which causes low performance.
2. When Full ArrayList increase size by %50, Vectors by %100 which means ArrayLists are more memory efficent.
3. ArrayList is not legacy class but vectors are.

## Resources

- Vector vs ArrayList in Java

  https://www.geeksforgeeks.org/vector-vs-arraylist-java/


- Java ArrayList

  https://www.w3schools.com/java/java_arraylist.asp


- Vector Class in Java

  https://www.geeksforgeeks.org/java-util-vector-class-java/