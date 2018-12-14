import java.util.*;
class magicno2
{
    public static void main()
    {
        Scanner Sc=new Scanner(System.in);
        System.out.println("Enter the range.(one by one no.)");
        int a=Sc.nextInt(),d=0,e=0;
        int b=Sc.nextInt(),max,i,n,sum,r,c=0;
        System.out.println("Magic Numbers:-");
      
       for(i=a;i<=b;i++)
       {
           d=i;c=1;sum=0;
           
           while(c>0)
           {
               
               
           while(d>0)
           
           {
               
               r=d%10;
               sum+=r;
               d=d/10;
            }
            
            if(sum<10)
            {
                c=0;
                if(sum==1)
                {
                System.out.println(i);
                e++;
            }
        }
            else
            {
                d=sum;
                sum=0;r=0;
                c=1;
            }
        }
        }
    
        
        System.out.println("There are "+e+" magic numbers in this range.");
    
    }
}
