# What is @Autowired Annotation

## Spring Annotations

Annotations in Spring are used to detect the beans in the different layers of appilication. To detect these beans
automatically Spring uses classpath scanning annotations then register each bean in the Application Context.

A generic example for Spring Annotations is @Component it is a generic stereotype for any Spring-managed component.

### Spring @Autowired Annotation

Autowired is for automatic dependency injection, by declaring all bean dependencies in a config file, 2 collaborating
beans can be wired through @Autowired annotation.

### Using @Autowired

### 1. @Autowired on Properties

This eliminates the need for getter and setters.

```java

@Service
public class UserService() {
}

@Controller
public class UserController() {
    
    @Autowired
    UserService userService;
}
```

### 2. @Autowired on Setters

```java

@Controller
public class UserController() {
    UserService userService;

    @Autowired
    public void setUserService(UserService userService) {
        this.userService = userService;
    }
}
```

### 3. @Autowired on Constructors

```java

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    // Here we can write method for calling specified queries.
}

@Service
public class UserService() {
    UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }
}
```

## Resources

- Spring @Autowired Annotation

  https://www.geeksforgeeks.org/spring-autowired-annotation/#:~:text=%40Autowired%20annotation%20is%20optional%20for,while%20creating%20the%20Customer%20object.&text=The%20setter%20method%20will%20be,at%20runtime%20by%20the%20container
  .


- Guide to Spring @Autowired

  https://www.baeldung.com/spring-autowire