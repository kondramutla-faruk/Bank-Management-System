# Banking Management System

## Project Overview

Banking Management System is a Java-based mini project developed using Core Java, JDBC, MySQL, and SQL.

The system manages customers, bank accounts, deposits, withdrawals, fund transfers, and transaction records.

## Features

- Customer management
- Account management
- Savings and Current account support
- Deposit
- Withdrawal
- Fund transfer
- Transaction history
- Input validation
- Custom exception handling
- JDBC transaction management
- MySQL database integration


## Technologies Used

- Java
- JDBC
- MySQL
- SQL
- IntelliJ IDEA


## Project Structure

```text
src
├── dao
├── exception
├── model
├── service
├── test
└── util
```

## Database

Database Name: `banking_management_system`

### Tables

- Customer
- Account
- Transaction

The project uses MySQL as the database and JDBC for database connectivity.


## Main Operations

- Add customer
- Create bank account
- View customer details
- View account details
- Deposit money
- Withdraw money
- Transfer money between accounts
- View transaction history


## Exception Handling

The project uses custom exceptions for handling common banking errors:

- `AccountNotFoundException`
- `InsufficientBalanceException`
- `InvalidAmountException`

These exceptions help validate banking operations and provide meaningful error messages.


## Transaction Management

Fund transfers are handled using JDBC transaction management.

The project uses:

- `setAutoCommit(false)`
- `commit()`
- `rollback()`

This ensures that a fund transfer is completed as a single transaction and prevents partial balance updates when an error occurs.


## Testing

The project was tested for:

- Customer creation and retrieval
- Account creation and retrieval
- Deposit
- Withdrawal
- Fund transfer
- Transaction history
- Invalid amounts
- Insufficient balance
- Invalid account numbers
- Transaction rollback scenarios


## How to Run

1. Create the `banking_management_system` database in MySQL.
2. Create the required tables: `Customer`, `Account`, and `Transaction`.
3. Configure the database connection in `DBConnection.java`.
4. Add the MySQL JDBC driver to the project.
5. Open the project in IntelliJ IDEA.
6. Build the project and run the required test classes from the `test` package.


## Future Enhancements

- Add a user-friendly graphical interface
- Add authentication and authorization
- Improve database security using external configuration
- Add advanced reporting and account statements
