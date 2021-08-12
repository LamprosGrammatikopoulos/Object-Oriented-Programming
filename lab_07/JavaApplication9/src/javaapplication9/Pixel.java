package javaapplication9;

import java.io.Serializable;

public class Pixel implements Serializable
{
    public static int MAX_X = 1280;
    public static int MAX_Y = 800;
    public int x,y;
    
    @Override
    public String toString()
    {
        return "(" + x + "," + y + ")";
    }

    void setX(int x) throws CoordinateOutOfBoundsException
    {
        if(x>=0 && x<=MAX_X)
        {
            this.x=x;
        }
        else
        {
            CoordinateOutOfBoundsException e = new CoordinateOutOfBoundsException("Error.");
            throw e;
        }
    }
    
    void setY(int y) throws CoordinateOutOfBoundsException
    {
        if(y>=0 && y<=MAX_Y)
        {
            this.y=y;
        }
        else
        {
            CoordinateOutOfBoundsException e = new CoordinateOutOfBoundsException("Error.");
            throw e;
        }
    }
}
