import java.util.*;
class Prac11_Merseen
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
    
    void display()
    {
        if(p==true)
        System.out.println("Yippeeee ITS MESEENE ");
    }
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        Prac11_Merseene m = new Prac11_Merseene();
        System.out.println("No to be checked");
        int no = sc.nextInt();
        m.check1(no);
        
        m.display();
        
    }
}