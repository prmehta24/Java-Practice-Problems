//  program on circular  queue

public class cqueuep1
{
   int q[]=new int[5];
   int f,r,size,val;
   cqueuep1(int n)
   {
       for(int i=0;i<5;i++)
       q[i]=0;
       f=-1;r=-1;
       size=n;
    }
    void insertqueue(int item)
    {
        if(f==0&&r==size-1||f==r+1)
        System.out.println("queue overflows");
        else
        {
            if(f==-1&&r==-1)
            {
                f=0;
                r=0;
            }
            else
            if(r==size-1)
              r=0;
            else
            r=r+1;
            q[r]=item;
        }
    }
    void deletequeue()
    {
        if(f==-1&&r==-1)
        System.out.println("queue underflow");
        else
        {
            val=q[f];
            if(f==size-1)
            f=0;
            else
            if(f==r)
            {
                f=-1;
                r=-1;
            }
            else
            f=f+1;
        }
    }
    void display()
    {
        System.out.println("elements of queue");
        for(int j=0;j<size;j++)
        System.out.println(q[j]);
    }

public static void main(String args[])
{
    
    cqueuep1 c1=new cqueuep1(5);
    c1.insertqueue(5);
    c1.insertqueue(8);
    c1.insertqueue(12);
    c1.deletequeue();
    
    c1.display();
}
}