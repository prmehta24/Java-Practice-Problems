//programs on stack
public class stackop
{
int s[]=new int[20];
int sp,n;
stackop(int nn)
{
    for(int i=0;i<20;i++)
    s[i]=0;
    sp=-1;
    n=nn;
}
void pushdata(int item)
{if(sp==(n-1))
    System.out.println("stack overflow");
    else
    {
        sp++;
        s[sp]=item;
    }
}
void popdata()
{
    int v;
    if(sp==-1)
    System.out.println("Stack underflow");
    else
    {
        v=s[sp];
        System.out.println("popped out element"+v);
         sp--;
        }
    }
    void display()
    {
        if(sp==-1)
        System.out.println("stack empty");
        else
        {
            System.out.println("SP -----"+s[sp]+"|");
            System.out.println("____");
            for(int i=sp-1;i>=0;i--)
            {
                System.out.println("    |"+s[i]+"|");
                System.out.println("     ____");
            }
        }
    }

public static void main()
{
    stackop s1=new stackop(10);
    s1.pushdata(20);
    s1.pushdata(10);
    s1.pushdata(5);
    s1.popdata();
    s1.display();
}}