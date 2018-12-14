// Sum of entered numbers
import java.util.*;
public class addnumbers
{
    public static void main(String args[])
    {
        Scanner Sc=new Scanner(System.in);
        System.out.println("Enter numbers you want to add with spaces.");
        String a=Sc.nextLine();
        StringTokenizer st=new StringTokenizer(a);
        int l=st.countTokens(),i=0,sum=0;
        for(i=0;i<l;i++)
        {
            String b=st.nextToken();
            sum+=Integer.parseInt(b);
        }
        System.out.println("The sum of the entered numbers :- "+sum);
    }
}