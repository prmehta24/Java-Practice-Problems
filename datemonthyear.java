import java.util.*;
class datemonthyear
{
    public static void main()
    {
        int month[]={31,28,31,30,31,30,31,31,30,31,30,31};
        String weekdays[]={"Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};
        String monthname[]={"January","February","March","April","May","June","July","August","September","October","November","December"};
        Scanner Sc=new Scanner(System.in);
        System.out.println("Enter the year(4 digits)");
        int year=Sc.nextInt();
        if(year%4==0)
        month[1]=29;
        System.out.println("Enter the day number(out of 365)");
        int day=Sc.nextInt();
        int e=day,j=0,m=-1;
        while(e>0)
        {
            e-=month[j];
            j++;
            m++;
        }
        System.out.println("m="+m);
        int d=day;
        if(m>0)
        {
        for(int i=0;i<m;i++)
        {
            d-=month[i];
        }
    }
        System.out.println(weekdays[day%7]+", "+d+" "+monthname[m]+","+year);
        
        }
    }