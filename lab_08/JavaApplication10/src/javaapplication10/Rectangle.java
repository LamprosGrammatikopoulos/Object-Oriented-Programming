package javaapplication10;
public class Rectangle extends Shape
{
    private double width;
    private double height;
    
    public Rectangle(double centerX,double centerY,double width,double height)
    {
        super(centerX,centerY);
        this.width=width;
        this.height=height;
    }
    
    public double height()
    {
        return height;
    }
    
    public double width()
    {
        return height;
    }
    
    @Override
    public double area()
    {
        return width*height;
    }
}
