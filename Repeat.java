
public class Repeat
{
    int st[]=new int[100];
    int cap;
    int f;
    int r;
    public Repeat(int m)
    {
        cap=m;
        f=0;
        r=0;
        st=new int[cap];
    }
    public void pushvalue(int v)
    {
        if((r+1)<=(cap))
        {
          st[r++]=v;
        }
        else
        {
             System.out.println("Oveflow");
        }
        
    }
    int popvalue()
    {
        int v;
        if(f!=r)
        {
            v=st[f++];
            return v;
        }
        else
        {
            return -9999;
        }
    }
    void disp()
    {
        if(f!=r)
        {
            for(int i=f;i<r;i++)
            System.out.print(st[i]+" ");
            
        }
        else
        {
            System.out.println("Queue is empty");
        }
        
    }
    
}

