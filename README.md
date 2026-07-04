# 📌 UC9: Group Bogies by Type (Collectors.groupingBy)

## 🎯 Goal

Group bogies into categories using Stream collectors so that passenger bogies and goods bogies are displayed in a structured form.

---

## 👤 Actor

**User**

---

## 🔄 Flow

1. User creates a list of bogies.
2. The system converts the list into a stream.
3. `Collectors.groupingBy()` is applied with a classification function.
4. Bogies are grouped into a `Map`.
5. The grouped result is displayed.
6. Program continues execution.

---

## 💡 Java Concepts Covered

- Stream API
- Collectors.groupingBy()
- Stream Pipeline
- Map Output Structure
- Lambda Classification Logic
- Data Aggregation
- Structured Transformation

---

## 📋 Functional Requirements

- Reuse the `Bogie` class created in UC7 and UC8.
- Add a `type` field to the `Bogie` class.
- Create a `List<Bogie>` containing bogies.
- Add the following bogies:
    - Sleeper (Passenger, 72 Seats)
    - AC Chair (Passenger, 48 Seats)
    - First Class (Passenger, 24 Seats)
    - Cargo (Goods, 100 Seats)
    - Oil Tanker (Goods, 80 Seats)
- Create a stream using `stream()`.
- Apply `Collectors.groupingBy()` using the bogie type.
- Store the result in `Map<String, List<Bogie>>`.
- Print the grouped bogie structure.

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

Grouped Bogies:

Passenger Bogies:
Bogie Name : Sleeper, Type : Passenger, Capacity : 72 Seats
Bogie Name : AC Chair, Type : Passenger, Capacity : 48 Seats
Bogie Name : First Class, Type : Passenger, Capacity : 24 Seats

Goods Bogies:
Bogie Name : Cargo, Type : Goods, Capacity : 100 Seats
Bogie Name : Oil Tanker, Type : Goods, Capacity : 80 Seats
```

---

## 📈 Learning Outcome

After completing UC9, the following Java concepts are understood:

- Grouping objects into categories using `Collectors.groupingBy()`
- Using `Map<String, List<Bogie>>` for structured data
- Applying stream collectors to build reports
- Organizing flat collections into meaningful groups
- Adding a `type` field to objects for classification
- Preparing data for analytics and dashboard-style output

---

## 🌿 Git Branch

```text
feature/uc9-group-by-type
```

---

## 💬 Commit Message

```text
feat(UC9): group bogies by type using Collectors.groupingBy
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
