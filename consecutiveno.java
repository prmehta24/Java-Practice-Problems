import java.util.*;
class consecutiveno
{
    public static void main()
    {
        Scanner Sc=new Scanner(System.in);
        System.out.println("Enter the range.(one by one no.)");
        int a=Sc.nextInt();
        int b=Sc.nextInt(),max,i,n,sum,r,c=0,s,j=0,k=0;
        System.out.println("Magic Numbers:-");
       if(a>b)
       max=a;
       else
       max=b;
       for(i=a;i<=b;i++)
       {s=0;
           for(j=1;j<=i;j++)
           for(j=1;j<=i;j++)
           {
               s+=j;
               if(s==i)
               {
                   c++;
                   for(k=1;k<=j;k++)
                   {
                       System.out.print("+"+k);
                    }
                    System.out.println("="+s);
                }
               
            }
            
        }
        System.out.println("There are "+c+" numbers in this range of the sum of its consecutive digit");
        }
        
    }
