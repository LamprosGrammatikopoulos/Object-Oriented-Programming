package television;
import java.util.Scanner;
public class Television
{
    public static void main(String[] args)
    {
        RemoteControl c = new RemoteControl();
        Scanner s;
        s = new Scanner(System.in);
        int m=1;
        while(true)
        {
            System.out.println("Options:");
            System.out.println("0 Power button.");
            System.out.println("1 Next channel.");
            System.out.println("2 Previous channel.");
            System.out.println("3 Volume up.");
            System.out.println("4 Volume down.");
            System.out.println("5 Close programm.");
            System.out.println("Enter a command:");
            int n = s.nextInt();
            if(n==0 && m%2==1)
            {
                if(c.isOn()==false)
                {
                    c.setpower(1);
                    System.out.println("Television opened.");
                }
            }
            if(n==0 && m%2==0)
            {
                if(c.isOn()==true)
                {
                    c.setpower(0);
                    System.out.println("Television closed.");
                }
            }
            else if(n==1)
            {
                if(c.isOn()==true)
                {
                    if(c.setChannelup())
                    {
                        System.out.println("Channel changed to: " + c.getChannel());
                    }
                    else
                    {
                        System.out.println("Please give a valid channel between 0 and 100.");
                    }
                }
                else
                {
                    System.out.println("You must turn on the television first.");
                }
            }
            else if(n==2)
            {
                if(c.isOn()==true)
                {
                    if(c.setChanneldown())
                    {
                        System.out.println("Channel changed to: " + c.getChannel());
                    }
                    else
                    {
                        System.out.println("Please give a valid channel between 0 and 100.");
                    }
                }
                else
                {
                    System.out.println("You must turn on the television first.");
                }
            }
            else if(n==3)
            {
                if(c.isOn()==true)
                {
                    if(c.setVolumeup())
                    {
                        System.out.println("Volume changed to: " + c.getVolume());
                    }
                    else
                    {
                        System.out.println("Already max volume.");
                    }
                }
                else
                {
                    System.out.println("You must turn on the television first.");
                }
            }
            else if(n==4)
            {
                if(c.isOn()==true)
                {
                    if(c.setVolumedown())
                    {
                        System.out.println("Volume changed to: " + c.getVolume());
                    }
                    else
                    {
                        System.out.println("Already min volume.");
                    }
                }
                else
                {
                    System.out.println("You must turn on the television first.");
                }
            }
            else if(n==5)
            {
                return;
            }
            m=m+1;
        }
    }
    
}
