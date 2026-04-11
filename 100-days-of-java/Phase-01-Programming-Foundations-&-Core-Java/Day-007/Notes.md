# Day 7 – Arrays and Methods

---

## 1. Arrays and Methods

In Java, arrays can be:
- Passed to methods as arguments
- Returned from methods

👉 This helps in writing **modular and reusable code**

---

## 2. Passing Array as Argument

### Definition:
An array can be passed to a method just like a normal variable.

👉 But instead of passing values, we pass a **reference to the array**

---

### Syntax:
```java
methodName(arrayName);
```

### Example:
```java
public class PassArray {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40};

        printArray(arr);
    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
```

### Real-World Analogy:
Think of passing an array like giving someone a list of items instead of one item.

---

### Important Insight:
- Changes made inside the method affect the original array  
- Because arrays are passed by reference  

### Example (Modification):
```java
public static void modifyArray(int[] arr) {
    arr[0] = 100;
}
```

---

## 3. Returning Array from Method

### Definition:
A method can return an array.

### Syntax:
```java
return arrayName;
```

### Example:
```java
public class ReturnArray {
    public static void main(String[] args) {
        int[] result = createArray();

        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }

    public static int[] createArray() {
        int[] arr = {1, 2, 3, 4};
        return arr;
    }
}
```

### Real-World Analogy:
A method returning an array is like:
👉 You request data → you receive a full dataset

---

## 4. Key Points

- Arrays are passed by reference  
- Changes inside method affect original array  
- Methods can return arrays  
- Helps in modular programming  

---

## Summary

- Passing arrays → reuse logic on multiple elements  
- Returning arrays → structured data output  
- Foundation for real-world applications (APIs, data processing)  
