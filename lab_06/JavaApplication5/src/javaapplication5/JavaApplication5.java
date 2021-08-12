package javaapplication5;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class JavaApplication5 
{

    public static void main(String[] args) 
    {
        Complex z1=new Complex();
        Complex z2=new Complex(3.2,-5.1);
        Complex z3=new Complex(7);
        Complex z4 = z2.add(z3);
        //Complex z5 = new Complex().substract(z2,z3);
        Complex z5 = Complex.substract(z2,z3);
        System.out.println(z1.toString());
        System.out.println(z2.toString());
        System.out.println(z3.toString());
        System.out.println(z4.toString());
        System.out.println(z5.toString());
        
        try
        {
            Scanner FileScanner = new Scanner(new File("1.txt"));
            int k=FileScanner.nextInt();
            System.out.println(k);
            String []array= new String[k];
            
            //FileScanner.next();
            for(int i=0;i<k;i++)
            {
                Complex Z=new Complex();
                double re=FileScanner.nextDouble();
                Z.setReal(re);
                double im=FileScanner.nextDouble();
                Z.setImaginary(im);
                array[i]=Z.toString();
                System.out.println("---"+array[i]+"---");
            }
        }
        catch(Exception fe)
        {
            System.out.println("Error.");
        }
    }
}
