package tolldevice;
public class TollDevice
{
    public int balance=10;
    public int tollfee=3;
    
    public void showBalance()
    {
        System.out.println(balance);
    }
    
    public void addBalance(int x)
    {
        if(x>0)
        {    
            balance=balance+x;
            System.out.println("New balance is: " + balance);
        }
        else
        {
            System.out.println("Please give a valid number.");
        }
    }
    
    public boolean payToll()
    {
        if(tollfee <= balance)
        {
            balance=balance-tollfee;
            System.out.println("New balance is: " + balance);
            return true;
        }
        else
        {
            return false;
        }
    }
}
