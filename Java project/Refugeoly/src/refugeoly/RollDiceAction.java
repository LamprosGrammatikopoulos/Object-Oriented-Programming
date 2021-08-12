package refugeoly;
public class RollDiceAction implements Action
{
    private int z;

    public int getRollDiceAction(Refugee refugee)
    {
        z=(int)(1+Math.random()*6);
        if(refugee.getSquare()!=-5)
        {
            System.out.println("Dice was rolled, the outcome is: " + z + ".");
        }
        return z;
    }
    
    @Override
    public void act(Refugee refugee)
    {
    }
}
