# What is Transaction

Transactions are a series of actions that must complete successfully. So if one action fails all others' must roll back
to previous unchanged state to ensure integrity of application states or data. It can be a single local transaction  "
Local Transaction" or more than one transaction may be involved "Global transaction".

@Transactional annotation in Spring unsures of integrity of our process, can be specialized with various parameters.

```java
@Transactional
public void processes(Data data){
        // Various processes on Data if one fails process roll back to a unchanged situation.
        process1();
        process2();
        process3();
        process4();
        }

```

### 1. Propangation

Propagation decides when service method called current transaction should continue or a new transaction should create
and set its behavior. Has 7 rules.

```java
@Transactional(propagation = Propagation.REQUIRED)

@Transactional(propagation = Propagation.REQUIRES_NEW)

@Transactional(propagation = Propagation.NESTED)

@Transactional(propagation = Propagation.SUPPORTS)

@Transactional(propagation = Propagation.NOT_SUPPORTED)

@Transactional(propagation = Propagation.NEVER)

@Transactional(propagation = Propagation.MANDATORY)
```

### 2. readOnly

If we specify readonly as true, FlushMode will be set as **FlushMode.NEVER** in current session prevents the session
from commiting the transaction.

```java
@Transactional(readOnly = true)
```

### 2. timeOut

We can set a timeout if process does not complete in time it rolls back.

```java
 @Transactional(timeout = 25)
```

### 2. rollbackFor

We can watch "Checked" and "Unchecked exceptions", with this only given exceptions are catched otherwise commits.

```java
@Transactional(rollbackFor = TransactionalRollBackException.class)
```

## Resources

- Transactions with Spring and JPA

  https://www.baeldung.com/transaction-configuration-with-jpa-and-spring


- Transaction Management

  https://docs.spring.io/spring-framework/docs/4.2.x/spring-framework-reference/html/transaction.html


- Spring Transaction Management: @Transactional In-Depth

  https://www.marcobehler.com/guides/spring-transaction-management-transactional-in-depth


- Introduction to Transactions in Java and Spring

  https://www.baeldung.com/java-transactions