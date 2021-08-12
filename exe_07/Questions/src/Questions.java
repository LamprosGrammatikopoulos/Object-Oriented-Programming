package questions;
import java.util.ArrayList;
import java.util.Scanner;
public class Questions
{
    public static void main(String[] args)
    {
        int x=0,y=0,z=0,c=0,h;
        Scanner a;
        String s,tmp;
        ArrayList<String> arr = new ArrayList<>();
        
        IntAdditionQuestion aq = new IntAdditionQuestion(x,y);
        IntSubtractionQuestion sq = new IntSubtractionQuestion(x,y);
        GeneralIntQuestion gq = new GeneralIntQuestion(z);
        
        for(int i=0;i<4;i++)
        {
            if(i==0)
            {
                aq.Create();
                tmp=aq.getQuestion();
                arr.add(i,tmp);
                System.out.println(arr.get(i));
                a = new Scanner(System.in);
                s = a.next();
                h = Integer.parseInt(s);
                if(h==aq.getCorrectAnswer())
                {
                    c=c+1;
                }
            }
            else if(i==1)
            {
                sq.Create();
                tmp=sq.getQuestion();
                arr.add(i,tmp);
                System.out.println(arr.get(i));
                a = new Scanner(System.in);
                s = a.next();
                h = Integer.parseInt(s);
                if(h==sq.getCorrectAnswer())
                {
                    c=c+1;
                }
            }
            else if(i==2)
            {
                sq.Create();
                tmp=sq.getQuestion();
                arr.add(i,tmp);
                System.out.println(arr.get(i));
                a = new Scanner(System.in);
                s = a.next();
                h = Integer.parseInt(s);
                if(h==sq.getCorrectAnswer())
                {
                    c=c+1;
                }
            }
            else if(i==3)
            {
                gq.Create();
                tmp=gq.getQuestion();
                arr.add(i,tmp);
                System.out.println(arr.get(i));
                a = new Scanner(System.in);
                s = a.next();
                h = Integer.parseInt(s);
                if(h==gq.getCorrectAnswer())
                {
                    c=c+1;
                }
            }
        }
        System.out.println("Correct answers: "+ c);
    }  
}
