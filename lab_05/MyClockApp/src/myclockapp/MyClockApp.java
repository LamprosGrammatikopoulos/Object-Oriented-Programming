/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myclockapp;

import java.util.Scanner;

/**
 *
 * @author nplatis
 */
public class MyClockApp
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        try
        {
        Clock c1 = new Clock();
        c1.setHours(15);
        c1.setMinutes(3);
        System.out.println(c1);
        }
        catch(IllegalArgumentException e)
        {
            System.out.println("error"); 
        }
        
        // Κλήση (έμμεση) της toString() της Clock
        try
        {
        Clock c2 = new Clock();
        c2.setTime(7, 35);
        System.out.println(c2);
        }
        catch(IllegalArgumentException e)
        {
            System.out.println("error"); 
        }
        
        
        try
        {
        Clock c3 = new Clock();
        c3.setTime("17:54");
        System.out.println(c3);
        }
        catch(IllegalArgumentException e)
        {
            System.out.println("error"); 
        }
        
        
        Scanner input = new Scanner(System.in);
        System.out.println("Give hours,minutes and seconds :");
        while (true) {
            try
            {
                int h = input.nextInt();
                int m = input.nextInt();
                int s = input.nextInt();
                PreciseClock c6=new PreciseClock(h,m,s);
                c6.setTime(h, m);
                System.out.println(c6);
                break;
            }
            catch(IllegalArgumentException e)
            {
                System.out.println("error");
            }
        }
    }
    
}
