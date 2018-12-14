import java.util.*;
class DiagonalX
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter order of matrix");
        int n = sc.nextInt();
        int i,j;
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
        System.out.println("Above Diagonal Matrix = ");
        for(i=0 ; i<n ; i++)
        {
            for(j=0 ; j<n ; j++)
            {
                if(j>i)
                System.out.print((a[i][j])+" ");
                else
                System.out.print("  ");
            }
            System.out.println();
        }
        System.out.println("Below Diagonal Matrix = ");
        for(i=0 ; i<n ; i++)
        {
            for(j=0 ; j<n ; j++)
            {
                if(j<i)
                System.out.print((a[i][j])+" ");
                else
                System.out.print("  ");
            }
            System.out.println();
        }
        System.out.println("Except Diagonal Matrix = ");
        for(i=0 ; i<n ; i++)
        {
            for(j=0 ; j<n ; j++)
            {
                if(j!=i)
                System.out.print((a[i][j])+" ");
                else
                System.out.print("  ");
            }
            System.out.println();
        }
        System.out.println("Main Diagonal Matrix = ");
        for(i=0 ; i<n ; i++)
        {
            for(j=0 ; j<n ; j++)
            {
                if(j==i)
                System.out.print((a[i][j])+" ");
                else
                System.out.print("  ");
            }
            System.out.println();
        }
        System.out.println("Secondary Diagonal Matrix = ");
        for(i=0 ; i<n ; i++)
        {
            for(j=0 ; j<n ; j++)
            {
                if(j==2-i)
                System.out.print((a[i][j])+" ");
                else
                System.out.print("  ");
            }
            System.out.println();
        }
    }
}