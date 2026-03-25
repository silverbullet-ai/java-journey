# Day 11 – Method Overloading in Java

---

## 1. What is a Method in Java?

### Definition:
A method is a block of code that performs a specific task.

---

### Syntax:
```java
returnType methodName(parameters) {
    // code
}
```

### Example:
```java
void greet() {
    System.out.println("Hello!");
}
```

### Real-World Analogy:
A method is like a machine in a factory:

- Input → raw material  
- Output → finished product  

---

## 2. What is a Constructor?

### Definition:
A constructor is a special method used to initialize objects.

---

### Example:
```java
class Student {
    Student() {
        System.out.println("Object Created");
    }
}
```

### Real-World Analogy:
A constructor is like setting up a new account:

- Name, details are initialized at creation  

---

## 3. Method vs Constructor

| Feature | Method | Constructor |
|--------|--------|-------------|
| Purpose | Perform task | Initialize object |
| Name | Any | Same as class |
| Return Type | Yes/void | No |
| Call | Explicit | Automatic |

---

## 4. Method Overloading

### Definition:
Method overloading means having multiple methods with the same name but different parameters.

---

### Example:
```java
class MathUtils {
    int add(int a, int b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }
}
```

### Real-World Analogy:
Think of a calculator button (+):

- Works for 2 numbers  
- Works for 3 numbers  

👉 Same name, different inputs  

---

### Why Do We Need Method Overloading?

- Improves code readability  
- Avoids creating multiple method names  
- Makes code flexible and reusable  

---

## 5. Ways to Achieve Method Overloading

### 🔹 1. Change Number of Parameters
```java
void show(int a) {}
void show(int a, int b) {}
```

### 🔹 2. Change Data Type of Parameters
```java
void show(int a) {}
void show(double a) {}
```

⚠️ Changing return type alone is NOT enough  

---

## 6. Can We Overload main() Method?

Yes, we can overload it.

### Example:
```java
public class Main {
    public static void main(String[] args) {
        System.out.println("Main method");

        main(10);
    }

    public static void main(int a) {
        System.out.println("Overloaded main: " + a);
    }
}
```

### Important:
JVM only calls:
```java
public static void main(String[] args)
```

---

## 7. this Keyword

### Definition:
`this` refers to the current object  

---

### Use Cases:

#### 🔹 1. Referring to Current Object Variables
```java
class Student {
    String name;

    Student(String name) {
        this.name = name;
    }
}
```

#### 🔹 2. Calling Another Constructor
```java
class Student {
    int age;

    Student() {
        this(20);
    }

    Student(int age) {
        this.age = age;
    }
}
```

### Real-World Analogy:
`this` is like saying:
👉 "This current object I am talking about"  

---

## Summary

- Methods perform actions  
- Constructors initialize objects  
- Overloading allows same method name with different inputs  
- main() can be overloaded but JVM uses standard one  
- this keyword refers to current object  
