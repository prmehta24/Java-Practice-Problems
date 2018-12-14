class pattern7
{
    public static void main()
    {
        int s=1;
        for(int i=0;i<=9;)
        {
            for(int j=0;j<s;j++)
            {
            System.out.print(i+" ");
            i++;
        }
        s++;
        System.out.println("");
        
            
        }
         s-=2;
        for(int i=5;i>=0;)
        {
            for(int j=0;j<s;j++)
            {
            System.out.print(i+" ");
            i--;
        }
        s--;
        System.out.println("");
        
            
        }
    }
}