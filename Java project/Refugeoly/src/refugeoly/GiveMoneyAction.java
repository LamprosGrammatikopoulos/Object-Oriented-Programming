package refugeoly;
public class GiveMoneyAction implements Action
{
    public void setGiveMoneyAction(int x,String s,Refugee refugee)
    {
        System.out.println(s + " paid " + x + " to refugee.");
        refugee.receiveMoney(x);
    }
    
    @Override
    public void act(Refugee refugee)
    {
    }
}
