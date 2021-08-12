package minimarket;

import java.util.ArrayList;
import java.util.Scanner;

public class MiniMarket 
{
    public static void main(String[] args) 
    {
       
        Scanner input;
        input=new Scanner(System.in);
        int command;
        ArrayList<Item> array;
        array=new ArrayList<Item>();
        do
        {
            command=input.nextInt();
            if(command==1)
            {
                System.out.println("Give a price");
               double price=input.nextDouble();
               System.out.println("Give a name");
               String name=input.next();
               UnitItem un=new UnitItem(name,price);
               array.add(un);
            }
        }while(command!=0);


    }
    
}
