package com.ncu.exceptions;
import java.util.Scanner;
import java.io.IOException;

public class EmptyPasswordException extends Exception{
  
public EmptyPasswordException(String s){

    super(s);
  }
} 
public class EmptyUserName extends Exception{
  
public EmptyUserName(String s){

    super(s);
  }
}
public class InvalidPasswordException extends Exception{
  
public InvalidPasswordException(String s){

    super(s);
  }
}
public class InvalidUserNameException extends Exception{
  
public InvalidUserNameException(String s){

    super(s);
  }
}
public class CheckLoginCredential {
 
 public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
  String username, password;
  
  System.out.print("Enter username :: ");
  username = s.nextLine();
  
  System.out.print("Enter password :: ");
  password = s.nextLine();
  
  int length = username.length();
  int length1 = password.lenght();
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