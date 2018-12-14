import java.util.*;
class Zig_ZagMatrix
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
        System.out.println("Zig Zag Matrix = ");
        for(i=0 ; i<n ; i++)
        {
            for(j=0 ; j<n ; j++)
            System.out.print((a[n-1-i][n-1-j])+" ");
            System.out.println();
        }
        System.out.println("Another Zig Zag Matrix = ");
        for(i=0 ; i<n ; i++)
        {
            if(i%2!=0)
            {
                for(j=n-1 ; j>=0 ; j--)
                System.out.print((a[i][j])+" ");
                System.out.println();
            }
            else
            {
                for(j=0 ; j<n ; j++)
                System.out.print((a[i][j])+" ");
                System.out.println();
            }
        }
    }
}