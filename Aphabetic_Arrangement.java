// Letters in word in alphabetical order
import java.util.*;
public class Aphabetic_Arrangement
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a word");
        String a = sc.nextLine();
        int i=0,j=0,l=a.length();
        int b[] = new int[l];
        int t;
        for(i=0 ; i<l ; i++)
        b[i] = (int)a.charAt(i);
        for(i=0 ; i<l-1 ; i++)
        {
            for(j=i+1 ; j<l ; j++)
            {
                if(b[i]>b[j])
                {
                    t = b[i];
                    b[i] = b[j];
                    b[j] = t;
                }
            }
        }
        for(i=0 ; i<l ; i++)
        System.out.println((char)b[i]);
    }
}