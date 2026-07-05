To create a **custom exception** in Java, you need to create a class that extends either `Exception` (for checked exceptions) or `RuntimeException` (for unchecked exceptions).

Custom exceptions are useful when you need to handle specific application-level errors that standard Java exceptions cannot describe, such as `InsufficientFundsException` or `InvalidUserRoleException`.

---

### 1. Creating the Custom Exception

It is best practice to provide constructors that allow you to pass a custom message to the parent exception class.

```java
// Custom Unchecked Exception (extends RuntimeException)
public class InvalidAgeException extends RuntimeException {
    
    // Constructor with a custom message
    public InvalidAgeException(String message) {
        super(message);
    }
}

```

---

### 2. Using (Throwing) the Exception

You use the `throw` keyword to trigger the exception when a specific condition is met in your logic.

```java
public class UserRegistration {
    
    public void registerUser(int age) {
        if (age < 18) {
            // Throwing the custom exception
            throw new InvalidAgeException("Registration failed: User must be at least 18 years old.");
        }
        System.out.println("User registered successfully!");
    }
}

```

---

### 3. Handling the Exception

Use a `try-catch` block to handle the exception gracefully, preventing your program from crashing.

```java
public class Main {
    public static void main(String[] args) {
        UserRegistration reg = new UserRegistration();
        
        try {
            reg.registerUser(15);
        } catch (InvalidAgeException e) {
            // Printing the custom error message
            System.err.println("Caught an error: " + e.getMessage());
        }
    }
}

```

---

### Quick Reference: Which one to extend?

| Type | Extend | When to use? |
| --- | --- | --- |
| **Checked** | `Exception` | When the calling code **must** anticipate and handle the error (e.g., File not found, Connection failed). |
| **Unchecked** | `RuntimeException` | When the error is a result of **programming logic** or unexpected bad input (e.g., Invalid age, Null values). |

> **Pro-Tip:** For most application-specific business logic errors, extending `RuntimeException` is often preferred because it makes your code cleaner by not forcing the caller to use `throws` declarations everywhere.
