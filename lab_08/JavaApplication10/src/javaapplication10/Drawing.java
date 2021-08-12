package javaapplication10;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
public class Drawing
{
    private ArrayList<Shape> array=new ArrayList<>();
    
    public Shape getArray(int i)
    {
        return array.get(i);
    }
    
    public void setArray(Shape s)
    {
        array.add(s);
    }
    
    public void readFromFile() throws FileNotFoundException
    {
        try
        {   
            Scanner file = new Scanner(new File("draw1.txt")); 
            
            while(true)
            {
                String s=file.next();
                if("r".equals(s))
                {
                    double x=file.nextDouble();
                    double y=file.nextDouble();
                    double px = file.nextDouble();
                    double py = file.nextDouble();
                    Rectangle rect=new Rectangle(x,y,px,py);
                }
                else if("s".equals(s))
                {
                    double x=file.nextDouble();
                    double y=file.nextDouble();
                    double px = file.nextDouble();
                    Square squ= new Square(x,y,px);
                }
                else
                {
                    break;
                }
            }
        }
        catch(FileNotFoundException e)
        {
            System.out.println("Error");
        }
    }
    
    public double totalArea()
    {
        int i=0;
        double E=0;
        for(Shape sq:array)
        {
            E=array.get(i).area();
            i++;
        }
        return E;
    }
    
    public int countRectangles()
    {
        int tmp=0;
        for(int i=0;i<array.size();i++)
        {
            if(!(array.get(i) instanceof Square)  )
            {
                tmp++;
            }
        }
        return tmp;
    }
}
