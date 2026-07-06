# 📌 UC20: Exception Handling During Search Operations

## 🎯 Goal

Prevent search operations on an empty train by throwing an `IllegalStateException` before performing the search.

---

## 👤 Actor

**User**

---

## 🔄 Flow

1. User initiates a search operation.
2. The system checks whether the train contains any bogies.
3. If the bogie collection is empty, the system throws an `IllegalStateException`.
4. The exception is caught and a meaningful error message is displayed.
5. The search operation stops immediately.
6. The application continues execution safely.

---

## 💡 Java Concepts Covered

- Defensive Programming
- IllegalStateException
- Runtime Exceptions
- throw Keyword
- try-catch Block
- State Validation
- Fail-Fast Principle

---

## 📋 Functional Requirements

- Create a collection to store bogie IDs.
- Check whether the collection is empty before searching.
- Throw an `IllegalStateException` if no bogies are available.
- Display a meaningful error message.
- Prevent further execution of the search logic.
- Handle the exception using a `try-catch` block.
- Continue program execution after handling the exception.

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

> **Note:** `IllegalStateException` is a built-in Java runtime exception (`java.lang`). No custom exception class is required for this use case.

---

## ▶️ Sample Output

### Empty Train Consist

```text
======================================
   Train Consist Management App
======================================

Enter Bogie ID to Search: BG101

Error: No bogies available in the train consist.

Program Continues Safely...
```

### Train Contains Bogies

```text
======================================
   Train Consist Management App
======================================

Enter Bogie ID to Search: BG205

Bogie Found: BG205

Program Continues Safely...
```

---

## 📈 Learning Outcome

After completing UC20, the following Java concepts are understood:

- Applying defensive programming techniques
- Validating object state before performing operations
- Using the built-in `IllegalStateException`
- Throwing runtime exceptions using the `throw` keyword
- Handling exceptions using a `try-catch` block
- Implementing the fail-fast principle
- Preventing invalid search operations
- Improving application reliability through state validation

---

## 🌿 Git Branch

```text
feature/uc20-exception-handling-search
```

---

## 💬 Commit Message

```text
feat(UC20): prevent search on empty train using IllegalStateException
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
- ✅ UC20 Completed
- 🎉 **Train Consist Management App Project Completed**