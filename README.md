# 📌 UC17: Sort Bogie Names Using Arrays.sort()

## 🎯 Goal

Sort bogie type names alphabetically using Java's built-in `Arrays.sort()` method instead of implementing a manual sorting algorithm.

---

## 👤 Actor

**User**

---

## 🔄 Flow

1. User provides an array of bogie type names.
2. The system displays the original array.
3. The system calls `Arrays.sort()` on the array.
4. Java sorts the bogie names alphabetically.
5. The sorted array is displayed using `Arrays.toString()`.
6. Program continues execution.

---

## 💡 Java Concepts Covered

- Arrays
- Arrays.sort()
- Arrays.toString()
- Natural Ordering
- Library-Based Sorting
- Optimized Sorting Algorithms
- Time Complexity O(n log n)

---

## 📋 Functional Requirements

- Create an array of bogie type names.
- Store sample bogie names such as:
    - Sleeper
    - AC Chair
    - First Class
    - Cargo
    - Guard
- Display the array before sorting.
- Sort the array using `Arrays.sort()`.
- Display the sorted array using `Arrays.toString()`.
- Do **not** implement manual swap logic or Bubble Sort.

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
[Sleeper, AC Chair, First Class, Cargo, Guard]

After Sorting:
[AC Chair, Cargo, First Class, Guard, Sleeper]
```

---

## 📈 Learning Outcome

After completing UC17, the following Java concepts are understood:

- Using the `Arrays` utility class
- Sorting arrays with `Arrays.sort()`
- Displaying arrays using `Arrays.toString()`
- Understanding natural ordering of strings
- Recognizing the performance advantage of library-based sorting
- Writing clean and maintainable code using Java's standard library
- Understanding the difference between manual sorting and optimized built-in sorting

---

## 🌿 Git Branch

```text
feature/uc17-arrays-sort-bogie-names
```

---

## 💬 Commit Message

```text
feat(UC17): sort bogie names alphabetically using Arrays.sort
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
- ✅ UC17 Completed