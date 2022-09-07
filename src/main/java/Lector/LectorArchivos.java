package Lector;
import java.io.*;

public class LectorArchivos{
  public static void main(String[] args)throws Exception
  {
  File doc = new File("C:\\Users\\HP\\Documents\\NetBeansProjects\\Lector\\junio.dat");

  BufferedReader obj = new BufferedReader(new FileReader(doc));

  String strng;
  while ((strng = obj.readLine()) != null)
    System.out.println(strng);
  }
}