import java.util.*;
class magicn
{
    public static void main()
    {
        Scanner Sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int a=Sc.nextInt();
        int sav=a,c=0,i=0,n=0,sum=0;
       
        while(a>0)
        {
            n=n+(a%10);
            a=a/10;

        }
        System.out.println("n= "+n);
        while(n>0)
        {
            sum=sum+(n%10);
            n=n/10;

        }
         System.out.println("sum= "+sum);
    
    if(sum==1)
    System.out.println(sav+" is a magic number");
    else
    System.out.println(sav+" is not a magic number");
        
    }
}