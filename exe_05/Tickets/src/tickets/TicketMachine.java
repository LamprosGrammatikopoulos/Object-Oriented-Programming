package tickets;
public class TicketMachine
{
    private double ticketPrice=5;
    private double amountPaid;
    private int ticketsSold;
    private double moneyCollected;

    
    public void setTicketPrice(double x)
    {
        ticketPrice=x;
        amountPaid=0;
        ticketsSold=0;
        moneyCollected=0;
    }
    public double getTicketPrice()
    {
        return ticketPrice;
    }
    public double getticketsSold()
    {
        return ticketsSold;
    }
    public double getAmountPaid()
    {
        return amountPaid;
    }
    public double moneyCollected()
    {
        return moneyCollected;
    }
    public void insertMoney(double y)
    {
        amountPaid=y;
        moneyCollected=moneyCollected+y;
    }
    public void printTicket()
    {
        if(getTicketPrice()<=getAmountPaid())
        {
            System.out.println("#########################");
            System.out.println("# The Tripolis Transports");
            System.out.println("Ticket: " + getTicketPrice() + " euro");
            System.out.println("#########################");
            ticketsSold=ticketsSold+1;
        }
        else
        {
            System.out.println("Please add more money.");
        }
    }
    public void payChange()
    {
        double resta;
        resta=amountPaid-ticketPrice;
        moneyCollected=moneyCollected-resta;
        System.out.println("Your change is: " + resta);
        amountPaid=0;
    }
    public void cancelTicket()
    {
        moneyCollected=moneyCollected-amountPaid;
        amountPaid=0;
        System.out.println("Cancellation executed successfully, please take back your money.");
    }
}
