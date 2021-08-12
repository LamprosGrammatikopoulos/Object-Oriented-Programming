package refugeoly;
public class GiverEntity implements MoneyGiver
{
    @Override
    public int giveMoney(int x) throws NoMoneyException
    {
        return NB.giveMoney(x);
    }
    
    @Override
    public int getNGO_Bank()
    {
        return NB.getNGO_Bank();
    }
    
    @Override
    public void setNGO_Bank(int x)
    {   
    }
}
