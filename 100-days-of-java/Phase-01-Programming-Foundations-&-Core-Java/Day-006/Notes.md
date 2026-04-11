# Day 006 – Array Manipulation in Java

---

## 1. Introduction to Arrays

### Definition:
An array is a collection of elements of the **same data type** stored in a **continuous memory location**.

### Real-World Analogy:
Think of an array like a **row of lockers**:
- Each locker stores one value
- Each locker has an index (0, 1, 2...)

---

## 2. Declaring and Initializing Arrays

### Syntax:
```java
dataType[] arrayName = new dataType[size];
```

### Example:
```java
int[] numbers = new int[5];
```

### Direct Initialization:
```java
int[] numbers = {10, 20, 30, 40, 50};
```

---

## 3. Accessing Elements

### Syntax:
```java
arrayName[index];
```

### Example:
```java
System.out.println(numbers[0]); // 10
```

👉 Index starts from 0

---

## 4. Array Length

### Syntax:
```java
arrayName.length;
```

### Example:
```java
System.out.println(numbers.length);
```

👉 Gives total number of elements

---

## 5. Modifying Elements

```java
numbers[2] = 100;
```

👉 Changes value at index 2

---

## 6. Array Manipulation

### 🔹 Sorting Arrays
```java
import java.util.Arrays;

Arrays.sort(numbers);
```

👉 Sorts array in ascending order

---

### 🔹 Searching Arrays
```java
int index = Arrays.binarySearch(numbers, 30);
```

👉 Works on sorted arrays

---

### 🔹 Copying Arrays
```java
int[] newArray = Arrays.copyOf(numbers, numbers.length);
```

---

### 🔹 Resizing Arrays

Java arrays are fixed in size, so we create a new array:

```java
int[] newArr = new int[10];

for (int i = 0; i < numbers.length; i++) {
    newArr[i] = numbers[i];
}
```

👉 Like moving items to a bigger box

---

## 7. Multi-Dimensional Arrays

### Definition:
Array inside another array

👉 Used for tables, grids, matrices

---

### Syntax:
```java
int[][] matrix = new int[3][3];
```

---

### Example:
```java
int[][] matrix = {
    {1, 2, 3},
    {4, 5, 6},
    {7, 8, 9}
};
```

---

### Accessing Elements:
```java
System.out.println(matrix[1][2]); // 6
```

---

### Real-World Analogy:
Think of a chessboard:

- Rows and columns  
- Each cell has a value  

---

## Summary

- Arrays store multiple values of same type  
- Index starts from 0  
- Arrays are fixed in size  
- Useful for storing and processing bulk data  
- Multi-dimensional arrays handle grids and tables  
