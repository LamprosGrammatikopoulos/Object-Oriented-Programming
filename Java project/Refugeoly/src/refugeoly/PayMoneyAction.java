package refugeoly;
public class PayMoneyAction implements Action
{
    public void setPayMoneyAction(int x,String s,Refugee refugee)
    {
        if(s.equals("not_mafia"))
        {
            refugee.loseMoney(x);
            System.out.println("Refugee paid " + x + ".");
        }
        else if(!s.equals("not_mafia"))
        {
            refugee.giveMoney(x);
            System.out.println("Refugee paid " + x + " to " + s + ".");
        }
    }
    
    @Override
    public void act(Refugee refugee)
    {
    }
}
