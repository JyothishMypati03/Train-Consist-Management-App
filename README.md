# 📌 UC14: Handle Invalid Bogie Capacity (Custom Exception)

## 🎯 Goal

Prevent invalid passenger bogies from being added to the train by enforcing capacity rules using a custom exception.

---

## 👤 Actor

**User**

---

## 🔄 Flow

1. User attempts to create a passenger bogie.
2. The system validates the bogie capacity.
3. If the capacity is less than or equal to zero, a custom exception is thrown.
4. If the capacity is valid, the bogie is created successfully.
5. The exception is handled appropriately.
6. The program continues execution safely.

---

## 💡 Java Concepts Covered

- Custom Exception
- Exception Inheritance
- throw Keyword
- throws Declaration
- try-catch Block
- Fail-Fast Validation
- Business Rule Enforcement

---

## 📋 Functional Requirements

- Create a custom exception class `InvalidBogieException`.
- Extend the `Exception` class.
- Validate the passenger bogie capacity inside the constructor.
- Throw `InvalidBogieException` when the capacity is less than or equal to zero.
- Declare the constructor using `throws InvalidBogieException`.
- Catch the exception using a `try-catch` block.
- Ensure invalid passenger bogies are never added to the train consist.

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
│   │                   └── InvalidBogieException.java
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
    └── InvalidBogieException.java
```

---

## ▶️ Sample Output

### Valid Capacity

```text
======================================
   Train Consist Management App
======================================

PassengerBogie{name='Sleeper', capacity=72}
PassengerBogie{name='AC Chair', capacity=48}

Program Continues Safely...
```

### Invalid Capacity

```text
======================================
   Train Consist Management App
======================================

PassengerBogie{name='Sleeper', capacity=72}
PassengerBogie{name='AC Chair', capacity=48}

Exception: Invalid Bogie Capacity! Capacity must be greater than zero.

Program Continues Safely...
```

---

## 📈 Learning Outcome

After completing UC14, the following Java concepts are understood:

- Creating custom checked exceptions
- Extending the `Exception` class
- Throwing exceptions using the `throw` keyword
- Declaring exceptions using the `throws` keyword
- Handling exceptions using `try-catch`
- Applying fail-fast validation during object creation
- Enforcing business rules through custom exceptions
- Preventing invalid data from entering the application

---

## 🌿 Git Branch

```text
feature/uc14-handle-invalid-capacity
```

---

## 💬 Commit Message

```text
feat(UC14): handle invalid passenger bogie capacity using custom exception
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
