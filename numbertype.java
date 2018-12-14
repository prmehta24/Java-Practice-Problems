import java.util.*;
class numbertype
{
    public static void main()
    {
        Scanner Sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int n=Sc.nextInt();
        int i=0;
        int n2=n*2;
        int sum=0;
        for(i=n;i>0;i--)
        {
            if(n%i==0)
            sum+=i;
        }
        System.out.println("sum = "+sum);
        System.out.println("Double of input number = "+n2);
        if(sum>n2)
        System.out.println(n+ " is an abundant number");
        else if(sum==n2)
        System.out.println(n+" is a perfect number.");
        else if(sum<n2)
        System.out.println(n+" is a deficient number.");
        
    }
}