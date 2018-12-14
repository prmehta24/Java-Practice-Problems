import java.util.*;
 class worddigit
 {
     public static void main()
     {
         Scanner Sc=new Scanner(System.in);
         System.out.println("Enter a number");
         int no=Sc.nextInt();
        int no3=no,digit=0,no2=0;
        while(no3>0)
        {
            no2=(no2*10)+(no3%10);
            no3=no3/10;
            System.out.println("no2= "+no2);
        }
        System.out.println("no2= "+no2);
        while(no2>0)
        {
           digit=no2%10;
            
            switch(digit)
            {
                case 0:
                System.out.print(" Zero ");
                break;
                case 1:
                System.out.print(" One ");
                break;
                case 2:
                System.out.print(" Two ");
                break;
                case 3:
                System.out.print(" Three ");
                break;
                case 4:
                System.out.print(" Four ");
                break;
                case 5:
                System.out.print(" Five ");
                break;
                case 6:
                System.out.print(" Six ");
                break;
                case 7:
                System.out.print(" Seven ");
                break;
                case 8:
                System.out.print(" Eight ");
                break;
                case 9:
                System.out.print(" Nine ");
                break;
                default:
                System.out.print(" Error-Not a valid number(1-9) ");
                break;
            }
            no2=no2/10;
        }
        }
    }