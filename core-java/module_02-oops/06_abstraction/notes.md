# Module 2 - OOP (Abstraction)

## What is Abstraction?

Abstraction means hiding implementation details and showing only essential features.

---

## Abstract Class

- Declared using abstract keyword
- Can have abstract and non-abstract methods
- Cannot be instantiated

Example:

```java
abstract class Animal {
    abstract void sound();

    void sleep() {
        System.out.println("Sleeping...");
    }
}
```

---

## Abstract Method

- Declared without body
- Must be implemented by subclass

---

## Interface

- Contains only abstract methods (by default)
- Supports multiple inheritance
- Methods are public and abstract by default

Example:

```java
interface Animal {
    void sound();
}
```

---

## Difference: Abstract Class vs Interface

| Feature           | Abstract Class       | Interface            |
|------------------|---------------------|----------------------|
| Methods           | Abstract + concrete | Only abstract        |
| Inheritance       | Single              | Multiple             |
| Keyword           | extends             | implements           |

---

## Key Takeaways

- Abstract class → partial abstraction  
- Interface → full abstraction  
- Used for designing systems  