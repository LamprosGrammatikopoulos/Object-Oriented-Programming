package minimarket;
public class UnitItem extends Item 
{
    private double price;
    
    public double getPrice()
    {
        return price;
    }
    public UnitItem(String name,double price)
    {
        super(name);
        this.price=price; 
    }
    public double Cost()
    {
        
        return price;
    }
  
}
