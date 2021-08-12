package movie;
import java.util.Scanner;
public class Ratings
{
    public static void main(String[] args)
    {
        Movie r = new Movie();
        Scanner s;
        s = new Scanner(System.in);
        int x=0,l=0;
        while(true)
        {
            System.out.println("Options:");
            System.out.println("0 Enter movie title.");
            System.out.println("1 Enter number of stars for the movie.");
            System.out.println("2 Show all ratings and the average rating for the movie.");
            System.out.println("Enter a command:");
            int n = s.nextInt();
            if(n==0)
            {
                System.out.println("Enter movie title:");
                s = new Scanner(System.in);
                String t = s.next();
                r.setTitle(t);
                System.out.println("Movie title set to: " + t);
                l=1;
            }
            else if(n==1 && l==1)
            {
                System.out.println("Give number of stars for the movie.");
                s = new Scanner(System.in);
                x = s.nextInt();
                if(x>0 && x<6)
                {
                    r.addRatings(x);
                    System.out.println("Rating added.");
                }
                else
                {
                    System.out.println("Please give a valid rating.");
                }
            } 
            else if(n==2 && l==1)
            {
                System.out.println("All ratings:");
                for (int i = 1; i <= 5; i++)
                {
                    System.out.println(i + ": " + r.getRatingCount(i));
                }
                System.out.printf("Average rating: %.2f\n",r.averageRating());
                 return;
            }
            if(n<0 || n>2)
            {
                System.out.println("Please give a valid command.");
            }
            else if(l==0)
            {
                System.out.println("Please give a movie title first.");
            }
        }
    }
    
}
