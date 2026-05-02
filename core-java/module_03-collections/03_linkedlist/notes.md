# Module 3 - Collections (LinkedList)

## What is LinkedList?

A LinkedList is a linear data structure where elements are stored as nodes.

Each node contains:
- data
- reference to next node

---

## Syntax

```java
import java.util.LinkedList;

LinkedList<Integer> list = new LinkedList<>();
```

---

## Common Methods

- add(value)
- addFirst(value)
- addLast(value)
- remove()
- removeFirst()
- removeLast()
- get(index)

---

## ArrayList vs LinkedList

| Feature        | ArrayList              | LinkedList            |
|---------------|------------------------|------------------------|
| Storage       | Dynamic array          | Nodes (linked)         |
| Access        | Fast (O(1))            | Slow (O(n))            |
| Insertion     | Slow (shift needed)    | Fast                   |
| Memory        | Less                   | More                   |

---

## When to Use?

- Use ArrayList → frequent access  
- Use LinkedList → frequent insert/delete  

---

## Key Takeaways

- LinkedList is good for dynamic insertion  
- Not efficient for random access  