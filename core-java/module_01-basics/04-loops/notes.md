# Module 1 - Basics (Loops)

## What are Loops?
Loops are used to execute a block of code multiple times.

---

## for Loop

Syntax:

```java
for (initialization; condition; update) {
    // code
}
```

Example:

```java
for (int i = 1; i <= 5; i++) {
    System.out.println(i);
}
```

---

## while Loop

Syntax:

```java
while (condition) {
    // code
}
```

Example:

```java
int i = 1;
while (i <= 5) {
    System.out.println(i);
    i++;
}
```

---

## do-while Loop

Syntax:

```java
do {
    // code
} while (condition);
```

Example:

```java
int i = 1;
do {
    System.out.println(i);
    i++;
} while (i <= 5);
```

---

## Key Difference

- for → when number of iterations is known  
- while → when condition-based repetition  
- do-while → runs at least once  

---

## Loop Control

### break
Stops the loop completely

### continue
Skips current iteration

---

## Important Points

- Avoid infinite loops
- Always update loop variable