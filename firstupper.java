import java.util.*;
class firstupper
{
    public static void main()
    {
        Scanner Sc=new Scanner(System.in);
        System.out.println("Enter a sentence");
        String a=Sc.nextLine();
        StringTokenizer st=new StringTokenizer(a);
        int l=st.countTokens();
        for(int i=0;i<l;i++)
        {
            String b=st.nextToken();
            int l1=b.length();
            char c=b.charAt(0);
            System.out.print(Character.toUpperCase(c)+b.substring(1,l1)+" ");
        }
    }
}