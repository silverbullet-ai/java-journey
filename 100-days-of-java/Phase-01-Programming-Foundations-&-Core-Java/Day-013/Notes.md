# Day 013 – Method Overriding in Java

---

## 1. Introduction to Method Overriding

### Definition:
Method overriding occurs when a **child class provides a specific implementation of a method already defined in the parent class**.

---

### Syntax:
```java
class Parent {
    void show() {
        System.out.println("Parent method");
    }
}

class Child extends Parent {
    void show() {
        System.out.println("Child method");
    }
}
```

### Real-World Analogy:
Think of a remote control:

- Button = same  
- Function = changes based on device  

👉 Same method, different behavior  

---

## 2. Conditions for Method Overriding

- Same method name  
- Same parameters  
- Same return type (or covariant)  
- Must be in child class  
- Must have inheritance  

---

## 3. Example

```java
class Animal {
    void sound() {
        System.out.println("Animal sound");
    }
}

class Dog extends Animal {
    void sound() {
        System.out.println("Bark");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal a = new Dog();
        a.sound();
    }
}
```

👉 Output: Bark (runtime decision)  

---

## 4. @Override Annotation

### Definition:
Indicates that a method is overriding a parent method.

### Example:
```java
class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Bark");
    }
}
```

👉 Helps avoid errors  

---

## 5. Rules of Method Overriding

- Access modifier can be same or more permissive  
- Cannot reduce visibility  
- Cannot override final method  
- Static methods cannot be overridden (only hidden)  
- Private methods are not inherited → cannot override  

---

## 6. Method Overriding vs Method Overloading

| Feature | Overriding | Overloading |
|--------|-----------|------------|
| Class | Different classes | Same class |
| Parameters | Same | Different |
| Binding | Runtime | Compile-time |
| Purpose | Change behavior | Add flexibility |

---

## 7. Polymorphism and Overriding

### Runtime Polymorphism:
```java
Animal a = new Dog();
a.sound();
```

👉 JVM decides method at runtime  

---

### Real-World Analogy:

Driver:

- Drives car 🚗  
- Drives bike 🏍️  

Same action → different behavior  

---

## 8. Why We Cannot Override Certain Methods?

### 🔹 final Method
```java
final void show() {}
```
👉 Cannot be overridden  
Reason: Prevent modification  

---

### 🔹 static Method
```java
static void show() {}
```
👉 Belongs to class, not object  
→ No runtime polymorphism  

---

### 🔹 private Method
```java
private void show() {}
```
👉 Not accessible in child class  
→ Not inherited  

---

## 9. super Keyword in Overriding

### Definition:
Used to call parent class method  

### Example:
```java
class Animal {
    void sound() {
        System.out.println("Animal sound");
    }
}

class Dog extends Animal {
    void sound() {
        super.sound();
        System.out.println("Bark");
    }
}
```

👉 Output:
```
Animal sound
Bark
```

---

## 10. Advantages of Method Overriding

- Enables runtime polymorphism  
- Improves code flexibility  
- Supports dynamic method dispatch  
- Makes code extensible  

---

## Summary

- Overriding = redefining parent method  
- Happens at runtime  
- Requires inheritance  
- super calls parent method  
- Not allowed for final, static, private  
