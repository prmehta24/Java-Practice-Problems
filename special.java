class special
{
    int n,s;
    special()
    {
        n=0;
    }
    
    
    special(int a)
    {
       n=a;
    }
    void sum()
    {
        int r=n,r2=0,s=0,i=0,sum=1;
        while(r>0)
        {
            r2=r%10;sum=1;
            if(r2==0)
            sum=0;
            System.out.println("r2 = "+r2);
            for(i=r2;i>0;i--)
            {
                
                sum*=i;
                System.out.println("sum = "+sum);
            }
             
            s+=sum;
            System.out.println("s = "+s);
            r=r/10;
        }
        this.s=s;
        
    }
    void isspecial()
    {
       
        if(n==s)
        System.out.println(n+" is a special number . "+s);
        else
        System.out.println(n+" is not a special number. "+s);
    }
    public static void main()
    {
        special s=new special(145);
        s.sum();
        s.isspecial();
    }
}