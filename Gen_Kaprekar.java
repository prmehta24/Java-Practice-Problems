import java.util.*;
class Gen_Kaprekar
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a no limit");
        int i = sc.nextInt();
        int t=0,cnt=0,h=0;
        double s1=0,s2=0;
        for(int k=0 ; k<=i ; k++)
        {
            h=(k*k);
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
            System.out.println("Kaprekar no = "+k);
            h=0;
            cnt=0;
            t=0;
            s1=0;
            s2=0;
        }
    }
}