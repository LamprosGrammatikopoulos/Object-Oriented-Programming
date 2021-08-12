package javaapplication3;
import java.util.Scanner;
public class JavaApplication3
{
    public static void main(String[] args)
    {
       Scanner a = new Scanner(System.in);
       System.out.print("Input the radius of he circle: ");
       double r = a.nextDouble(); 
       System.out.println("Perimeter is: " + 2*Math.PI*r);
       System.out.println("Area is: " + Math.PI*Math.pow(r,2));
    }
}
