import java.util.*;
class FindWord
{
    public static void main()
{
    String str;
    int freq;
    str="";freq=0;
   Scanner Sc=new Scanner(System.in);
   System.out.println("Enter a sentence.");
   str=Sc.nextLine();
   System.out.println("Enter the word you want to find. ");
   String str3=Sc.nextLine();
  StringTokenizer St=new StringTokenizer(str);
  int l=St.countTokens(),i=0;
  for(i=0;i<l;i++)
     {
            String str2=St.nextToken();
            
            if(str3.equalsIgnoreCase(str2))
            {
                freq++;
            }
            
       }
        System.out.println("The sentence is :- "+str);
        System.out.println("The number of '"+str3+"' words are :- "+freq);
    

    
}
}