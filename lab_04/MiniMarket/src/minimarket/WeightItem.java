package minimarket;
public class WeightItem extends Item  
{
   private double kiloprice;
   private double weight;
   
   public WeightItem(String name,double weight,double kiloprice)
   {
       super(name);
       this.kiloprice=kiloprice;
       this.weight=weight;
   }
   public double Cost()
   {
       double cost;
       cost=kiloprice*weight;
       return cost;
   }
}
