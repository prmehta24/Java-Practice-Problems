import java.util.*;
class changetoken
{
    public static void main()
    {
        Scanner Sc=new Scanner(System.in);
        System.out.println("Enter a word");
        String a=(Sc.nextLine()).toLowerCase();
       int l=a.length();
       String b="";
       for(int i=0;i<l;i++)
       {char c=a.charAt(i);
           if((c=='a')||(c=='e')||(c=='i')||(c=='o')||(c=='u')||(c=='.')||(c=='!')||(c=='?'))
           {
               
            }
            else
            b+=c;
            
        }
        String c="";
        System.out.println("Remove vowels: "+b);
        int l1=b.length();
        String z[]=new String[l1];
        for(int i=0;i<l1;i++)
        {
            z[i]="";
            z[i]+=b.charAt(i);
        }
        for(int i=0;i<l1;i++)
        {
            for(int j=i+1;j<l1;j++)
            {
                
                String t="";
                if(z[i].compareTo(z[j])>1)
                {System.out.println("Check");
                    t=z[i];
                    z[i]=z[j];
                    z[j]=t;
                    
                }
            }
        }
        
        for(int i=0;i<l1;i++)
        {
           c+=z[i];
        }
        System.out.println("Alphabetical Order: "+c);
        
        
        
        
        
    }
}