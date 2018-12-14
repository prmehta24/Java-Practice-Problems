import java.util.*;
class changetoken2
{
    public static void main()
    {
        Scanner Sc=new Scanner(System.in);
        System.out.println("Enter a sentence");
        String a=(Sc.nextLine()).toLowerCase();
       StringTokenizer st=new StringTokenizer(a);
       int le=st.countTokens();
       String x="";String x1="";
       String q[]=new String[le];
       for(int i=0;i<le;i++)
       {
           q[i]="";
           q[i]=st.nextToken();
        }
        
       
       
       
       for(int i=0;i<le;i++)
       {
           System.out.println(i);
         String a1=q[i];
         
       int l=a1.length();
        String b="";
       for( int f=0;f<l;f++)
       {char c=a1.charAt(f);
           if((c=='a')||(c=='e')||(c=='i')||(c=='o')||(c=='u')||(c=='.')||(c=='!')||(c=='?'))
           {
               
            }
            else
            b+=c;
            
        }
        String c="";
        x+=b+" ";
        int l1=b.length();
        
        String z[]=new String[l1];
       
        for( int g=0;g<l1;g++)
        {
            z[g]="";
            z[g]+=b.charAt(g);
        }
        
        for( int h=0;h<l1;h++)
        {
            
            for(int j=h+1;j<l1;j++)
            {
                
                String t="";
                
                if(z[h].compareTo(z[j])>0)
                {
                    
                    t=z[h];
                    z[h]=z[j];
                    z[j]=t;
                    
                }
                
            }
        }
        
        
        for( int k=0;k<l1;k++)
        {
           c+=z[k];
        }
        
        x1+=c+" ";
       
    }
    System.out.println("Without Vowels: "+x);
    System.out.println("Alphabetical Order: "+x1);
        
        
        
        
        
    }
}