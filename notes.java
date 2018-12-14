import java.util.*;
class notes
{
    public static void main()
    {
        Scanner Sc=new Scanner(System.in);
        System.out.println("Enter the value of money.");
        int a=Sc.nextInt(),j=0,r=0;
        int i[]={1000,500,100,50,20,10,5,2,1};
        for(j=0;j<i.length;j++)
        {
            r=a/i[j];
            if(r!=0)
            {
                System.out.println("There are  "+r+" "+i[j]+" rupee notes.");
            }
            a=a%i[j];
        }
    }
}