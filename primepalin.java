import java.util.*;
class primepalin
{
    public static void main()
    {
        Scanner Sc=new Scanner(System.in);
        System.out.println("Enter the range in which you want to find prime palindrome numbers.(enter one number and after entering enter the other number.)");
        int m=Sc.nextInt();
        int n=Sc.nextInt();
        int c,sum,i,j,d,r,c2=0;
        System.out.println("Prime Palindrome Numbers:-");
        for(i=m;i<=n;i++)
        {
            sum=0;
            c=0;
            d=i;
            for(j=i-1;j>1;j--)
            {
                if(i%j==0)
                c++;
            }
            if(c==0)
            {
                while(d>0)
                {
                    r=d%10;
                    sum=(sum*10)+r;
                    d=d/10;
                }
                if(sum==i)
                {
                    c2++;
                System.out.println(i);
            }
            }
        }
        System.out.println("There are "+c2+" prime palindromes in this range.");
    }
}