# Day 012 – Inheritance and Polymorphism in Java

---

## 1. Need for Inheritance

### Problem Without Inheritance:

```java
class Dog {
    void eat() {
        System.out.println("Eating...");
    }
}

class Cat {
    void eat() {
        System.out.println("Eating...");
    }
}
```

👉 Same code repeated again and again ❌  

---

### Solution with Inheritance:
```java
class Animal {
    void eat() {
        System.out.println("Eating...");
    }
}

class Dog extends Animal {}
class Cat extends Animal {}
```

👉 Code reuse ✅  

---

### Real-World Analogy:

Think of:

- Parent → Animal  
- Children → Dog, Cat  

Children inherit properties from parent.  

---

## 2. What is Inheritance?

### Definition:
Inheritance is the process where one class acquires properties and methods of another class.

### Syntax:
```java
class Child extends Parent {
}
```

---

## 3. Inheritance of Methods and Variables

```java
class Animal {
    void eat() {
        System.out.println("Eating...");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Barking...");
    }
}
```

👉 Dog can use both:
- eat() (inherited)  
- bark() (own)  

---

## 4. Types of Inheritance

### 🔹 1. Single Inheritance
One parent → one child  

```java
class A {}
class B extends A {}
```

---

### 🔹 2. Multilevel Inheritance
Chain of inheritance  

```java
class A {}
class B extends A {}
class C extends B {}
```

---

### 🔹 3. Hierarchical Inheritance
One parent → multiple children  

```java
class A {}
class B extends A {}
class C extends A {}
```

---

## 5. Why Java Does Not Support Multiple Inheritance (with Classes)

### Problem:
Diamond Problem ❌  

```
     A
    / \
   B   C
    \ /
     D
```

👉 D gets ambiguity  

---

### Java Solution:
- Does NOT allow multiple inheritance via classes  
- Uses interfaces instead  

---

## 6. Java Inheritance Hierarchy (InputStream Example)

```
InputStream
   |
   |-- FileInputStream
   |-- ByteArrayInputStream
```

👉 Parent class defines common behavior  
👉 Child classes specialize it  

---

## 7. Representation of Hierarchy

- Tree structure  
- Parent-child relationships  

👉 Helps in understanding system design  

---

## 🔥 Now Comes Polymorphism

---

## 8. What is Polymorphism?

### Definition:
Polymorphism means one name, many forms  

---

### Real-World Analogy:

A person:

- At home → son  
- At office → employee  

Same person, different roles  

---

## 9. Types of Polymorphism

### 🔹 1. Compile-Time Polymorphism
(Method Overloading)  

### 🔹 2. Runtime Polymorphism
(Method Overriding)  

---

## 10. Method Overloading (Recap)

```java
int add(int a, int b) { return a + b; }
int add(int a, int b, int c) { return a + b + c; }
```

---

## 11. Method Overriding

### Definition:
Child class provides its own implementation of parent method  

---

### Example:
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
```

---

### Usage:
```java
Animal a = new Dog();
a.sound(); // Bark
```

---

### Real-World Analogy:

Same action → different behavior  

- Dog → bark  
- Cat → meow  

---

## 12. Constructor Overloading

```java
class Student {
    Student() {}
    Student(String name) {}
}
```

👉 Multiple constructors with different parameters  

---

## 13. Advantages of Polymorphism

- Code flexibility  
- Reusability  
- Easy maintenance  
- Extensibility  

---

## Summary

- Inheritance → code reuse  
- Types → single, multilevel, hierarchical  
- Java avoids multiple inheritance (class level)  
- Polymorphism → one interface, many implementations  
- Overloading → compile-time  
- Overriding → runtime  
