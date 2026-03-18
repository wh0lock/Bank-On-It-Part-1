import java.util.*;
import java.io.*;

public class CheckingAccount implements HasMenu, Serializable{
  double balance;

  public static void main(String[] args){
    CheckingAccount ca = new CheckingAccount();
    ca.start();
  } // end main

  public CheckingAccount(){
    this.balance = 0d;
  } // end null parameter constructor

  public CheckingAccount(double balance){
    this.balance = balance;
  } // end constructor

  public String menu(){
    Scanner input = new Scanner(System.in);
    System.out.println("0) Quit");
    System.out.println("1) Check balance");
    System.out.println("2) Make a deposit");
    System.out.println("3) Make a withdrawal");
    System.out.println();
    System.out.print("Please enter 0-3: ");
    String response = input.nextLine();
    return response;
  } // end menu

  public void start(){
    boolean keepGoing = true;
    String response;
    while (keepGoing){
      response = menu();
      if (response.equals("1")){
        System.out.println("Checking balance...");
        this.checkBalance();
      } else if (response.equals("2")){
          System.out.println("Making a deposit...");
          this.makeDeposit();
          } else if (response.equals("3")){
              System.out.println("Making a withdrawal...");
              this.makeWithdrawal();
            } else if (response.equals("0")){
                keepGoing = false;
              } else {
                  System.out.println("Please enter 0, 1, 2, or 3.");
                } // end if
    } // end while
  } // end start
  
  public double getBalance(){
    return this.balance;
  } // end getBalance

  public String getBalanceString(){
    String result = String.format("$%.02f", this.balance);
    return result;
  } // end getBalanceString

  public void setBalance(double balance){
    this.balance = balance;
  } // end setBalance

  private double getDouble(){
    Scanner input = new Scanner(System.in);
    String resultStr = input.nextLine();
    double result = 0d;
    try {
      result = Double.parseDouble(resultStr);
    } catch (Exception e){
      System.out.println("Not a legal input - changing to 0.");
      result = 0d;
    } // end try
    return result;
  } // end getDouble

  public void checkBalance(){
    System.out.print("Current balance: ");
    System.out.println(this.getBalanceString());
  } // end checkBalance

  public void makeDeposit(){
    System.out.print("How much to deposit? ");
    double deposit = this.getDouble();
    this.balance += deposit;
    System.out.println("New balance: " + this.getBalanceString());
  } // end makeDeposit

  public void makeWithdrawal(){
    System.out.print("How much to withdrawal? ");
    double withdrawal = this.getDouble();
    if (withdrawal >= 0){
      if (withdrawal > this.balance){
        System.out.println("Insufficient funds :(");
      } else {
          this.balance -= withdrawal;
        } // end if
    } else {
        System.out.println("Please input a positive value.");
      } // end if
    System.out.println("New balance: " + this.getBalanceString());
  } // end makeWithdrawal

} // end CheckingAccount   
