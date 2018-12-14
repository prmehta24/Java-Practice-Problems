import java.util.*;
class descendingorder
{
    public static void main()
    {
        Scanner Sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int a=Sc.nextInt();
        System.out.println("Enter another number");
        int b=Sc.nextInt();
        if(a>b)
        {
            System.out.println(a+">"+b);
        }
        
        
        else if(b>a)
        {
            System.out.println(b+">"+a);
        }
        
        else if(a==b)
        {
            System.out.println(a+"="+b);

    }
}
}