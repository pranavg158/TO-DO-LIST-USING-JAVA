package src.com.ncu.validator;
import java.util.Scanner;

import src.com.ncu.exceptions.*;

import java.io.IOException;

public class CheckLoginCredentials {
 
 public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
  String username, password;
  
  System.out.print("Enter username :: ");
  username = s.nextLine();
  
  System.out.print("Enter password :: ");
  password = s.nextLine();
  
  int length = username.length();
  int length1 = password.length();
  try {
   if(length < 6)
    throw new InvalidUserNameException("Username must be greater than 6 characters ???");
   else if(username == null)
    throw new EmptyUserName("Please Enter a Username");
  else if(password == null)
    throw new EmptyPasswordException("Please Enter The Password");
  else if(length1 > 10)
    throw new InvalidPasswordException("Please Enter Valid Password");
   else
    System.out.println("Login Successful !!!");
  }
  catch (EmptyUserName u) {
   u.printStackTrace();
  }
  catch (EmptyPasswordException p) {
   p.printStackTrace();
  }
  catch(InvalidPasswordException f) {
    f.printStackTrace();
  }
  catch(InvalidUserNameException g) {
    g.printStackTrace();
  }
 }
}