class consecutive2
{
    public static void main(int n)
    { int sum=0;
        int count=0;
        for(int i=1;i<n;i++)
        {
            
            sum=0;
            for(int j=i;j<n;j++)
            {
                
                sum+=j;
                 
                if(sum==n)
                {
                     
                    count=j-i;
                     
                    for(int k=i;k<(count+1+i);k++)
            {
                System.out.print(k+"+");
            }
            System.out.println("="+n);
            break;
                }
                else if(sum>n)
                break;
                
            }
            
            
        }
        
    }
}