package refugeoly;
import java.util.ArrayList;
import java.util.Scanner;
public class Square implements Action,MoneyReceiver,MoneyGiver
{
    private int number;
    private String text;
    private ArrayList<Action>actionsarray=new ArrayList<>();
    
    public ArrayList<Action> getActionsarray()
    {
        return actionsarray;
    }
    
    public void setNumber(int x)
    {
        this.number=x;
    }
    
    public void addAction(Action action)
    {
        actionsarray.add(action);
    }
    
    public Action getAction(int x)
    {
        return actionsarray.get(x);
    }

    @Override
    public void act(Refugee refugee)
    {
        int f=0,backwardsflag=0;
        if(refugee.getMoney()>=0)
        {
            System.out.println("-----------------------------------------");
            System.out.println("Name: " + refugee.getName() + ".");
            System.out.println("Money: " + refugee.getMoney() + ".");
            System.out.println("Expenses: " + refugee.getExpenses() + ".");
            if(refugee.getSquare()==-5 || refugee.getSquare()==-10)
            {
                System.out.println("Position: waiting.");
            }
            else
            {
               System.out.println("Position: " + refugee.getSquare() + "."); 
            }
            if(refugee.getLifeVest()==true)
            {
                System.out.println("Life vest: ON.");
            }
            else
            {
                System.out.println("Life vest: OFF.");
            }
            System.out.println("NGO Bank money: " + NB.getNGO_Bank() + ".");
            System.out.println("Mafia Bank money: " + MB.getMafiaBankMoney() + ".");
            System.out.println("-----------------------------------------");
        }
        while(true)
        {
            if(refugee.getMoney()<0)
            {
                refugee.setName("x.x");
                System.out.println("Refugee doesn't have enough money to pay, he/she dies.");
                break;
            }
            if(refugee.getName().contains("x.x"))
            {
                f=1;
                break;
            }
            if(refugee.getName().contains("WINNER"))
            {
                f=1;
                break;
            }
            if(f==0)
            {   
                if(refugee.getSquare()==-5 || refugee.getSquare()==-10)
                {
                    if(refugee.getSquare()==-10)
                    {
                        System.out.println("Wait for a round.");
                        STA.setStayTurnAction(-5,refugee,2,0);
                        addAction(STA);
                    }
                    else if(refugee.getSquare()==-5)
                    {
                        System.out.println("Wait for a round.");
                        STA.setStayTurnAction(number,refugee,1,0);
                        addAction(STA);
                    }
                    break;   
                }
                
                if(number>39)
                {
                    number=number-40;
                }
                
                int x=RDA.getRollDiceAction(refugee);
                number=refugee.getSquare()+x;
                
                if(number>39)
                {
                    number=number-40;
                }
                
                if(refugee.getSquare()!=-5 || refugee.getSquare()!=0)
                {
                    if(backwardsflag==1)
                    {
                        int a=refugee.getSquare()-x;
                        number=a;
                        refugee.setSquare(a);
                        backwardsflag=0;
                    }
                    else
                    {
                        refugee.setSquare(number);
                    }
                }
                
                GTA.setGoToAction(number,refugee);
                addAction(GTA);
                
                if(refugee.getSquare()==0 ||  number==0)
                {
                    this.text="Country in conflict (war box).";
                    System.out.println(this.text);
                    break;     
                }
                if(number==1)
                {
                    this.text="Food for the journey. Pay $100.";
                    System.out.println(this.text);
                    PMA.setPayMoneyAction(100,"not_mafia",refugee);
                    addAction(PMA);
                    break;
                }
                if(number==2)
                {
                    this.text="Car. You get a free lift. Roll dice.";
                    System.out.println(this.text);
                    addAction(RDA); 
                }
                if(number==3)
                {
                    this.text="Communication gear. Mobile phone and sim card. Pay $300 to the mafia Bank.";
                    System.out.println(this.text);
                    PMA.setPayMoneyAction(300,"Mafia_Bank",refugee);
                    addAction(PMA); 
                    break;
                }
                if(number==4)
                {
                    this.text="Army control. You go back to war box (0).";
                    System.out.println(this.text);
                    number=0;
                    GTA.setGoToAction(number,refugee);
                    addAction(GTA);
                    break;
                }
                if(number==5)
                {
                    this.text="Border 1. Go back to war box (0).";
                    System.out.println(this.text);
                    number=0;
                    GTA.setGoToAction(number,refugee);
                    addAction(GTA);
                    break;
                }
                if(number==6)
                {
                    this.text="Mafia. Pay $1000";
                    System.out.println(this.text);
                    PMA.setPayMoneyAction(1000,"Mafia_Bank",refugee);
                    addAction(PMA);
                    break;
                }
                if(number==7)
                {
                    this.text="Live Vest. You have an extra life if you land in the sea (Box 10).";
                    System.out.println(this.text);
                    number=10;
                    LVA.setLifeVestAction(true,refugee);
                    addAction(LVA);
                    break;
                }
                if(number==8)
                {
                    this.text="GPS Location. Stay for a turn.";
                    System.out.println(this.text);
                    STA.setStayTurnAction(-5,refugee,1,1);
                    addAction(STA);
                    number=8;
                    break;
                }
                if(number==9)
                {
                    this.text="Boat. Pay 3000$ to the Mafia Bank. Roll dice.";
                    System.out.println(this.text);
                    PMA.setPayMoneyAction(3000,"Mafia_Bank",refugee);
                    addAction(PMA);
                    addAction(RDA);
                    number=9;
                }
                if(number==10)
                {
                    if(refugee.getLifeVest()==false)
                    {
                        this.text="Dead at sea. You are dead and out of the game.";
                        System.out.println(this.text);
                        refugee.setName(refugee.getName() + ":x.x");
                        WOLA.setWinOrLoseAction(refugee);
                        addAction(WOLA);
                    }
                    else
                    {
                        this.text="Refugee used his life vest.";
                        System.out.println(this.text);
                        LVA.setLifeVestAction(false,refugee);
                        addAction(LVA);
                    }
                    break;
                }
                if(number==11)
                {
                    this.text="You get sick. Stay one turn.";
                    System.out.println(this.text);
                    STA.setStayTurnAction(-5,refugee,1,1);
                    addAction(STA);
                    number=11;
                    break;
                }
                if(number==12)
                {
                    this.text="You reach on EU coast. Roll dice.";
                    System.out.println(this.text);
                    addAction(RDA);
                    number=12;
                }
                if(number==13)
                {
                    this.text="Tent and sleeping bank. Pay $200 to Mafia Bank.";
                    System.out.println(this.text);
                    PMA.setPayMoneyAction(200,"Mafia_Bank",refugee);
                    addAction(PMA);
                    number=13;
                    break;
                }
                if(number==14)
                {
                    this.text="Border police. Stay one turn.";
                    System.out.println(this.text);
                    STA.setStayTurnAction(-5,refugee,1,1);
                    addAction(STA);
                    number=14;
                    break;
                }
                if(number==15)
                {
                    this.text="Border Control 2. Back to Border Control 1.";
                    System.out.println(this.text);
                    number=5;
                    GTA.setGoToAction(number,refugee);
                    addAction(GTA);
                    break;
                }
                if(number==16)
                {
                    this.text="Refugee camp. Pay $500 to Mafia bank to leave and roll dice.";
                    System.out.println(this.text);
                    PMA.setPayMoneyAction(500,"Mafia_Bank",refugee);
                    addAction(PMA);
                    addAction(RDA);
                    number=16;
                }
                if(number==17)
                {
                    this.text="Train. Roll dice.";
                    System.out.println(this.text);
                    addAction(RDA);
                    number=17;
                }
                if(number==18)
                {
                    this.text="Red Cross Shelter. Jump to river crossing box (22)";
                    System.out.println(this.text);
                    number=22;
                    GTA.setGoToAction(number,refugee);
                    addAction(GTA);
                    break;
                }
                if(number==19)
                {
                    this.text="Guard Dogs. Stay one turn.";
                    System.out.println(this.text);
                    STA.setStayTurnAction(-5,refugee,1,1);
                    addAction(STA);
                    number=19;
                    break;
                }
                if(number==20)
                {
                    this.text="NGO Support. You receive $1000 from NGO Bank.";
                    System.out.println(this.text);
                    GMA.setGiveMoneyAction(1000,"NGO_Bank",refugee);
                    addAction(GMA);
                    number=20;
                    break;
                }
                if(number==21)
                {
                    this.text="Theft. You lose 1500$. Place this money in the Players Expencses box.";
                    System.out.println(this.text);
                    PMA.setPayMoneyAction(1500,"not_mafia",refugee);
                    addAction(PMA);
                    number=21;
                    break;
                }
                if(number==22)
                {
                    this.text="River Crossing. Roll dice and go backwards by the number.";
                    System.out.println(this.text);
                    addAction(RDA);
                    backwardsflag=1;
                }
                if(number==23)
                {
                    this.text="NGO Lift. Jump to family reunion box (29).";
                    System.out.println(this.text);
                    number=29;
                    GTA.setGoToAction(number,refugee);
                    addAction(GTA);
                    break;
                }
                if(number==24)
                {
                    this.text="Border Police. Stay one turn.";
                    System.out.println(this.text);
                    STA.setStayTurnAction(-5,refugee,1,1);
                    addAction(STA);
                    number=24;
                    break;
                }
                if(number==25)
                {
                    this.text="Border Control 3. Back to border 2 (box 15).";
                    System.out.println(this.text);
                    number=15;
                    GTA.setGoToAction(number,refugee);
                    addAction(GTA);
                    break;
                }
                if(number==26)
                {
                    this.text="Asylum Paperwork. Pay $1000 to Mafia Bank. Option A: Pay $1500 to Mafia Bank and roll dice. Option B: Don't pay and stay 2 turns.";
                    System.out.println(this.text);
                    PMA.setPayMoneyAction(1000,"Mafia_Bank",refugee);
                    addAction(PMA);
                    String desision;
                    do
                    {
                        System.out.println("Please choose option A or option B.");
                        Scanner option=new Scanner(System.in);
                        desision=option.next();
                    }while(!"A".equals(desision) && !"B".equals(desision));
                    if("A".equals(desision))
                    {
                        PMA.setPayMoneyAction(1500,"Mafia_Bank",refugee);
                        addAction(PMA);
                        addAction(RDA);
                    }
                    else if("B".equals(desision))
                    {
                        STA.setStayTurnAction(-10,refugee,2,1);
                        addAction(STA);
                        number=26;
                        break;
                    }
                }
                if(number==27)
                {
                    this.text="Storm. Stay one turn.";
                    System.out.println(this.text);
                    STA.setStayTurnAction(-5,refugee,1,1);
                    addAction(STA);
                    number=27;
                    break;
                }
                if(number==28)
                {
                    this.text="UNHCR Aid. Roll dice.";
                    System.out.println(this.text);
                    addAction(RDA);
                    number=28;
                }
                if(number==29)
                {
                    this.text="Family Reunion. Jump to bus box (31).";
                    System.out.println(this.text);
                    number=31;
                    GTA.setGoToAction(number,refugee);
                    addAction(GTA);
                    break;
                }
                if(number==30)
                {
                    this.text="Right Wing Militia. Back to Border police box (24).";
                    System.out.println(this.text);
                    number=24;
                    GTA.setGoToAction(number,refugee);
                    addAction(GTA);
                    break;
                }
                if(number==31)
                {
                    this.text="Mafia Bus. Pay $800 to Mafia Bank. Roll dice.";
                    System.out.println(this.text);
                    PMA.setPayMoneyAction(800,"Mafia_Bank",refugee);
                    addAction(PMA);
                    addAction(RDA);
                    number=31;
                }
                if(number==32)
                {
                    this.text="Government Detention Camp. Stay one turn.";
                    System.out.println(this.text);
                    STA.setStayTurnAction(-5,refugee,1,1);
                    addAction(STA);
                    number=32;
                    break;
                }
                if(number==33)
                {
                    this.text="Asylum Seeker Application rejected. Back to Train box (17) and Roll dice.";
                    System.out.println(this.text);
                    addAction(RDA);
                    number=17;
                    GTA.setGoToAction(number,refugee);
                    addAction(GTA);
                }
                if(number==34)
                {
                    this.text="Border Police. Stay one turn.";
                    System.out.println(this.text);
                    STA.setStayTurnAction(-5,refugee,1,1);
                    addAction(STA);
                    number=34;
                    break;
                }
                if(number==35)
                {
                    this.text="Border Control 4. Back to Border 3 (box 25).";
                    System.out.println(this.text);
                    number=25;
                    GTA.setGoToAction(number,refugee);
                    addAction(GTA);
                    break;
                }
                if(number==36)
                {
                    this.text="Asylum Seeker Application Approved. You win.";
                    System.out.println(this.text);
                    refugee.setName(refugee.getName() + ":WINNER");
                    WOLA.setWinOrLoseAction(refugee);
                    addAction(WOLA);
                    number=36;
                    break;
                }
                if(number==37)
                {
                    this.text="Mafia. Pay $1000 to Mafia Bank.";
                    System.out.println(this.text);
                    PMA.setPayMoneyAction(1000,"Mafia_Bank",refugee);
                    addAction(PMA);
                    number=37;
                    break;
                }
                if(number==38)
                {
                    this.text="Deported. You are sent back to war box (0).";
                    System.out.println(this.text);
                    number=0;
                    GTA.setGoToAction(number,refugee);
                    addAction(GTA);
                    break;
                }
                if(number==39)
                {
                    this.text="New Home. You are finally accepted. You win.";
                    System.out.println(this.text);
                    refugee.setName(refugee.getName() + ":WINNER");
                    WOLA.setWinOrLoseAction(refugee);
                    addAction(WOLA);
                    number=39;
                    break;
                }
            }
        }
        System.out.println();
    }

    @Override
    public int receiveMoney(int x)
    {
        return 0;
    }

    @Override
    public int getMafiaBankMoney()
    {
        return 0;
    }

    @Override
    public void setMafiaBankMoney(int x)
    {
    }

    @Override
    public int giveMoney(int x) throws NoMoneyException
    {
        return 0;
    }

    @Override
    public int getNGO_Bank()
    {
        return 0;
    }

    @Override
    public void setNGO_Bank(int x)
    {
    }
}
