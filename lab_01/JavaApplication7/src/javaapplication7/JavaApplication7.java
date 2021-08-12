package javaapplication7;
import java.util.Scanner;
public class JavaApplication7
{
    public static void main(String[] args)
    {
       Scanner z = new Scanner(System.in);
       System.out.println("Input a number: ");
       int a=z.nextInt();
       for(int i=0;i<10;i++)
       {
         System.out.println(a+"x"+(i+1)+"="+(a*(i+1)));
       }
    }
}
