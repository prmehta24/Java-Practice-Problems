


class CircleNo
{
    public static void main(int lim)
    {
        CircleNo c=new CircleNo();
        System.out.println("Circular Primes:-");
        for(int i=1;i<lim;i++)
        {
            c.check(i);
        }
    }
    void check(int n)
    {
        
        n = n;
        int cnt=0,t=n,i=0,j=0;
        while(t>0)
        {
            t=t/10;
            cnt++;
        }
        boolean a=true;
        int N[]=new int[cnt];
        N[0]=n;
        for(i=1 ; i<cnt ; i++)
        {
            t=N[i-1]%10;
            N[i]=((int)(t*(Math.pow(10,(cnt-1)))))+((int)N[i-1]/10);
        }
        
        
        for(i=0 ; i<cnt ; i++)
        {
            for(j=2 ; j<N[i] ; j++)
            {
                if(N[i]%j==0)
                {
                    i=cnt;
                    a=false;
                    break;
                }
            }
        }
        if(a==true)
        System.out.println(n);
        
    }
}

