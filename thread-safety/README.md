# How can you share common resource between threads safely ?

Multithreading is a concept of creating multiple threads of a single process to downsize waiting times of process and
increase efficiency but since multiple threads share single process they have share access to memory, and it should be
kept in mind during using multiple threads.Different threads can access the same resources without exposing erroneous
behavior or producing unpredictable results.

## 1. Stateless Implementations

With a spesific input add method always produces same output therefore this method does not rely on external state nor
maintain a state at all. So, it is thread-safe because all threads can safely call add() method without altering output
of other threads.

```java
class Calculator {
    public static int add(int num1, int num2) {
        return num1 + num2;
    }
}
```

## 2. Immutable Implementations

A class instance is immutable when its internal state can't be modified after it has been constructed. In Java by
declaring all fields private and final we can achieve Immutability. Multiple threads that accessed immutable class have
read-only access so can not change state of the class.

```java
public class PlayerService {
    private final String name;
    private final int level;
    private final double damage;

    public PlayerService(String name, int level, double damage) {
        this.name = name;
        this.level = level;
        this.damage = damage;
    }

    // Getters
}
```

## 4. Thread-local Fields

With defining private fields in Threads we can achieve thread-safety because this fields won't be reachable outside
the thread and other threads won't be change the state of current thread and different
threads can have different thread-local fields.

```java
class TreadExample extends Thread {
    private final List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);

    @Override
    public void run() {
        System.out.println("Thread started.");

        numbers.forEach(System.out::println);
    }
}
```

## 5. Synchronized,Concurrent Collections

In Java, we can use synchronization wrappers included with collections framework or concurrent collections in
java.util.concurrent package to make collections thread safe.

```java
class SynchronizedExample() {
    Collection<Integer> syncCollection = Collections.synchronizedCollection(new ArrayList<>());
    Thread thread1 = new Thread(() -> syncCollection.addAll(Arrays.asList(1, 2, 3, 4, 5, 6)));
    Thread thread2 = new Thread(() -> syncCollection.addAll(Arrays.asList(7, 8, 9, 10, 11, 12)));
    thread1.start();
    thread2.start();
}
```

Using synchronizedCollections we achieve thread safety with lock-unlock the resource so threads can access only one at a
time.

```java
class ConcurrentExample() {
    Map<String, String> concurrentMap = new ConcurrentHashMap<>();
    concurrentMap.put("1","one");
    concurrentMap.put("2","two");
    concurrentMap.put("3","three");
}
```

Using concurrent collections we achieve thread safety with dividing data into segments so multiple treads can reach the
resources at the same time. Concurrent collections are much more performant than synchronized collections, due to the
inherent advantages of concurrent thread access.

## 6. Synchronization

Using syncronization we can achieve thread safety on greater levels, with syncronization we can ensure that only one
thread can access the specified part at a time.

### Synchronized Methods

We can synchronize a method using prefixed synchronized keyword.

```java
class Counter {
    public synchronized void incrementCounter() {
        counter += 1;
    }
}
```

### Synchronized Statements

For getting only a part of a method we can use synchronized statement. Synchronization is expensive, so with this
option, we are able to only synchronize the relevant parts of a method

```java
class Counter {
    public void incrementCounter() {
        // additional unsynced operations
        synchronized (this) {
            counter += 1;
        }
    }
}
```

## Resources

- What is Thread-Safety and How to Achieve it?

  https://www.baeldung.com/java-thread-safety


- Guide to the Synchronized Keyword in Java

  https://www.baeldung.com/java-synchronized
