# What is thread ? How do you make a thread in java?

## What is a thread?

Threading enables performing multiple actions simultaneously on a single machine,
without interrupting the main program. Threads got seperate parts of execution.

**Multithreading** is a concept of creating multiple threads of a single process to downsize
waiting times of process and increase efficiency but since multiple threads share single
process they have share access to memory, and it should be kept in mind during using multiple threads.

### Where to use threads?

Using threads does not ensure of a faster program. If program has too many threads creating and
managing threads will become an expensive operation. Additionally, managing a threadpool
is not an easy task unless using tools like "ThreadPool etc.".

Programmer should consider multithreading when program has:

- Operations that could have long waiting times(Waiting form input, database validation opeations etc.)
- Asynchronous operations
- Operations that can be parallelized
- Continual running background operations

### Thread Lifecycle

![tread-lifecyle](treads.png)

#### 1. New State:

In this state, code has not yet been run and the execution process is not yet initiated.

#### 2. Active State:

When a Thread in new state invokes with the start() method transfers to this state.

- Runnable State:
  In this state Thread is ready to run to not currenty running, when a multihreaded program runs threads shares slices
  of time intervals and this job is managed by Thread Scheduler.

- Running State:
  When Runnable Thread recevied resources from CPU by Thread Scheduler, Thread transfers to this state and dynamically
  moves back and forth depending on time slices.

#### 3. Waiting/Blocked State:

**Wating:** When 2 threads are waiting for accessing same resource 1 of the threads enters waiting state or a request
like(IO, form request etc.) has been made until the response returns thread enters waiting state.

**Blocked:** When 2 or threads are scheduled for same time interval Tread Scheduler creates a queue and clears the
queue by rejecting unwanted Thread and allocating CPU on a priority basis.

#### 4. Terminated State:

This state means thread is terminated and no longer available can be due to several reasons:

- When a tread finishes its task normally.
- Sometimes Threads may be terminated due to unusual events like segmentation faults,
  exceptions…etc. and such kind of Termination can be called Abnormal Termination.

## How do you create a thread in java?

### Thread Class

Threads can be created by extending Tread Class and overriding its run() method. Thread Class provides methods and
constructor for creting and using threads.

```java
class TreadExample extends Thread {
    public static void main(String[] args) {
        // Initialized thread its in new state    
        TreadExample thread1 = new TreadExample();

        // Invoing Thread to runnable state
        thread1.start();
    }

    public void run() {
        System.out.println("Thread started.");
    }
}
```

### Runnable Interface

This is the recommended way to creating Threads because in Java a class can implement multiple interfaces but can't
extend multiple classes.

```java
class TreadExample implements Runnable {
    public static void main(String[] args) {
        // Initialized thread its in new state    
        TreadExample thread1 = new TreadExample();

        // Invoing Thread to runnable state
        thread1.start();
    }

    public void run() {
        System.out.println("Thread started.");
    }
}
```

## Resources

- Java Threads

https://www.w3schools.com/java/java_threads.asp

- Java Threads | How to create a thread in Java

https://www.javatpoint.com/how-to-create-a-thread-in-java

- Java Threads

https://www.geeksforgeeks.org/java-threads/

- When Should I Use Threads?

https://stackoverflow.com/questions/2857184/when-should-i-use-threads