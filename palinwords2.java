import java.util.*;
class palinwords2
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
            String sum="",r="";
             String s=St.nextToken();
            int c=s.length();
            int j=0;
            for(j=c-1;j>=0;j--)
            {
                sum=sum+s.charAt(j);
            }
             
           
            if(sum.equalsIgnoreCase(s))
            {
                System.out.println(s);
            d++;
        }
            
         }
         System.out.println("Number of palindromes are "+d);
    }
}