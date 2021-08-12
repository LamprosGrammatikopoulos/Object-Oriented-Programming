package refugeoly;
public class StayTurnAction implements Action
{
    public void setStayTurnAction(int x ,Refugee refugee,int y,int z)
    {
        if(x==-5 && z==1)
        {
            System.out.println("Refugee loses " + y + " turns.");
        }
        refugee.setSquare(x);
    }
    
    @Override
    public void act(Refugee refugee)
    {
    }
}
