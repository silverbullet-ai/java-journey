# Module 2 - OOP (Inheritance)

## What is Inheritance?

Inheritance allows one class to acquire properties and methods of another class.

---

## Syntax

```java
class Child extends Parent {
    // inherited properties
}
```

---

## Example

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

---

## Types of Inheritance

### 1. Single Inheritance
	One child inherits one parent

### 2. Multilevel Inheritance
	Chain of inheritance

### 3. Hierarchical Inheritance
	Multiple classes inherit from one parent

---

## Important Points

- Parent class → Superclass  
- Child class → Subclass  
- Child gets access to public and protected members  
- private members are NOT inherited  

---

## Key Takeaways

- Promotes code reuse  
- Builds relationships between classes  
- Reduces redundancy  