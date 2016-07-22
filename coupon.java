import java.lang.*;
import java.util.*;
public class coupon
{
public static void main(String[] args)
{
 
System.out.println("How many random nos. you want to generate?");
Scanner sc=new Scanner(System.in);
int p=sc.nextInt();
   
      int rnd;  
      Random rand=new Random();  
      ArrayList numbers = new ArrayList();  
      for (int k=0 ;k<=p;k++)  
      {  
           rnd = rand.nextInt(100);  
           if(k==0)  
           {  
                 numbers.add(rnd);  
           }  
           else  
           {  
                while(numbers.contains(new Integer(rnd)))  
                {  
                     rnd = rand.nextInt(100); 
                }  
                numbers.add(rnd); 
           }  
      }  

    System.out.println(numbers);
    coupon c=new coupon();
    c.arrprint(numbers);
    
}
public void arrprint(ArrayList numbers)
{
    System.out.print("The random no. of unique numbers generated is:");
	for (int i = 0; i < numbers.size(); i++) 
    {
	    int value = (int)numbers.get(i);
	    System.out.print(value);
	}
    System.out.println();

    
	
}


}
