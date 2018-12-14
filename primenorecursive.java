import java.util.*;

class primenorecursive
{
    void calling(int x)
    {
        long begin=new Date().getTime();
       
        int n=x;
        int f=2;
        int a=show(n,f);
        System.out.println(a);
        long end=new Date().getTime();
        System.out.println(begin);
        System.out.println(end);
    }
    int show(int n,int f)
    {
        if(n==f)
        return 1;
        if(n%f==0||n==1)
        return 0;
        else
        return show(n,f+1);
    }
}