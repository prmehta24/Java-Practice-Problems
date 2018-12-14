import java.util.*;
class Prac1_StringToken
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Line");
        String s = sc.nextLine();
        System.out.println("Enter a Encoding no");
        int g = sc.nextInt();
        StringTokenizer st = new StringTokenizer(s);
        int a = st.countTokens();
        int i=0,j=0,h=0;
        String t="";
        char c;
        for(i=0 ; i<a ; i++)
        {
            t=st.nextToken();
            for(j=0 ; j<t.length() ; j++)
            {
                c=t.charAt(j);
                if(c=='.')
                System.out.print(c);
                else if((j+1)%2==0)
                System.out.print(c);
                else
                {
                    if((int)c>122-g)
                    {
                        h=(int)c+g-26;
                        System.out.print((char)h);
                    }
                    else
                    {
                        h=(int)c+g;
                        System.out.print((char)h);
                    }
                }
            }
            System.out.print(" ");
        }
    }
}