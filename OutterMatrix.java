import java.util.*;
class OutterMatrix
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter order of matrix");
        int n = sc.nextInt();
        int i,j,t=0;
        int a[][] = new int[n][n];
        for(i=0 ; i<n ; i++)
        {
            System.out.println("Enter elements of row "+(i+1));
            for(j=0 ; j<n ; j++)
            a[i][j] = sc.nextInt();
        }
        System.out.println("Matrix = ");
        for(i=0 ; i<n ; i++)
        {
            for(j=0 ; j<n ; j++)
            System.out.print((a[i][j])+" ");
            System.out.println();
        }
        System.out.println("Outter Matrix = ");
        for(i=0 ; i<n ; i++)
        {
            for(j=0 ; j<n ; j++)
            {
                if((i!=0)&&(i!=(n-1)))
                {
                    if((j==0)||(j==(n-1)))
                    System.out.print((a[i][j])+" ");
                    else
                    System.out.print("  ");
                }
                else
                {
                    System.out.print((a[i][j])+" ");
                }
            }
            System.out.println();
        }
        System.out.println("Inner Matrix = ");
        for(i=0 ; i<n ; i++)
        {
            for(j=0 ; j<n ; j++)
            {
                if((i!=0)&&(i!=(n-1)))
                {
                    if((j!=0)&&(j!=(n-1)))
                    System.out.print((a[i][j])+" ");
                    else
                    System.out.print("  ");
                }
                else
                {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}