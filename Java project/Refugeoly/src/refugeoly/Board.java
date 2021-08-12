package refugeoly;
import java.util.ArrayList;
public class Board extends Square
{
    private ArrayList<Square>squaresarray=new ArrayList<>();
    
    public Board()
    {
        Square v;
        for(int i=0;i<40;i++)
        {
            addSquare(v=new Square());
            squaresarray.get(i).setNumber(i);
        }
    }
    
    public void addSquare(Square square)
    {
        squaresarray.add(square);
    }
    
    public Square getSquare(int x)
    {
        return squaresarray.get(x);
    }
}