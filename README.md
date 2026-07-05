# 📌 UC12: Safety Compliance Check for Goods Bogies

## 🎯 Goal

Validate goods bogies against railway safety rules using the Java Stream API and `allMatch()` to ensure that only safe cargo configurations are allowed.

---

## 👤 Actor

**User**

---

## 🔄 Flow

1. User creates a list of goods bogies.
2. The system converts the collection into a stream.
3. `allMatch()` validates every bogie against the safety rule.
4. Conditional logic checks whether cylindrical bogies carry only petroleum.
5. The validation result is stored in a boolean variable.
6. The system displays whether the train is safety compliant.
7. Program continues execution.

---

## 💡 Java Concepts Covered

- Stream API
- stream() Method
- allMatch() Terminal Operation
- Lambda Expressions
- Conditional Logic in Streams
- Short-Circuit Evaluation
- Business Rule Validation

---

## 📋 Functional Requirements

- Create a `GoodsBogie` class with the following fields:
    - type
    - cargo
- Create a `List<GoodsBogie>` to store goods bogies.
- Add goods bogies with different types and cargo.
- Convert the collection into a stream using `stream()`.
- Apply the following business rule:
    - **Cylindrical → Petroleum only**
- Validate all bogies using `allMatch()`.
- Store the validation result in a boolean variable.
- Display whether the train is safety compliant.

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

### Valid Goods Bogies

```text
======================================
   Train Consist Management App
======================================

Goods Bogies:

GoodsBogie{type='Cylindrical', cargo='Petroleum'}
GoodsBogie{type='Rectangular', cargo='Coal'}
GoodsBogie{type='Rectangular', cargo='Cement'}

Train Safety Compliance : PASSED
```

### Invalid Goods Bogies

```text
======================================
   Train Consist Management App
======================================

Goods Bogies:

GoodsBogie{type='Cylindrical', cargo='Coal'}
GoodsBogie{type='Rectangular', cargo='Cement'}

Train Safety Compliance : FAILED
```

---

## 📈 Learning Outcome

After completing UC12, the following Java concepts are understood:

- Using the Java Stream API for validation
- Validating collections using `allMatch()`
- Writing business rules with lambda expressions
- Applying conditional logic inside stream pipelines
- Understanding short-circuit evaluation
- Enforcing real-world safety rules in software systems

---

## 🌿 Git Branch

```text
feature/uc12-safety-compliance
```

---

## 💬 Commit Message

```text
feat(UC12): implement goods bogie safety compliance using Stream allMatch
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
