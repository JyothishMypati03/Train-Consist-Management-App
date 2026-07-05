# 📌 UC18: Linear Search for Bogie ID (Array-Based Searching)

## 🎯 Goal

Search and identify a specific bogie ID from an unsorted array using the **Linear Search** algorithm.

---

## 👤 Actor

**User**

---

## 🔄 Flow

1. User provides a list of bogie IDs.
2. User enters a bogie ID to search.
3. The system traverses the array sequentially.
4. Each bogie ID is compared with the search key using `equals()`.
5. If a match is found, the search stops immediately.
6. The search result is displayed.
7. Program continues execution.

---

## 💡 Java Concepts Covered

- Arrays
- Linear Search Algorithm
- Sequential Traversal
- String Comparison using `equals()`
- Looping (`for` Loop)
- `break` Statement
- Boolean Flag
- Time Complexity O(n)

---

## 📋 Functional Requirements

- Create an array of bogie IDs.
- Store sample IDs such as:
    - BG101
    - BG205
    - BG309
    - BG450
    - BG512
- Accept a bogie ID from the user.
- Traverse the array using a `for` loop.
- Compare each bogie ID using the `equals()` method.
- Stop searching immediately when a match is found.
- Display whether the bogie ID exists along with its index.
- Display an appropriate message if the bogie ID is not found.

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

### Bogie Found

```text
======================================
   Train Consist Management App
======================================

Enter Bogie ID to Search: BG309

Bogie Found at Index : 2
```

### Bogie Not Found

```text
======================================
   Train Consist Management App
======================================

Enter Bogie ID to Search: BG999

Bogie ID Not Found.
```

---

## 📈 Learning Outcome

After completing UC18, the following Java concepts are understood:

- Understanding the Linear Search algorithm
- Traversing arrays sequentially
- Comparing strings safely using `equals()`
- Using a boolean flag to track search results
- Stopping execution early using the `break` statement
- Understanding why Linear Search works on unsorted data
- Learning the **O(n)** time complexity of Linear Search
- Building a foundation for optimized searching techniques such as Binary Search

---

## 🌿 Git Branch

```text
feature/uc18-linear-search-bogie-id
```

---

## 💬 Commit Message

```text
feat(UC18): implement linear search for bogie IDs
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
- ✅ UC18 Completed