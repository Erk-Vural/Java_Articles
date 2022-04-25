# How can you catch exception resource safely ?

Exceptions are unwanted-unexpected events that occurs during the program's execution.
Methods can throw exception object that contains information about name and description
and state of program when the exception occurded.

Some common scenarios where exceptions can occur:

- Invalid user input.
- Out of memory.
- Requesting an unavailable file.
- Connection failure.
- Code errors.

## Exception Handling

In Java programmers use few predefined keywords to handle exceptions.

### try - catch - finally keywords

**try:** Statements that might throw an exception are placed in try blocks. Like IO, Database
operations.

**catch:** A try block always followed by a catch block, if the statements in try
throws exceptions catch block handles it can catch exceptions.There can be multiple
catch blocks that can handle different exceptions in case of try block can throw
more than one exception.

**finally:** Runs after all catch blocks can unclude common code for catch block such as close open connections, logging
details etc.

```java
// Database connection example using try-catch blocks to handle possible ecxeptions.
class ConnJdbc {
    public static void main(String[] args) {
        Connection conn = null;
        try {
            String url = "jdbc:sqlite:path-to-db/chinook/chinook.db";
            // getConnection method throws SQLException
            conn = DriverManager.getConnection(url);

            System.out.println("Connected to Sqlite Database");

        }
        // if statement in try block fails catch handles exception object
        catch (SQLException e) {
            throw new Error("Exception catched", e);
        }
        // After all blocks completed finally runs usually includes operations such as
        // connection closing, logging etc. 
        finally {
            try {
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
            }
        }
    }
}
```

### throw/throws keywords

**throw:** When used program throws an exception, generally used to transfer control
from try block to catch block.

**throws:** Used when an exception may occur in method, it doesn't throw an exception.
Added to method signature.

```java
// throw example if condition is not met throws exception.
class Validate() {
    public static void main(String[] args) {
        if (age < 18)
            throw new ArithmeticException("Users younger than 18 can not access this content.");
    }
}
```

```java
// throws example method throws user defined exception
class Main() {
    public checkUserDefined(long userId) throws BusinessException {
        if (!Objects.nonNull(repository.findByUserId(userId)))
            throw new BusinessException(MessageStrings.CUSTOMER_NOT_FOUND);
    }
}
```

- Exceptions in Java

  https://www.geeksforgeeks.org/exceptions-in-java/

- Try, catch, throw and throws in Java

  https://www.geeksforgeeks.org/try-catch-throw-and-throws-in-java/

- Exception Handling in Java

  https://www.javatpoint.com/exception-handling-in-java