# Day 005 – Looping Statements

---

## 1. What are Loops?

Loops are used to execute a block of code **multiple times** until a condition is met.

### Real-World Analogy:
Imagine doing push-ups:
- You repeat the same motion 10 times
👉 That repetition is a **loop**

---

## 2. Types of Loops in Java

---

### 🔹 1. for Loop

Used when the number of iterations is known.

### Syntax:
```java
for (initialization; condition; update) {
    // code
}
```

### Example:
```java
for (int i = 1; i <= 5; i++) {
    System.out.println(i);
}
```

### Real-World Example:
Counting steps while climbing stairs.

### Infinite for Loop:
```java
for (;;) {
    System.out.println("Infinite Loop");
}
```

---

### 🔹 2. while Loop

Used when the number of iterations is not known beforehand.

### Syntax:
```java
while (condition) {
    // code
}
```

### Example:
```java
int i = 1;
while (i <= 5) {
    System.out.println(i);
    i++;
}
```

### Real-World Example:
Checking messages until no new messages arrive.

### Infinite while Loop:
```java
while (true) {
    System.out.println("Infinite Loop");
}
```

---

### 🔹 3. do-while Loop

Executes at least once, even if condition is false.

### Syntax:
```java
do {
    // code
} while (condition);
```

### Example:
```java
int i = 1;
do {
    System.out.println(i);
    i++;
} while (i <= 5);
```

### Real-World Example:
Trying a password at least once before validation.

### Infinite do-while Loop:
```java
do {
    System.out.println("Infinite Loop");
} while (true);
```

---

## 3. break Statement

### Definition:
Used to terminate the loop immediately.

### Syntax:
```java
break;
```

### Example:
```java
for (int i = 1; i <= 10; i++) {
    if (i == 5) {
        break;
    }
    System.out.println(i);
}
```

### Output:
```
1 2 3 4
```

### Use Case:
- Exit loop when condition is met  
- Search operations  

---

## 4. continue Statement

### Definition:
Skips the current iteration and moves to the next.

### Syntax:
```java
continue;
```

### Example:
```java
for (int i = 1; i <= 5; i++) {
    if (i == 3) {
        continue;
    }
    System.out.println(i);
}
```

### Output:
```
1 2 4 5
```

### Use Case:
- Skip unwanted values  
- Filtering logic  

---

## 5. Key Differences

| Loop Type | When to Use |
|----------|------------|
| for | Known iterations |
| while | Unknown iterations |
| do-while | At least one execution |

---

## 6. Nested Loops

### Definition:
A loop inside another loop is called a **nested loop**.

### Syntax:
```java
for (initialization; condition; update) {
    for (initialization; condition; update) {
        // inner loop code
    }
}

### Example:

```java
for (int i = 1; i <= 3; i++) {
    for (int j = 1; j <= 3; j++) {
        System.out.print("* ");
    }
    System.out.println();
}
```
### Output:

```
* * *
* * *
* * *
```

### Real-World Analogy:

Think of a calendar:

- Outer loop → months
- Inner loop → days

For every month, all days repeat.

### How it Works:

- Outer loop runs once
- Inner loop runs completely for each outer iteration

👉 If outer runs 3 times and inner runs 3 times → total executions = 9  

### Important Insight:

Nested loops are mainly used for:

- Pattern problems
- Matrix operations
- Multi-level iterations

### Infinite Nested Loop Example:

```java
for (;;) {
    for (;;) {
        System.out.println("Infinite Nested Loop");
    }
}
```
⚠️ Avoid unless intentionally required


---

## Summary

- Loops reduce code repetition  
- for → controlled repetition  
- while → condition-based repetition  
- do-while → executes at least once  
- break → exits loop  
- continue → skips iteration 
- nested loops → loop inside loop
