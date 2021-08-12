package javaapplication2;
import java.util.Scanner;
public class JavaApplication2
{
    public static void main(String[] args)
    {
       Scanner a = new Scanner(System.in);
       System.out.print("Input your first name: ");
       String fn = a.next(); 
       System.out.print("Input your last name: ");
       String ln = a.next();
       System.out.println();
       System.out.println("Hello");
       System.out.print(fn+" "+ln+"\n"); 
    }
}
