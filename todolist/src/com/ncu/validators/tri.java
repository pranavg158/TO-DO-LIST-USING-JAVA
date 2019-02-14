package tries;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;
public class tri 
{
	public static void main(String[] args)
	{
	System.out.println("MENU(please enter from the following options:=)\n1)ADD\n2)UPDATE\n3)DELETE\n4)DISPLAY") ;  //menu options
	int k ;
	add3 n=new add3() ;
	delete l=new delete() ;          //function to delete
	display o=new display() ;        //function to display
	Scanner input=new Scanner(System.in) ;
	k=input.nextInt() ;
	switch(k)
	{
	case 1: n.adder() ;
	        break ;
	case 2:break ;
	case 3:l.delet();
           break ;
	case 4:o.display();
	       break ;
    default: System.out.print("yo where are you heading bro . bye bye");

	}
	}
}
	//done 2
	



