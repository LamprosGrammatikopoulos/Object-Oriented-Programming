package refugeoly;
public class WinOrLoseAction implements Action
{
    public void setWinOrLoseAction(Refugee refugee)
    {
        if(refugee.getName().contains("x.x"))
        {
            System.out.println("Refugee lost.");
        }
        else if(refugee.getName().contains("WINNER"))
        {
            System.out.println("Refugee won.");
        }
    }
    
    @Override
    public void act(Refugee refugee)
    {
    }
}
