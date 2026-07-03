# 📌 UC6: Map Bogie to Capacity (HashMap)

## 🎯 Goal

Associate each bogie with its seating or load capacity by using a `HashMap`, enabling efficient storage and retrieval of bogie capacity information.

---

## 👤 Actor

**User**

---

## 🔄 Flow

1. User creates a bogie-capacity mapping.
2. Bogie names are stored as keys.
3. Capacity values are stored as values.
4. Entries are inserted into a `HashMap`.
5. The system iterates through the map using `entrySet()`.
6. Each bogie along with its corresponding capacity is displayed.
7. Program continues execution.

---

## 💡 Java Concepts Covered

- Map Interface
- HashMap
- put() Method
- Key–Value Pair Mapping
- entrySet() Iteration
- Fast Lookup Using Keys

---

## 📋 Functional Requirements

- Create a `HashMap<String, Integer>` to store bogie-capacity information.
- Add the following bogie-capacity mappings:
    - Sleeper → 72
    - AC Chair → 48
    - First Class → 24
- Use the `put()` method to insert each mapping.
- Iterate through the map using `entrySet()`.
- Display each bogie along with its seating capacity.

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

Bogie Capacity Details:

Sleeper -> 72
AC Chair -> 48
First Class -> 24
```

> **Note:** `HashMap` stores data as **key–value pairs**. The iteration order is **not guaranteed**, so the output order may vary.

---

## 📈 Learning Outcome

After completing UC6, the following Java concepts are understood:

- Using the `HashMap` collection
- Associating keys with values using key–value pairs
- Storing bogie capacities efficiently
- Iterating through a map using `entrySet()`
- Performing fast lookups using keys
- Understanding when to use a `Map` instead of a `List` or `Set`

---

## 🌿 Git Branch

```text
feature/uc6-map-bogie-capacity
```

---

## 💬 Commit Message

```text
feat(UC6): map bogies to seating capacity using HashMap
```

---

## 🚀 Project Status

- ✅ UC1 Completed
- ✅ UC2 Completed
- ✅ UC3 Completed
- ✅ UC4 Completed
- ✅ UC5 Completed
- ✅ UC6 Completed
