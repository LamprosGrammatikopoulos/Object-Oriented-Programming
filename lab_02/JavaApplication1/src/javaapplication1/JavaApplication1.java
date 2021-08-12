package javaapplication1;
import java.util.Scanner;
public class JavaApplication1
{
    public static void main(String[] args) 
    {
     Scanner a;
     a=new Scanner(System.in);
     String lex=a.next();
     alpha(lex);
    }
    public static void alpha(String lex)
    {
        String FirstG;
        String SecG;
        String MidG;
        String EndG;
        int x;
        FirstG=lex.substring(0,1);         //FirstG=H
        FirstG=FirstG.toLowerCase();        //FirstG=h
        x=lex.length();
        SecG=lex.substring(1,2);            //SecG=e
        SecG=SecG.toUpperCase();               //SecG=E
        MidG=lex.substring(2,x);              //MidG=llo
        EndG=SecG+MidG+FirstG+"ay";
        System.out.println(EndG);
    }
}
