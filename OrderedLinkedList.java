package com.bridgelabz.utility;
/*
Created by:Sourav Bebarta on 13.5.16
Purpose:
1.To perform operation on a doubly linked list.
*/
import com.bridgelabz.structure.Nodes;
import java.lang.String;
public class OrderedLinkedList<E>
{
	private Nodes head;
	private Nodes tail;
	private int size;
	public void add(E item)
    {
		Nodes newnode=new Nodes(item,null,null);
		size++;
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
				if((Integer)temp.getData()>(Integer)item)
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
		    if((Integer)item>(Integer)tail.getData())
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
				if((Integer)searchnode.getData()==(Integer)item)
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
				if((Integer)removal.getData()==(Integer)item)
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
			System.out.print(((Integer)iterate.getData())+" ");
            iterate=iterate.next;
		} 
        System.out.println();
	}
}

