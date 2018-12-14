import java.util.*;
 class rseries
 {
     double sum,a,b;
     int c;
     
        double calc2(double a,double b, int c)
        {
            if(c<10)
            sum+=(a/b)+calc2((a-1),(b-1),(c+1));
            return sum;
        }
        public static void main()
     {
         Scanner Sc=new Scanner(System.in);
         System.out.println("Enter a no for series");
         int n=Sc.nextInt();
         rseries s=new rseries();
         double total=s.calc2(((double)(n-1)),((double)(n+10)),0);
         System.out.println("total= "+total);
        }
    }