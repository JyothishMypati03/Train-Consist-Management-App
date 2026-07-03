# 📌 UC4: Maintain Ordered Train Consist (LinkedList)

## 🎯 Goal

Maintain the physical order of train bogies by using a `LinkedList`, allowing efficient insertion and removal of bogies from the beginning, middle, and end of the train consist.

---

## 👤 Actor

**User**

---

## 🔄 Flow

1. User creates the train consist.
2. Bogies are added to the train.
3. A Pantry Car is inserted at a specific position.
4. The first and last bogies are removed.
5. The final ordered train consist is displayed.
6. Program continues execution.

---

## 💡 Java Concepts Covered

- List Interface
- LinkedList
- Node-Based Data Structure
- addFirst() Method
- addLast() Method
- add(index, element) Method
- removeFirst() Method
- removeLast() Method
- Order Preservation

---

## 📋 Functional Requirements

- Create a `LinkedList<String>` to represent the train consist.
- Add the following bogies:
    - Engine
    - Sleeper
    - AC
    - Cargo
    - Guard
- Insert **Pantry Car** at position **2**.
- Remove the first bogie.
- Remove the last bogie.
- Display the final ordered train consist.

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

Initial Train Consist:
[Engine, Sleeper, AC, Cargo, Guard]

After Inserting Pantry Car:
[Engine, Sleeper, Pantry Car, AC, Cargo, Guard]

Final Train Consist:
[Sleeper, Pantry Car, AC, Cargo]
```

---

## 📈 Learning Outcome

After completing UC4, the following Java concepts are understood:

- Using the `LinkedList` collection
- Maintaining the physical order of train bogies
- Inserting elements at the beginning, middle, and end
- Removing elements efficiently from both ends
- Understanding node-based data structures
- Learning when `LinkedList` is preferred over `ArrayList`

---

## 🌿 Git Branch

```text
feature/uc4-ordered-bogie-ids
```

---

## 💬 Commit Message

```text
feat(UC4): implement ordered train consist using LinkedList
```

---

## 🚀 Project Status

- ✅ UC1 Completed
- ✅ UC2 Completed
- ✅ UC3 Completed
- ✅ UC4 Completed
