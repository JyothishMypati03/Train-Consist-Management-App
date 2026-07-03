#  UC3: Track Unique Bogie IDs (Set – HashSet)

## 🎯 Goal

Ensure that no duplicate bogie IDs are added to the train by using the `HashSet` collection.

---

## 👤 Actor

**User**

---

## 🔄 Flow

1. User adds bogie IDs.
2. System stores bogie IDs in a `HashSet`.
3. Duplicate bogie IDs are ignored automatically.
4. Unique bogie IDs are displayed.
5. Program continues execution.

---

## 💡 Java Concepts Covered

- Set Interface
- HashSet
- add() Method
- Automatic Deduplication
- Uniqueness of Elements
- Hash-Based Storage

---

## 📋 Functional Requirements

- Create a `HashSet<String>` for bogie IDs.
- Add multiple bogie IDs.
- Intentionally add duplicate IDs.
- Display the final set.
- Verify that duplicate IDs are removed automatically.

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

Bogie IDs:
[BG101, BG102, BG103]
```

> Duplicate entries are automatically ignored by `HashSet`.

---

## 📈 Learning Outcome

After completing UC3, the following Java concepts are understood:

- Using the `Set` interface
- Working with `HashSet`
- Storing only unique elements
- Preventing duplicate data automatically
- Understanding unordered collections
- Applying uniqueness constraints in real-world applications

---

## 🌿 Git Branch

```text
feature/uc3-unique-bogie-ids
```

---

## 💬 Commit Message

```text
feat(UC3): implement unique bogie ID management using HashSet
```

---

## 🚀 Project Status

- ✅ UC1 Completed
- ✅ UC2 Completed
- ✅ UC3 Completed
