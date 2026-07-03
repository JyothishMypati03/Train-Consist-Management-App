# 📌 UC8: Filter Passenger Bogies Using Streams

## 🎯 Goal

Filter passenger bogies based on their seating capacity using the Java **Stream API** and display only the bogies that satisfy the specified condition.

---

## 👤 Actor

**User**

---

## 🔄 Flow

1. User creates a list of passenger bogies.
2. The system converts the list into a stream.
3. A filter condition is applied based on seating capacity.
4. Matching bogies are collected into a new list.
5. Filtered passenger bogies are displayed.
6. Program continues execution.

---

## 💡 Java Concepts Covered

- Stream API
- stream() Method
- filter() Operation
- Lambda Expressions
- collect() / toList()
- Declarative Programming Style

---

## 📋 Functional Requirements

- Reuse the `Bogie` class created in UC7.
- Create a `List<Bogie>` containing passenger bogies.
- Add the following bogies:
    - Sleeper (72 Seats)
    - AC Chair (48 Seats)
    - First Class (24 Seats)
- Convert the list into a stream using `stream()`.
- Apply the filter condition:
  ```java
  b -> b.getCapacity() > 60
  ```
- Collect the filtered result into a new list.
- Display the filtered passenger bogies.

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

All Passenger Bogies:

Bogie Name : Sleeper, Capacity : 72 Seats
Bogie Name : AC Chair, Capacity : 48 Seats
Bogie Name : First Class, Capacity : 24 Seats

Passenger Bogies with Capacity > 60:

Bogie Name : Sleeper, Capacity : 72 Seats
```

---

## 📈 Learning Outcome

After completing UC8, the following Java concepts are understood:

- Using the Java Stream API for collection processing
- Converting collections into streams using `stream()`
- Filtering objects using the `filter()` operation
- Writing concise filtering logic with lambda expressions
- Collecting filtered results into a new list using `toList()`
- Understanding declarative programming for cleaner and more maintainable code

---

## 🌿 Git Branch

```text
feature/uc8-filter-passengers
```

---

## 💬 Commit Message

```text
feat(UC8): filter passenger bogies using Java Stream API
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
- ✅ UC8 Completed
