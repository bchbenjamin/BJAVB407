In Java, an **Interface** is a reference type, similar to a class, that can contain only constants, method signatures, default methods, static methods, and nested types.

Think of an interface as a **contract**. When a class "implements" an interface, it is essentially promising the compiler: *"I guarantee that I will provide the specific behavior defined by these method names."*

---

### Understanding Interfaces

* **100% Abstract (Historically):** Traditionally, interfaces contained only method signatures (the "what to do") with no implementation (the "how to do it").
* **Multiple Inheritance:** Unlike classes, a Java class can implement **multiple** interfaces. This is the primary way Java handles multiple inheritance of type.
* **Decoupling:** Interfaces allow you to write code that depends on behaviors rather than specific implementations, which makes your system significantly easier to maintain and test.

---

### Interface vs. Abstract Class: The Comparison

While both are used to achieve abstraction, they serve different architectural purposes.

| Feature | Interface | Abstract Class |
| --- | --- | --- |
| **Inheritance** | A class can implement **multiple** interfaces. | A class can extend only **one** abstract class. |
| **State** | Cannot hold instance state (fields are `public static final` constants). | Can have instance variables (non-static, non-final fields). |
| **Constructor** | Does not have constructors. | Can have constructors (called by subclasses). |
| **Methods** | Methods are implicitly `public`. | Can have `private`, `protected`, and `public` methods. |
| **Purpose** | Used to define a **capability** or "can-do" contract. | Used to define a **base identity** or "is-a" relationship. |

---

### When to use which?

#### Use an Interface when:

* You want to define a common capability that can be applied to unrelated classes (e.g., `Serializable`, `Runnable`, or your `Resizable` example).
* You need to support multiple inheritance of type.
* You want to decouple the definition of a service from its implementation (essential for Dependency Injection).

#### Use an Abstract Class when:

* You are building a hierarchy of closely related objects (e.g., a `Vehicle` base class for `Car` and `Truck`).
* You need to share common code, state (fields), or non-public methods among subclasses.
* You want to provide a "template" where some parts are fixed and others must be filled in by subclasses.

---

### The "Identity" Analogy

Imagine a **"Remote Control"** (Interface) vs. a **"Smartphone"** (Abstract Class):

* **Interface (Remote Control):** Anything can be a "Remote Control"—a TV, a fan, or a drone. They don't share a common "parent" necessarily, but they all *must* implement the `powerOn()` and `volumeUp()` buttons. They all have the same "capability."
* **Abstract Class (Smartphone):** An iPhone and a Pixel are both "Smartphones." They share a core "identity" (Battery, Screen, OS). They are fundamentally the same type of thing, just with different implementations of specific features (like the Camera or the UI).