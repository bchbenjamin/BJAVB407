In Java, a **package** is a namespace that organizes a set of related classes and interfaces. It acts like a folder on your computer, helping to prevent naming conflicts and making your code easier to manage.

---

### 1. How to Create a Package

To create a package, you must place the `package` statement at the **very first line** of your source code file.

**Step 1:** Create a file named `Calculator.java` inside a directory named `mytools`.

```java
// File: mytools/Calculator.java
package mytools; // The package declaration

public class Calculator {
    public int add(int a, int b) {
        return a + b;
    }
}

```

---

### 2. How to Import a Package

Once your class is in a package, other classes can access it using the `import` statement.

**Step 2:** Create a `Main.java` file (outside the `mytools` directory or in another package).

```java
// File: Main.java
import mytools.Calculator; // Import the specific class

public class Main {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println("Sum: " + calc.add(5, 10));
    }
}

```

---

### 3. Implementation/Compilation Rules

To ensure your code compiles and runs successfully, follow these rules:

* **Folder Structure:** The directory structure **must** match the package name. If your package is `mytools`, the file `Calculator.java` **must** be inside a folder named `mytools`.
* **Compilation:** Navigate to the parent directory (the folder *containing* `mytools`) and compile:
```bash
javac mytools/Calculator.java Main.java

```


* **Execution:** Run the program from the same parent directory:
```bash
java Main

```



---

### Useful Import Techniques

| Type | Syntax | Description |
| --- | --- | --- |
| **Single Class** | `import mytools.Calculator;` | Imports only the specific class. |
| **Entire Package** | `import mytools.*;` | Imports **all** classes in the `mytools` package. |
| **Static Import** | `import static java.lang.Math.PI;` | Allows you to use static members without class qualification (e.g., just `PI` instead of `Math.PI`). |

> **Note:** If you are using an IDE like IntelliJ or VS Code, they usually handle the directory creation and path settings automatically when you create a new package through the "New Package" option.