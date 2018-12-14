import java.util.*;
class magicno3
{
    public static void main()
    {
        Scanner Sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int a=Sc.nextInt();
        int sum=0,sum1=0;
        int a1=a;
        int c=1;
        while(c>0)
        {
            while(a>0)
            {
                sum+=a%10;
                a=a/10;
            }
            System.out.println("sum="+sum);
            if((sum>=0)&&(sum<=9))
            {
                
                sum1=sum;
                System.out.println("in Sum1="+sum1);
            c=0;
        }
        a=sum;
        sum=0;
        
            
            
        }
        System.out.println("out Sum1="+sum1);
        if(sum1==1)
        System.out.println("It is a magic number");
        else
        System.out.println("It isnt a magic number");
    }
}