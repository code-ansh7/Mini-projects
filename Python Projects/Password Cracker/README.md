# 🔐 Random Password Guess Simulator

A Python console application that demonstrates how random character generation can be used to repeatedly generate guesses until they match a user-defined password.

This project was created to practice Python fundamentals such as loops, random number generation, string manipulation, and basic automation concepts.

> **Note:** This project is created for educational purposes only to understand programming logic and random guessing techniques. It is **not** a real password cracking tool.

---

# 🎯 Project Objective

The objective of this project is to simulate how a program continuously generates random password guesses until the generated string matches the user-provided password.

This project helps in understanding:

* Random character generation
* String comparison
* Loop execution
* Automation concepts
* Program flow

---

# 🚀 Features

### 🔑 User Password Input

Allows the user to enter a custom password.

---

### 🎲 Random Character Generation

Randomly selects characters from a predefined character list.

---

### 🔄 Continuous Guessing

Keeps generating password guesses until the correct password is produced.

---

### 💻 Live Guess Display

Displays each generated guess while the simulation is running.

---

### 🎉 Success Message

Displays the guessed password once it matches the user's input.

---

# 📚 Python Concepts Used

## Variables

* String Variables
* List Variables

---

## Loops

* while Loop
* for Loop

---

## Random Module

* `random.randint()`

---

## String Operations

* String Concatenation
* String Comparison

---

## Lists

* Character List
* Random Index Access

---

## OS Module

* `os.system("cls")`

Used to clear the console screen on Windows.

---

# 🏗 Project Workflow

```text
Start
   │
   ▼
Enter Password
   │
   ▼
Generate Random Characters
   │
   ▼
Build Random Password
   │
   ▼
Compare with User Password
   │
   ├── Not Match → Try Again
   └── Match → Display Password
```

---

# ⚙️ Program Flow

```text
User Input
      │
      ▼
Random Character Generator
      │
      ▼
Create Guess
      │
      ▼
Compare Strings
      │
      ├── Incorrect
      │      │
      │      ▼
      │   Generate Again
      │
      └── Correct
             │
             ▼
      Display Password
```

---

# 🧠 Concepts Practiced

* Random Number Generation
* String Manipulation
* Nested Loops
* Infinite Loop Control
* User Interaction
* Basic Automation Logic

---

# 💻 Sample Output

```text
Enter a password : java

Generating password...

j
ja
jav
java

Your password is : java
```

---

# 🛠 Skills Developed

* Logical Thinking
* Loop Design
* Randomized Programming
* Python Fundamentals
* Console Application Development

---

# 💼 Educational Applications

* Random Guess Simulation
* Programming Practice
* Loop Demonstration
* String Manipulation Exercises
* Beginner Python Projects

---

# 🚀 Future Improvements

* Include uppercase letters
* Include special characters
* Include complete alphabet and digits
* Display total attempts
* Display execution time
* Adjustable character set
* Better random generation
* GUI Version
* Password Strength Checker
* Password Generator

---

# 🏆 Learning Outcome

After completing this project, I learned how to:

* Generate random characters using Python
* Compare strings efficiently
* Build repeated guessing logic using loops
* Work with lists and indexing
* Understand simulation-based programming

---

# 📌 Project Status

```text
Version : 1.0

Status  : ✅ Completed

Language : Python
```

---

## 👨‍💻 Developer

**Developed by Ansh**

This project is part of my programming journey where I build small projects to strengthen problem-solving skills, logical thinking, and software development fundamentals. Every project helps me move one step closer to becoming a professional App Developer.

---

⭐ **This project is intended solely for educational and learning purposes.**
