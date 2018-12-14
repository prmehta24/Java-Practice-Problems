import java.util.*;
class hexadecimal
{
    public static void main()
    {
        Scanner Sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int a=Sc.nextInt();
        int n=a;
       String h="";
       int r=0;
       while(n>0)
       {r=n%16;
           if(r==10)
           h="A"+h;
           else if(r==11)
           h="B"+h;
           else if(r==12)
           h="C"+h;
           else if(r==13)
           h="D"+h;
           else if(r==14)
           h="E"+h;
           else if(r==15)
           h="F"+h;
           else
           h=r+h;
           n=n/16;
           }
           System.out.println("The hexadecimal number is "+h);
        
    }
}