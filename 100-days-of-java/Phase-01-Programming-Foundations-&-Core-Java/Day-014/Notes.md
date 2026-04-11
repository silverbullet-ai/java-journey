# Day 014 – Abstraction in Java

---

## 1. What is Abstraction?

### Definition:
Abstraction means **hiding implementation details and showing only essential features**.

---

### Real-World Analogy:
Driving a car:
- You use steering, brake, accelerator
- You don’t know engine internals

👉 You use features without knowing implementation

---

## 2. Why Do We Use Abstraction?

- Reduce complexity  
- Improve code readability  
- Increase security  
- Focus only on important details  

---

## 3. Types of Abstraction in Java

### 🔹 1. Abstract Class (Partial Abstraction)
### 🔹 2. Interface (Full Abstraction)

---

## 4. Abstract vs Concrete

- **Abstract Class** → incomplete (may have abstract methods)  
- **Concrete Class** → fully implemented  

---

## 5. Abstract Class in Java

### Definition:
A class declared with `abstract` keyword that **cannot be instantiated**.

### Contains:
- Abstract methods (no body)
- Concrete methods (with body)
- Variables
- Constructors

### Syntax:
```java
abstract class Animal {
    abstract void sound();

    void eat() {
        System.out.println("Eating...");
    }
}
```

### Example:
```java
class Dog extends Animal {
    void sound() {
        System.out.println("Bark");
    }
}
```

### Purpose:
- Provide common structure  
- Force child classes to implement behavior  

---

## 6. Abstract Methods

### Definition:
A method declared without a body

### Syntax:
```java
abstract void methodName();
```

### Example:
```java
abstract class Shape {
    abstract void draw();
}
```

👉 Must be implemented in child class  

---

## 7. Interface in Java

### Definition:
An interface is a blueprint that provides 100% abstraction (conceptually).

### Key Points:
- Uses `interface` keyword  
- Methods are public & abstract by default  
- Implemented using `implements`  

### Syntax:
```java
interface Animal {
    void sound();
}
```

### Example:
```java
class Dog implements Animal {
    public void sound() {
        System.out.println("Bark");
    }
}
```

### Real-World Analogy:
Remote control:
- Buttons defined  
- Device decides behavior  

---

## 8. Abstract Class vs Interface

| Feature | Abstract Class | Interface |
|--------|---------------|----------|
| Methods | Abstract + Concrete | Abstract (by default) |
| Variables | Allowed | Constants only |
| Inheritance | Single | Multiple |
| Keyword | extends | implements |

---

## 9. Abstraction vs Encapsulation

| Feature | Abstraction | Encapsulation |
|--------|------------|--------------|
| Focus | Hiding implementation | Hiding data |
| Achieved by | Abstract class/interface | Private variables |
| Goal | Simplify usage | Secure data |

---

## 10. Advantages of Abstraction

- Reduces complexity  
- Improves maintainability  
- Promotes reusability  
- Enhances security  

---

## 11. Abstraction in Real-World Applications

🔹 APIs  
You call API → don’t know backend logic  

🔹 Frameworks (Spring)  
You use annotations → framework handles logic  

🔹 Libraries  
You use functions → implementation hidden  

🔹 UI Systems  
Buttons, forms → user interacts, logic hidden  

---

## Summary

- Abstraction hides implementation  
- Abstract class → partial abstraction  
- Interface → full abstraction  
- Used heavily in real-world systems  
- Works with encapsulation for secure design  
