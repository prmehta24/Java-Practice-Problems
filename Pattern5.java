import java.util.*;
class Pattern5
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Order");
        int n = sc.nextInt();
        System.out.println("First Character");
        char c1 = sc.next().charAt(0);
        System.out.println("Second Character");
        char c2 = sc.next().charAt(0);
        System.out.println("Third Character");
        char c3 = sc.next().charAt(0);
        int i,j;
        char c[][] = new char[n][n];
        for(i=0 ; i<n ; i++)
        {
            for(j=0 ; j<n ; j++)
            {
                if((i==j)||(j==(n-1-i)))
                c[i][j] = c3;
                if((j>i)&&(j<(n-1-i)))
                {
                    c[i][j] = c1;
                    c[j][i] = c2;
                }
                if((j>i)&&(j>(n-1-i)))
                {
                    c[i][j] = c2;
                    c[j][i] = c1;
                }
            }
        }
        for(i=0 ; i<n ; i++)
        {
            for(j=0 ; j<n ; j++)
            System.out.print(c[i][j]);
            System.out.println();
        }
    }
}