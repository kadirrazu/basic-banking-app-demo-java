# basic-banking-app-demonstration-java
Basic Solution About Using Inheritence in Java

Problem Statements are as follows:
==================================

Here, BankingApp.java is my MAIN class. Account.java is parent/super class, And CurrentAccount.java + SavingsAccount.java is two child/inherited class of Account.java

==Problem Statement Start==

Assume that a bank maintains two kinds of accounts for its customers, one called savings account and the other current account. The savings account provides compound interest (5%) and withdrawal facilities. The current account provides no interest. Current account holders should also maintain a minimum balance and if the balance falls below this level, a service charge in imposed.

Create a class Account that stores customer name, account number, type of account and balance. From this Account class derive the classes CurrentAccount and SavingsAccount to make them more specific to their requirements. Include the necessary methods in order to achieve the following tasks:

o Initialize all instance variables through constructors. [use super() ]

o Accept deposit from a customer & update the balance [depAmount (…) ]

o Display the balance [showBalance ( ) ]

o Compute and deposit interest [computeInterest ( ) ]

o Permit withdrawal and update the balance [withdraw (…) ]

o Check for the minimum balance (assume $500), impose penalty (print a message, if necessary) and restrict the withdrawal of balance.

[Use only methods to initialize the class members and other tasks.] 

==Problem Statement Ends==
