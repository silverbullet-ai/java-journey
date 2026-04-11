# Day 4 – Java Fundamentals & Conditional Statements

---

## 1. Overview of Java

### What is Java?
Java is a **high-level, object-oriented programming language** used to build applications.

### Real-World Analogy:
Think of Java as a **universal language** like English — write once, understood everywhere.

### Why Java is Popular?
- Platform Independent (Write Once, Run Anywhere)
- Strong community support
- Used in backend, Android, enterprise systems

### What Can We Build?
- Web Applications
- Mobile Apps (Android)
- Desktop Software
- Enterprise Systems
- APIs & Backend Services

---

## 2. Java Architecture

### JDK (Java Development Kit)
- Tools to develop Java applications
- Includes compiler

👉 Like a **toolbox for developers**

### JVM (Java Virtual Machine)
- Executes Java bytecode
- Makes Java platform independent

👉 Like a **translator that runs your code**

### JRE (Java Runtime Environment)
- Provides libraries + JVM to run Java

👉 Like a **runtime environment to execute code**

### JIT (Just-In-Time Compiler)
- Improves performance by compiling code at runtime

👉 Like a **speed booster**

---

## 3. Data Types

### Primitive Data Types
Basic building blocks:
- int → integers
- float/double → decimals
- char → single character
- boolean → true/false

```java
int age = 21;
double salary = 50000.50;
char grade = 'A';
boolean isActive = true;
```

### Non-Primitive Data Types
- String
- Arrays
- Objects

👉 Store complex data

---

## 4. Variables

### Definition:
A variable is a container to store data.

### Syntax:
```java
dataType variableName = value;
```

### Example:
```java
int marks = 90;
```

### Real-World Analogy:
A variable is like a labeled box storing something.

---

## 5. Typecasting

### Implicit Casting (Automatic)
Smaller → larger type

```java
int a = 10;
double b = a;
```

### Explicit Casting (Manual)
Larger → smaller type

```java
double x = 10.5;
int y = (int) x;
```

👉 May lose data

---

## 6. First Java Program

```java
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }
}
```

### Explanation:
- main() → entry point
- System.out.println → prints output

---

## 7. Scanner Class (User Input)

```java
import java.util.Scanner;

Scanner sc = new Scanner(System.in);
int num = sc.nextInt();
```

👉 Used to take input from user

---

## 8. Operators

### Arithmetic Operators
- (+) 
- (-) 
- (*) 
- (/) 
- (%)

👉 Used for calculations

### Relational Operators
- (==) 
- (!=) 
- (>, <) 
- (>=, <=)

👉 Used for comparison

### Logical Operators
- && (AND)
- || (OR)
- ! (NOT)

👉 Used to combine conditions

---

## 9. Conditional Statements

### if Statement
```java
if (condition) {
    // code
}
```

👉 Executes when condition is true

---

### if-else Statement
```java
if (condition) {
    // true block
} else {
    // false block
}
```

---

### if-else-if Ladder
```java
if (marks > 90) {
    System.out.println("A");
} else if (marks > 75) {
    System.out.println("B");
} else {
    System.out.println("C");
}
```

---

### switch Statement
```java
switch (day) {
    case 1:
        System.out.println("Monday");
        break;
    case 2:
        System.out.println("Tuesday");
        break;
    default:
        System.out.println("Invalid");
}
```

👉 Cleaner alternative to multiple if-else

---

## Real-World Understanding of Conditionals

Conditionals are like decision making in life:

- If it rains → take umbrella  
- If marks > 90 → reward  
- If balance < 0 → restrict spending  

👉 Programs think the same way.

---

## Summary

- Java is platform independent and widely used  
- Variables store data  
- Data types define what we store  
- Operators perform actions  
- Conditionals control flow of program  
