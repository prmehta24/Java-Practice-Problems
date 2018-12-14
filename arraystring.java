// Enter sentences in
import java.util.*;
public class arraystring
{
    public static void main(String args[])
    {
        Scanner Sc=new Scanner(System.in);
        System.out.println("Enter sentences with a period after them (separated by space)");
        String a=Sc.nextLine(),c=" ";
        StringTokenizer st=new StringTokenizer(a);
        int b=st.countTokens(),d=0,i=0;
        for(i=0;i<b;i++)
        {
             c=st.nextToken();
            if(c.equals("."))
            {
               d++;
            }
             }
        System.out.println("There are "+d+" sentences.");
        String e[]=new String[d];
        for(i=0;i<d;i++)
        {
            e[i]=" ";
         }
        d=0;
        c=" ";
       StringTokenizer St=new StringTokenizer(a);
        for(i=0;i<b;i++)
        {
            c=St.nextToken();
                if(c.equals("."))
            {
                
               d++;
            }
            else
            {
                e[d]=e[d]+" "+c;
              }
                }
                System.out.println("Before:-");
        for(i=0;i<d;i++)
        {
            System.out.println("Sentence "+(i+1)+" : "+e[i]);
           
            
               
           }
           
           for(i=0;i<d;i++)
           {
               if(i%2==0)
               {
                   String z=e[i].toLowerCase(),w="";
                   int x=z.length(),n=0;
                   for(int j=0;j<x;j++)
                   {
                       char v=z.charAt(j);
                       if(v==(' '))
                       {
                           w=w+v;
                        }
                        else
                        {
                       int m=(int)v;
                       
                       if(m>120)
                       {
                        n=-26+m+2;
                    }
                    else
                    {
                         n=m+2;
                    }
                    char s=(char)n;
                    w=w+s;
                    e[i]=w;
                }
                    
                    
                       
                    }
                    
                   
                }
                else
                {
                     String z=e[i];
                    StringBuffer sb=new StringBuffer(z);
                    String y= (sb.reverse()).toString();
                    System.out.println(y);
                    e[i]=y;
                }
            }
            System.out.println("After:- ");
             for(i=0;i<d;i++)
        {
            System.out.println("Sentence "+(i+1)+" : "+e[i]);
           
            
               
           }
        
        
    }
}