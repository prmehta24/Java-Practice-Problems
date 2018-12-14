//Arrange elements in ascending order except outter matrix
import java.util.*;
class Matrix_Special_Boards
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a order of Matrix");
        int n = sc.nextInt();
        int i=0,j=0,i1=0,j1=0,t=0,k1=n-2,k2=n-2;
        int a[][]=new int[n][n];
        boolean c =true;
        for(i=0 ; i<n ; i++)
        {
            System.out.println("Enter a elements of Row "+(i+1));
            for(j=0 ; j<n ; j++)
            a[i][j]=sc.nextInt();
        }
        System.out.println("Original Matrix  =");
        for(i=0 ; i<n ; i++)
        {
            for(j=0 ; j<n ; j++)
            System.out.print(a[i][j]+" ");
            System.out.println();
        }
        i=1;
        j=1;
        while(k1!=0)
        {
            while((i1<=k1)||(j1<=k2))
            {
                i1=i;
                j1=j+1;
                if(j1==n-1)
                {
                    j1=1;
                    i1=i+1;
                    if(i1==n-1)
                    break;
                }
                if(a[i][j]>a[i1][j1])
                {
                    t=a[i][j];
                    a[i][j]=a[i1][j1];
                    a[i1][j1]=t;
                }
                System.out.println("i = "+i);
                System.out.println("i1 = "+i1);
                System.out.println("j = "+j);
                System.out.println("j1 = "+j1);
                j=j1;
                i=i1;
            }
            System.out.println("gfcj = "+a[n-2][n-2]);
            i=1;
            j=1;
            k2--;
            if(k2==0)
            {
                k1--;
                k2=n-2;
                if(k1==0)
                break;
            }
        }
        
        System.out.println("Rearranged Matrix  =");
        for(i=0 ; i<n ; i++)
        {
            for(j=0 ; j<n ; j++)
            System.out.print(a[i][j]+" ");
            System.out.println();
        }
        System.out.println("Special Diagnoal Matrix =");
        for(i=0 ; i<n ; i++)
        {
            for(j=0 ; j<n ; j++)
            {
                if((i==0)||(i==(n-1))||(j==0)||(j==(n-1)))
                c=false;
                if((i==j)||(j==(n-1-i)))
                c=true;
                if(c==true)
                System.out.print(a[i][j]+" ");
                else
                System.out.print("  ");
            }
            System.out.println();
        }
    }
}