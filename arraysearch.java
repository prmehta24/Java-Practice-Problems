// Number of occurences of an element in array
import java.util.*;
class arraysearch
{
    public static void main()
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
        System.out.println("Enter the number you want to search for");
        int c=Sc.nextInt(),co=0;
        for(int i=0;i<a;i++)
        {
            if(b[i]==c)
            {
            co++;
            }
           
           
    }
    if(co>0)
    {
    
    System.out.println("The number "+c+" is present in array "+co+" times.");
    }
    else
    {
        System.out.println("The number "+c+" is not present in the array.");
    }
    
}
}