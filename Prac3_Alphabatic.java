import java.util.*;
class Prac3_Alphabatic
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a line");
        String s = sc.nextLine();
        StringTokenizer st = new StringTokenizer(s);
        int a = st.countTokens();
        String s1[] = new String[a];
        String t="";
        for(int i=0 ; i<a ; i++)
        {
            s1[i] = st.nextToken();
        }
        for(int i=0 ; i<a ; i++)
        {
            for(int j=i+1 ; j<a; j++)
            {
                if(s1[i].compareTo(s1[j])>0)
                {
                    t=s1[i];
                    s1[i]=s1[j];
                    s1[j]=t;
                }
            }
        }
        System.out.println("The Arranged string is = ");
        for(int i=0 ; i<a ; i++)
        {
            System.out.print(s1[i]+" ");
        }
    }
}