package refugeoly;
public class Mafia_Bank extends ReceiverEntity
{
    private final String name="Mafia_Bank";
    private int money=0;
    
    @Override
    public int receiveMoney(int x)
    {
        money=money+x;
        return money;
    }
    
    @Override
    public int getMafiaBankMoney()
    {
        return money;
    }
    
    @Override
    public void setMafiaBankMoney(int x)
    {
        money=x;
    }
}

