class selectionsort
{
    public static void main(int x[])
    {
       for(int i=0;i<x.length-1;i++)
       {
           int min=i;
           for(int j=i+1;j<x.length;j++)
           {
               if(x[j]>x[min])
               min=j;
            }
            int t=x[i];
            x[i]=x[min];
            x[min]=t;
            
            for(int z=0;z<x.length;z++)
            {
                System.out.print(x[z]+" ");
            }
            System.out.println();
        }
    }
}