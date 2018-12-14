import java.util.*;
class prime_palin
{
    public static void main()
    {
        Scanner Sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int a=Sc.nextInt();
        int sav=a,c=0,i=0,n=0;
        for(i=a-1;i>1;i--)
        {
            if(a%i==0)
            c++;
        }
        while(a>0)
        {
            n=n*10+(a%10);
            a=a/10;

        }
        System.out.println("c = "+c);
        System.out.println("new = "+n);
        if((c==0)&&(n==sav))
        System.out.println(sav+" is a palindrome and a prime number");
        else if((c==0)&&(n!=sav))
        System.out.println(sav+" is a prime number but not a palindrome");
        else if((c!=0)&&(n==sav))
        System.out.println(sav+" is a palindrome but not a prime number");
        else if((c!=0)&&(n!=sav))
        System.out.println(sav+" is not a palindrome nor a prime number");
    }
}