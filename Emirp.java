import java.util.*;
class Emirp
{
    int n;
    int rev;
    int f;
    int c;
    Emirp(int nn)
    {
        n=nn;
        rev=0;
        f=2;
        
    }
    int isPrime(int n,int i)
    {
        if(i==1)
        return 1;
        else
        {
            if(n%i==0)
            return 0;
            else
            return isPrime(n,(i-1));
        }
        
       
    }
    
    void isEmirp()
    {
        Emirp e=new Emirp(n);
        int nnn=n;
        int digit=0;
        while(nnn>0)
        {
            digit=nnn%10;
            rev=(rev*10)+digit;
            nnn=nnn/10;
            
        }
        System.out.println("Reverse no= "+rev);
        if((e.isPrime(n,(n/2))==1)&&(e.isPrime(rev,(rev/2))==1))
        System.out.println(n+" ,"+rev+" are both prime.");
        else
        System.out.println("They are not both prime.");
    }
}
    
    