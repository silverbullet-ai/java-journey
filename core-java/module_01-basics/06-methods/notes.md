# Module 1 - Basics (Methods)

## What are Methods?

Methods are blocks of code that perform a specific task.

They help in:
- Code reuse
- Better readability
- Modular programming

---

## Syntax

```java
returnType methodName(parameters) {
    // code
    return value;
}
```

---

## Example

```java
public static void greet() {
    System.out.println("Hello!");
}
```

---

## Calling a Method

```java
greet();
```
---

## Types of Methods

### 1. Without Parameters

```java
public static void greet() {
    System.out.println("Hello!");
}
```

---

### 2. With Parameters

```java
public static void greetUser(String name) {
    System.out.println("Hello " + name);
}
```

---

### 3. With Return Type

```java
public static int add(int a, int b) {
    return a + b;
}
```

---

## Important Points

- void → no return value
- return → sends value back
- methods must be called to execute