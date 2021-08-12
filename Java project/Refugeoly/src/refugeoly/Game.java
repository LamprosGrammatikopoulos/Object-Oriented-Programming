package refugeoly;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;
public class Game implements MoneyReceiver,MoneyGiver
{
    private Board B;
    private int players;
    private ArrayList<Refugee>refugeesarray=new ArrayList<Refugee>();
    
    public void setPlayers()
    {
        try
        {
            Scanner input=new Scanner(System.in);
            do
            {
                System.out.println("Give number of players [1-4]");
                players=input.nextInt();
            }while(players<1 || players>4); 
            //Dhmiourgia tou tamplo
            B = new Board();
        }
        catch(InputMismatchException y)
        {
            System.out.println("Error.");
        }
    }
    public void StartGame() throws IOException
    {
        int f=0,flagbreak=0,fl=0,saveflag=0,nextplayerflag=0;
        String playerturn="nothing";
        
        for(int i=0;i<players;i++)
        {
            refugeesarray.add(i,new Refugee(10000,"Refugee" + i));
        }
        while(true)
        {
            for(int i=0;i<players;i++)
            {
                //Gia to arxeio.
                if(refugeesarray.get(i).getName().contains("x.x"))
                {
                    continue;
                }
                if(nextplayerflag==1)
                {
                    if(playerturn.equals(refugeesarray.get(i).getName()))
                    {
                        nextplayerflag=0;
                    }
                    else
                    {
                        continue;
                    }
                }
                String s;
                do
                {
                    System.out.println("|==========================================================|");
                    System.out.println("|Do you want to save the current state of the game ? (s)   |");
                    System.out.println("|Do you load a previous save ? (l)                         |");
                    System.out.println("|Play round. (p)                                           |");
                    System.out.println("|==========================================================|");
                    System.out.print("Please choose an option:");
                    Scanner input = new Scanner(System.in);
                    s = input.next();
                }while(!"s".equals(s) && !"l".equals(s) && !"p".equals(s));
                System.out.println();
                if("s".equals(s))
                {
                    ////////////////////////SAVE//////////////////////////////////
                    playerturn=refugeesarray.get(i).getName();
                    saveflag=1;
                    try
                    {
                        PrintWriter pw = new PrintWriter("Saved Game.txt");
                        for(int b=0;b<refugeesarray.size();b++)
                        {
                            pw.println(refugeesarray.get(b).getName());
                            pw.println(refugeesarray.get(b).getMoney());
                            pw.println(refugeesarray.get(b).getExpenses());
                            pw.println(refugeesarray.get(b).getSquare());
                        }
                        pw.println(NB.getNGO_Bank());
                        pw.println(MB.getMafiaBankMoney());
                        pw.close();
                    }
                    catch(FileNotFoundException e)
                    {
                        System.out.println("Error.");
                    }
                    catch(IllegalStateException e)
                    {
                        System.out.println("Error.");
                    }
                    System.out.println("The game is saved.");
                    System.out.println();
                }
                ///////////////////////////////LOAD/////////////////////////////////////
                if("l".equals(s))
                {
                    if(saveflag==1)
                    {
                        try
                        {
                            Scanner fs = new Scanner(new FileInputStream("Saved Game.txt"));
                            for(int b=0;b<refugeesarray.size();b++)
                            {
                                String n=fs.nextLine();
                                refugeesarray.get(b).setName(n);

                                String m=fs.nextLine();
                                int mon=Integer.parseInt(m);
                                refugeesarray.get(b).setMoney(mon);

                                String ex=fs.nextLine();
                                int exp=Integer.parseInt(ex);
                                refugeesarray.get(b).setExpenses(exp);

                                String po=fs.nextLine();
                                int pos=Integer.parseInt(po);
                                refugeesarray.get(b).setSquare(pos);
                            }
                            String m=fs.nextLine();
                            int ngo=Integer.parseInt(m);
                            NB.setNGO_Bank(ngo);
                            
                            String z=fs.nextLine();
                            int mafia=Integer.parseInt(z);
                            MB.setMafiaBankMoney(mafia);
                            fs.close();
                        }
                        catch(InputMismatchException a)
                        {
                            System.out.println("Error.");
                        }
                        catch(IllegalStateException p)
                        {
                            System.out.println("Error.");
                        }
                        catch(NoSuchElementException b)
                        {
                            System.out.println("Error.");
                        }
                        nextplayerflag=1;
                        System.out.println("The saved game is loaded.");
                        break;
                    }
                    else
                    {
                        System.out.println("You must have a saved game to load.");
                    }
                }     
                if(refugeesarray.get(i).getName().contains("x.x"))
                {
                   fl=1;
                }
                if(fl==0)
                {
                    //B.getSquare(0).act(refugeesarray.get(i)); 
                    refugeesarray.get(i).act(refugeesarray.get(i)); 
                    System.out.println();
                }
                fl=0;
                if(refugeesarray.get(i).getName().contains("WINNER"))
                {
                    flagbreak=1;
                    break;
                }
            }
            for(int j=0;j<players;j++)               
            {
                if(refugeesarray.get(j).getName().contains("WINNER"))
                {
                    System.out.println("Refugee " + j + " is saved.");
                    flagbreak=1;
                    break;
                }
            }
            if(flagbreak==1)
            {
                break;
            }
            for(int j=0;j<players;j++)
            {
                if(refugeesarray.get(j).getName().contains("x.x"))
                {
                    f++;
                }
            }
            if(f==players)
            {
                System.out.println("All the refugees are dead.");
                break;
            }
            else
            {
                f=0;
            }
        }
    }
    
    @Override
    public int receiveMoney(int x)
    {
        return 0;
    }
    
    @Override
    public int giveMoney(int x)
    {
        return 0;
    }

    @Override
    public int getMafiaBankMoney()
    {
        return RE.getMafiaBankMoney();
    }
    
    @Override
    public int getNGO_Bank()
    {
        return GE.getNGO_Bank();
    }
    
    @Override
    public void setMafiaBankMoney(int x)
    {
    }
    
    @Override
    public void setNGO_Bank(int x)
    {
    }
}
