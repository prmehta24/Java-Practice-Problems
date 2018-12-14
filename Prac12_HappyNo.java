import java.util.*;
class Prac12_HappyNo
{
    static int n;
    Prac12_HappyNo()
    {
        n=0;
    }
    void getnum(int nn)
    {
        n=nn;
    }
    static int sumsqdigit(int x)
    {
        if((x>0)&&(x<=9))
        return x;
        else
        return(sumsqdigit( x%10+sumsqdigit(x/10)));
    }
    void ishappy(int num)
    {
        if(num==1)
        System.out.println("Number is happy");
        else
        System.out.println("Number is sad");
    }
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter value");
        int j=0;
        Prac12_HappyNo obj=new Prac12_HappyNo();
        obj.getnum(sc.nextInt());
        j= sumsqdigit(n);
        obj.ishappy(j);
    }
}
