package javaapplication10;
public class Square extends Rectangle
{
    private double length;
    
    public Square(double centerX,double centerY,double length)
    {
        super(centerX,centerY,length,length);
        this.length=length;
    }
}
