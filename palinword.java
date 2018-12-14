import java.util.*;
class palinword
{
    public static void main()
    {
        Scanner Sc=new Scanner(System.in);
        System.out.println("Enter a sentence");
        String str=Sc.nextLine(),str2="",str3="";
        StringTokenizer st=new StringTokenizer(str);
        int l=st.countTokens(),c=0,i=0,j=0;
        System.out.println("Palindrome Words:- ");
        for(i=0;i<l;i++)
        {
            str3="";
             str2=st.nextToken();
            int l2=str2.length();
            
            for(j=l2-1;j>=0;j--)
            {
                 str3=str3+str2.charAt(j);
            }
            
            if(str2.equalsIgnoreCase(str3))
            {
                c++;
            System.out.println(str2);
        }
        
        }
        System.out.println("The number of palindrome words are "+c);
    }
}