package refugeoly;
import java.io.IOException;
public class Refugeoly
{
    public static void main(String[] args) throws IOException
    {
        System.out.println("Let the game begin!");
        Game g=new Game();
        g.setPlayers();
        g.StartGame();
        System.out.println("The game is over.");
    }
}
