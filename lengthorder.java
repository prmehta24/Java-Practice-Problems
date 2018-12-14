import java.util.*;
class lengthorder
{
    public static void main()
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
                if(b[i].length()>b[j].length())
                {
                    t=b[i];
                    b[i]=b[j];
                    b[j]=t;
                    
                }
            }
        }
        System.out.println("The sentence in length order:-");
        for(i=0;i<l;i++)
        {
            System.out.print(b[i]+" ");
        }
        
    }
}