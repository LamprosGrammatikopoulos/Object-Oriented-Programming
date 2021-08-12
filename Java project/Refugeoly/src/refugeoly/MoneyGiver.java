package refugeoly;
public interface MoneyGiver
{
    GiverEntity GE=new GiverEntity();
    NGO_Bank NB=new NGO_Bank();
    public int giveMoney(int x) throws NoMoneyException;
    public int getNGO_Bank();
    public void setNGO_Bank(int x);
}
