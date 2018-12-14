class Pattern4
{
    public static void main() 
    {
        int i,j,k=0;
        for(i=1 ; i<=4 ; i++)
        {
            for(j=1 ; j<=7 ; j++)
            {
                if((j<=k)||(j>7-k))
                System.out.print(" ");
                else
                System.out.print(j);
            }
            System.out.println();
            k++;
        }
        k-=2;
        for(i=1 ; i<=3 ; i++)
        {
            for(j=1 ; j<=7 ; j++)
            {
                if((j<=k)||(j>7-k))
                System.out.print(" ");
                else
                System.out.print(j);
            }
            System.out.println();
            k--;
        }
    }
}