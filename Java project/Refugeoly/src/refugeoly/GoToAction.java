package refugeoly;
public class GoToAction implements Action
{
    public void setGoToAction(int x,Refugee refugee)
    {
        System.out.println("Refugee now goes on square " + x + ".");
        refugee.setSquare(x);
    }
    
    @Override
    public void act(Refugee refugee)
    {
    }
}
