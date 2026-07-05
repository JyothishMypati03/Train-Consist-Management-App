# 📌 UC16: Sort Passenger Bogies by Capacity (Bubble Sort – Algorithm Intro)

## 🎯 Goal

Sort passenger bogie capacities using the **Bubble Sort** algorithm without using built-in sorting methods such as `Arrays.sort()` or `Collections.sort()`.

---

## 👤 Actor

**User**

---

## 🔄 Flow

1. User provides passenger bogie capacities.
2. The system stores the capacities in an array.
3. Adjacent elements are compared.
4. If the left element is greater than the right element, they are swapped.
5. Multiple passes continue until the array is completely sorted.
6. The sorted capacities are displayed.
7. Program continues execution.

---

## 💡 Java Concepts Covered

- Bubble Sort Algorithm
- Arrays
- Nested Loops
- Swapping Logic
- Array Traversal
- Algorithmic Thinking
- Time Complexity O(n²)

---

## 📋 Functional Requirements

- Create an array of passenger bogie capacities.
- Store sample capacities such as:
    - 72
    - 48
    - 24
    - 56
    - 90
- Use nested `for` loops to compare adjacent elements.
- Swap elements whenever the left element is greater than the right element.
- Continue the process until the array is sorted.
- Display the capacities before and after sorting.
- Do **not** use `Arrays.sort()` or `Collections.sort()`.

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
│   │               ├── model
│   │               │   ├── Bogie.java
│   │               │   ├── PassengerBogie.java
│   │               │   └── GoodsBogie.java
│   │               │
│   │               └── exception
│   │                   ├── InvalidBogieException.java
│   │                   └── CargoSafetyException.java
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
├── model
│   ├── Bogie.java
│   ├── PassengerBogie.java
│   └── GoodsBogie.java
│
└── exception
    ├── InvalidBogieException.java
    └── CargoSafetyException.java
```

---

## ▶️ Sample Output

```text
======================================
   Train Consist Management App
======================================

Before Sorting:
72 48 24 56 90

After Sorting:
24 48 56 72 90
```

---

## 📈 Learning Outcome

After completing UC16, the following Java concepts are understood:

- Understanding the Bubble Sort algorithm
- Working with arrays using indexes
- Using nested loops for repeated comparisons
- Swapping array elements using a temporary variable
- Learning how manual sorting algorithms work internally
- Understanding why Bubble Sort has **O(n²)** time complexity
- Building a foundation for advanced sorting algorithms

---

## 🌿 Git Branch

```text
feature/uc16-bubble-sort
```

---

## 💬 Commit Message

```text
feat(UC16): implement bubble sort for passenger bogie capacities
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
- ✅ UC14 Completed
- ✅ UC15 Completed
- ✅ UC16 Completed
```