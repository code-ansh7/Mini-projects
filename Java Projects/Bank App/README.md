# 🏦 Bank Management System

A menu-driven Java console application that simulates basic banking operations such as depositing money, withdrawing money, checking account balance, and handling invalid transactions using Exception Handling.

This project was built to strengthen my understanding of Object-Oriented Programming (OOP), Exception Handling, modular programming, and real-world application development in Core Java.

---

# 🎯 Project Objective

The objective of this project is to build a simple banking system where users can:

* Deposit money
* Withdraw money
* Check current account balance
* Handle invalid transactions safely
* Practice OOP principles and exception handling

---

# 🚀 Features

### 💰 Deposit Money

Allows users to deposit money into their account.

Validation:

* Amount must be greater than zero.

---

### 💸 Withdraw Money

Allows users to withdraw money from their account.

Validation:

* Amount must be positive.
* Amount must not exceed available balance.

---

### 💳 Check Balance

Displays the current account balance.

---

### ⚠️ Exception Handling

Handles invalid operations such as:

* Negative deposit
* Invalid withdrawal amount
* Insufficient balance
* Invalid menu choice

---

### 🚪 Exit

Safely exits the application.

---

# 📚 Java Concepts Used

## Object-Oriented Programming

* Class
* Object
* Methods
* Instance Variables
* Encapsulation (Basic)

---

## Exception Handling

* try
* catch
* finally
* throw
* IllegalArgumentException

---

## User Input

* Scanner Class

---

## Decision Making

* if
* else if
* else

---

## Loops

* Infinite while Loop
* Menu Driven Programming

---

# 🏗 Project Structure

```text
BankAccount
│
├── balance
├── deposit()
├── withdraw()
└── checkBalance()

↓

bankApp
│
└── main()
```

---

# ⚙️ Program Workflow

```text
Start
   │
   ▼
Create BankAccount Object
   │
   ▼
Display Banking Menu
   │
   ▼
User Chooses Option
   │
   ├── Deposit Money
   ├── Withdraw Money
   ├── Check Balance
   └── Exit
```

---

# 📂 Methods Overview

| Method           | Purpose                          |
| ---------------- | -------------------------------- |
| `deposit()`      | Deposits money into the account  |
| `withdraw()`     | Withdraws money after validation |
| `checkBalance()` | Displays current account balance |

---

# 🧠 Exception Handling

The application throws custom exceptions for invalid situations:

### Invalid Deposit

```text
Amount must be positive
```

---

### Invalid Withdrawal

```text
Invalid amount
```

---

### Insufficient Balance

```text
Insufficient balance
```

---

### Invalid Menu Choice

```text
Invalid choice
```

---

# 💻 Sample Output

```text
1. Deposit
2. Withdraw
3. Check Balance
4. Exit

Choose option : 1

Enter Amount : 500

Deposited : 500

Transaction Finished
```

---

# 🛠 Skills Developed

* Object-Oriented Programming
* Exception Handling
* Menu Driven Programming
* Input Validation
* Modular Programming
* Business Logic Implementation
* Error Handling

---

# 💼 Real World Applications

* Banking Software
* ATM Machine Simulation
* Digital Wallet
* Payment Gateway
* Finance Management System
* Mobile Banking Applications

---

# 🚀 Future Improvements

* Multiple Bank Accounts
* Account Number Generation
* User Login Authentication
* PIN Verification
* Transaction History
* File Handling Integration
* Interest Calculator
* Money Transfer Between Accounts
* Swing GUI Version
* SQL Database Integration
* Flutter Mobile Banking App

---

# 🏆 Learning Outcome

After completing this project, I learned how to:

* Design classes and objects for real-world applications
* Implement banking operations using methods
* Validate user input before processing
* Throw and handle custom exceptions
* Use try-catch-finally effectively
* Build a menu-driven Java application
* Apply Core Java concepts to solve practical problems

---

# 📌 Project Status

```text
Version : 1.0

Status  : ✅ Completed

Type    : Core Java Mini Project
```

---

## 👨‍💻 Developer Note

This project is part of my **Core Java Learning Journey**. It focuses on combining Object-Oriented Programming with Exception Handling to build a real-world banking application. Future versions will include File Handling for transaction history, Swing GUI for a graphical interface, SQL for permanent data storage, and Flutter for a complete mobile banking application.
