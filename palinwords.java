import java.util.*;
class palinwords
{
    public static void main()
    {
        Scanner Sc=new Scanner(System.in);
        System.out.println("Enter a sentence.");
        String a=Sc.nextLine();
        StringTokenizer St=new StringTokenizer(a);
        int n=St.countTokens(),d=0,i=0;
        System.out.println("Palindrome Words:-");
        for(i=1;i<=n;i++)
        { 
            
             String s=St.nextToken();
             StringBuffer s1=new StringBuffer(s);
             
            s1= s1.reverse();
            String r=s1.toString();
             
           
            if(s.equalsIgnoreCase(r))
            {
                System.out.println(s);
            d++;
        }
            
         }
         System.out.println("Number of palindromes are "+d);
    }
}
