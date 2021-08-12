package javaapplication5;

public class Complex 
{
    private double re;
    private double im;
    
    public void setReal(double x)
    {
        re=x;
    }
    
    public void setImaginary(double x)
    {
        im=x;
    }
    
    public double getReal()
    {
        return re;
    }
    
    public double getImaginary()
    {
        return im;
    }
    
    public Complex()
    {
        re=0;
        im=0;
    }
    
    public Complex(double x)
    {
        re=x;
        im=0;
    }
    
    public Complex(double x,double y)
    {
        re=x;
        im=y;
    }
    
    public Complex add(Complex o)
    {
        double x1,x2;
        x1=re+o.getReal();
        x2=im+o.getImaginary();
        Complex z=new Complex(x1,x2);
        return z;
    }
    
    public static Complex substract(Complex o,Complex u) //static giati kaleitai me Comlex brosta
    {
        double x1,x2;
        x1=o.getReal()-u.getReal();
        x2=o.getImaginary()-u.getImaginary();
        Complex z=new Complex(x1,x2);
        return z;
    }
    
    @Override
    public String toString()
    {
        if(im<0)
        {
            return re +" "+im+"i";
        }
        else
        {
            return re+" + "+im+"i";
        }
    }
    
}
