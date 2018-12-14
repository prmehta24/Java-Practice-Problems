import java.util.*;
class gcd
{
    public static void main()
    {
        Scanner Sc=new Scanner(System.in);
        System.out.println("Enter the two numbers whose gcd you wish to find.(Enter one by one)");
        int a=Sc.nextInt();
        int b=Sc.nextInt(),j;
        if(a>b)
        {
        j=a;
    }
        else
        {
            
        j=b;
    }
    int max=0;
    for(int i=1;i<=j;i++)
    {
        if((a%i==0)&&(b%i==0))
       {
           if(i>max)
           {
               max=i;
            }
        }

    }
    System.out.println("GCD:- "+max);
    }
}