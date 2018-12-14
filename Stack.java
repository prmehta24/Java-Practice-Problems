import java.util.*;
class Stack
{
    String st[];
    int size;
    int top;
    int ctr;
    Stack()
    {
        size=0;
        top=0;
        ctr=0;
        st=new String[size];
        
    }
    Stack(int cap)
    {
        top=-1;
        size=cap;
        ctr=0;
        st=new String[size];
    }
    void pushname(String n)
    {
        if((ctr)==size)
        System.out.println("overflow");
        else
        {
            System.out.println("Entering "+n+" at the top of stack");
            st[top+1]=n;
            top+=1;
            ctr+=1;
            System.out.println("Stack:-"+ctr+" "+top);
            for(int i=0;i<ctr;i++)
        {
            System.out.print(st[i]+" ");
        }
        }
    }
    void popname()
    {
        if(ctr==0)
        {
            System.out.println("Underflow");
        }
        else
        {
            System.out.println("Removing "+st[top]+" from the top of stack");
            top-=1;
            ctr-=1;
            System.out.println("Stack:-"+ctr+" "+top);
            for(int i=0;i<ctr;i++)
        {
            System.out.print(st[i]+" ");
        }
        }
    }
    void display()
    {
        for(int i=0;i<ctr;i++)
        {
            System.out.print(st[i]+" ");
        }
    }
}