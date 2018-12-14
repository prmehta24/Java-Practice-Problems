import java.util.*;
class perfectno
{
    public static void main()
    {
        Scanner Sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int a=Sc.nextInt();
        int sav=a,sum=0,i=0;
        for(i=a-1;i>0;i--)
        {
            if(a%i==0)
            sum=sum+i;
        }
        System.out.println("Sum = "+sum);
        if(sum==sav)
        System.out.println(sav+" is a perfect number.");
        else
        System.out.println(sav+" is not a perfect number");
       
    }
}