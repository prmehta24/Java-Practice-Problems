import java.util.*;
class datasort
{
    
    int a,i,j;
    int arr[];
    
     Scanner Sc=new Scanner(System.in);

   
        void inpdata()
        {
        System.out.println("Enter the number of terms in array");
        int b=Sc.nextInt();
         a=b;
         int arr[]=new int[a];
        
        for( i=0;i<a;i++)
        {
            System.out.println("Enter term("+(i+1)+")of array");
            arr[i]=Sc.nextInt();
        }
        bubsort(arr);
        binary(arr);
        
            }
    void bubsort(int array[])
    {      System.out.println("Bubblesort"+a);
        for(i=0;i<a;i++)
        {
            System.out.println(array[i]);
        }
        int t;
        for(
        i=0;i<a;i++)
        {
            for(j=i+1;j<a;j++)
            {
                if(array[i]>array[j])
                {
                    t=array[i];
                    array[i]=array[j];
                    array[j]=t;
                    
                }
            }
        }
        for(i=0;i<a;i++)
        {
            System.out.println(array[i]);
        }
    
    }
    void binary(int array[])
    {
        System.out.println("Binary Search"+a);
        System.out.println("Enter the value you want to find");
        int f=Sc.nextInt();
        int no=0;
        int left=0;
        int right=a-1;
        while(left<=right)
        {
        int middle=(left+right)/2;
        if(array[middle]==f)
        {
        no=middle;
        break;
    }
        else if(array[middle]>f)
        {
            right=middle-1;
        }
        else if(array[middle]<f)
        {
            left=middle+1;
        }
    }
    if(no>0)
    {
        
    System.out.println("The value is in array "+no);
}
    else
    {
        System.out.println("The value is not in array.");
    }
    
   
       
        
        
        
    
}
public void main()
{
    datasort dt=new datasort();
    dt.inpdata();
    
    
}
}
