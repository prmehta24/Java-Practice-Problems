import java.util.*;
class specialno
{
    int sum;
    int factorial(int x)
    {
        if(x>1)
        {
        sum=sum*x;
        return factorial(x-1);
    }
    return sum;
        
        
    }
    int tot(int n)
    {
        int total=0;
        while(n>0)
        {
            int r=n%10;
            sum=1;
            total+=factorial(r);
             n/=10;
        }
        return total;
        
    }
    public static void main(int a)
    {
        int n=a;
        specialno sn=new specialno();
        int t=sn.tot(n);
        if (t==a)
        System.out.println(a+" is a special no");
        else
        System.out.println(a+" is not a special no");
        
        
    }
}