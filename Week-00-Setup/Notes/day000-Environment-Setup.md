# Day0 — Environment Setup

Before starting the Java Fullstack journey, the first step is preparing
the development environment.  
This ensures that all required tools are installed and working correctly
so that coding and learning can proceed smoothly.

---

## Why Java for Fullstack Development?

Java is one of the most widely used programming languages for backend
development.

Reasons Java is used in enterprise systems:

* Platform independent (Write Once, Run Anywhere)
* Strong ecosystem and libraries
* Mature frameworks like **Spring** and **Spring Boot**
* Widely used in banking, finance, and large-scale systems
* Strong community support

Java is also commonly used for building:

* REST APIs
* Microservices
* Enterprise backend systems

---

## Java Architecture

Java programs run using the Java runtime architecture.

### JDK (Java Development Kit)

The **JDK** is used to develop Java applications.

It includes:

* Java compiler (`javac`)
* Java runtime environment
* Development tools

---

### JRE (Java Runtime Environment)

The **JRE** is responsible for running Java applications.

It contains:

* JVM
* Core Java libraries
* Runtime components

---

### JVM (Java Virtual Machine)

The **JVM** executes Java bytecode.

Main responsibilities:

* Memory management
* Garbage collection
* Platform independence
* Program execution

Flow of execution:

```markdown
Java Code (.java) → Compiler (javac) → Bytecode (.class) → JVM → Machine Execution
```
---

## Installing Java

Recommended versions for development:

* **Java 17 (LTS)**
* **Java 21 (Latest LTS)**

### Verify Installation

Run the following command in the terminal:

``` bash
java -version
```

Example output:

```bash
java version "21.0.x"
```

---

## IntelliJ IDEA Setup

IntelliJ IDEA is a powerful IDE for Java development.

Steps:

1. Install IntelliJ IDEA Community Edition
2. Create a new project
3. Select Java project
4. Choose installed JDK
5. Create a main class

Example structure:

```markdown
project-name
├─ src
│   └─ Main.java
└─ .idea
```

---

## First Java Program

Create a file called:


```markdown
HelloWorld.java
```

Example program:

``` java
public class HelloWorld {

    public static void main(String\\\[] args) {

        System.out.println("Java Fullstack Journey Begins!");

    }

}
```

Run the program to confirm that Java is working correctly.

Expected output:

```bash
Java Fullstack Journey Begins!
```

---

## Git Setup

Git will be used for version control and tracking progress.

Verify Git installation:

```bash
git --version
```

Configure Git username and email:

```bash
git config --global user.name "Silver Bullet"
git config --global user.email "aahishsingh2000@outlook.com"
```
---

## Day 0 Summary

Today's objective was to prepare the development environment.

Completed tasks:

* Installed Java
* Verified Java installation
* Installed IntelliJ IDEA
* Ran first Java program
* Configured Git
* Created repository structure

The system is now ready to begin Core Java fundamentals.

