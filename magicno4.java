
class magicno4
{
    public static void main(int n)
    {
        System.out.println("Magic Numbers:-(Between 0 and "+n+")");
        int total=0;    
        for(int i=0;i<n;i++)
        {
        
        int a=i;
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
            
            if((sum>=0)&&(sum<=9))
            {
                
                sum1=sum;
               
            c=0;
        }
        a=sum;
        sum=0;
        
            
            
        }
       
        if(sum1==1)
        {
            total++;
        System.out.println(i);
    }
       
    }
    System.out.println("Total= "+total);
}
}