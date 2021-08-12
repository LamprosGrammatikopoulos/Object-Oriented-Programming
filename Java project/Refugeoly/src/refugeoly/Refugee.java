package refugeoly;
public class Refugee extends Square implements MoneyGiver,MoneyReceiver
{
    private String name;
    private int money;
    private int expenses;
    private int square=0;
    private boolean lifevest=false;
    
    public Refugee(int money, String name)
    {
        this.money=money;
        this.name=name;
    }
    
    public void moveTo(int x)
    {
        square=x;
    }
    
    @Override
    public int receiveMoney(int x)
    {
        int c=0;
        try
        {
            c=GE.giveMoney(x);
            money=money+c;
        }
        catch(NoMoneyException e)
        {
            System.out.println(e.getMessage());
            return 0;
        }
        return c;
    }
    
    @Override
    public int giveMoney(int x)
    {
        int b=RE.receiveMoney(x);
        expenses=expenses+x;
        money=money-x;
        return b;
    }
    
    public int loseMoney(int x)
    {
        expenses=expenses+x;
        money=money-x;
        return money;
    }
    
    public int getMoney()
    {
        return money;
    }
    
    public void setName(String s)
    {
        name=s;
    }
    
    public String getName()
    {
        return name;
    }
    
    public void setSquare(int x)
    {
        square=x;
    }
    
    public int getSquare()
    {
        return square;
    }
    
    public int getExpenses()
    {
        return expenses;
    }
    
    public void setExpenses(int x)
    {
        expenses=x;
    }
    
    public void setMoney(int x)
    {
        money=x;
    }
    
    public boolean getLifeVest()
    {
        return lifevest;
    }
    
    public void setLifeVest(boolean x)
    {
        lifevest=x;
    }
    
    @Override
    public int getNGO_Bank()
    {
        GiverEntity ge=new GiverEntity();
        int x=ge.getNGO_Bank();
        return x;
    }
    
    @Override
    public void setMafiaBankMoney(int x)
    {
    }
    
    @Override
    public void setNGO_Bank(int x)
    {
    }

    @Override
    public int getMafiaBankMoney()
    {
        return 0;
    }
}
