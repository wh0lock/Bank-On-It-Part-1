# Bank-On-It-Part-1

## Classes implemented during part 1: 
```
class CheckingAccount implements HasMenu
 ----------------
  double balance
 ----------------
  CheckingAccount()
  CheckingAccount(double balance)
  main()
  string menu()
  void start()
  double getBalance()
  string getBalanceString()
  void setBalance(double balance)
  void checkBalance()
  private double getDouble()
  void makeDeposit()
  void makeWithdrawal()
 ----------------

interface HasMenu()
 ----------------
 ----------------
  string menu()
  void start()
 ----------------

class SavingsAccount extends CheckingAccount
 ----------------
  double interestRate
 ----------------
  main()
  calcInterest()
  void setInterestRate()
  double getInterestRate()
 ----------------

abstract class User implements HasMenu, Serializable
 ----------------
  string userName
  string PIN
 ----------------
  boolean login()
  boolean login(userName, PIN)
  void setUserName(userName)
  string getUserName()
  void setPIN(PIN)
  string getPIN()
  abstract string getReport()
 ----------------

class Customer extends User
 ----------------
  CheckingAccount checking
  SavingsAccount savings
 ----------------
  void main()
  Customer()
  Customer(userName, PIN)
  void start()
  string menu()
  void changePin()
  string getReport()
 ----------------
```

## Classes implemented during part 2:
```
class Admin extends User
 ----------------
 ----------------
  Admin()
  string menu()
  void start()
  string getReport()
 ----------------

class Bank implements HasMenu
 ----------------
  Admin admin
  ArrayList customers
 ----------------
  Bank()
  void main()
  void loadSampleCustomers()
  void saveCustomers()
  void loadCustomers()
  viod reportAllUsers()
  void addUser()
  void applyInterest()
  void loginAsCustomer()
  string menu()
  void start()
  void startAdmin()
 ----------------
```
Milestone 1: 
  - Git repo
  - Create HasMenu interface
  - Get basic functionality of CheckingAccount class working

Milestone 2: 
  - Finish working on CheckingAccount if necessary
  - Implement and test SavingsAccount
  - Start working on User class

Milestone 3:
  - Finish User class
  - Implement and test Customer
  - (Note: you'll need to test User to test Customer)
