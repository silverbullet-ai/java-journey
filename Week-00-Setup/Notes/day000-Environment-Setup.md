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

# Required Tools

For this journey we need the following tools:

- Java (JDK)
- Git
- IntelliJ IDEA
- A terminal or command prompt

---

# Installing Java (JDK)

Java Development Kit (JDK) is required to write and run Java programs.

Recommended versions:

- Java 17 (LTS)
- Java 21 (Latest LTS)

> 💡 **Note**  
> **LTS (Long Term Support)** versions receive long-term updates, security patches, and bug fixes.  
> These versions are recommended for enterprise and production applications.

## Step 1 – Download Java

Visit:

https://www.oracle.com/java/technologies/downloads/

Steps:

1. Open the link
2. Select Java 21
3. Choose your OS (Windows / Linux / Mac)
4. Download the installer
5. Run the .exe file

---

## Step 2 – Install Java

Run the installer and follow the installation wizard.

After installation, Java will be added to your system.

---

## Step 3 – Verify Installation

Open terminal or command prompt and run:

```bash
java -version
```

Example output:

```bash
openjdk version "21.x.x"
```

Also verify the compiler:

```bash
javac -version
```
---

# Installing Git

Git is used for version control and tracking changes in projects.

## Step 1 – Download Git

Visit:

https://git-scm.com/downloads

Download the installer for your operating system.

## Step 2 – Install Git

Run the installer and keep the default settings unless you know what you are changing.

## Step 3 – Verify Installation

Run:

```bash
git --version
```

Example output:

```markdown
git version 2.x.x
```

## Configure Git

Set your username and email:

```bash
git config --global user.name "Silver Bullet"
git config --global user.email "aahishsingh2000@outlook.com"
```

Check configuration:

```bash
git config --list
```
---

# Installing IntelliJ IDEA

IntelliJ IDEA is one of the most popular IDEs for Java development.

We will use IntelliJ IDEA Community Edition.

## Step 1 – Download IntelliJ IDEA

Visit:

https://www.jetbrains.com/idea/download/

Download:

IntelliJ IDEA Community Edition

## Step 2 – Install IntelliJ

Run the installer and follow the setup wizard.

Recommended options during installation:

- Add launchers to PATH
- Add desktop shortcut

## Step 3 – Launch IntelliJ

Open IntelliJ IDEA and create a new project.

Steps:

1. Click New Project
2. Select Java
3. Choose installed JDK
4. Create project

Example project structure:

```markdown
project-name
 ├── src
 │   └── Main.java
 └── .idea
```

## First Java Program

Create a file called:

```markdown
HelloWorld.java
```

Example code:

```java
public class HelloWorld {

    public static void main(String[] args) {

        System.out.println("Java Fullstack Journey Begins!");

    }

}
```

Run the program.

Expected output:

```markdown
Java Fullstack Journey Begins!
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

