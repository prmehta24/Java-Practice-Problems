import java.util.*;
class printjob
{
    Scanner Sc=new Scanner(System.in);
    int job[]=new int[20];;
    int newjob;
    int capacity;
    int front;
    int rear;
    printjob()
    {
        capacity=20;
        front=rear=-1;
        
    }
    void createjob()
    {
      for(int i=0;i<job.length;i++)
      {
          job[i]=0;
        }
        for(int i=0;i<job.length;i++)
      {
          System.out.println("Array element "+(i+1));
          System.out.println(job[i]);
        }
        
    }
    void removeJob()
    {
        if(job[0]!=0)
        job[0]=0;
        else
        System.out.println("Printjob is empty");
        for(int i=0;i<job.length;i++)
      {
          System.out.println("Array element "+(i+1));
          System.out.println(job[i]);
        }
        
    }
    void addJob()
    {
        System.out.println("Enter the number u want to add");
        int b=Sc.nextInt(),c=0;
        for(int i=0;i<job.length;i++)
        {
            if(job[i]==0)
            {
            job[i]=b;
            break;
        }
            else
            {
            c++;
        }
        }
       
        if(c==20)
        System.out.println("Printjob is full, cannot add anymore.");
        for(int i=0;i<job.length;i++)
      {
          System.out.println("Array element "+(i+1));
          System.out.println(job[i]);
        }
    }
}