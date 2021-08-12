package tickets;
import java.util.Scanner;
public class TicketMachineTester
{
    public static void main(String[] args)
    {
        TicketMachine tm = new TicketMachine();
        Scanner s;
        int n;
        String x;
        double totalmoney=0;
        s = new Scanner(System.in);
        tm.setTicketPrice(1.20);
        while(true)
        {
            System.out.println("Commands:");
            System.out.println("0 Exit");
            System.out.println("1 Buy a ticket");
            n = s.nextInt();
            if(n==1)
            {
                System.out.println("Ticket price is: " + tm.getTicketPrice());
                do
                {
                    System.out.println("Please give 'number' of money to add or 'p' to print your ticket and take your change or 'c' to cancel transaction.");
                    x = s.next();
                    if(x.equals("p"))
                    {
                        if(tm.getAmountPaid()>=tm.getTicketPrice())
                        {
                            tm.printTicket();
                            tm.payChange();
                        }
                        else
                        {
                            System.out.println("Please add more money.");
                        }
                    }
                    else if(x.equals("c"))
                    {
                        tm.cancelTicket();
                    }
                    else
                    {
                        double y = Double.parseDouble(x);
                        if(y>=tm.getTicketPrice())
                        {
                            tm.insertMoney(y);
                            totalmoney=totalmoney+y;
                            System.out.println(totalmoney + " euro paid so far.");
                        }
                        else
                        {
                            System.out.println("Ticket price is: " + tm.getTicketPrice());
                            break;
                        }
                    }
                }while( !(x.equals("p")) && !(x.equals("c")) );
            }
            else if(n==0)
            {
                System.out.println("Number of tickets sold: " + tm.getticketsSold());
                System.out.println("MoneyCollected: " + tm.moneyCollected());
                return;
            }
        }
    }
}
