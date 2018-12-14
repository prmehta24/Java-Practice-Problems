import java.util.*;
class seriessum
{
    int x,n;
    double sum,result,result2;
    seriessum(int xx,int nn)
    {
        x=xx;
        n=nn;
    }
    double findfact(int m)
    {
        if(m==1)
        return 1;
         result = findfact(m-1)*m;
        return result;
    }
    double findpower(int x,int y)
    {
       if (y==1)
       return 1;
       result2=findpower(x,y-1)*x;
       return result2;
    }
    void calculate()
    {
        for(int i=2;i<=(2*n);i++)
        {
            if(i%2==0)
            sum+=((findpower(x,i))/(findfact(i-1)));

        }
        
    }
    void display()
    {
        System.out.println("The sum of the series = "+sum);
    }
    public static void main()
    {
        Scanner Sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int a=Sc.nextInt();
        System.out.println("Enter the number of terms");
        int b=Sc.nextInt();
        seriessum ss=new seriessum(a,b);
        ss.calculate();
        ss.display();
        
        
    }
}