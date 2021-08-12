package refugeoly;
public class LifeVestAction implements Action
{
    public void setLifeVestAction(boolean x,Refugee refugee)
    {
        if(x==true)
        {    
            System.out.println("Life vest applied to: " + refugee.getName() + ".");
        }
        refugee.setLifeVest(x);
    }
    
    @Override
    public void act(Refugee refugee)
    {
    }
}
