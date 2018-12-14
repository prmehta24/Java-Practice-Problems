import java.util.*;
class Encoding
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a line");
        String a = sc.nextLine();
        System.out.println("Enter a Encoding no");
        int n = sc.nextInt();
        StringTokenizer st = new StringTokenizer(a);
        int s = st.countTokens();
        int i=0,j=0,k=0,b=0;
        String m="",f="",t="";
        char c;
        for(i=0 ; i<s ; i++)
        {
            t=st.nextToken();
            for(j=0 ; j<t.length() ; j++)
            {
                c = t.charAt(j);
                if(Character.isUpperCase(c))
                k=64;
                else if(Character.isLowerCase(c))
                k=96;
                else
                k=0;
                b = ((int)c)-k;
                b = b+n;
                if(b>26)
                b = b-26;
                b = b+k;
                m = m+(char)b;
            }
            f = f+m+" ";
            m="";
        }
        System.out.println("New String = ");
        System.out.println(f);
    }
}