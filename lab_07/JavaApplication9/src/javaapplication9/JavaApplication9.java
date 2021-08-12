package javaapplication9;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class JavaApplication9
{
    public static void main(String[] args)
    {
        Pixel p = new Pixel();
        p.x=300;
        p.y=200;
        //p.MAX_X=1024;
        Pixel.MAX_X=1024; //giati einai static
        System.out.println(p);
        try
        {
            p.setX(-4);
        }
        catch(CoordinateOutOfBoundsException e)
        {
            System.out.println(e.getMessage());
        }
        Scanner a = new Scanner(System.in);
        
        Pixel array[]=new Pixel[10];
        for(int i=0;i<10;i++)
        {
            array[i]=new Pixel();
            System.out.println("Give coordinates:");         
            try
            {
                int x=a.nextInt();
                array[i].setX(x);
                int y=a.nextInt();
                array[i].setY(y);
            }
            catch(CoordinateOutOfBoundsException e)
            {
                i--;
                System.out.println(e.getMessage());
            } 
            try(ObjectOutputStream os=new ObjectOutputStream(new FileOutputStream("file.bin")))
            {
                os.writeObject(array[i]);
            }
            catch(IOException e)
            {
                 System.out.println("Error.");
            }
        }
    }
}