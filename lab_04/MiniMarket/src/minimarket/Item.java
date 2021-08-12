package minimarket;
public abstract class Item
{
    private String name;
    private double cost;
    
    public Item(String name)
    {
        this.name=name;
    }
    public double value()
    {
        return cost;
    }
}
