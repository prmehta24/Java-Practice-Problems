import java.util.*;
class primefactors
{
    public static void main(int n)
    {
        int nn=n;
        int c=0;
        int total=0;
        int sum=0;
        int i=2;
        while(i<=nn)
        {
            c=0;
            if(nn%i==0)
            {
                for(int j=2;j<i;j++)
                {
                    if(i%j==0)
                    c++;
                }
                if(c==0)
                {
                    System.out.println(i);
                    if(i>9)
                    {
                        int f=i;
                        total=0;
                        while(f>0)
                        {
                            total+=(f%10);
                            f=f/10;
                        }
                        
                        sum+=total;
                    }
                    else
                    sum+=i;
                    nn=nn/i;
                }
            }
            else
            i++;
        }
        System.out.println("Sum= "+sum);
    }
}