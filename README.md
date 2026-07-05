# 📌 UC15: Safe Cargo Assignment Using try-catch-finally

## 🎯 Goal

Safely handle unsafe cargo assignments without crashing the Train Consist Management App by using `try`, `catch`, and `finally` blocks along with a custom runtime exception.

---

## 👤 Actor

**User**

---

## 🔄 Flow

1. User attempts to assign cargo to a goods bogie.
2. The system checks the compatibility between the bogie shape and cargo.
3. If the cargo assignment is unsafe, a custom runtime exception is thrown.
4. The exception is caught using the `catch` block.
5. An appropriate error message is displayed.
6. The `finally` block executes cleanup or logging operations.
7. The application continues execution safely.

---

## 💡 Java Concepts Covered

- try Block
- catch Block
- finally Block
- Runtime Exception
- Custom Runtime Exception
- throw Keyword
- Graceful Exception Handling
- Defensive Programming

---

## 📋 Functional Requirements

- Create a custom runtime exception class `CargoSafetyException`.
- Create a `GoodsBogie` class with:
    - type
    - cargo
- Validate cargo compatibility before assignment.
- Throw `CargoSafetyException` when:
    - A **Rectangular** bogie is assigned **Petroleum**.
- Handle the exception using a `try-catch` block.
- Execute the `finally` block for completion logging.
- Ensure the application continues execution after handling the exception.

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

### Valid Cargo Assignment

```text
======================================
   Train Consist Management App
======================================

Assigning Cargo...

GoodsBogie{type='Rectangular', cargo='Coal'}

Cargo Assignment Process Completed.

Program Continues Safely...
```

### Invalid Cargo Assignment

```text
======================================
   Train Consist Management App
======================================

Assigning Cargo...

Exception: Petroleum cannot be assigned to a Rectangular Bogie.

Cargo Assignment Process Completed.

Program Continues Safely...
```

---

## 📈 Learning Outcome

After completing UC15, the following Java concepts are understood:

- Creating custom runtime exceptions
- Understanding the difference between checked and unchecked exceptions
- Throwing runtime exceptions using the `throw` keyword
- Handling runtime exceptions using `try-catch`
- Executing mandatory code using the `finally` block
- Implementing graceful failure handling
- Applying business rules during runtime operations
- Improving application reliability through defensive programming

---

## 🌿 Git Branch

```text
feature/uc15-safe-cargo-assignment
```

---

## 💬 Commit Message

```text
feat(UC15): implement safe cargo assignment using try-catch-finally
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
