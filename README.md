# 📌 UC19: Binary Search for Bogie ID (Optimized Searching)

## 🎯 Goal

Search and identify a specific bogie ID efficiently using the **Binary Search** algorithm on a sorted array of bogie IDs.

---

## 👤 Actor

**User**

---

## 🔄 Flow

1. User provides a list of bogie IDs.
2. The system sorts the bogie IDs.
3. User enters a bogie ID to search.
4. The system initializes `low` and `high` indexes.
5. The middle (`mid`) index is calculated.
6. The search key is compared with the middle element using `compareTo()`.
7. The search range is divided into half repeatedly.
8. The search continues until the bogie ID is found or the search range is exhausted.
9. The result is displayed.
10. Program continues execution.

---

## 💡 Java Concepts Covered

- Binary Search Algorithm
- Arrays.sort()
- Arrays.toString()
- String Comparison using `compareTo()`
- Divide-and-Conquer Strategy
- while Loop
- Index-Based Traversal (`low`, `high`, `mid`)
- Time Complexity O(log n)

---

## 📋 Functional Requirements

- Create an array of bogie IDs.
- Sort the array using `Arrays.sort()`.
- Accept a bogie ID from the user.
- Initialize:
    - `low`
    - `high`
    - `mid`
- Compare the search key with the middle element using `compareTo()`.
- Adjust the search range based on the comparison result.
- Stop searching when the bogie ID is found or when the search range becomes empty.
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

Sorted Bogie IDs:
[BG101, BG205, BG309, BG450, BG512]

Enter Bogie ID to Search: BG309

Bogie Found at Index : 2
```

### Bogie Not Found

```text
======================================
   Train Consist Management App
======================================

Sorted Bogie IDs:
[BG101, BG205, BG309, BG450, BG512]

Enter Bogie ID to Search: BG999

Bogie ID Not Found.
```

---

## 📈 Learning Outcome

After completing UC19, the following Java concepts are understood:

- Understanding the Binary Search algorithm
- Working with sorted arrays
- Using `Arrays.sort()` before performing binary search
- Comparing strings using `compareTo()`
- Using `low`, `high`, and `mid` indexes for efficient searching
- Applying the divide-and-conquer strategy
- Understanding why Binary Search requires sorted data
- Learning the **O(log n)** time complexity of Binary Search
- Comparing Binary Search with Linear Search for performance optimization

---

## 🌿 Git Branch

```text
feature/uc19-binary-search
```

---

## 💬 Commit Message

```text
feat(UC19): implement binary search for bogie IDs
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
- ✅ UC19 Completed
