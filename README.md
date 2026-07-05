# 📌 UC10: Count Total Seats in Train (reduce)

## 🎯 Goal

Aggregate the seating capacities of all passenger bogies into a single total value using the Stream API `reduce()` method.

---

## 👤 Actor

**User**

---

## 🔄 Flow

1. User creates a list of passenger bogies.
2. The system converts the list into a stream.
3. `map()` extracts the seating capacity from each bogie.
4. `reduce()` calculates the total seating capacity.
5. The total seating capacity is displayed.
6. Program continues execution.

---

## 💡 Java Concepts Covered

- Stream API
- stream() Method
- map() Operation
- reduce() Method
- Method References (`Integer::sum`)
- Functional Aggregation
- Stream Pipeline

---

## 📋 Functional Requirements

- Reuse the `Bogie` class created in previous use cases.
- Create a `List<Bogie>` containing passenger bogies.
- Add the following bogies:
    - Sleeper (72 Seats)
    - AC Chair (48 Seats)
    - First Class (24 Seats)
- Convert the list into a stream using `stream()`.
- Apply `map(Bogie::getCapacity)` to extract seating capacities.
- Use `reduce(0, Integer::sum)` to calculate the total seating capacity.
- Display the total seating capacity.

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

Passenger Bogies:

Bogie Name : Sleeper, Type : Passenger, Capacity : 72 Seats
Bogie Name : AC Chair, Type : Passenger, Capacity : 48 Seats
Bogie Name : First Class, Type : Passenger, Capacity : 24 Seats

Total Seating Capacity: 144
```

---

## 📈 Learning Outcome

After completing UC10, the following Java concepts are understood:

- Converting collections into streams using `stream()`
- Transforming objects into numeric values using `map()`
- Aggregating data using `reduce()`
- Using method references such as `Integer::sum`
- Performing functional-style calculations without manual loops
- Computing business metrics using Java Stream API

---

## 🌿 Git Branch

```text
feature/uc10-total-seats
```

---

## 💬 Commit Message

```text
feat(UC10): calculate total seating capacity using Stream reduce
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
- ✅ UC9 Completed
- ✅ UC10 Completed
