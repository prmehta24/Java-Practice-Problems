import java.util.*;
class removekumar
{
    public static void main()
    {
        Scanner Sc=new Scanner(System.in);
        System.out.println("Enter a full name");
        String a=Sc.nextLine();
        String c="";
        StringTokenizer st=new StringTokenizer(a);
        int l=st.countTokens();
        for(int i=0;i<l;i++)
        {
            String b=st.nextToken();
            if((b.toLowerCase()).equals("kumar"))
            {
            }
            else
            c+=b+" ";
        }
        
        System.out.println("The modified sentence:- "+c);
    }
}