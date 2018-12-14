import java.util.*;
class Stock
{
    String title,author,publisher;
    long noc,price,pric;
    Stock(String t,String a,String p,long no, long pr)
    {
        title=t;
        author=a;
        publisher=p;
        noc=no;
        price=pr;
        
    }
    void check(String tit, String auth, int n)
    {
        pric=0;
        if((title.equalsIgnoreCase(tit))&&(author.equalsIgnoreCase(auth)))
        {
            if(noc>n)
            {
                System.out.println("E");
            noc=noc-n;
            pric=n*price;
            
            
        }
        else
{
        System.out.println("There is not enough stock.");
        pric=0;
    }
}
        else
        {
        System.out.println("There is no stock.");
        pric=0;
         
    }
   
        }
    
    void disp()
    {
        System.out.println("Title:- "+title);
        System.out.println("Author:- "+author);
        System.out.println("Publisher:- "+publisher);
        System.out.println("Unit Price :- "+price);
        System.out.println("Total Amount:- "+pric);
        System.out.println("Remaining stock:- "+noc);
    }
    public static void main()
    {
        Stock s=new Stock("Bible","Jesus","Christian Church",10,100);
        s.check("Bible","Jesus",5);
        s.disp();
    }
}
