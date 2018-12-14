import java.util.*;
class library

{
    String name,author;
    float p,d,f;
    library(String nam,String autho,float days,float price)
    {
        name=nam;
        author=autho;
        d=days;
        p=price;
        f=0;
    }
    void fine()
    {
        if(d<=7)
        {
            f=((((float)(2.0f/100.0f)*p)*d));
        }
        if(d>7)
        {
            if(((d-7)>=1)&&((d-7<=5)))
            {
                f=(((float)(2.0f/100.0f)*p)*d)+2.00f;
            }
            else if(((d-7)>=6)&&((d-7<=10)))
            {
                f=(((float)(2.0f/100.0f)*p)*d)+3.00f;
            }
            if(((d-7)>=10))
            {
                f=(((float)(2.0f/100.0f)*p)*d)+5.00f;
            }
        }
    }
    void display()
    {
        System.out.println("Book Name :- "+name);
        System.out.println("Book author :- "+author);
        System.out.println("Book price :- "+p);
        System.out.println("Days book was kept :- "+d);
        System.out.println("Rent on book :- "+f);
    }
    
}