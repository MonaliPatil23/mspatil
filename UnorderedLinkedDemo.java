package com.bridgelabz.app;
/**
	*	Created by bridgelabz on 17/5/16.
	* <p>
 	* Purpose:
	*	1.Read the string from the file
	*	2.Provide a menu.
	*	3.Write the modified string to the file. 
**/
import  java.util.Scanner;
//import java.lang.*;
import java.io.BufferedReader;
//import java.io.*;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.FileWriter;
import com.bridgelabz.utility.UnorderedLinkedList;
public class UnorderedLinkedDemo
{
 	UnorderedLinkedList<String> unorderedLinkedList;
	BufferedReader br;
    public UnorderedLinkedDemo()
	{
		unorderedLinkedList=new UnorderedLinkedList();
		String p=userInput("UnorderedList.txt");
		String z[]=p.split(" ");
		for(int i=0;i<z.length;i++)
		{  
        	unorderedLinkedList.add(z[i]);
		}
		System.out.print("Your ordered linked list is: ");
	    unorderedLinkedList.print();
	} 
 	public String userInput(String filename)
	{
   		 try
		 {
            br=new BufferedReader(new FileReader(filename));
            StringBuilder sb=new StringBuilder();
			String line=br.readLine();
			while(line!=null)bool keyword in c
            {
                sb.append(line);
				sb.append(System.lineSeparator());
				line=br.readLine();
			}
			return sb.toString();
		}
		catch(Exception E)
		{
			return null;
		}
        finally
		{
			try
			{   
                br.close();
			}
			catch(Exception E)
            {
            }
 
		}
	
	}//end of userinput
	public static void main(String []args)
	{
		  UnorderedLinkedDemo uorder=new UnorderedLinkedDemo();
		  Scanner sc=new Scanner(System.in);
          char ch='y';
          while(ch=='y')
		  {
			System.out.println("Press 1 to search the number from the list and add or remove it accordingly:");
			System.out.println("Press 2 to save the modified list.");
			System.out.println("Enter your choice:");
            int choice=sc.nextInt();
            uorder.menu(choice);
			System.out.println("Do you want to repeat again ?(press y)");
            String str=sc.next();//Inputs String
            ch=str.charAt(0);
		  }
	}
    public void menu(int choice)
    {   
        Scanner sc=new Scanner(System.in);
    	switch(choice)
		{
			case 1:System.out.println("Enter word to search:");
                   String k=sc.nextLine();
				   if(!unorderedLinkedList.search(k))
                   {
						System.out.print("Integer not found.So,we have to add.");
						unorderedLinkedList.add(k);
						unorderedLinkedList.print();
                   }
				   else
                   {
						System.out.print("Integer found.So,we have to remove.");
                        unorderedLinkedList.remove(k);
                        unorderedLinkedList.print();
                   }
                   break;
        	case 2:System.out.println("We are going to save the modified list.");
                   writeFile(unorderedLinkedList.getString(),"UnorderedList.txt");
				   break;
		}	
   }
   public void writeFile(String contents,String filename)
   {
		File file=new File(filename);
		try
        {
		FileWriter fw=new FileWriter(file);
		fw.write(contents);
		fw.flush();
		fw.close();
		}
        catch(Exception e)
        {
        }
   }
	
}
