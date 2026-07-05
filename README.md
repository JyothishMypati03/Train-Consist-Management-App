# 📌 UC11: Validate Train ID & Cargo Codes (Regex)

## 🎯 Goal

Validate Train ID and Cargo Code formats using **Regular Expressions (Regex)** to ensure that only correctly formatted input is accepted before further processing.

---

## 👤 Actor

**User**

---

## 🔄 Flow

1. User enters the Train ID.
2. User enters the Cargo Code.
3. The system compiles the regular expression patterns.
4. `Matcher` validates the user input against the patterns.
5. If the input matches the required format, it is accepted.
6. Otherwise, an error message is displayed.
7. Program continues execution.

---

## 💡 Java Concepts Covered

- Regular Expressions (Regex)
- Pattern Class
- Matcher Class
- matches() Method
- Format Enforcement
- Data Integrity Validation

---

## 📋 Functional Requirements

- Define a regex pattern for Train ID:
    - `TRN-\\d{4}`
- Define a regex pattern for Cargo Code:
    - `PET-[A-Z]{2}`
- Compile the regex patterns using the `Pattern` class.
- Create `Matcher` objects for the user input.
- Validate the input using the `matches()` method.
- Display whether the Train ID and Cargo Code are valid or invalid.

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
│   │                   └── Bogie.java
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
    └── Bogie.java
```

---

## ▶️ Sample Output

### Valid Input

```text
======================================
   Train Consist Management App
======================================

Enter Train ID : TRN-1234
Enter Cargo Code : PET-AB

Train ID is Valid.
Cargo Code is Valid.
```

### Invalid Input

```text
======================================
   Train Consist Management App
======================================

Enter Train ID : TRAIN12
Enter Cargo Code : PET-123

Train ID is Invalid.
Cargo Code is Invalid.
```

---

## 📈 Learning Outcome

After completing UC11, the following Java concepts are understood:

- Creating regular expressions for input validation
- Compiling regex patterns using the `Pattern` class
- Matching user input using the `Matcher` class
- Validating complete strings using the `matches()` method
- Enforcing business rules through input format validation
- Improving application reliability by preventing invalid data entry

---

## 🌿 Git Branch

```text
feature/uc11-regex-validation
```

---

## 💬 Commit Message

```text
feat(UC11): validate train ID and cargo code using regular expressions
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
