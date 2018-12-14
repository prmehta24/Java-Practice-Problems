import java.util.*;
class letters
{
    public static void main()
    {
        Scanner Sc=new Scanner(System.in);
        System.out.println("Enter a sentence.");
        String a=Sc.nextLine();
        int l=a.length();
        int i=0;
        int c=0;
        System.out.println("-------------------------------------------------");
        System.out.println("Your options:-");
        System.out.println("1-Count Vowels");
        System.out.println("2-Count Uppercase letters");
        System.out.println("3-Count Lowercase letters");
        System.out.println("--------------------------------------------------");
        System.out.println("Enter your choice.");
        int b=Sc.nextInt();
        switch(b)
        {
            case 1:
            {
                for(i=0;i<l;i++)
                {
                    char ch=a.charAt(i);
                    if((ch=='a')||(ch=='e')||(ch=='i')||(ch=='o')||(ch=='u')||(ch=='A')||(ch=='E')||(ch=='I')||(ch=='O')||(ch=='U'))
                    c++;
                }
                System.out.println("Number of Vowels:- "+c);
                
            }
            break;
            case 2:
            {
                for(i=0;i<l;i++)
                {
                    char ch=a.charAt(i);
                    if(Character.isUpperCase(ch))
                    c++;
                }
                System.out.println("Number of UpperCase Letters:- "+c);
            }
            break;
            case 3:
            {
                for(i=0;i<l;i++)
                {
                    char ch=a.charAt(i);
                    if(Character.isLowerCase(ch))
                    c++;
                }
                System.out.println("Number of LowerCase Letters:- "+c);
            }
            break;
            default:
            System.out.println("Invalid option.Program will be terminated");
            break;
        }
        
        
    }
}