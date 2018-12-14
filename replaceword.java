import java.util.*;
class replaceword
{
    public static void main()
    {
        Scanner Sc=new Scanner(System.in);
        System.out.println("Enter a sentence");
        String a=Sc.nextLine();
        System.out.println("Enter the word you want to replace");
        String b=Sc.nextLine();
        System.out.println("Enter the word you want as a replacement");
        String c=Sc.nextLine();
        StringTokenizer st=new StringTokenizer(a);
        int l=st.countTokens();
        for(int i=0;i<l;i++)
        {
            String d=st.nextToken();
            if(d.equals(b))
            {
                System.out.print(c+" ");
            }
            else
            {
                System.out.print(d+" ");
            }
            
            
        }
    }
}