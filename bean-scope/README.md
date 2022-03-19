# What is Bean Scope

## What is Bean

> Beans are the backbone of the application.

Beans are objects that instantiated, assembled and managed by Spring IoC containers.

Spring beans are defined either in spring config file or by using annotations(@), instantiated by the spring container
and injected into our application.

## What is Spring Bean Scope

When defining a bean we have the option of declaring a scope for it. Scope of a bean defines the life cycles and
visibility of the beans in used context.

Spring Bean Scopes gives us more control on the creation of bean instances and there are 6 different types of scopes.

### 1. Singleton Scope

This scope is the default one unless defined otherwise.Defining Singleton scope ensures that only a single instance of
bean will be created, all request for the bean will return the same object and any changes on object will be reflected
in all references of the bean.

```java
public class exampleClass() {
    @Bean
    @Scope(value = "singleton")
    public Item singletonItem() {
        return new Item();
    }
}
```

or we can use a constant for defining

```java
@Scope(value = ConfigurableBeanFactory.SCOPE_SINGLETON)
```

### 2. Prototype Scope

Prototype scope will return a different instance everytime it's requested from container. Defining is similar with "
Singleton scope".

### 3. Web Aware Scopes

These scopes are only available for web-aware applications.

### 3.1. Request Scope

Request scope creates a bean instance for an HTTP request, and it's lifecycle is ended when HTTP request is completed.

```java
public class exampleClass() {
    @Bean
    @Scope(value = "request", proxyMode = ScopedProxyMode.TARGET_CLASS)
    public Item singletonScopeItem() {
        return new Item();
    }
}
```

We have a @RequestScope annotation as a shortcut for above definition.

```java

@Bean
@RequestScope
public class exampleClass() {
    public Item requestScopeItem() {
        return new Item();
    }
}
```

### 3.2. Session Scope

Session scope creates a bean instance for an HTTP session, and it's lifecycle is ended when HTTP session is completed.

Defining is similar with "Request scope".

### 3.3. Application Scope

Application scope bean is instantiated for an application , it's similar to "Singleton scope" but bean is shared across
multiple applications versus Singleton is available for only available for single application context.

Defining is similar with "Request scope".

### 3.4. Websocket Scope

This scope too similar to "Singleton scope" but only available for a WebSocket session.

```java

@Bean
@Scope(scopeName = "websocket", proxyMode = ScopedProxyMode.TARGET_CLASS)
public class exampleClass() {
    public Item requestScopeItem() {
        return new Item();
    }
}
```

## Resources

- Quick Guide to Spring Bean Scopes

  https://www.baeldung.com/spring-bean-scopes


- Spring Bean Scopes

  https://www.journaldev.com/21039/spring-bean-scopes


- Use/Purpose of beans in Spring

  https://stackoverflow.com/questions/16544050/use-purpose-of-beans-in-spring


- Spring - Bean Scopes

  https://www.tutorialspoint.com/spring/spring_bean_scopes.htm