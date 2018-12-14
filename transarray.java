import java.util.*;
class transarray
{
    public static void main()
    {
    Scanner Sc=new Scanner(System.in);
    System.out.println("Enter the rows");
    int rows=Sc.nextInt();
    System.out.println("Enter the columns");
    int columns=Sc.nextInt();
    int matrix[][]=new int[rows][columns];
    for(int i=0;i<rows;i++)
    {
       for(int j=0;j<columns;j++)
       {
           System.out.println("Enter array element(row = "+i+"/ column= "+j);
           matrix[i][j]=Sc.nextInt();
        }
    }
    System.out.println("Array : Rows= "+rows+"/ Columns ="+columns);
    for(int i=0;i<rows;i++)
    {
       for(int j=0;j<columns;j++)
       {
           
           System.out.print(matrix[i][j]+" ");
        }
        System.out.println();
    }
    int sum=0;
    for(int i=0;i<rows;i++)
    {
       for(int j=0;j<columns;j++)
       {
           if(i==j)
           sum+=matrix[i][j];
        }
        System.out.println();
    }
    System.out.println("Diagonal Sum = "+sum);
    int transpose[][]=new int[columns][rows];
    for(int i=0;i<rows;i++)
    {
       for(int j=0;j<columns;j++)
       {
           
          transpose[j][i]=matrix[i][j];
        }
    }
    System.out.println("Transpose:-");
    for(int i=0;i<rows;i++)
    {
       for(int j=0;j<columns;j++)
       {
           
          System.out.print(transpose[i][j]+" ");
        }
        System.out.println();
    }
    
    
}
}