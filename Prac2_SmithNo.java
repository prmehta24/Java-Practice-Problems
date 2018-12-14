import java.util.*;
class Prac2_SmithNo
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a no");
        int a = sc.nextInt();
        int a1=a,i=2,sum=0,t=0,sum1=0,j=0;
        for(i=2 ; i<a+1 ; i++)
        {
            while(a1%i==0)
            {
                j=i;
                if(j>9)
                {
                    while(i>0)
                    {
                        t=i%10;
                        sum=sum+t;
                        i=i/10;
                    }
                    i=j;
                }
                else
                sum=sum+j;
                System.out.println(j);
                a1=a1/j;
                if(a1==1)
                break;
            }
            if(a1==1)
            break;
        }
        while(a>0)
        {
            t=a%10;
            sum1=sum1+t;
            a=a/10;
        }
        if(sum1==sum)
        {
            System.out.println("YIPPEE");
            System.out.println("SUM SMITH = "+sum);
            System.out.println("SUM Direct = "+sum1);
        }
        else
        {
            System.out.println("OH NO");
            System.out.println("SUM SMITH = "+sum);
            System.out.println("SUM Direct = "+sum1);
        }
    }
}