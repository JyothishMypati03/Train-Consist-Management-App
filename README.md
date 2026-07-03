# 📌 UC5: Preserve Insertion Order of Bogies (LinkedHashSet)

## 🎯 Goal

Maintain the insertion order of train bogies while enforcing uniqueness by using a `LinkedHashSet`.

---

## 👤 Actor

**User**

---

## 🔄 Flow

1. User creates the train formation.
2. Bogies are attached to the train.
3. A duplicate bogie is intentionally added.
4. `LinkedHashSet` ignores the duplicate automatically.
5. The train formation is displayed in the original insertion order.
6. Program continues execution.

---

## 💡 Java Concepts Covered

- Set Interface
- LinkedHashSet
- add() Method
- Automatic Deduplication
- Insertion Order Preservation
- Ordered Iteration

---

## 📋 Functional Requirements

- Create a `LinkedHashSet<String>` to represent the train formation.
- Add the following bogies:
    - Engine
    - Sleeper
    - Cargo
    - Guard
- Attempt to add a duplicate bogie (`Sleeper`).
- Display the final train formation.
- Ensure duplicate bogies do not appear in the output while preserving insertion order.

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

Train Formation:
[Engine, Sleeper, Cargo, Guard]
```

> **Note:** The duplicate `Sleeper` bogie is ignored automatically, and the insertion order is preserved.

---

## 📈 Learning Outcome

After completing UC5, the following Java concepts are understood:

- Using the `LinkedHashSet` collection
- Maintaining insertion order while preventing duplicate elements
- Understanding the difference between `HashSet` and `LinkedHashSet`
- Iterating over elements in insertion order
- Applying uniqueness and ordering together in real-world applications

---

## 🌿 Git Branch

```text
feature/uc5-preserve-insertion-order
```

---

## 💬 Commit Message

```text
feat(UC5): preserve insertion order using LinkedHashSet
```

---

## 🚀 Project Status

- ✅ UC1 Completed
- ✅ UC2 Completed
- ✅ UC3 Completed
- ✅ UC4 Completed
- ✅ UC5 Completed