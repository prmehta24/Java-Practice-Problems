// Words in sentence in alphabetical order
import java.util.*;
public class alphabetorder
{
    public static void main(String args[])
    {
        Scanner Sc=new Scanner(System.in);
       System.out.println("Enter a sentence.");
       String a=Sc.nextLine(),t;
       StringTokenizer st=new StringTokenizer(a);
       int l=st.countTokens(),i,j;
       String b[]=new String[l];
       for(i=0;i<l;i++)
       {
           b[i]=st.nextToken();
        }
        for(i=0;i<l;i++)
        {
            for(j=i+1;j<l;j++)
            {
                if(b[i].compareTo(b[j])>0)
                {
                    t=b[i];
                    b[i]=b[j];
                    b[j]=t;
                    
                }
            }
        }
        System.out.println("The sentence in alphabetical order:-");
        for(i=0;i<l;i++)
        {
            System.out.print(b[i]+" ");
        }
        
    }
}