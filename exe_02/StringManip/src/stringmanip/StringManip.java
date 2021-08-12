package stringmanip;
import java.util.Scanner;
public class StringManip
{
    public static void main(String[] args)
    {
        Scanner a;
        //Diabazw n
        System.out.println("Dwste arithmo sumboloseirwn :");
        a= new Scanner(System.in);
        int n = a.nextInt();
        //Diabazw n fores keimeno
        System.out.println("Dwste sumboloseires :");
        a = new Scanner(System.in);
        //Pernaw ta n keimena se ena pinaka
        String pinsumb[] = new String[n];
        for(int i=0;i<n;i++)
        {    
            String sumb = a.next();
            pinsumb[i] = sumb;
        }
        //Antigrafw ta n keimena se enan allo pinaka
        String pinsumb2[] = new String[n];
        for(int i=0;i<n;i++)
        {
            pinsumb2[i] = pinsumb[i];
        }
        //Kalw thn sunarthsh taksinomhshs BubbleSort
        sortStrings(pinsumb2);
        //Zhtaw poia sumboloseira na psaksei
        System.out.println("Dwste sumboloseira pros anazhthsh :");
        a = new Scanner(System.in);
        String search = a.next();
        //Kalw thn sunarthsh eureshs theshs mias sumboloseiras ston arxiko kai ston taksinomhmeno pinaka
        searchString(pinsumb,pinsumb2,search);
    }
    public static void sortStrings(String pinsumb2[])
    {
        //Taksinwnw me algorithmo BubbleShort ton pinaka 
        int n = pinsumb2.length;
        String tempstring;  
        for(int i=0; i < n; i++)
        {  
            for(int j=1; j < (n-i); j++)
            {
                //pinsumb2[j-1] > pinsumb2[j]
                if(pinsumb2[1].compareTo(pinsumb2[j-1]) < pinsumb2[1].compareTo(pinsumb2[j]))
                {  
                //swap elements  
                tempstring = pinsumb2[j-1];  
                pinsumb2[j-1] = pinsumb2[j];  
                pinsumb2[j] = tempstring;
                }
            }
        }
        //Ektupwnw ton taksinomhmeno pinaka
        System.out.println("O taksinomhmenos pinakas pou prokuptei einai :");
        for(String s : pinsumb2)
        {
            System.out.println(s);
        }
    }
    public static int searchString(String pinsumb[] , String pinsumb2[] , String search)
    {
        int n = pinsumb2.length;
        int p=0,k=0,f=0,r=0;
        //Elegxw an uparxei taksinomhmenos piankas
        for(int j=0;j<n;j++)
        {
            if(pinsumb[j].equals(pinsumb2[j]))
            {
                f=f+1;
            }
        }
        for(int i=0;i<n;i++)
        {
            if(search.equals(pinsumb[i]))
            {
                //krataw thn prwth thesh sthn opoia emfanizetai h sumboloseira ston arxiko pinaka
                if(p==0)
                {
                    p=i;
                }
            }
            //An uparxei taksinomhmenos piankas
            if(f!=n)
            {    
                if(search.equals(pinsumb2[i]))
                {
                    //krataw thn prwth thesh sthn opoia emfanizetai h sumboloseira ston taksinomhmeno pinaka
                    if(k==0)
                    {
                        k=i;
                    }
                }
            }
            //An den uparxei taksinomhmenos piankas kai exw diatreksei ola ta stoixeia
            if(f==n && i==n-1)
            {
                System.out.println("O taksinomhmenos pinakas einai o idios me ton arxiko pinaka epomenws h thesh thn sumboloseiras einai idia kai stous duo.");
            }
            //An den uparxei h sumboloseira ston pinaka
            if(!(search.equals(pinsumb[i])))
            {
                r=r+1;
                if(r==n)
                {
                    System.out.println("Den uparxei h sumboloseira ston pinaka.");
                    return -1;
                }
            }
        }
        //Ektupwnw thn thesh ths shmboloseiras ston arxiko pinaka
        System.out.println("Thesh ths shmboloseiras ston arxiko pinaka : " + (p+1));
        //Ektupwnw thn thesh ths shmboloseiras ston taksinomhmeno pinaka an uparxei
        if(f!=n)
        {
            System.out.println("Thesh ths shmboloseiras ston taksinomhmeno pinaka : " + (k+1));
        }
        return 0;
    }
}
