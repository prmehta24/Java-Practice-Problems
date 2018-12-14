import java.util.*;
class Prac6_Kaprekar
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a no");
        int k = sc.nextInt();
        int t=0,cnt=0,h=(k*k);
        double s1=0,s2=0;
        while(h>0)
        {
            h/=10;
            cnt++;
        }
        h=(k*k);
        t=(int)cnt/2;
        s1=h%(Math.pow(10,(cnt-t)));
        s2=(h-s1)/(Math.pow(10,(cnt-t)));
        if(s1+s2==k)
        System.out.println("Kaprekar no");
        else
        System.out.println("Not Kaprekar no");
    }
}