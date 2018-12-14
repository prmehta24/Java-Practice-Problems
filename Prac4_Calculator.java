import java.util.*;
class Prac4_Calculator
{
	public static void main(String args[])
	{
	Scanner sc = new Scanner(System.in);
		System.out.println("Hello");
		int cnt=0,a=0,b=0,cnt2=0;
		int ch;
		while(cnt==0)
		{
			while(cnt2==0)
			{
				System.out.println("Enter a");
				a = sc.nextInt();
				System.out.println("Enter b");
				b = sc.nextInt();
				cnt2=1;
			}
			System.out.println("1) Addition");
			System.out.println("2) Subtraction");
			System.out.println("3) Multiplication");
			System.out.println("4) Division");
			ch = sc.nextInt();
			switch(ch)
			{
				case 1:
					System.out.println("Addition = "+(a+b));
					break;
				case 2:
					System.out.println("Subtraction = "+(a-b));
					break;
				case 3:
					System.out.println("Multiplication = "+(a*b));
					break;
				case 4:
					System.out.println("Division = "+(a/b));
					break;
			}
			System.out.println("0 for countinue with diff value");
			System.out.println("1 for countinue with same value");
			System.out.println("2 for exit");
			cnt2 = sc.nextInt();
			if (cnt2==2)
			cnt=1;
		}
		System.out.println("BYE");
	}
}
