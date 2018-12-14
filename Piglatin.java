import java.util.*;
class Piglatin
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a word");
        String a = sc.nextLine();
        int i=0,j=0,l=a.length();
        String m="",f="";
        char c;
        boolean b=true;
        for(i=0 ; i<l ; i++)
        {
            c = a.charAt(i);
            if((c=='a')||(c=='e')||(c=='i')||(c=='o')||(c=='u'))
            b=false;
            if(b==true)
            f = f+c;
            if(b==false)
            m=m+c;
        }
        System.out.println("New String = ");
        System.out.println(m+f+"ay");
    }
}