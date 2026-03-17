import java.lang.*;
import java.util.*;

public class CheckingAccount extends SavingsAccount implements HasMenu{
  public static void main(String[] args){
    new CheckingAccount();
  } // end main

  double balance;

  public CheckingAccount(){
  
  } // end null parameter constructor

  public CheckingAccount(balance){

  } // end constructor

  public String menu(){
    Scanner input = new Scanner(System.in);
    System.out.println("Account menu");
    System.out.println("0) quit");
    System.out.println("1) check balance");
    System.out.println("2) make a deposit");
    System.out.println("3) make a withdrawal");
    System.out.println("Please enter 0-3: ");
    String response = input.nextLine();
    return response;
  } // end menu

  public void start(){
    boolean keepGoing = true;
    while (keepGoing){
      String response = menu();

      if (response.equals("1")){
        System.out.println("Checking balance...");
        getBalanceString();
      } else if (response.equals("2")){
          System.out.println("Making a deposit...");
          makeDeposit();
          } else if (response.equals("3")){
              System.out.println("Making a withdrawal...");
              makeWithdrawal();
            } else if (response.equals("0")){
                keepGoing = false;
              } // end if
    } // end while

  public double getBalance(){
    return this.balance;
  } // end getBalance

  public String getBalanceString(){
    String balStr = String.format("%.2f", balance);
    System.out.println(balStr);
  } // end getBalanceString

  public void setBalance(balance){
    balance = 123.45d;

  
    
