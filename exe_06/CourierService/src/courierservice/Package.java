package courierservice;
public class Package
{
    private String id;
    private double weight;
    private double cost=0;
    public Package(String id, double weight)
    {
        this.id=id;
        this.weight=weight;
    }
    public String GetId()
    {
        return id;
    }
    public double GetWeight()
    {
        return weight;
    }
    public double computeCost()
    {
        if(weight<=3)
        {
            cost=3;
        }
        else if(weight>3)
        {
            cost=3+((weight-3)*0.7);
        }
        return cost;
    }
    public void ToString(String arrid)
    {
        System.out.println(arrid);
    }
}
