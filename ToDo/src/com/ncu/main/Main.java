package src.com.ncu.main;
import java.util.* ;
import java.lang.* ;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

import src.com.ncu.exceptions.*;
import src.com.ncu.validator.*;
public class Main {

	public static void main(String[] args)
	{NameValidator2 n=new NameValidator2() ;
		Scanner input=new Scanner(System.in) ;
		n.username();
		
		System.out.print("\nCONGRATULATIONS YOU HAVE ENTERED THE PLATFORM");
	Scanner reader=new Scanner(System.in) ;
	System.out.print("\nDO YOU WANT TO MAKE CHANGES IN THE EARLIER FILE:(ENTER Y FOR YES AND N FOR NO)");
		char p=reader.next().charAt(0) ;
	while(p=='n')
		{
	n.adder();
	break ;}
	int k ;
	do{System.out.println("MENU(please enter from the following options:=)\n1)ADD\n2)UPDATE\n3)DELETE\n4)DISPLAY\n5)EXIT") ;  //menu options
	
	

	
	k=input.nextInt() ;
	switch(k)
	{
	case 1: n.adder2() ;
	        break ;
	case 2:n.update3() ;
		
		n.replace();
break ;	
	case 3:n.delet();
           break ;
	case 4:n.display();
	       break ;
    default: System.out.print("yo where are you heading bro . bye bye");

	}}while(k!=5) ; java.lang.System.exit(0) ;
	}
}
	//done 2
	



