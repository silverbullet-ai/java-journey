# Module 2 - OOP (Encapsulation)

## What is Encapsulation?

Encapsulation means binding data and methods together and restricting direct access.

---

## Why Encapsulation?

- Protect data
- Control access
- Improve security
- Better maintainability

---

## Access Modifiers

### private
	Accessible only within the same class

### default (no keyword)
	Accessible within the same package only

### protected
	Accessible within the same package and also in subclasses (even in different packages)

### public
	Accessible everywhere

---

## Access Summary

| Modifier   | Same Class | Same Package | Subclass (Different Package) | Other Packages |
|------------|-----------|--------------|------------------------------|----------------|
| private    | ✅        | ❌           | ❌                           | ❌             |
| default    | ✅        | ✅           | ❌                           | ❌             |
| protected  | ✅        | ✅           | ✅                           | ❌             |
| public     | ✅        | ✅           | ✅                           | ✅             |
---

## Getters and Setters

Used to access and update private variables.

Example:

```java
private int age;

public int getAge() {
    return age;
}

public void setAge(int age) {
    this.age = age;
}
```

---

## Key Concept

- Data should be private
- Access via methods (get/set)

---

## Key Takeaways

- Encapsulation = data hiding
- Use private variables
- Use public methods to access data