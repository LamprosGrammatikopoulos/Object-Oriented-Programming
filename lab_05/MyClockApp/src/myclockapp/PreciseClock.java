package myclockapp;

public class PreciseClock extends Clock
{

    private int sec;

    public PreciseClock(int h, int m, int s)
    {
        super(h, m);
        if (s >= 0 && s <= 59)
        {
            this.sec = s;
        } 
        else
        {
            IllegalArgumentException t = new IllegalArgumentException();
            throw t;
        }

    }

    public void setTime(int h, int m, int s)
    {
        super.setTime(h, m);
        //this.hours = hours;
        this.sec = s;
        // this.minutes = minutes;
        if (s >= 0 && s <= 59)
        {
            this.sec = s;
        } 
        else
        {
            IllegalArgumentException t = new IllegalArgumentException();
            throw t;
        }

    }
     @Override
    public String toString()
    {
        String s = super.toString();
        return String.format("%s:%02d",s,sec);
    }

}
