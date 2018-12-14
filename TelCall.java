import java.util.*;
class TelCall
{
    long phno,n;
    double amt;
    String name;
    TelCall(String name2,long phno2,long n2)
    {
        amt=0.0D;
        phno=phno2;
        n=n2;
        name=name2;
    }
    void compute()
    {
        if((n>=1)&&(n<=100))
        amt=500;
        else if((n>=101)&&(n<=200))
        amt=(n*1)+500;
        else if((n>=201)&&(n<=300))
        amt=(n*1.2)+500;
        else if(n>=301)
        amt=(n*1.5)+500;
        
    }
    void dispdata()
    {
        System.out.println("Phone Number\tName\tNo of Calls\tAmount");
        System.out.println(phno+"\t"+name+"\t"+n+"\t"+amt);
    }
    public static void main()
    {
        TelCall tc=new TelCall("Parimal",9428245904L,245);
        tc.compute();
        tc.dispdata();
    }
}