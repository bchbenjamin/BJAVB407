An **abstract class** in Java is a class that cannot be instantiated on its own. It is designed to be a base class for other classes to extend, serving as a template to define a common structure and behavior for a group of related subclasses.

---

### Key Characteristics

* **Cannot be Instantiated:** You cannot create an object of an abstract class using the `new` keyword (e.g., `new MyAbstractClass()` will throw a compiler error).
* **Abstract Methods:** It can contain abstract methods (methods declared without a body). Subclasses **must** provide the implementation for these methods unless the subclass is also abstract.
* **Concrete Methods:** It can also contain fully implemented (concrete) methods. This allows you to share code among multiple subclasses.
* **Fields and Constructors:** It can have fields (member variables) and constructors. Constructors in abstract classes are called when a subclass is instantiated to initialize the state of the base class.
* **Access Modifiers:** Methods can be `public`, `protected`, or package-private (but not `private` if they are abstract, as they need to be overridden).

---

### Basic Syntax

```java
abstract class Animal {
    String name;

    // Constructor
    Animal(String name) {
        this.name = name;
    }

    // Concrete method: All animals share this behavior
    void eat() {
        System.out.println(name + " is eating.");
    }

    // Abstract method: Must be implemented by subclasses
    abstract void makeSound();
}

```

---

### Example Usage

```java
class Dog extends Animal {
    Dog(String name) {
        super(name);
    }

    @Override
    void makeSound() {
        System.out.println(name + " says: Woof!");
    }
}

public class Main {
    public static void main(String[] args) {
        // Animal a = new Animal(); // This would cause an error
        Dog myDog = new Dog("Buddy");
        myDog.eat();      // Inherited concrete method
        myDog.makeSound(); // Overridden abstract method
    }
}

```

---

### When to Use Abstract Classes vs. Interfaces

| Feature | Abstract Class | Interface |
| --- | --- | --- |
| **Inheritance** | A class can extend only **one** abstract class. | A class can implement **multiple** interfaces. |
| **State** | Can have non-static/non-final fields. | Fields are implicitly `public static final`. |
| **Methods** | Can have methods with any visibility (public/protected). | Methods are implicitly `public`. |
| **Purpose** | Used for **"is-a"** relationships (code sharing). | Used for **"can-do"** relationships (capabilities/contracts). |

### When should you use them?

Use an **abstract class** when you want to share code among several closely related classes or when you need to define non-public methods or maintain state (fields) that subclasses should inherit.

Would you like to see a more complex example involving abstract classes in a real-world scenario, such as a payment processing system?