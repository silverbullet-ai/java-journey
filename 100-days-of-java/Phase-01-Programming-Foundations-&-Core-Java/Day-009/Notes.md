# Day 9 – String Methods

---

## 1. Introduction to String

### Definition:
A String is a sequence of characters used to store and manipulate text.

### Example:
```java
String name = "Aahish";
```

---

## 2. Key Features of String Class

- Part of java.lang package (auto-imported)  
- Final class → cannot be extended  
- Immutable → cannot be changed after creation  
- Thread-safe → safe for multi-threading  
- Memory efficient → uses String Pool  

---

## 3. Common String Methods

### 🔹 charAt()
Definition: Returns character at given index  
Syntax:
```java
str.charAt(index);
```
Returns: char  

---

### 🔹 length()
Definition: Returns length of string  
Syntax:
```java
str.length();
```
Returns: int  

---

### 🔹 substring()
Definition: Extracts part of string  
Syntax:
```java
str.substring(start, end);
```
Returns: String  

---

### 🔹 equals()
Definition: Compares two strings (case-sensitive)  
Syntax:
```java
str1.equals(str2);
```
Returns: boolean  

---

### 🔹 equalsIgnoreCase()
Definition: Compares strings ignoring case  
Syntax:
```java
str1.equalsIgnoreCase(str2);
```
Returns: boolean  

---

### 🔹 compareTo()
Definition: Compares lexicographically  
Syntax:
```java
str1.compareTo(str2);
```
Returns: int  

---

### 🔹 contains()
Definition: Checks if substring exists  
Syntax:
```java
str.contains("text");
```
Returns: boolean  

---

### 🔹 toUpperCase()
Definition: Converts to uppercase  
Syntax:
```java
str.toUpperCase();
```
Returns: String  

---

### 🔹 toLowerCase()
Definition: Converts to lowercase  
Syntax:
```java
str.toLowerCase();
```
Returns: String  

---

### 🔹 trim()
Definition: Removes leading and trailing spaces  
Syntax:
```java
str.trim();
```
Returns: String  

---

### 🔹 split()
Definition: Splits string using delimiter  
Syntax:
```java
str.split("delimiter");
```
Returns: String[]  

👉 Delimiter = character used to split (e.g., " ", ",")

---

### 🔹 valueOf()
Definition: Converts other data types to String  
Syntax:
```java
String.valueOf(value);
```
Returns: String  

---

## 4. StringBuilder

### Definition:
A mutable sequence of characters used for efficient string manipulation.

### Why StringBuilder?

👉 Strings are immutable → every change creates new object  
👉 StringBuilder modifies same object → better performance  

---

### Example:
```java
StringBuilder sb = new StringBuilder("Hello");
sb.append(" World");
System.out.println(sb);
```

---

### Key Methods

#### append()
Adds text to end  
```java
sb.append("Java");
```

#### insert()
Inserts at index  
```java
sb.insert(0, "Hi ");
```

#### delete()
Removes part of string  
```java
sb.delete(0, 2);
```

#### reverse()
Reverses string  
```java
sb.reverse();
```

#### toString()
Converts to String  
```java
sb.toString();
```

---

## 5. String vs StringBuilder

| Feature | String | StringBuilder |
|--------|--------|--------------|
| Mutability | Immutable | Mutable |
| Performance | Slower | Faster |
| Thread-safe | Yes | No |
| Use Case | Fixed text | Frequent modifications |

---

## Summary

- String is immutable and widely used  
- Many built-in methods simplify text processing  
- StringBuilder is used for performance optimization  
- Essential for real-world applications (APIs, validation, parsing)  
