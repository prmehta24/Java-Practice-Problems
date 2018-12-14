import java.util.*;
class Inventory
{
    String product;
    double qty;
    double rate;
    double amt;
    Inventory(String p,double q,double r)
    {
        product=p;
        qty=q;
        rate=r;
        amt=rate*qty;
    }
    void display()
    {
        System.out.println("Product: "+product);
        System.out.println("Quantity: "+qty);
        System.out.println("Rate: "+rate);
        System.out.println("Amount: "+amt);
    }
    
}
public class Sale extends Inventory
{
    double sqty;
    double srate;
    Sale(String p,double q,double r,double q2,double r2)
    {
        super(p,q,r);
        sqty=q2;
        srate=r2;
    }
    void update()
    {
        rate=srate;
        qty=qty-sqty;
        amt=rate*qty;
    }
    void display()
    {
        super.display();
    }
   
}
 class Test
{
    public static void main()
    {
    }
}