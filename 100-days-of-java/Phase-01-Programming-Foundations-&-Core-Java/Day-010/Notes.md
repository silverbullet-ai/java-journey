# Day 10 – Object-Oriented Programming (OOP) in Java

---

## 1. What is a Class?

### Definition:
A class is a **blueprint** used to create objects.

---

### Real-World Analogy:
Think of a **Car blueprint**:
- Defines color, speed, engine
- But actual cars are built using it

👉 Class = blueprint  
👉 Object = real entity  

---

## What Does a Class Contain?

### 1. Data Members (Variables)
Store data  

### 2. Methods
Define behavior  

### 3. Constructor
Used to initialize objects  

### 4. Nested Class
Class inside another class (advanced usage)  

---

### Example:
```java
class Car {
    String color; // data member

    void drive() { // method
        System.out.println("Car is moving");
    }
}
```

---

## 2. What is an Object?

### Definition:
An object is an instance of a class.

---

### Properties of an Object:

1. State  
Data (color, speed)

2. Behavior  
Actions (drive, brake)

3. Identity  
Unique reference  

---

### Real-World Example:

Car object:

- State → red, 120km/h  
- Behavior → drive()  
- Identity → car1  

---

## 3. Creating an Object

### Syntax:
```java
ClassName obj = new ClassName();
```

### Example:
```java
Car c1 = new Car();
c1.color = "Red";
c1.drive();
```

---

## 4. What is a Constructor?

### Definition:
A constructor is a special method used to initialize objects.

---

### Key Rules:
- Same name as class  
- No return type  
- Automatically called when object is created  

---

## 5. Types of Constructors

### 🔹 1. Default Constructor

Constructor with no parameters

```java
class Car {
    Car() {
        System.out.println("Default Constructor");
    }
}
```

---

### 🔹 2. Parameterized Constructor

Constructor with parameters

```java
class Car {
    String color;

    Car(String c) {
        color = c;
    }
}
```

### Usage:
```java
Car c1 = new Car("Red");
```

---

### 🔹 3. Copy Constructor

Creates a new object by copying another object

```java
class Car {
    String color;

    Car(Car c) {
        this.color = c.color;
    }
}
```

### Example Usage:
```java
Car c1 = new Car();
c1.color = "Blue";

Car c2 = new Car(c1);
```

---

## 6. Constructor vs Method

| Feature | Constructor | Method |
|--------|------------|--------|
| Purpose | Initialize object | Perform actions |
| Name | Same as class | Any name |
| Return Type | No | Yes/void |
| Call | Automatic | Manual |

---

## 7. Encapsulation

### Definition:
Encapsulation is wrapping data and methods into a single unit and restricting access.

---

### Real-World Analogy:
Think of a capsule medicine:
- Data is inside  
- You can't access it directly  

---

### How to Achieve Encapsulation?

- Make variables private  
- Provide getter and setter methods  

---

### Example:
```java
class Student {
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
```

### Usage:
```java
Student s = new Student();
s.setName("Aahish");

System.out.println(s.getName());
```

---

## Summary

- Class → blueprint  
- Object → real instance  
- Constructor → initializes object  
- Encapsulation → data hiding  

👉 This is the foundation of real-world software design  
