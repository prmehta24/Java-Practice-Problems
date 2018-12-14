class prime
{
    boolean Isprime(int n)
    {
        int c=0;
        for(int i=2;i<n;i++)
        {
            if(n%i==0)
            c++;
        }
        if(c>0)
        return false;
        else
        return true;
    }
    public void twinprimes(int lim)
    {
        System.out.println("Twin Primes:-");
        for(int i=2;i<=lim;i++)
        {
            boolean a=Isprime(i);
            boolean b=Isprime(i+2);
            if((a==true)&&(b==true))
            {
                System.out.println("("+i+","+(i+2)+")");
            }
        }
    }
    public double BrunConstant(int lim)
    { double sum=0;
        for(int i=2;i<=lim;i++)
        {
            ;
            boolean a=Isprime(i);
            boolean b=Isprime(i+2);
            if((a==true)&&(b==true))
            {
                System.out.println("("+i+","+(i+2)+")");
              sum+=(1/((double)i))+(1/((double)(i+2)));
              System.out.println("sum = "+sum);
            }
        }
        return sum;
    }
}