package minimumcommonmultiple;
import java.util.Scanner;
public class MinimumCommonMultiple
{
    public static void main(String[] args)
    {
        menuChoice();
    }
    public static int mcm(int a, int b)
    {
        int ekp=0,meg=0,i=0,mik=0;
        if(a>=b)
        {
            meg=a;
            mik=b;
        }
        else if(a<b)
        {
            meg=b;
            mik=a;
        }
        for(i=1;i<1000;i++)
        {
            ekp=meg*i;
            if(ekp%mik==0)
            {
                break;
            }
        }
        return ekp;
    }
    public static void menuChoice()
    {
        Scanner s = new Scanner(System.in);
        int ekp=0,c=0;
        int x;
        do
        {
            System.out.println("Μενού:");
            System.out.println("1. Εύρεση ΕΚΠ");
            System.out.println("2. Βοήθεια");
            System.out.println("3. Έξοδος");
            System.out.println("Παρακαλώ επιλέξτε ενέργεια.");
            x=s.nextInt();
            if(x!=1 && x!=2 && x!=3)
            {
                System.out.println("Λανθασμένη επιλογή, παρακαλώ προσπαθήστε ξανά.");
            }
            else if(x==1)
            {
                System.out.println("Παρακαλώ δώστε δύο θετικούς ακέραιους αριθμούς.");
                int a = s.nextInt();
                if(a<=0)
                {
                  System.out.println("Λανθασμένη επιλογή, παρακαλώ προσπαθήστε ξανά.");  
                }
                int b = s.nextInt();
                if(b<=0)
                {
                  System.out.println("Λανθασμένη επιλογή, παρακαλώ προσπαθήστε ξανά.");  
                }
                ekp = mcm(a,b);
                System.out.println("Το ΕΚΠ είναι: "+ekp);
            }
            else if(x==2)
            {
                System.out.println("Το πρόγραμμα δέχεται δύο θετικούς ακέραιους αριθμούς και υπολογίζει το ΕΚΠ τους.");
                System.out.println("Το πρόγραμμα δημιουργήθηκε από τον Λάμπρο Γραμματικόπουλο.");
            }
            else if(x==3)
            {
                break;
            }
        }while(x!=3);
    }
}