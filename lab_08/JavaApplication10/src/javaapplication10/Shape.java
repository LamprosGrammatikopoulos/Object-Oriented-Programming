package javaapplication10;
public abstract class Shape
{
    private double centerX;
    private double centerY;
    
    public Shape(double centerX,double centerY)
    {
        this.centerX=centerX;
        this.centerY=centerY;
    }
    public abstract double area();
}
