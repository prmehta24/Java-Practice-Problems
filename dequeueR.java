import java.util.*;
public class dequeueR
{
    int arr[] = new int[100];
    int lim,front,rear;
    dequeueR(int l)
    {
 lim=l;
front=0;
 rear=0;
  
    }
    void addfront(int val)
    {
if(front>=0)
{
      arr[front]=val;
      front--;
    }
else
System.out.print("\n Overflow from front ");

    }
    void addrear(int val)
    {
if((rear+1)<lim)
{
      rear++;
      arr[rear]=val;
    }
else
System.out.print("\n Overflow from rear ");
    }
    int popfront()
    {
        int val;
if(front!=rear)
{
front++;
val=arr[front++];
return val;
}
else
return -999;
    }
    int poprear()
    {
        int val;
if(front!=rear)
{
    val=arr[rear];
    rear--;
    return val;
}
else
return -999;
}
void display()
{
    if(front!=rear)
    {
    for(int i=front++;i<=rear;i++)
    System.out.print(arr[i]+" ");
}
else
System.out.println("empty");
}
}