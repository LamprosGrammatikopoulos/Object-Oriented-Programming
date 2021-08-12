package refugeoly;
public interface Action
{
    public void act(Refugee refugee);
    RollDiceAction RDA=new RollDiceAction();
    PayMoneyAction PMA=new PayMoneyAction();
    GiveMoneyAction GMA=new GiveMoneyAction();
    GoToAction GTA=new GoToAction();
    StayTurnAction STA=new StayTurnAction();
    WinOrLoseAction WOLA=new WinOrLoseAction();
    LifeVestAction LVA = new LifeVestAction();
}
