package refugeoly;
public class ReceiverEntity implements MoneyReceiver
{
    @Override
    public int receiveMoney(int x)
    {
       int b=MB.receiveMoney(x);
       return b;
    }
    
    @Override
    public int getMafiaBankMoney()
    {
        int x=MB.getMafiaBankMoney();
        return x;
    }
    
    @Override
    public void setMafiaBankMoney(int x)
    {   
    }
}
