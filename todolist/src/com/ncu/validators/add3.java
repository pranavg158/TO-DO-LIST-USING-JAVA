package tries;
import java.util.*;
import java.io.*;
public class add3 {


	public void adder()
	{
	    try
	    {
	        File f=new File("ToDo.txt");
	        FileWriter fout=new FileWriter(f);
	        BufferedWriter bout=new BufferedWriter(fout);
	        Scanner sc=new Scanner(System.in);
	        boolean flag=true;
	        while(flag)
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
            System.out.println("The contents of the file");
            while((sr=bin.readLine())!=null)
            {
                String[] strs = sr.split(" ");
                System.out.println((strs[0]+ " "+ strs[1]+ " "+ strs[2]+ " "+ strs[3]));
            }
	    }catch(Exception e)
	    {
	         System.out.print("the error occured");
	    }
	   
	}  
}

