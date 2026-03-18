import java.util.*;
import java.io.*;

abstract class User implements HasMenu, Serializable{
  String userName;
  String PIN;

  public String getUserName(){
    return this.userName;
  } // end getUserName

  public String getPIN(){
    return this.PIN;
  } // end getPIN

  public void setUserName(String userName){
    this.userName = userName;
  } // end setUserName

  public void setPIN(String PIN){
    this.PIN = PIN;
  } // end setPIN

  public boolean login(){
    Scanner input = new Scanner(System.in);
    System.out.print("User name: ");
    String userName = input.nextLine();
    System.out.println();
    System.out.print("PIN: ");
    String PIN = input.nextLine();
    boolean keepGoing = true;
    while(keepGoing){
      if (userName.equals(this.userName)){
        if (PIN.equals(this.PIN)){
          System.out.println("Login successful");
          keepGoing = false;
          return true;
        } else {
            System.out.println("Incorrect PIN");
            return false;
          } // end if
      } else {
          System.out.println("Incorrect user name");
          return false;
        } // end if
    } // end while
    return true;
  } // end login

  public boolean login(String userName, String PIN){
    boolean keepGoing = true;
    while(keepGoing){
      if (userName.equals(this.userName)){
        if (PIN.equals(this.PIN)){
          System.out.println("Login successful");
          keepGoing = false;
          return true;
        } else {
            System.out.println("Incorrect PIN");
            return false;
          } // end if
      } else {
          System.out.println("Incorrect user name");
          return false;
        } // end if
    } // end while
    return true;
  } // end login(userName, PIN)

  public abstract String getReport();

} // end User
