package myclockapp;
public class MyClockApp
{
    public static void main(String[] args)
    {
        Clock c1 = new Clock();
        
        //Sunarthseis setHours kai setMinutes
        System.out.println("Time set to 15:59.");
        c1.setHours(15);
        c1.setMinutes(59);
        
        //Sunarthsh toString kai print
        c1.toString();
        c1.print();
        System.out.println();
        
        //Extra elegxoi gia tis sunarthseis setHours kai setMinutes
        System.out.println("Check if 32:67 is a valid time.");
        if(c1.setHours(32) == false)
        {
            System.out.println("Invalid hours.");
        }
        if(c1.setMinutes(67) == false)
        {
            System.out.println("Invalid minutes.");
        }
        
        //Sunarthseis getHours, getMinutes kai tick
        System.out.println("A tick will be added in current time.");
        System.out.println("New time:");
        c1.tick(c1.getHours() , c1.getMinutes());
        c1.print();
        System.out.println();
        
        //Sunarthsh setTime
        System.out.println("Time will be set to 18:05");
        System.out.println("New time:");
        c1.setHours(18);
        c1.setMinutes(05);
        c1.setTime(c1.getHours() , c1.getMinutes());
        c1.print();
        System.out.println();
        
        //Sunarthsh overloadedsetTime
        System.out.println("Time will be given through string: 20:09.");
        System.out.println("New time:");
        c1.overloadedsetTime("20:09");
        c1.print();
        System.out.println();
    }
    
}
