# 🚆 Train Consist Management App

## 📖 Project Overview

The **Train Consist Management App** is a console-based Java application that simulates how a railway system manages a train consist, which is a collection of bogies attached to a locomotive (engine).

The application is developed incrementally through multiple use cases, where each use case introduces one or more Core Java concepts using a realistic railway management scenario.

---

# UC2: Add Passenger Bogies to Train (ArrayList Operations)

## 🎯 Goal

Allow dynamic insertion and removal of passenger bogies using **ArrayList**.

---

## 👤 Actor

**User**

---

## 🔄 Flow

1. User runs the application.
2. Passenger bogies are added to the train.
3. The list of passenger bogies is displayed.
4. One bogie is removed from the train.
5. The application checks whether a specific bogie exists.
6. The final state of the passenger bogie list is displayed.
7. Program continues execution.

---

## 💡 Java Concepts Covered

- ArrayList
- add() Method
- remove() Method
- contains() Method
- Insertion Order Preservation
- CRUD Operations (Create, Read, Update, Delete)

---

## 📋 Functional Requirements

- Create an `ArrayList<String>` to store passenger bogies.
- Add the following passenger bogies:
    - Sleeper
    - AC Chair
    - First Class
- Display all passenger bogies after insertion.
- Remove the **AC Chair** bogie.
- Check whether the **Sleeper** bogie exists using `contains()`.
- Display the final state of the passenger bogie list.

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

Passenger Bogies After Adding:
[Sleeper, AC Chair, First Class]

Passenger Bogies After Removing AC Chair:
[Sleeper, First Class]

Contains Sleeper? true

Final Passenger Bogies:
[Sleeper, First Class]
```

---

## 📈 Learning Outcome

After completing UC2, the following Java concepts are understood:

- Creating and managing dynamic collections using `ArrayList`
- Adding elements using the `add()` method
- Removing elements using the `remove()` method
- Searching elements using the `contains()` method
- Understanding CRUD operations on collections
- Preserving insertion order in an `ArrayList`

---

## 🌿 Git Branch

```text
feature/uc2-add-passenger-bogies
```

---

## 💬 Commit Message

```text
feat(UC2): implement passenger bogie management using ArrayList
```

---

## 🚀 Project Status

- ✅ UC1 Completed
- ✅ UC2 Completed
