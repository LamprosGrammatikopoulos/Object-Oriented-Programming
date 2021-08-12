package javaapplication5;
import java.util.Scanner;
public class JavaApplication5
{
    public static void main(String[] args)
    {
       Scanner z = new Scanner(System.in);
       System.out.print("Input first integer: ");
       int a = z.nextInt();
       if((a%2)==0)
       {
           System.out.println("Artios");
       }
       else if((a%2)!=0)
       {
           System.out.println("Perittos");  
       }
    }
}

