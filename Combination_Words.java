import java.util.*;
class Combination_Words
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a n letter word");
        String a = sc.next();
        int i=0,j=0,k=0,n=a.length();
        char c[] = new char[n];
        int b[] = new int[n];
        String m="";
        for(i=0 ; i<n ; i++)
        {
            c[i] = a.charAt(i);
            b[i] = 0;
        }
        System.out.println("Arranged word are = ");
        int g=(int)Math.pow(n,n);
        for(i=0 ; i<g ; i++)
        {
            k=0;
            b[0]++;
            for(j=0 ; j<n-1 ; j++)
            {
                if(b[j]>=n)
                {
                    b[j] = b[j]-n;
                    b[j+1]++;
                }
            }
            if(b[n-1]>=n)
            break;
            for(i=0 ; i<n-1 ; i++)
            {
                for(j=i+1 ; j<n ; j++)
                {
                    if(b[i]==b[j])
                    k=1;
                }
            }
            if(k==1)
            continue;
            for(j=n-1 ; j>=0 ; j--)
            System.out.print(c[b[j]]);
            System.out.println();
            
        }
    }
}