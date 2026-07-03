# 📌 UC7: Sort Bogies by Capacity (Comparator)

## 🎯 Goal

Sort passenger bogies based on their seating capacity by using a custom `Comparator`.

---

## 👤 Actor

**User**

---

## 🔄 Flow

1. User creates passenger bogie objects.
2. Bogies are stored in a `List`.
3. The system applies a `Comparator` to sort the bogies by seating capacity.
4. Sorted passenger bogies are displayed.
5. Program continues execution.

---

## 💡 Java Concepts Covered

- Comparator Interface
- Custom Objects
- List Collection
- sort() Method
- Comparator.comparingInt()
- Lambda Expressions
- Separation of Data and Business Logic

---

## 📋 Functional Requirements

- Create a `Bogie` class with the following fields:
    - name
    - capacity
- Create a `List<Bogie>` to store passenger bogies.
- Add the following bogies:
    - Sleeper (72 Seats)
    - AC Chair (48 Seats)
    - First Class (24 Seats)
- Sort the bogies using `Comparator.comparingInt()`.
- Display the sorted passenger bogies.

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
│   │               ├── app
│   │               │   └── TrainApplication.java
│   │               │
│   │               └── model
│   │                   └── Bogie.java
│   │
│   └── resources
│
└── test
```

---

## 🏗 Package Structure

```text
com.bridgelabz.trainconsist
│
├── app
│   └── TrainApplication.java
│
└── model
    └── Bogie.java
```

---

## ▶️ Sample Output

```text
======================================
   Train Consist Management App
======================================

Before Sorting:

Bogie Name : Sleeper, Capacity : 72 Seats
Bogie Name : AC Chair, Capacity : 48 Seats
Bogie Name : First Class, Capacity : 24 Seats

After Sorting by Capacity:

Bogie Name : First Class, Capacity : 24 Seats
Bogie Name : AC Chair, Capacity : 48 Seats
Bogie Name : Sleeper, Capacity : 72 Seats
```

---

## 📈 Learning Outcome

After completing UC7, the following Java concepts are understood:

- Creating custom Java objects
- Storing objects inside collections
- Applying business rules using `Comparator`
- Sorting objects based on custom properties
- Using `Comparator.comparingInt()` for integer comparison
- Separating object data from sorting logic
- Preparing object collections for enterprise-level applications

---

## 🌿 Git Branch

```text
feature/uc7-sort-by-capacity

---

## 💬 Commit Message

```text
feat(UC7): sort passenger bogies by capacity using Comparator
```

---

## 🚀 Project Status

- ✅ UC1 Completed
- ✅ UC2 Completed
- ✅ UC3 Completed
- ✅ UC4 Completed
- ✅ UC5 Completed
- ✅ UC6 Completed
- ✅ UC7 Completed
