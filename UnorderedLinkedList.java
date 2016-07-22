package com.bridgelabz.utility;
/**
	*	Created by bridgelabz on 17/5/16.
	* <p>
 	* Purpose:
	*	1.Read the string from the file
	*	2.Search the word
	*	3.If word is found delete from the file
	*	4.Else if the word not found then add the word.
**/
import java.lang.String;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import com.bridgelabz.structure.Nodes;
public class UnorderedLinkedList<E>
{  
    private Nodes head;
	private Nodes tail;
	private int msize;
	public void add(E item)
    {
		Nodes newnode=new Nodes(item,null,null);
		msize++;
		if(head==null)
		{
			head=newnode;
			tail=newnode;
		}
 		else
	    {
			Nodes temp=head;
		    while(temp!=null)
			{
				if(((String)temp.getData()).compareTo((String)item)>0)
				{  
					newnode.next=temp;
			        newnode.previous=temp.previous;
			        if(temp.previous!=null)
					{
						(temp.previous).next=newnode;
					}
	 				else
					{
						head=newnode;
					}	
					temp.previous=newnode;
                    break;
				}
				temp=temp.next;
	        }
		    if(((String)item).compareTo((String)tail.getData())>0)
	        {
			   newnode.previous=tail;
			   tail.next=newnode;
		       tail=tail.next;
	        }

       }
			
    }
    public boolean search(E item)
	{
		if(head==null)
        {
        	return false;
        }
        else
		{
			Nodes searchnode=head;
			while(searchnode!=null)
			{
				if(((String)searchnode.getData()).equals((String)item))
                {
					System.out.println("The search item is found.");
                    return true;
                }
				searchnode=searchnode.next;
			}
            return false;
        }
    }
    public void remove(E item)
    {
		
		if(head==null)
        System.out.println("No element present in the linked list.");
		else
		{
			Nodes removal=head;
            while(removal!=null)
			{
				if(((String)removal.getData()).equals((String)item))
				{
					if(removal==head)
                    {
						(removal.next).previous=null;
						head=removal.next;
						return;
                    }
					else if(removal==tail)
					{
						(removal.previous).next=null;
						tail=tail.previous;
						return;
					}
                    else
					{
						(removal.previous).next=removal.next;
		                (removal.next).previous=removal.previous;
						return;
					}
			    }
			    removal=removal.next;
            }
	    }
   }
   public String getString()
   {
		Nodes traverse=head;
        String str=new String();
        while(traverse!=null)
		{
			str+=traverse.getData()+" ";
            traverse=traverse.next;
		}
        System.out.println(str);
		return str;
   }
   public void print()
   {
        Nodes iterate=head;
		while(iterate!=null)
		{
			System.out.print(((String)iterate.getData())+" ");
            iterate=iterate.next;
		} 
        System.out.println();
   }
}


  

