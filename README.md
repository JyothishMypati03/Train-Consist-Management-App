# 🚆 Train Consist Management App

## 📖 Project Overview

The **Train Consist Management App** is a console-based Java application that simulates how a railway system manages a train consist, which is a collection of bogies attached to a locomotive (engine).

The application is developed incrementally through multiple use cases, where each use case introduces one or more Core Java concepts using a realistic railway management scenario.

---

# 📌 UC1: Initialize Train and Display Consist Summary

## 🎯 Goal

Initialize the Train Consist Management App and display the initial state of the train consist.

---

## 👤 Actor

**User**

---

## 🔄 Flow

1. User runs the application.
2. Application displays a welcome message.
3. An empty train consist is initialized.
4. The initial bogie count is displayed.
5. Program continues execution.

---

## 💡 Java Concepts Covered

- Class
- Main Method
- Static Keyword
- List Interface
- ArrayList
- Dynamic Collection Initialization
- Console Output using `System.out.println()`

---

## 📋 Functional Requirements

- Create a Java class for the Train Consist Management application.
- Implement the `main()` method as the application's entry point.
- Display a welcome message.
- Create an empty `ArrayList` to represent the train consist.
- Display the initial number of bogies using the `size()` method.

---

## 📂 Maven Project Structure

```text
TrainConsistManagement
│
├── pom.xml
├── README.md
├── .gitignore
│
├── src
│   ├── main
│   │   ├── java
│   │   │
│   │   └── com
│   │       └── bridgelabz
│   │           └── trainconsist
│   │               └── app
│   │                   └── TrainApplication.java
│   │
│   └── resources
│
└── test
```

---

## 🏗 Package Structure

```text
com.bridgelabz.trainconsist.app
        │
        └── TrainApplication.java
```

---

## ▶️ Sample Output

```text
======================================
   Train Consist Management App
======================================

Train consist initialized successfully.

Initial Bogie Count : 0
```

---

## 📈 Learning Outcome

After completing UC1, the following Java concepts are understood:

- Java program execution flow
- Entry point using the `main()` method
- Creating dynamic collections using `ArrayList`
- Working with the `List` interface
- Displaying output using the console
- Using the `size()` method to determine collection size

---

## 🌿 Git Branch

```text
feature/uc1-initialize-train
```

---

## 💬 Commit Message

```text
feat(UC1): initialize Train Consist Management application
```

---

## 🚀 Project Status

- ✅ UC1 Completed
