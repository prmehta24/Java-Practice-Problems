// Average of elements in array
import java.util.*;
class arrayavg
{
    public static void main(String args[])
    {
        Scanner Sc=new Scanner(System.in);
        System.out.println("Enter the number of values in array ");
        int a=Sc.nextInt(),max=0,min=1000000,sum=0;
        int b[]=new int[a];
        for(int i=0;i<a;i++)
        {
            System.out.println("Enter number "+(i+1)+" of array");
            b[i]=Sc.nextInt();
            
        }
        System.out.println("The array:-");
        for(int i=0;i<a;i++)
        {
            System.out.print(b[i]+" ");
            }
            for(int i=0;i<a;i++)
        {
            if(b[i]>max)
            {
            max=b[i];
        }
        if(b[i]<min)
        {
            min=b[i];
        }
        sum+=b[i];
            }
            int avg=sum/a;
            System.out.println();
            System.out.println("Max= "+max);
            System.out.println("Min= "+min);
            System.out.println("Total= "+sum);
            System.out.println("Avg= "+avg);
        
    }
}