import java.util.*;
class switchmatrix
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
        int b[][] = new int[n][n];
        for(i=0;i<n;i++)
        {
         for(j=0;j<n;j++)
         {
             if(i==0)
             b[i][j]=a[i+1][j];
             else if(i==1)
             b[i][j]=a[i-1][j];
             else
             b[i][j]=a[i][j];
            }
        }
        System.out.println("Rows 1 and 2 switched Matrix = ");
         for(i=0 ; i<n ; i++)
        {
            for(j=0 ; j<n ; j++)
            System.out.print((b[i][j])+" ");
            System.out.println();
        }
        int c[][] = new int[n][n];
        for(i=0;i<n;i++)
        {
         for(j=0;j<n;j++)
         {
             if(i==1)
             c[i][j]=a[i+1][j];
             else if(i==2)
             c[i][j]=a[i-1][j];
             else
             c[i][j]=a[i][j];
            }
        }
        System.out.println("Rows 2 and 3 switched Matrix = ");
         for(i=0 ; i<n ; i++)
        {
            for(j=0 ; j<n ; j++)
            System.out.print((c[i][j])+" ");
            System.out.println();
        }
    }
}