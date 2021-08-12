package javaapplication6;
import java.util.Scanner;
public class JavaApplication6
{
    public static void main(String[] args)
    {
       Scanner z = new Scanner(System.in);
       int sum=0;
       System.out.println("Input 5 integers: ");
       for(int i=0;i<5;i++)
       {
         sum=sum+z.nextInt();
       }
       /*int a1 = z.nextInt();
       int a2 = z.nextInt();
       int a3 = z.nextInt();
       int a4 = z.nextInt();
       int a5 = z.nextInt();
       int sum=a1+a2+a3+a4+a5;*/
       double MO=(sum)/5.0;
       System.out.println("Sum:"+sum);
       System.out.println("Average:"+MO);
    }
}
