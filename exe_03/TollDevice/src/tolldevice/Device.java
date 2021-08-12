package tolldevice;
import java.util.Scanner;
public class Device
{
    public static void main(String[] args)
    {
        TollDevice d = new TollDevice();
        Scanner s;
        s = new Scanner(System.in);
        while(true)
        {
            System.out.println("Options:");
            System.out.println("1 Show balance");
            System.out.println("2 Add money");
            System.out.println("3 Pay toll");
            System.out.println("4 Exit car");
            System.out.println("Enter a command:");
            int n = s.nextInt();
            if(n==1)
            {
                d.showBalance();
            }
            else if(n==2)
            {
                System.out.println("Please give a number:");
                int x = s.nextInt();
                d.addBalance(x);
            }
            else if(n==3)
            {
                if(d.payToll() == true)
                {
                    System.out.println("Toll fee paid you can pass.");
                }
                else if(d.payToll() == false)
                {
                    System.out.println("Not enough money to pay the toll fee you can not pass.");
                }
            }
            else if(n==4)
            {
                return;
            }
        }
    }
}
