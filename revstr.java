import java.util.*;
class revstr
{
    String str,b;
    String revst="";
    Scanner Sc=new Scanner(System.in);
    void getStr()
    {
        System.out.println("Enter a word");
        str=Sc.nextLine();
        int m=str.length();
        b=str;
        
    }
    void reverse()//dont know recursive method
    {
        StringBuffer sb=new StringBuffer(str);
        StringBuffer sb2=new StringBuffer(sb.reverse());
        revst=sb2.toString();
        
    }
    void recReverse(int length)
    {
        length=str.length();
       revst+=str.charAt(length-1);
       System.out.println(revst);
       str=str.substring(0,(length-1));
       System.out.println(str);
       if(str.length()>0)
        recReverse(str.length());
        
        
           
    }
    void check()
    {
        System.out.println(b+" "+revst);
     if(b.equalsIgnoreCase(revst))
     System.out.println("It is a palindrome");
     else
     System.out.println("It  is not a palindrome");
     
     
   }
    
}
