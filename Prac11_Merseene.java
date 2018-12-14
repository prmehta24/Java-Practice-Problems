import java.util.*;
class Prac11_Merseene
{
    static boolean p=false,q=false;
    static int i=0,j=0;
    void check1(int a)
    {
        for(i=0 ; i<=a ; i++)
        {
            if(a==((Math.pow(2,i))-1))
            p=true;
        }
    }
    void check2(int b)
    {
        for(i=0 ; i<=b ; i++)
        {
            if(b==(((Math.pow(2,i))-1)-1))
            q=true;
        }
    }
    void gen1(int c)
    {
        for(i=0 ; i<=c ; i++)
        {
            for(j=0 ; j<=(int)((Math.log(c+1))/(Math.log(2))+1) ; j++)
            {
                if(i==((Math.pow(2,j))-1))
                System.out.println(i);
            }
        }
    }
    void gen2(int d)
    {
        double e=0;
        e = (Math.log(2*(d+1)))/(Math.log(2));
        e = (Math.log(e))/(Math.log(2));
        e = (int)e+1;
        for(i=0 ; i<=d ; i++)
        {
            for(j=0 ; j<=e ; j++)
            {
                if(i==((Math.pow(2,((Math.pow(2,j))-1)))-1))
                System.out.println(i);
            }
        }
    }
    void display()
    {
        if((q==true)&&(p==true))
        System.out.println("Yippeeee ITS MESEENE AS WELL AS DOUBLE MERSEENE");
        if(q==true)
        System.out.println("Yippeeee ITS DOUBLE MERSEENE");
        if(p==true)
        System.out.println("Yippeeee ITS MERSEENE");
        if((q==false)&&(p==false))
        System.out.println("I M SORRY ITS NOTHING");
    }
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        Prac11_Merseene m = new Prac11_Merseene();
        System.out.println("No to be checked");
        int no = sc.nextInt();
        m.check1(no);
        m.check2(no);
        m.display();
        System.out.println("gen1(Merseene) := ");
        int g1 = sc.nextInt();
        m.gen1(g1);
        System.out.println("gen2(Double Merseene) := ");
        int g2 = sc.nextInt();
        m.gen2(g2);
    }
}