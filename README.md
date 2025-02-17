# Multithreaded Bank System

A **Multithreaded Bank System** that simulates banking transactions, such as deposits, withdrawals, and transfers, using **multithreading** and **custom exceptions**. This project demonstrates the use of **thread synchronization**, **Executor Service**, and **custom exceptions** to manage concurrent access to bank accounts safely.

## Features

- **Multithreaded Transactions**: Simulate concurrent deposits, withdrawals, and transfers using Java's `ExecutorService`.
- **Thread-Safe Operations**: Bank account methods (deposit, withdraw, transfer) are synchronized to ensure that they are thread-safe.
- **Custom Exceptions**: Handle errors such as insufficient funds or invalid account operations using custom exceptions.
- **Concurrency Handling**: Using the `ExecutorService` to manage a fixed thread pool, tasks are submitted and processed concurrently.
- **Real-time Logging**: Transaction logs to track the status of deposits, withdrawals, and transfers.

## Technologies Used

- Java 8+
- Executor Service
- Synchronized Methods
- Custom Exceptions
- Multithreading
- Logging

## How to Run

1. **Clone the repository:**
   ```bash
   git clone https://github.com/yourusername/multithreaded-bank-system.git
   cd multithreaded-bank-system


multithreaded-bank-system/
|__main/
  ├── BankSystem.java               # Main class to execute transactions
  ├── Bank.java                     # Bank class that manages accounts and transactions
  ├── BankAccount.java              # Represents a bank account
  ├── TransactionTask.java          # Defines a transaction task to be run in a separate thread
└── Exceptions/                   # Folder containing custom exceptions
    ├── InsufficientFundsException.java  # Custom exception for insufficient funds
    └── InvalidAccountException.java   # Custom exception for invalid account operations
