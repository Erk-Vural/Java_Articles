# Differences between Arraylist, HashSet and TreeSet

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

## What is Hashset

HashSet is a set so all items are unique, and it's located in java.util package.

```java
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        HashSet<String> items = new HashSet<String>();

        items.add("item1");
        // Duplicate element gives a warning
        items.add("item1");
        items.add("item2");

        items.contains("item1");

        items.remove("item2");

        items.clear();
    }
}
```

## What is Treeset

It's located in java.util package.TreeSet implements SortedSet Interface that uses a tree for storage. It also
implements NavigableSet Interface. TreeSet are useful for storing big amounts of sorted data.

- Treeset is a set so all items are unique
- Treeset is a sortedSet so objects are stored in an ascending and sorted order.
- Insertion order of objects does not matter, objects are sorted by keys.

```java
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        TreeSet<String> items = new TreeSet<String>();

        items.add("item1");
        // Duplicate element gives a warning
        items.add("item1");
        items.add("item2");

        System.out.println("First value " + items.first());

        System.out.println("Lower" + items.lower("item2"));

        // Removes a specific element
        items.remove("item2");

        // Removes first or last element
        items.pollFirst();
        items.pollLast();
    }
}
```

## Differences between Arraylist, Hashset and Treeset

1. HashSet and TreeSet are implenmenting Set interface so elements does not duplicate, Arraylist implements List
   interface and can contain duplicates.
2. HashSet and Arraylist are not sorted elements that inserted are stored with an instertion order,Treeset is a
   sortedSet so objects are stored in an ascending and sorted order.
3. Hashset and ArrayList are faster for data manupilation operations (takes constant time), whereas in TreeSet search,
   insert and delete takes O(Log n) which is higher than Hashset and ArrayList.
4. Hashset and Arraylist are allowed null objects but TreeSet does not because TreeSet uses compareTo() method which
   compare keys in case of a null object it throws NullPointerException.
5. For contant use of read/write operations TreeSet is a good choice because of Red-Black binary tree algorithm it uses.

## Resources

- Java HashSet

  https://www.w3schools.com/java/java_hashset.asp


- TreeSet in Java

  https://www.geeksforgeeks.org/treeset-in-java-with-examples/#:~:text=TreeSet%20is%20one%20of%20the,an%20explicit%20comparator%20is%20provided


- HashSet vs TreeSet in Java

  https://www.geeksforgeeks.org/hashset-vs-treeset-in-java/