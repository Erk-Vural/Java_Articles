# What is LinkedList

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

## What is LinkedList

List is a part of Collection Framework and can be found in java.util package, the class is implementation of LinkedList
data structure. In linkedList is a linear data structure where elements are not stored as in contiguous locations but in
nodes. To access a node we need to iterate from start of link and reach the desired node.

```java
import java.util.LinkedList;

class Main {
    public static void main(String[] args) {
        LinkedList<String> exampleList = new LinkedList<String>();

        exampleList.add("A");
        exampleList.add("B");
        exampleList.add("C");

        exampleList.remove("A");
        exampleList.remove(2);
    }
}
```

### How does LinkedList works

LinkedList acts as a dynamic array and during initalization we don't specifize a size so list automaticly increase and
decrease in size as needed. Every node in linkedList point to next one with a pointer but as a difference from double
linked list last pointer does not point anywhere.

![Alt text](Linkedlist.png?raw=true "Linkedlist Data structure")

## Where to Choose LinkedList over ArrayList

- With the use of generics like Arraylist, Linkedlist can store all types of objects.
- Data Manipulations(insert, remove, update etc.) are faster with Linkedlist because then a node added links between two
  neigbor nodes are broken and reconnected to new node.
- As opposed to Arraylist's data manipulations which requires all memory bits to traversed and shifted, when adding an
  element to Arraylist all elements in front moved one block and similar problem with deletion.

So if we need to manipulate data Linkedlist should be used over Arraylist but when seaching queries Arraylist are faster
because of indexing structure.

## Resources

- Differences between ArrayList and LinkedList in Java

  https://www.tutorialspoint.com/differences-between-arraylist-and-linkedlist-in-java#:~:text=ArrayList%20internally%20uses%20a%20dynamic,List%20to%20store%20its%20elements.&text=ArrayList%20is%20slow%20as%20array,not%20much%20bit%20shifting%20required


- LinkedList in Java

  https://www.geeksforgeeks.org/linked-list-in-java/


- ArrayList vs LinkedList in Java

  https://www.geeksforgeeks.org/arraylist-vs-linkedlist-java/