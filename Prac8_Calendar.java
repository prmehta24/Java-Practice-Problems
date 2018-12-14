import java.util.*;
class Prac8_Calendar
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a day");
        int d=0,sum=0,i=0,sum1=0;
        double sum0=0;
        d = sc.nextInt();
        System.out.println("Enter a year");
        int y = sc.nextInt();
        int t[] = {31,28,31,30,31,30,31,31,30,31,30,31};
        String month[] = {"January","February","March","April","May","June","July","August","September","October","November","December"};
        String day[] = {"Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};
        if(y%4==0)
        t[1]=29;
        for(i=0 ; i<12 ; i++)
        {
            if((d>sum)&&(d<=(sum+t[i])))
            break;
            else
            sum += t[i];
        }
        d = d-sum;
        sum0 = (y-1)*365.25+sum+d;
        sum1 = (int)sum0;
        sum1 = sum1%7;
        System.out.println(day[sum1]+" ,"+d+" "+month[i]+" ,"+y);
    }
}