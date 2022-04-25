# What are the types of exceptions ? How can you raise exception inside method ?

## What is an Exception?

Exceptions are unwanted-unexpected events that occurs during the program's execution.
Methods can throw exception object that contains information about name and description
and state of program when the exception occurded.

Some common scenarios where exceptions can occur:

- Invalid user input.
- Out of memory.
- Requesting an unavailable file.
- Connection failure.
- Code errors.

### Errors vs Exceptions

- Error represents irrecoverable conditions such as; JVM run out of memory, memory leaks, infinite recursions, stack
  overflow errors etc., Errors are not recommended to be handled.
- Exception indicates conditions that should be handled.

### Exception Hierarchy

![exception-hierarchy](exception-hierarchy.png "Exception Hierarchy")

## Exception Types

![exception-types](exception-types.jpg "Expetion Types")

## 1. Built-in Exceptions

Built-in exceptions are pre defined exceptions that suitable certain situtations, they are available in Java libraries.

```java
import java.io.FileWriter;   // Import the FileWriter class
import java.io.IOException;

class Example {
    // Method raises a built-in exception and should be handled in a try-catch block.
    public void writeToFile(String message, String filePath) throws IOException {
        // Example code for writing to file
        FileWriter myWriter = new FileWriter("filename.txt");
        myWriter.write("Example text");
    }
}
```

### Checked Exceptions

Checked Expections are checked during compile-time by complier.

### Unchecked Exceptions

Unchecked Exceptions are not checked during compile-time. Programmers need to handle or declare them or program not
going to give compilation errors.

```java
class Example {
    public static void main(String[] args) {
        // Division by zero exception should be thrown but since it's not handled. This error won't be caught during compile-time.
        int x = 0;
        int y = 7;
        int z = y / x;
    }
}
```

## 2. User-Defined Exceptions

Built-in exceptions cannot describe all situation, for this reason programmer can write specialized exceptions to
describe specific conditions on project. This custom classes should extend Exception class.

The advantages of Exception Handling in Java are as follows:

- Provision to Complete Program Execution
- Easy Identification of Program Code and Error-Handling Code
- Meaningful Error Reporting
- Identifying Error Types

## Resources

- Exceptions in Java

  https://www.geeksforgeeks.org/exceptions-in-java/


- Java - Exceptions

  https://www.tutorialspoint.com/java/java_exceptions.htm


- Lesson: Exceptions

  https://docs.oracle.com/javase/tutorial/essential/exceptions/index.html