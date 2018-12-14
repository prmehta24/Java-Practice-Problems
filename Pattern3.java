class Pattern3
{
    public static void main() 
    {
        int i,j,k=0;
        for(i=1 ; i<=5 ; i++)
        {
            for(j=1 ; j<=9 ; j++)
            {
                if((j<k+5)&&(j>5-k))
                System.out.print(" ");
                else
                System.out.print(j);
            }
            System.out.println();
            k++;
        }
        k=k-2;
        for(i=1 ; i<=4 ; i++)
        {
            for(j=1 ; j<=9 ; j++)
            {
                if((j<k+5)&&(j>5-k))
                System.out.print(" ");
                else
                System.out.print(j);
            }
            System.out.println();
            k--;
        }
    }
}