# 📌 UC13: Performance Comparison (Loops vs Streams)

## 🎯 Goal

Compare the performance of traditional loop-based processing and Stream API-based processing by measuring execution time using `System.nanoTime()`.

---

## 👤 Actor

**User**

---

## 🔄 Flow

1. User prepares a collection of bogies.
2. The system records the start time using `System.nanoTime()`.
3. Filtering is performed using a traditional loop.
4. The execution time of the loop is calculated.
5. The system records the start time again.
6. Filtering is performed using the Stream API.
7. The execution time of the stream is calculated.
8. Both execution times are displayed.
9. Program continues execution.

---

## 💡 Java Concepts Covered

- System.nanoTime()
- Performance Benchmarking
- Loop-Based Processing
- Stream API
- stream() Method
- filter() Operation
- Micro-Performance Measurement
- Evidence-Driven Optimization

---

## 📋 Functional Requirements

- Reuse the `Bogie` class created in previous use cases.
- Create a `List<Bogie>` containing passenger and goods bogies.
- Record the start time using `System.nanoTime()`.
- Perform filtering using a traditional `for` loop.
- Record the end time and calculate the loop execution time.
- Record the start time again.
- Perform filtering using the Stream API.
- Record the end time and calculate the stream execution time.
- Display the filtered bogies.
- Display the execution time for both approaches.

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
│   │                   ├── Bogie.java
│   │                   └── GoodsBogie.java
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
    ├── Bogie.java
    └── GoodsBogie.java
```

---

## ▶️ Sample Output

```text
======================================
   Train Consist Management App
======================================

Loop-Based Filtering:

Bogie Name : Sleeper, Type : Passenger, Capacity : 72 Seats
Bogie Name : Cargo, Type : Goods, Capacity : 100 Seats
Bogie Name : Oil Tanker, Type : Goods, Capacity : 80 Seats

Stream-Based Filtering:

Bogie Name : Sleeper, Type : Passenger, Capacity : 72 Seats
Bogie Name : Cargo, Type : Goods, Capacity : 100 Seats
Bogie Name : Oil Tanker, Type : Goods, Capacity : 80 Seats

Performance Comparison

Loop Execution Time   : 185700 ns
Stream Execution Time : 263400 ns
```

> **Note:** The execution time will vary on every execution depending on the system configuration, JVM optimizations, and current CPU load.

---

## 📈 Learning Outcome

After completing UC13, the following Java concepts are understood:

- Measuring execution time using `System.nanoTime()`
- Benchmarking different implementations
- Comparing loop-based and Stream API-based processing
- Understanding that performance should be measured instead of assumed
- Applying evidence-driven optimization techniques
- Developing awareness of performance considerations in enterprise applications

---

## 🌿 Git Branch

```text
	feature/uc13-performance-test
```

---

## 💬 Commit Message

```text
feat(UC13): compare loop and stream performance using System.nanoTime
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
- ✅ UC11 Completed
- ✅ UC12 Completed
- ✅ UC13 Completed
