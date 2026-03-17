# Day 2 – Algorithms

## What is an Algorithm?

An **algorithm** is a step-by-step procedure or set of instructions designed to solve a specific problem or perform a task.

### Characteristics of an Algorithm

- **Input** → Takes zero or more inputs  
- **Output** → Produces at least one output  
- **Definiteness** → Steps are clear and unambiguous  
- **Finiteness** → Must terminate after a finite number of steps  
- **Effectiveness** → Each step should be simple and executable  

---

## Importance of Algorithms

### Why Algorithms Matter

- Provide a clear approach to problem-solving  
- Improve efficiency and performance  
- Help in writing optimized code  
- Form the foundation of programming  

### Applications

- Searching and sorting data  
- Navigation systems  
- Banking and transaction processing  
- Artificial Intelligence and Machine Learning  

---

## Basic Steps of an Algorithm

1. Start  
2. Define the problem  
3. Identify inputs  
4. Process the inputs  
5. Produce output  
6. End  

---

## Types of Algorithms

### 1. Sequential Algorithm
Steps are executed one after another in order.

**Characteristics:**
- Simple and straightforward  
- No decision-making  
- No repetition  

---

### 2. Conditional Algorithm
Execution depends on conditions (decision making).

**Characteristics:**
- Uses if-else logic  
- Different paths based on conditions  
- Used in decision-making problems  

---

### 3. Iterative Algorithm
Repeats a set of steps multiple times.

**Characteristics:**
- Uses loops  
- Repeats until a condition is met  
- Efficient for repetitive tasks  

---

## Writing Algorithms for Common Tasks

- **Define the task** → Clearly state the problem  
- **Identify inputs and outputs** → Determine required data and expected result  
- **Break down the process** → Divide into smaller steps  
- **Follow a standard structure** → Maintain logical order  

---

## Identifying Inputs and Outputs

- **Input** → Data required to solve the problem  
- **Output** → Final result after processing  

Example:
- Input: Two numbers  
- Output: Their sum  

---

## Examples of Algorithms

### 1. Bubble Sort
Repeatedly compares adjacent elements and swaps them if they are in the wrong order.

```markdown
Step 1: Start  
Step 2: Input array A of size n  
Step 3: Repeat (n - 1) times  
Step 4:     For i = 0 to n - 2  
Step 5:         If A[i] > A[i + 1]  
Step 6:             Swap A[i] and A[i + 1]  
Step 7:     End For  
Step 8: End Repeat  
Step 9: Output sorted array  
Step 10: End
```

---

### 2. Linear Search
Checks each element one by one until the target element is found.

```markdown
Step 1: Start  
Step 2: Input array A of size n  
Step 3: Input target element T  
Step 4: For i = 0 to n - 1  
Step 5:     If A[i] == T  
Step 6:         Output "Element found at index i"  
Step 7:         Stop  
Step 8: End For  
Step 9: Output "Element not found"  
Step 10: End
```

---

### 3. Binary Search
Searches a sorted list by repeatedly dividing the search space in half.

```markdown
Step 1: Start  
Step 2: Input sorted array A of size n  
Step 3: Input target element T  
Step 4: Set low = 0, high = n - 1  

Step 5: While low <= high  
Step 6:     mid = (low + high) / 2  

Step 7:     If A[mid] == T  
Step 8:         Output "Element found at index mid"  
Step 9:         Stop  

Step 10:    Else If A[mid] < T  
Step 11:        low = mid + 1  

Step 12:    Else  
Step 13:        high = mid - 1  

Step 14: End While  

Step 15: Output "Element not found"  
Step 16: End
```

---

## Optimizing Algorithms

Optimization focuses on improving:

- **Time Complexity** → Faster execution  
- **Space Complexity** → Efficient memory usage  

Techniques:
- Reducing unnecessary steps  
- Using efficient data structures  
- Choosing better algorithms  

---

## Benefits of Algorithms

- Improves problem-solving skills  
- Helps in writing efficient programs  
- Reduces errors  
- Enhances logical thinking  
- Makes debugging easier  

---

## Practice Algorithms

1. Write the algorithm to find the **sum of two numbers**.

2. Write the algorithm to check whether a number is **positive or negative**.

3. Write the algorithm to find the **largest of two numbers**.