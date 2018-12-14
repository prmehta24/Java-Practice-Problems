import java.util.*;
class conversion
{
    public static void main()
    {
        Scanner Sc=new Scanner(System.in);
        System.out.println("Enter a decimal number.");
        long d=Sc.nextInt();
        long r=d;
        String sum="";
        System.out.println("Choose your conversion:-");
        System.out.println("Hexadecimal-1");
        System.out.println("Octal-2");
        System.out.println("Binary-3");
        int b=Sc.nextInt();
        switch(b)
        {
            case 1:
            {
        while(r>0)
        {
           long remainder=r%16;
           System.out.println(remainder);
           
           if((remainder>=0)&&(remainder<=9))
           {
               sum=remainder+sum;
            }
            else if(remainder==10)
            {
                 sum="A"+sum;
                
            }
            else if(remainder==11)
            {
                sum="B"+sum;
            }
            else if(remainder==12)
            {
                 sum="C"+sum;
            }
            else if(remainder==13)
            {
                 sum="D"+sum;
            }
            else if(remainder==14)
            {
                 sum="E"+sum;
            }
            else if(remainder==15)
            {
                sum="F"+sum;
            }
            r=r/16;
        }
        System.out.println("The hexadeciml number :- "+sum);
    }
    break;
    case 2:
    {
        while(r>0)
        {
           long remainder=r%8;
           System.out.println(remainder);
           
           if((remainder>=0)&&(remainder<=7))
           {
               sum=remainder+sum;
            }
            
            r=r/8;
        }
        System.out.println("The octal number :- "+sum);
    }
    break;
    case 3:
    {
        while(r>0)
        {
           long remainder=r%2;
           System.out.println(remainder);
           
           if((remainder>=0)&&(remainder<=1))
           {
               sum=remainder+sum;
            }
            
            r=r/2;
        }
        System.out.println("The binary number :- "+sum);
    }
    break;
    default:
    System.out.println("Wrong option.");
    }
    }
}