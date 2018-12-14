import java.util.*;
class vowelwords
{
    public static void main()
    {
        Scanner Sc=new Scanner(System.in);
        System.out.println("Enter a sentence.");
        String a=Sc.nextLine().toLowerCase();
        StringTokenizer St=new StringTokenizer(a);
        int n=St.countTokens(),d=0,i=0;
        
        System.out.println(" Words starting with vowels:-");
        for(i=1;i<=n;i++)
        { 
            String sum="",r="";
             String s=St.nextToken();
           char c=s.charAt(0);
           if((c=='a')||(c=='e')||(c=='i')||(c=='o')||(c=='u'))
           {
               d++;
               System.out.println(s);
            }
            
        }
            System.out.println("Words starting with vowels are  "+d);
         }
         
    }
