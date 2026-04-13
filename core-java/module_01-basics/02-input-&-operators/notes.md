# Module 1 - Basics (Input & Operators)

## User Input in Java

To take input from user, we use Scanner class.

Import:

```java
import java.util.Scanner;
```

Steps:
1. Create Scanner object
2. Use methods like nextInt(), nextLine()

Example:

```java
Scanner sc = new Scanner(System.in);
int num = sc.nextInt();
```

---

## Common Scanner Methods

```markdown
- nextInt() → integer
- nextDouble() → decimal
- next() → single word
- nextLine() → full line
```

---

## Operators in Java

### 1. Arithmetic Operators

```markdown
+  → addition  
-  → subtraction  
*  → multiplication  
/  → division  
%  → modulus (remainder)
```

---

### 2. Relational Operators

```markdown
==  → equal  
!=  → not equal  
>   → greater  
<   → smaller  
>=  → greater or equal  
<=  → smaller or equal  
```

---

### 3. Logical Operators

```markdown
&& → AND  
|| → OR  
!  → NOT  
```

---

## Important Concepts

### Integer Division

```java
int a = 5 / 2;  // result = 2 (not 2.5)
```

### Type Conversion (Implicit Casting)

```java
int a = 10;
double b = a;  // automatic conversion
```

---

## Key Takeaways
- Scanner is used for input
- Operators help perform calculations
- Be careful with integer division