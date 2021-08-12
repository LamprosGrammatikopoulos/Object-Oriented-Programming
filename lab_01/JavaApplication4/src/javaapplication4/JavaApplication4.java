package javaapplication4;
import java.util.Scanner;
public class JavaApplication4
{
    public static void main(String[] args)
    {
       Scanner z = new Scanner(System.in);
       System.out.print("Input first integer: ");
       int a = z.nextInt();
       System.out.print("Input second integer: ");
       int b = z.nextInt();
       if (a!=b)
       {
            System.out.println(a + "!=" + b);
       }
       if (a<b)
       {
            System.out.println(a + "<" + b);
       }
       else if (a>b)
       {
            System.out.println(a + ">" + b);
       }
       if (a<=b)
       {
            System.out.println(a + "<=" + b);
       }
       else if (a>=b)
       {
            System.out.println(a + ">=" + b);
       }
    }
}
