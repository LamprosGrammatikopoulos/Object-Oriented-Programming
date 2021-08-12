package courierservice;
import java.util.ArrayList;
import java.util.Scanner;
public class CourierService
{
    public static void main(String[] args)
    {
        Scanner a;
        int n,k=0;
        String id,arrs,y;
        double w,arrcost,totalcost=0;
        Package p=null;
        ArrayList<String> arr = new ArrayList<>();
        do
        {
            System.out.println("Options:");
            System.out.println("1 Package.");
            System.out.println("2 InsuredPackage.");
            System.out.println("3 Exit.");
            a= new Scanner(System.in);
            n = a.nextInt();
            if(n==1)
            {
                System.out.println("Please give packge id:");
                id=a.next();
                for (int i = 0; i < arr.size(); i++) 
                {
                    y = arr.get(i);
                    if(arr.contains(y))
                    {
                        k=1;
                    }
                }
                if(k==1)
                {
                    System.out.println("Package already given.");
                    continue;
                }
                System.out.println("Please give packge weight:");
                w=a.nextDouble();
                p=new Package(id,w);
                arrcost=p.computeCost();
                totalcost=totalcost+arrcost;
                System.out.println("Package costs: " + arrcost);
                arrs="id:" + id + " weight:" + w + " cost:" + arrcost;
                arr.add(arrs);
                k=0;
            }
            else if(n==2)
            {
                System.out.println("Please give InsuredPackage id:");
                id=a.next();
                for (int i = 0; i < arr.size(); i++) 
                {
                    y = arr.get(i);
                    if(arr.contains(y))
                    {
                        k=1;
                    }
                }
                if(arr.contains(id))
                {
                    System.out.println("Package InsuredPackage given.");
                    continue;
                }
                System.out.println("Please give InsuredPackage weight:");
                w=a.nextDouble();
                p=new InsuredPackage(id,w);
                arrcost=p.computeCost();
                totalcost=totalcost+arrcost;
                System.out.println("Package costs: " + arrcost);
                arrs="id:" + id + " weight:" + w + " cost:" + arrcost;
                arr.add(arrs);
                k=0;
            }
            else if(n==3 && p!=null)
            {
                for (int i = 0; i < arr.size(); i++) 
                {
                    p.ToString(arr.get(i));
                }
                System.out.println("Total cost: " + totalcost);
            }
        }while(n!=3);
    }
}
