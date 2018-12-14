import java.util.*;
class Matrix_Rotate
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
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
        System.out.println("Rotated Matrix =");
        for(i=0;i<n;i++)
        {
            for(j=n-1;j>=0;j--)
            System.out.print(a[j][i]+" ");
            System.out.println();
        }
    }
}