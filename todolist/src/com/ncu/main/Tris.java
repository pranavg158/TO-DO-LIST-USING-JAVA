package tries;
import java.util.* ;
import java.lang.* ;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;
public class Tris
{
	public static void main(String[] args)
	{
	Scanner input=new Scanner(System.in) ;	
	Scanner reader=new Scanner(System.in) ;
	System.out.print("DO YOU WANT TO MAKE CHANGES IN THE EARLIER FILE:(ENTER Y FOR YES AND N FOR NO)");
		char p=reader.next().charAt(0) ;
	while(p=='n')
		{add3 n=new add3() ;
	n.adder();
	break ;}
	int k ;
	do{System.out.println("MENU(please enter from the following options:=)\n1)ADD\n2)UPDATE\n3)DELETE\n4)DISPLAY\n5)EXIT") ;  //menu options
	
	
	Append1 t=new Append1() ;
	delete l=new delete() ;          //function to delete
	display o=new display() ;        //function to display
	Update3 u=new Update3() ;
	
	k=input.nextInt() ;
	switch(k)
	{
	case 1: t.adder2() ;
	        break ;
	case 2:u.update3() ;
		break ;
	case 3:l.delet();
           break ;
	case 4:o.display();
	       break ;
    default: System.out.print("yo where are you heading bro . bye bye");

	}}while(k!=5) ; java.lang.System.exit(0) ;
	}
}
	//done 2
	



