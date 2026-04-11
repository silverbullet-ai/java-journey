# Day 8 – String Manipulation in Java

---

## 1. Introduction to String

### Definition:
A String is a sequence of characters used to represent text.

```java
String str = "Hello";
```

👉 Strings are immutable (cannot be changed after creation)

---

## 2. String Class Overview

- Part of java.lang package  
- Immutable  
- Stored in String Pool for memory efficiency  
- Provides many built-in methods for manipulation  

---

## 3. String Concatenation

### Definition:
Combining two or more strings.

### Syntax:
```java
String result = str1 + str2;
```

### Example:
```java
String a = "Hello";
String b = "World";
String result = a + " " + b;
```

👉 Output: Hello World

---

## 4. Substrings

### Definition:
Extracting part of a string.

### Syntax:
```java
str.substring(start, end);
```

### Example:
```java
String str = "JavaProgramming";
System.out.println(str.substring(0, 4));
```

👉 Output: Java

---

## 5. String Length

### Definition:
Returns number of characters.

### Syntax:
```java
str.length();
```

### Example:
```java
String str = "Hello";
System.out.println(str.length());
```

👉 Output: 5

---

## 6. String Comparison

### equals()
```java
str1.equals(str2);
```

👉 Case-sensitive comparison  

---

### compareTo()
```java
str1.compareTo(str2);
```

👉 Lexicographical comparison  

Returns:
- 0 → equal  
- positive → greater  
- negative → smaller  

---

## 7. String Searching & Manipulation

### contains()
```java
str.contains("text");
```

👉 Checks if substring exists  

---

### split()
```java
str.split(" ");
```

👉 Splits string using delimiter  

---

### replace()
```java
str.replace("a", "o");
```

👉 Replaces characters or words  

---

### toUpperCase() / toLowerCase()
```java
str.toUpperCase();
str.toLowerCase();
```

👉 Changes case  

---

## 8. StringBuilder

### Definition:
A mutable sequence of characters used for efficient string operations.

### Example:
```java
StringBuilder sb = new StringBuilder("Hello");
sb.append(" World");
System.out.println(sb);
```

### Key Methods:
```java
sb.append("text");
sb.insert(0, "Hi ");
sb.delete(0, 2);
sb.reverse();
```

---

## 9. StringBuffer

### Definition:
Similar to StringBuilder but thread-safe

### Example:
```java
StringBuffer sb = new StringBuffer("Hello");
sb.append(" Java");
```

---

## 10. String vs StringBuilder vs StringBuffer

| Feature | String | StringBuilder | StringBuffer |
|--------|--------|--------------|-------------|
| Mutability | Immutable | Mutable | Mutable |
| Performance | Slow | Fast | Slower than SB |
| Thread-safe | Yes | No | Yes |

---

## When to Use What?

- String → fixed text  
- StringBuilder → frequent changes (best performance)  
- StringBuffer → multi-threaded environments  

---

## Summary

- Strings are immutable and widely used  
- Many methods simplify manipulation  
- StringBuilder improves performance  
- StringBuffer ensures thread safety  
