
public class Dequeue2
{
    int arr[] = new int[100];
    int lim,front,rear;
    Dequeue2(int l)
    {
 lim=l;
front=-1;
 rear=-1;
  arr=new int[lim];
    }
    void addfront(int val)
    {
if(front>=0)
      arr[front--]=val;
else
System.out.print("\n Overflow from front ");

    }
    void addrear(int val)
    {
if(rear<lim-1)
      arr[++rear]=val;
else
System.out.print("\n Overflow from rear ");
    }
    int popfront()
    {
if(front!=rear)
return arr[++front];
else
return -9999;
    }
    int poprear()
    {
if(front!=rear)
return arr[rear--];
else
return -9999;
}
void display()
{
    for(int i=(front+1);i<=rear;i++)
    System.out.print(arr[i]+" ");
}
}