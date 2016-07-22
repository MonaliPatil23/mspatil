import java.io.*;
import java.io.Reader;
class FileLinkedList

{
public static void main(String args[])
{

try{
  
  FileInputStream fs = new FileInputStream("/home/bridgeit/Documents/abc.txt");
  DataInputStream in = new DataInputStream(fs);
  BufferedReader br = new BufferedReader(new InputStreamReader(in));
  String strLine;
  
  while ((strLine = br.readLine()) != null) 
  {
  
     String[] splitted = strLine.split("-"); // here - is used as the delimiter
  }
  
  in.close();
    }
 catch (Exception e)
 {
  System.err.println("Error: " + e.getMessage());
  }

 }
}
