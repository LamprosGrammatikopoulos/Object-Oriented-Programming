package refugeoly;
public interface MoneyReceiver
{
    ReceiverEntity RE=new ReceiverEntity();
    Mafia_Bank MB=new Mafia_Bank();
    public int receiveMoney(int x);
    public int getMafiaBankMoney();
    public void setMafiaBankMoney(int x);
}
