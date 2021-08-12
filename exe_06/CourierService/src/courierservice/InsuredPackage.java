package courierservice;
public class InsuredPackage extends Package
{
    public InsuredPackage(String id, double weight)
    {
        super(id,weight);
    }
    private double cost=0;
    @Override
    public double computeCost()
    {
        if(GetWeight()<=3)
        {
            cost=3;
        }
        else if(GetWeight()>3)
        {
            cost=3+((GetWeight()-3)*0.7);
        }
        if(cost<=5)
        {
            return cost+2;
        }
        else if(cost>5 && cost<=10)
        {
            return cost+3;
        }
        else
        {
            return cost+5;
        }
    }
}
