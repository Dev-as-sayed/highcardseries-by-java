# `README.md`

````md
# High Card Series

A console-based Java card game built using Object-Oriented Programming (OOP), Java Collections Framework, and Maven.

---

# Features

- Multiple players
- Computer player support
- Standard 52-card deck
- Round-based gameplay
- Automatic score calculation
- Sequence bonus system
- Suit bonus system
- Card replacement system
- JUnit testing support
- Modular architecture using services and models

---

# Technologies Used

- Java 21
- Maven
- JUnit 5
- VS Code / IntelliJ IDEA
- OOP Principles
- Java Collections Framework

---

# Project Structure

```txt
src/
├── main/
│   └── java/
│       └── com/highcard/
│
│           ├── constants/
│           ├── enums/
│           ├── exceptions/
│           ├── interfaces/
│           ├── models/
│           ├── services/
│           ├── utils/
│           └── Main.java
│
└── test/
    └── java/
        └── com/highcard/
```

---

# Requirements

Install:

- Java JDK 21
- Maven 3+
- Git (optional)

---

# Environment Setup (Ubuntu)

## Install Java 21

```bash
sudo apt update
sudo apt install openjdk-21-jdk -y
```

Verify:

```bash
java -version
```

---

## Install Maven

```bash
sudo apt install maven -y
```

Verify:

```bash
mvn -version
```

---

# Clone Project

```bash
git clone <your-repository-url>
```

Enter project folder:

```bash
cd highcardseries
```

---

# Compile Project

```bash
mvn clean compile
```

---

# Run Project

```bash
mvn exec:java
```

---

# Run Tests

```bash
mvn test
```

---

# Example Gameplay

```txt
=================================
HIGH CARD SERIES
=================================

Enter number of players (2-5): 2

Enter Player 1 Name: Sayed
Enter Player 2 Name: Alex

Add computer player? (yes/no): yes

Enter total rounds (5-10): 5

===== GAME STARTED =====
```

---

# Core Game Rules

- Each player draws one card per round.
- Highest card wins the round.
- Winners gain points.
- Winning cards are collected.
- Losing cards return to the deck.
- Bonus points:
  - Consecutive rank sequence
  - Same suit collections
- Final highest score wins the game.

---

# Maven Commands

## Compile

```bash
mvn clean compile
```

## Run

```bash
mvn exec:java
```

## Test

```bash
mvn test
```

## Package JAR

```bash
mvn package
```

---

# Architecture

The project follows layered architecture:

```txt
models
   ↑
utils
   ↑
services
   ↑
Main
```

---

# Main Components

| Layer     | Responsibility            |
| --------- | ------------------------- |
| models    | data objects              |
| services  | game logic                |
| utils     | helper algorithms         |
| constants | centralized configuration |
| tests     | validation/testing        |
````
