# Day 15 – Interfaces in Java

---

## 1. Introduction to Interfaces

### Definition:
An interface is a blueprint that provides **complete abstraction**.

---

### Purpose:
- Define what a class should do  
- Hide implementation details  
- Achieve multiple inheritance  

---

### Keyword:
```java
interface InterfaceName {
}
```

### Real-World Analogy:
Think of a remote control:
- Buttons defined  
- Actual behavior depends on device  

---

## 2. Interface Syntax in Java

### Declaration:
```java
interface Animal {
    void sound();
}
```

### Key Points:
- Methods → public & abstract by default  
- Variables → public static final  
- No method body (traditionally)  

---

## 3. Implementing an Interface

### Syntax:
```java
class Dog implements Animal {
    public void sound() {
        System.out.println("Bark");
    }
}
```

### Example:
```java
interface Animal {
    void sound();
}

class Dog implements Animal {
    public void sound() {
        System.out.println("Bark");
    }
}
```

---

## 4. Multiple Interfaces

### Definition:
A class can implement multiple interfaces  

### Syntax:
```java
class ClassName implements Interface1, Interface2 {
}
```

### Example:
```java
interface A {
    void show();
}

interface B {
    void display();
}

class Test implements A, B {
    public void show() {
        System.out.println("Show");
    }

    public void display() {
        System.out.println("Display");
    }
}
```

---

## 5. Characteristics of Interfaces

- Cannot be instantiated  
- Methods are abstract (by default)  
- Supports multiple inheritance  
- Provides loose coupling  

---

## 6. Default and Static Methods

### Default Method:
```java
interface Animal {
    default void eat() {
        System.out.println("Eating");
    }
}
```

### Static Method:
```java
interface Animal {
    static void info() {
        System.out.println("Animal interface");
    }
}
```

---

## 7. Multiple Inheritance with Interfaces

### Definition:
Java allows multiple inheritance using interfaces  

### Example:
```java
interface A {
    void show();
}

interface B {
    void show();
}

class Test implements A, B {
    public void show() {
        System.out.println("Resolved ambiguity");
    }
}
```

👉 No diamond problem (must implement method)  

---

## 8. Interface vs Abstract Class

| Feature | Interface | Abstract Class |
|--------|----------|---------------|
| Methods | Abstract (default) | Abstract + Concrete |
| Inheritance | Multiple | Single |
| Keyword | implements | extends |
| Use Case | Full abstraction | Partial abstraction |

---

## 9. Real-World Example

### Payment System:
```java
interface Payment {
    void pay();
}

class UPI implements Payment {
    public void pay() {
        System.out.println("UPI Payment");
    }
}

class Card implements Payment {
    public void pay() {
        System.out.println("Card Payment");
    }
}
```

👉 Same interface, different implementations  

---

## 10. Marker Interfaces

### Definition:
Empty interface (no methods)  

### Purpose:
Used to mark a class  

### Example:
```java
interface Marker {}

class Test implements Marker {}
```

👉 Used internally by JVM  

---

## 11. Functional Interfaces

### Definition:
Interface with only one abstract method  

### Annotation:
```java
@FunctionalInterface
interface A {
    void show();
}
```

### Example:
```java
@FunctionalInterface
interface A {
    void show();
}

class Test {
    public static void main(String[] args) {
        A obj = () -> System.out.println("Lambda Expression");
        obj.show();
    }
}
```

### Use Case:
- Lambda expressions  
- Functional programming  

---

## 12. Advantages of Interfaces

- Achieve abstraction  
- Support multiple inheritance  
- Improve flexibility  
- Promote loose coupling  

---

## 13. Interfaces in Frameworks

🔹 Spring Framework  
Uses interfaces for services and repositories  

🔹 APIs  
Define contract between systems  

🔹 Libraries  
Provide reusable functionality  

---

## Summary

- Interface → full abstraction  
- Supports multiple inheritance  
- Functional interfaces enable lambda  
- Widely used in real-world frameworks  
