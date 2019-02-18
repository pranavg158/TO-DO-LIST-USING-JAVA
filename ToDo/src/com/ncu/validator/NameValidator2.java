package src.com.ncu.validator;
import java.util.*;
import java.io.* ;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import src.com.ncu.exceptions.*;


import java.io.*;
public class NameValidator2 {
	Scanner in=new Scanner(System.in) ;
public void adder()
	{
	    try // try catch block 
	    {
	    	
	        File f=new File("C:\\Users\\comapq\\eclipse-workspace\\ToDo\\ToDo\\ToDo.txt");// opens the file
	        FileWriter fout=new FileWriter(f);
	        BufferedWriter bout=new BufferedWriter(fout);
	        Scanner sc=new Scanner(System.in);
	     
	        
	        boolean flag=true;
	        while(flag) //keeps on working till the boolean value is true
	   
            {
                System.out.print("Enter s.no. ");
                
                bout.write(Integer.toString(sc.nextInt()));
                bout.write(' ');
                System.out.print(" Enter Venue:");
                bout.write(sc.next());
                bout.write(' ');
                System.out.print("Enter Time ");
                bout.write(Float.toString(sc.nextFloat()));
                bout.write(' ');
                System.out.print("Enter Details");
                bout.write(sc.next());
                bout.write(' ');
                System.out.print("\nDo you want to enter more?");
                char c=sc.next().charAt(0);
                bout.write('\n');
                if(c=='n' || c=='N')
                {
                    flag=false;
                }
            }
            bout.close();
            FileReader fin=new FileReader(f);
            BufferedReader bin= new BufferedReader(fin);
            String sr;
            System.out.println("The contents of the file are:");
            while((sr=bin.readLine())!=null)
            {
                String[] strs = sr.split(" ");
                System.out.println((strs[0]+ " "+ strs[1]+ " "+ strs[2]+ " "+ strs[3]));
            }
	    }catch(Exception e) // method to show the exception
	    {
	         System.out.print("the error occured");
	    }
	   
	}  
public void update3(){try {
	File fin = new File("C:\\Users\\comapq\\eclipse-workspace\\ToDo\\ToDo\\ToDo.txt");
	FileInputStream fis = new FileInputStream(fin);
	BufferedReader in = new BufferedReader(new InputStreamReader(fis));

	FileWriter fstream = new FileWriter("C:\\Users\\comapq\\eclipse-workspace\\ToDo\\ToDo\\Re.txt");
	BufferedWriter out = new BufferedWriter(fstream);
System.out.print("please enter the sno.");
Scanner ins=new Scanner(System.in) ;
int k=ins.nextInt();
String h=Integer.toString(k) ;
	String aLine = null;
	while ((aLine = in.readLine()) != null) {
		
		String[] strs= aLine.split(" ") ;
		
		if(strs[0].equals(h)) {out.write(strs[0]);
		   out.write(' ');
           System.out.print(" Enter Venue:");
           out.write(ins.next());
           out.write(' ');
           System.out.print("Enter Time ");
           out.write(Float.toString(ins.nextFloat()));
           out.write(' ');
           System.out.print("Enter Details");
           out.write(ins.next());
           out.write(' ');
		
		}
		else out.write(aLine) ;
		
		
		
		
		
		//Process each line and add output to Dest.txt file
		
	}

	// do not forget to close the buffer reader
	in.close();

	// close buffer writer
	out.close();
}catch(Exception e) {System.out.print("hello");}

} 


public void delet()
{ 

    File file = new File("C:\\Users\\comapq\\eclipse-workspace\\ToDo\\ToDo\\ToDo.txt"); 
      
    if(file.delete()) 
    { 
        System.out.println("File deleted successfully"); 
    } 
    else
    { 
        System.out.println("Failed to delete the file"); 
    } 
} 
public void display()
{
    String fname;
    Scanner scan = new Scanner(System.in);

    /* enter filename with extension to open and read its content */

    System.out.print("Enter File Name to Open (with extension like file.txt) : ");
    fname = scan.nextLine();

    /* this will reference only one line at a time */

    String line = null;
    try
    {
        /* FileReader reads text files */
        FileReader fileReader = new FileReader("C:\\Users\\comapq\\eclipse-workspace\\ToDo\\ToDo\\"+fname);

        
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        while((line = bufferedReader.readLine()) != null)
        {
            System.out.println(line);
        }

        /* always close the file after use */
        bufferedReader.close();
    }
    catch(Exception e)
    {
        System.out.println("Error reading file");
    }
}
public void replace()
{
try {	
	File fin = new File("C:\\Users\\comapq\\eclipse-workspace\\ToDo\\ToDo\\Re.txt");
	FileInputStream fis = new FileInputStream(fin);
	BufferedReader in = new BufferedReader(new InputStreamReader(fis));

	FileWriter fstream = new FileWriter("C:\\Users\\comapq\\eclipse-workspace\\ToDo\\ToDo\\ToDo.txt");
	BufferedWriter out = new BufferedWriter(fstream);

	String aLine = null;
	while ((aLine = in.readLine()) != null) {
		//Process each line and add output to Dest.txt file
		out.write(aLine);
		out.newLine();
	}

	// do not forget to close the buffer reader
	in.close();

	// close buffer writer
	out.close();

}catch(Exception e) {System.out.print(e);}
}
public void adder2()
{
    try // try catch block 
    {
        File f=new File("C:\\Users\\comapq\\eclipse-workspace\\ToDo\\ToDo\\ToDo.txt");// opens the file
        FileWriter fout=new FileWriter(f,true);
        BufferedWriter bout=new BufferedWriter(fout);
        Scanner sc=new Scanner(System.in);
        boolean flag=true;
        while(flag) //keeps on working till the boolean value is true
   
        {
            System.out.print("Enter s.no. ");
            
            bout.write(Integer.toString(sc.nextInt()));
            bout.write(' ');
            System.out.print(" Enter Venue:");
            bout.write(sc.next());
            bout.write(' ');
            System.out.print("Enter Time ");
            bout.write(Float.toString(sc.nextFloat()));
            bout.write(' ');
            System.out.print("Enter Details");
            bout.write(sc.next());
            bout.write(' ');
            System.out.print("\nDo you want to enter more?");
            char c=sc.next().charAt(0);
            bout.write('\n');
            if(c=='n' || c=='N')
            {
                flag=false;
            }
        }
        bout.close();
        FileReader fin=new FileReader(f);
        BufferedReader bin= new BufferedReader(fin);
        String sr;
        System.out.println("The appended contents of the file are:");
        while((sr=bin.readLine())!=null)
        {
            String[] strs = sr.split(" ");
            System.out.println((strs[0]+ " "+ strs[1]+ " "+ strs[2]+ " "+ strs[3]));
        }
    }catch(Exception e) // method to show the exception
    {
         System.out.print("the error occured");
    }
   
}  

public void username() {
	Logger logger = Logger.getLogger(NameValidator.class);
	PropertyConfigurator.configure("C:\\Users\\comapq\\eclipse-workspace\\ToDo\\configs\\logs\\logger.properties");
	Properties prop = new Properties();
	FileInputStream input=null; 
	Scanner s = new Scanner(System.in);
  String username, password;
  boolean x=true ;
 do {
	 if(x==false)System.out.print("please enter the correct information again!!!!\n");
	 System.out.print("Enter username(atleast 6 characters) :: ");
  username = s.nextLine();
 
  System.out.print("Enter password(at most 10 characters) :: ");
  password = s.nextLine();
  
  int length = username.length();
  int length1 = password.length();
try {
	input = new FileInputStream("C:\\Users\\comapq\\eclipse-workspace\\ToDo\\configs\\constant\\exceptions.properties");
	prop.load(input);
emptyUserName(length) ;
emptyPassword(length1) ;
invalidUserName(length) ;
invalidPassword(length1) ;

}

catch(EmptyUserName e){
	logger.error("\n \n"+e+prop.getProperty("emptyNameMessage")+"\n");
	x=false ;
	
}
catch(EmptyPasswordException f){
	logger.error("\n \n"+f+prop.getProperty("passwordMessage")+"\n");
	x=false ;
	
}
catch(InvalidUserNameException g){
	logger.error("\n \n"+g+prop.getProperty("invalidUsername")+"\n");
	x=false ;
	
}
catch(InvalidPasswordException h){
	logger.error("\n \n"+h+prop.getProperty("invalidPassword")+"\n"); 
x=false ;

}
catch(Exception k) {System.out.print(k);}}while(x!=true) ;}
private void emptyUserName(int len)throws EmptyUserName{
	if(len==0) throw new EmptyUserName("Empty File Name") ;


 }
private void emptyPassword(int len)throws EmptyPasswordException{
	if(len==0) throw new EmptyPasswordException("Empty Password") ;


 }
private void invalidUserName(int length)throws InvalidUserNameException{
	if(length<6) throw new InvalidUserNameException("Invalid User Name") ;


 }
private void invalidPassword(int length)throws InvalidPasswordException{
	if(length>10) throw new InvalidPasswordException("Invalid Password") ;


 }
}



