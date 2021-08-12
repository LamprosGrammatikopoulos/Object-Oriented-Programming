package movie;
public class Movie
{
    public String title;
    public int ratings1=0;
    public int ratings2=0;
    public int ratings3=0;
    public int ratings4=0;
    public int ratings5=0;
    
    public String getTitle()
    {
        return title;
    }
    public void setTitle(String s)
    {
        title=s;
    }
    public void addRatings(int r)
    {
        if(r==1)
        {
            ratings1=ratings1+1;
        }
        else if(r==2)
        {
            ratings2=ratings2+1;
        }
        else if(r==3)
        {
            ratings3=ratings3+1;
        }
        else if(r==4)
        {
            ratings4=ratings4+1;
        }
        else if(r==5)
        {
            ratings5=ratings5+1;
        }
    }
    public int getRatingCount(int r)
    {
        if(r==1)
        {
            return ratings1;
        }
        else if(r==2)
        {
            return ratings2;
        }
        else if(r==3)
        {
            return ratings3;
        }
        else if(r==4)
        {
            return ratings4;
        }
        else if(r==5)
        {
            return ratings5;
        }
        else
        {
            System.out.println("Please give a valid number.");
            return 0;
        }
    }
    public double averageRating()
    {
        double x,y;
        y=ratings1+ratings2+ratings3+ratings4+ratings5;
        x=(1*ratings1)+(2*ratings2)+(3*ratings3)+(4*ratings4)+(5*ratings5);
        return x/y;
    }
}