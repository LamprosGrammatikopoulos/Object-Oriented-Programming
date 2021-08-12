package myclockapp;
public class Clock
{
    private int hours;
    private int minutes;
    
    public int getHours()
    {
        return hours;
    }
    
    public int getMinutes()
    {
        return minutes;
    }

    public boolean setHours(int h)
    {
        if(h >=0 && h <= 23)
        {
            hours = h;
            return true;
        }
        else
        {
            return false;
        }
    }
    
    public boolean setMinutes(int m)
    {
        if(m >= 0 && m <= 59)
        {
            minutes = m;
            return true;
        }
        else
        {
            return false;
        }
    }
    
    public void print()
    {
       System.out.printf("%d:%02d", hours, minutes);
    }
    
    public void setTime(int h , int m)
    {
        if(h >=0 && h <= 23)
        {
            hours = h;
            //an thelame tuxaies times : (int)(Math.random()*((max-min)+1))+min;
        }
        if(m >= 0 && m <= 59)
        {
            minutes = m;
            //an thelame tuxaies times : (int)(Math.random()*((max-min)+1))+min;
        }   
    }
    
    public void overloadedsetTime(String s)
    {
        String parts[] = s.split(":");
        int h = Integer.parseInt(parts[0]);
        int m = Integer.parseInt(parts[1]);
        if(h >= 0 && h <= 23)
        {
            hours = h;
        }
        if(m >= 0 && m <= 59)
        {
            minutes = m;
        }   
    }
    
    public void tick(int h , int m)
    {
        if(m==59)
        {
            minutes=0;
            hours=hours+1;
        }
        else if(m<59)
        {
            minutes=minutes+1;
        }    
    }
    
    @Override
    public String toString()
    {
        return String.format("%d:%02d", hours, minutes);
    }
}
