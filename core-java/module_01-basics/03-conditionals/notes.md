# Module 1 - Basics (Conditionals)

## What are Conditionals?
Conditionals allow a program to make decisions based on conditions.

---

## if Statement

Syntax:  

```java
if (condition) {  
    // code
}
```

Example:

```java
if (age >= 18) {
    System.out.println("Eligible to vote");
}
```

---

## if-else Statement

```java
if (condition) {
    // true block
} else {
    // false block
}
```

---

## else-if Ladder

```java
if (condition1) {
    // code
} else if (condition2) {
    // code
} else {
    // default
}
```

---

## Nested if

```java
if (condition1) {
    if (condition2) {
        // code
    }
}
```

---

## Important Points

- Conditions must return boolean (true/false)
- Use relational operators (>, <, ==, etc.)
- Logical operators (&&, ||) can combine conditions

---

## Example

```java
int marks = 75;

if (marks >= 90) {
    System.out.println("Grade A");
} else if (marks >= 60) {
    System.out.println("Grade B");
} else {
    System.out.println("Grade C");
}
```

---

## Key Takeaways
- Conditionals control program flow
- else-if helps handle multiple cases
- Nested if is used for deeper logic