
public class Queue
{
    int st[];
    int cap;
    int f;
    int r;
    Queue(int m)
    {
        cap=m;
        f=0;
        r=0;
        st=new int[cap];
    }
    void pushvalue(int v)
    {
        if(r==(cap))
        {
            System.out.println("Oveflow");
        }
        else
        {
            st[r++]=v;
        }
        
    }
    int popvalue()
    {
        if(f==r)
        {
            return -9999;
        }
        else
        {
            return st[f++];
        }
    }
    void disp()
    {
        if(f==r)
        {
            System.out.println("Queue is empty");
        }
        else
        {
            for(int i=f;i<r;i++)
            System.out.print(st[i]+" ");
        }
        
    }
    
}
