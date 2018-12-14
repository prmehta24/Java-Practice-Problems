import java.util.*;
class VowelWord
{
    String str;
    int freq;
    VowelWord()
    {
        str="";
        freq=0;
    }
    void readstr()
    {
        Scanner Sc=new Scanner(System.in);
        System.out.println("Enter a sentence.");
        str=Sc.nextLine();
    }
    void vowel()
    {
        StringTokenizer St=new StringTokenizer(str);
        int l=St.countTokens(),i=0;
        for(i=0;i<l;i++)
        {
            String str2=St.nextToken();
            char a=str2.charAt(0);
            if((a=='a')||(a=='e')||(a=='i')||(a=='o')||(a=='u')||(a=='A')||(a=='E')||(a=='I')||(a=='O')||(a=='U'))
            {
                freq++;
            }
            
        }
        
    }
    void display()
    {
        System.out.println("The sentence is :- "+str);
        System.out.println("The number of words starting with vowels are :- "+freq);
    }
public static void main()
{
    VowelWord vw=new VowelWord();
    vw.readstr();
    vw.vowel();
    vw.display();
}
}