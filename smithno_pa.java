import java.util.*;
class smithno_pa
{
    public static void main()
    {
        Scanner Sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int a=Sc.nextInt();
        int sav1=a,i=0;
        int sav2=a;
        int sum=0,sum2=0;
        while(a>0)
        {
            int r=a%10;
            sum+=r;
            a=a/10;
        }
        System.out.println("Sum = "+sum);
        while(sav1>0)
        {
            if(sav1==1)
            {
            break;
        }
            for( i=2;i<sav1;i++)
            {
                int c=0;
                for(int j=2;j<sav1;j++)
                {
                    if((i%j==0)&&(sav1%j!=0))
                    c++;
                }
                if(c==0)
                {
                    break;
                }
                
            }
            if(i<9)
            {
                sum2+=i;
                
            }
            else
            {
                int sav3=i;
                int sum3=0;
                while(sav3>0)
        {
            int r=sav3%10;
            
            sum3+=r;
            sav3=sav3/10;
        }
        sum2+=sum3;
                
            }
            
        System.out.println("Prime Factors="+i);
        sav1=sav1/i;
        
        
    }
    System.out.println("Sum of digits of prime factors = "+sum2);
    if(sum==sum2)
    {
        System.out.println("It is a smith no.");
    }
    else
    {
        System.out.println("It is not a smith no.");
    }
}
}

