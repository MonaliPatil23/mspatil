import java.io.*;
import java.util.*;
class TwoArray
{
 public static void main(String args[])
 { 
   int m,n,i,j;
    Scanner s=new Scanner(System.in);
    m=s.nextInt();
   n=s.nextInt();
   int[][] arr=new int[m][n];
   System.out.println("Enter number of rows and columns" +m +n);
  
   for(i=0;i<m;i++)
   {
    for(j=0;j<n;j++)
    {
       arr[i][j]=s.nextInt();
    }
      
   }
     for(i=0;i<m;i++)
   {
    for(j=0;j<n;j++)
{

   System.out.println("values of array" + arr[i][j]);
}}
 }

 }
