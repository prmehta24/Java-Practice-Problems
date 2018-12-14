
public class Dequeue2test
{
    int arr[] = new int[100];
    int lim,front,rear;
    Dequeue2test(int l)
    {
 lim=l;
front=0;
 rear=0;
  arr=new int[lim];
    }
    void addfront(int val)
    {
if(front>0)
      arr[--front]=val;
else
System.out.print("\n Overflow from front ");

    }
    void addrear(int val)
    {
if(rear<=lim-1)
      arr[rear++]=val;
else
System.out.print("\n Overflow from rear ");
    }
    int popfront()
    {
if(front!=rear)
return arr[front++];
else
return -9999;
    }
    int poprear()
    {
if(front!=rear)
return arr[--rear];
else
return -9999;
}
void display()
{
    for(int i=(front);i<rear;i++)
    System.out.print(arr[i]+" ");
}
}