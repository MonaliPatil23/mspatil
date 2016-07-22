package com.bridgelabz.app;
/*
Created by:Sourav Bebarta on 13.5.16
Purpose:
1.To perform operation of reading from and writing to a textfile.
*/
import com.bridgelabz.utility.OrderedLinkedList;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;
public class OrderedListDemo
{
	static String line;
    OrderedLinkedList<Integer> orderedLinkedList;
	BufferedReader br;
    public OrderedListDemo()
	{
	orderedLinkedList=new OrderedLinkedList();
	String p=readFile("OrderedNumberList.txt");
    String z[]=p.split(" ");
    number(z);
	}
	public String readFile(String filename)
	{
		try
		{
            br=new BufferedReader(new FileReader(filename));
            StringBuilder sb=new StringBuilder();
			String line=br.readLine();
			while(line!=null){
                
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
    }
    public void number(String wrd[])
	{
		
        int a[]=new int[wrd.length-1];
        
        for(int i=0;i<wrd.length-1;i++)
		{
			try{
            
            if(i==wrd.length-2)
            {
            
            a[i]=Integer.parseInt(wrd[i].trim());
            
            }
            else
            {
        	a[i]=Integer.parseInt(wrd[i]);
           
            }
			}
			catch(Exception exception){
				
			}  
		}
		for(int i=0;i<a.length;i++)
		{  
            orderedLinkedList.add(a[i]);
        }
		System.out.println("Your ordered linked list is: ");
        orderedLinkedList.print();
	}
	public void writeFile(String contents,String filename)
	{
		File file=new File(filename);
		try{
		FileWriter fw=new FileWriter(file);
		fw.write(contents);
		fw.flush();
		fw.close();
		}catch(Exception e){}
	}
	public static void main(String args[])
	{
		
		OrderedListDemo orderDemo=new OrderedListDemo();
        Scanner sc=new Scanner(System.in);
        char ch='y';
      
        while(ch=='y')
		{
			System.out.println("Press 1 to search the number from the list and add or remove it accordingly:");
			System.out.println("Press 2 to save the modified list.");
			System.out.println("Enter your choice:");
            int choice=sc.nextInt();
            orderDemo.menu(choice);
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
			case 1:System.out.println("Enter no. to search:");
                   int k=sc.nextInt();
				   if(!orderedLinkedList.search(k))
                   {
						System.out.println("Integer not found.So,we have to add.");
						orderedLinkedList.add(k);
						orderedLinkedList.print();
                   }
				   else
                   {
						System.out.println("Integer found.So,we have to remove.");
                        orderedLinkedList.remove(k);
                        orderedLinkedList.print();
                   }
                   break;
        	case 2:System.out.println("We are going to save the modified list.");
                   
				   writeFile(orderedLinkedList.getString(),"OrderedNumberList.txt");
				   break;
		}	
    }
}

