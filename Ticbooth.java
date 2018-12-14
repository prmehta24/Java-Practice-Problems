import java.util.*;
class Ticbooth
{
    double rate,amount,no_people,notsold,sold;
    void intial(double amount2,double people2)
    {
        rate=2.5;
        amount=amount2;
        no_people=people2;
    }
    void notsold()
    {
        notsold=no_people-(amount/rate);
        
    }
    void sold()
    {
        sold=(amount/rate);
    }
    void disp_totals()
    {
        System.out.println("The number of visiting people:- "+no_people);
    }
    void disp_tickets()
    {
        System.out.println("The number of ticket buyers(tickets):- "+sold);
        System.out.println("The number of not ticket buyers(visiters only):- "+notsold);
        System.out.println("Accumulated Money:- "+amount);
    }
    public static void main()
    {
        Ticbooth tb=new Ticbooth();
        tb.intial(1578.3,1000.0);
        tb.notsold();
        tb.sold();
        tb.disp_totals();
        tb.disp_tickets();
}
}