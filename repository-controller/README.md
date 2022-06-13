# What are @Repository and @Controller Annotations

## Spring Annotations

Annotations in Spring are used to detect the beans in the different layers of application. To detect these beans
automatically Spring uses classpath scanning annotations then register each bean in the Application Context.

A generic example for Spring Annotations is @Component it is a generic stereotype for any Spring-managed component.

### Spring @Repository Annotation

This annotation is a specilazed @Component annotation and responsable for storage, retrival, update, delete and search
operations on objects. It's similar to DAO pattern which reponsible for CRUD operations for Database tables.

Below is a simple User entity and UserRepository for demonstrate uses of a repository.

```java

@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    private Long userId;

    @Column(name = "email")
    private String email;

    @Column(name = "password")
    private String password;
}
```

```java

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    // Here we can write method for calling specified queries.
}
```

### Spring @Controller Annotation

This annotation is a specilazed @Component annotation and a classic MVC controller it is typically use @Controller with
@RequestMapping annotation for request handling methods.

```java

@Controller
@RequestMapping("greeting")
public class exampleController() {
    @GetMapping("/")
    public void GetGreeting(@RequestParam String userName) {
        return "Hello there " + userName;
    }
}
```

## Resources

- @Component vs @Repository and @Service in Spring

  https://www.baeldung.com/spring-component-repository-service


- Spring @Repository Annotation

  https://www.journaldev.com/21460/spring-repository-annotation


- Spring @Repository Annotation with Example

  https://www.geeksforgeeks.org/spring-repository-annotation-with-example/


- Spring @Controller Annotation with Example

  https://www.geeksforgeeks.org/spring-controller-annotation-with-example/#:~:text=The%20%40Controller%20annotation%20indicates%20that,as%20a%20web%20request%20handler


- The Spring @Controller and @RestController Annotations

  https://www.baeldung.com/spring-controller-vs-restcontroller
