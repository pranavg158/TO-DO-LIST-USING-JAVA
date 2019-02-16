package com.ncu.validators;

import java.io.*;
import java.util.Scanner;


public class display
{
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
        FileReader fileReader = new FileReader(fname);

        
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
}