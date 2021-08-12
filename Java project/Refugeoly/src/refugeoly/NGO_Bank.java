package refugeoly;
public class NGO_Bank extends GiverEntity
{
    private final String name="NGO_Bank";
    private int money=10000;
    
    @Override
    public int giveMoney(int x) throws NoMoneyException
    {
        if(money>=x)
        {
            money=money-x;
        }
        else
        {
            throw new NoMoneyException("Not enough money in NGO Bank.");
        }
        return x;
    }
    
    @Override
    public int getNGO_Bank()
    {
        return money;
    }

    @Override
    public void setNGO_Bank(int x)
    {
        money=x;
    }
}
