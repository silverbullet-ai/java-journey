# Module 1 - Basics (Input & Operators)

## User Input in Java

To take input from user, we use Scanner class.

Import:
import java.util.Scanner;

Steps:
1. Create Scanner object
2. Use methods like nextInt(), nextLine()

Example:
Scanner sc = new Scanner(System.in);
int num = sc.nextInt();

---

## Common Scanner Methods

- nextInt() → integer
- nextDouble() → decimal
- next() → single word
- nextLine() → full line

---

## Operators in Java

### 1. Arithmetic Operators
+  → addition  
-  → subtraction  
*  → multiplication  
/  → division  
%  → modulus (remainder)

---

### 2. Relational Operators
==  → equal  
!=  → not equal  
>   → greater  
<   → smaller  
>=  → greater or equal  
<=  → smaller or equal  

---

### 3. Logical Operators
&& → AND  
|| → OR  
!  → NOT  

---

## Important Concepts

### Integer Division
int a = 5 / 2;  // result = 2 (not 2.5)

### Type Conversion (Implicit Casting)
int a = 10;
double b = a;  // automatic conversion

---

## Key Takeaways
- Scanner is used for input
- Operators help perform calculations
- Be careful with integer division