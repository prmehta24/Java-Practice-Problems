import java.util.*;
class Prac5_Bank
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome To Our Bank");
        int v=1,cnt=0,cnt2=0,b=0,t=0,ch=0;
        String s1="",s2="";
        while(v==1)
        {
            System.out.println("1) Login");
            System.out.println("2) Exit");
            cnt=sc.nextInt();
            if(cnt==2)
            {
                v=0;
            }
            while(cnt==1)
            {
                System.out.println("Enter username");
                s1 = sc.next();
                System.out.println("Enter password");
                s2 = sc.next();
                if((s1.equals("Arya"))&(s2.equals("131712")))
                cnt2=1;
                else
                {
                    System.out.println("Wrong username or password");
                    cnt2=0;
                    cnt=0;
                }
                while(cnt2==1)
                {
                    System.out.println("1) Deposit");
                    System.out.println("2) Withdrawl");
                    System.out.println("3) Check Balance");
                    System.out.println("4) Log Out");
                    ch = sc.nextInt();
                    switch(ch)
                    {
                        case 1:
                            System.out.println("Enter Deposit Amount");
                            b += sc.nextInt();
                            System.out.println("Final balance = "+b);
                            break;
                        case 2:
                            System.out.println("Enter Deposit Amount");
                            t = sc.nextInt();
                            if(b-t>=0)
                            {
                                b -= t;
                                System.out.println("Final balance = "+b);
                            }
                            else
                            System.out.println("Not Enough Balance");
                            break;
                        case 3:
                            System.out.println("Your current balance = "+b);
                            break;
                        case 4:
                            cnt=0;
                            cnt2=0;
                            break;
                        default:
                            System.out.println("Option not found");
                            System.out.println("Please retry");
                            break;
                    }
                }
            }
        }
		System.out.println("Thank You For Using Our Bank");
	}
}
