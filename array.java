// 2D array
import java.util.*;
class array
{
    public static void main()
    {
        Scanner Sc=new Scanner(System.in);
        System.out.println("Enter the length of the array rows");
        int rows=Sc.nextInt();
        System.out.println("Enter the number of rows in array");
        int no=Sc.nextInt();
        int [][]a=new int[rows][no];
        for(int i=0;i<no;i++)
        {
            for(int j=0;j<rows;j++)
            {
                System.out.println("Enter the number "+(j+1)+" of row "+(i+1));
                a[j][i]=Sc.nextInt();
            }
        }
        System.out.println("The array:");
        for(int i=0;i<no;i++)
        {
            for(int j=0;j<rows;j++)
            {
                System.out.print(a[j][i]+" ");
                
            }
            System.out.println();
        }
        
    }
}