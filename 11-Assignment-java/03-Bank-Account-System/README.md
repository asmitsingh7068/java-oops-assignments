# 🏦 Bank Account System (Core Java)

A simple **Bank Account System** developed using **Core Java**.

This project demonstrates the basic concepts of **Object-Oriented Programming (OOP)** such as **Encapsulation, Classes, Objects, Constructors, and Methods**.

---

## 📌 Features

- 💰 Deposit Money
- 💸 Withdraw Money
- 💳 Check Account Balance
- 📜 View Transaction History
- 🚪 Exit Application

---

## 🛠️ Technologies Used

- Core Java
- OOP (Object-Oriented Programming)
- Scanner Class
- Methods
- Encapsulation

---

## 📂 Project Structure

```
03-Bank-Account-System
│
├── BankAccount.java
├── Main.java
└── README.md
---

## UML Daigram....


                    +--------------------------------------+
                    |            BankAccount              |
                    +--------------------------------------+
                    | - accountHolderName : String         |
                    | - accountNumber     : int            |
                    | - balance           : double         |
                    | - transactionHistory: String         |
                    +--------------------------------------+
                    | + BankAccount(                      |
                    |     accountHolderName : String,     |
                    |     accountNumber : int,            |
                    |     balance : double )              |
                    |--------------------------------------|
                    | + deposit(amount : double) : void    |
                    | + withdraw(amount : double) : void   |
                    | + showBalance() : void               |
                    | + showTransactionHistory() : void    |
                    +--------------------------------------+

                              ▲
                              │
                              │ creates & uses
                              │
                    +----------------------------+
                    |            Main            |
                    +----------------------------+
                    | + main(args:String[])      |
                    +----------------------------


#OUTPUT---


C:\Users\R.K.Singh\OneDrive\Desktop\GitHub-Projects\java-oops-assignments\11-Assignment-java\03-Bank-Account-System>javac Main.java

C:\Users\R.K.Singh\OneDrive\Desktop\GitHub-Projects\java-oops-assignments\11-Assignment-java\03-Bank-Account-System>java Main
========== BANK ACCOUNT ==========
Enter Account Holder Name : asmit
Enter Account Number : 1111
Enter Initial Balance : 100000

========== MENU ==========
1. Deposit
2. Withdraw
3. Check Balance
4. Transaction History
5. Exit
Enter Your Choice : 2
Enter Withdraw Amount : 10000
â??10000.0 Withdrawn Successfully.

========== MENU ==========
1. Deposit
2. Withdraw
3. Check Balance
4. Transaction History
5. Exit
Enter Your Choice : 3

Current Balance : â??90000.0

========== MENU ==========
1. Deposit
2. Withdraw
3. Check Balance
4. Transaction History
5. Exit
Enter Your Choice : 4

===== Transaction History =====
Account Created with Balance : â??100000.0
Withdraw : â??10000.0


========== MENU ==========
1. Deposit
2. Withdraw
3. Check Balance
4. Transaction History
5. Exit
Enter Your Choice : 5

Thank You!
Visit Again.

## 👨‍💻 Author

**Asmit Singh**

Learning Core Java and building projects to strengthen Java and OOP concepts.