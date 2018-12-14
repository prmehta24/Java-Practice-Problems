class Pattern2
{
    public static void main() 
    {
        int i,j;
        for(i=10 ; i>=2 ; i-=2)
        {
            for(j=i ; j<10 ; j+=2)
            {
                System.out.print(" ");
            }
            for(j=i ; j>=2 ; j-=2)
            {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}