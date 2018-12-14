import java.util.*;
class Prac1_CircularNO
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        int cnt=0,t=n,i=0,j=0;
        while(t>0)
        {
            t=t/10;
            cnt++;
        }
        boolean a=true;
        int N[]=new int[cnt];
        N[0]=n;
        for(i=1 ; i<cnt ; i++)
        {
            t=N[i-1]%10;
            N[i]=((int)(t*(Math.pow(10,(cnt-1)))))+((int)N[i-1]/10);
        }
        System.out.println("Circular numbers are  =");
        for(i=0 ; i<cnt ; i++)
        {
            System.out.println(N[i]);
        }
        for(i=0 ; i<cnt ; i++)
        {
            for(j=2 ; j<N[i] ; j++)
            {
                if(N[i]%j==0)
                {
                    i=cnt;
                    a=false;
                    break;
                }
            }
        }
        if(a==true)
        System.out.println(n+" IS A CIRCULAR PRIME");
        else
        System.out.println(n+" IS NOT A CIRCULAR PRIME");
    }
}