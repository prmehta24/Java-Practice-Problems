import java.util.*;
class Combine
{

    int size;
    int com[];
    Combine(int nn)
    {
        size=nn;
        com = new int[size];
        for(int i=0;i<size;i++)
           com[i]=0;
    }
    void inputarray()
    {
        Scanner Sc=new Scanner(System.in);
        System.out.println(size);
        for(int i=0;i<size;i++)
        {
            System.out.println("Enter array element "+(i+1));
            if (Sc != null )
                com[i]=Sc.nextInt();
            else
                System.out.println("null");
        }
    }
    void sort()
    {
        for(int i=0;i<(size-1);i++)
        {
            int min=i;
            for(int j=i+1;j<size;j++)
            {
                if(com[j]<com[min])
                min=j;
                
            }
            int t=com[i];
            com[i]=com[min];
            com[min]=t;
        }
    }
    void mix(Combine A,Combine B)
    {
        int l1=A.com.length;
        int l2=B.com.length;
        
        int k=0;
        for(int i=0;i<l1;i++)
        {
            com[k]=A.com[i];
            k++;
        }
        for(int i=0;i<l2;i++)
        {
            com[k]=B.com[i];
            k++;
        }
        
    }
    void display()
    {
       for(int i=0;i<com.length;i++)
       {
           System.out.print(com[i]+" ");
        }
        System.out.println();
    }
    public static void main(int a,int b)
    {
        Combine obj=new Combine(a);
        System.out.println(obj.com.length);
        Combine obj1=new Combine(b);
        System.out.println(obj1.com.length);
        Combine objm=new Combine((a+b));
        System.out.println(objm.com.length);
        obj.inputarray();
        obj1.inputarray();
        objm.mix(obj,obj1);
        objm.sort();
        objm.display();
        
        
        
        
        
    }
}