import java.util.*;
class happy
{
    int n,sum,result;
    
    happy()
    {
        n=0;
        sum=0;
        result=0;
    }
    void getnum(int nn)
    {
        n=nn;
    }
    int sqd(int x)
    {
        if((x>=0)&&(x<=9))
        return x*x;
        else
        return sqd((sqd(x%10))+(sqd(x/10)));
        }
        void ishappy()
    {
        if(sqd(n)==1)
        System.out.println(n+" is a happy no");
        else 
        System.out.println(n+" is not a happy no");
    }
    public static void main()
    {
        Scanner Sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int a=Sc.nextInt();
        happy h=new happy();
        h.getnum(a);
        h.ishappy();
    }
    
    
}