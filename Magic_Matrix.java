import java.util.*;
class Magic_Matrix
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter order of matrix");
        int n = sc.nextInt();
        int i,j,k=0;
        boolean c=true;
        int a[][] = new int[n][n];
        int b[] = new int[(2*n)+2];
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
        for(i=0 ; i<n ; i++)
        {
            for(j=0 ; j<n ; j++)
            {
                b[k] += a[i][j];
                b[k+1] += a[j][i];
                if(i==j)
                b[(2*n)+1] += a[i][i];
                if(j==(2-i))
                b[2*n] += a[i][j];
            }
            k+=2;
        }
        for(i=0 ; i<(2*n)+1 ; i++)
        {
            if(b[i]!=b[i+1])
            c=false;
            System.out.println(b[i]);
        }
        System.out.println(b[i]);
        if(c==true)
        System.out.println("Magic Matrix");
        else
        System.out.println("Oh No Not AMagic Matrix");
    }
}