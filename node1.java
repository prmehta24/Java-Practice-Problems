//Program for single linked list
import java.io.*;

import java.util.*;



public class node1

{

int data;

node1 link;

node1()

{

    data=0;

    link=null;

}

void create()

{

    int n;

    Scanner s1=new Scanner(System.in);

    System.out.println("enter first data");

    data=s1.nextInt();

    System.out.println("enter no of nodes");

    n=s1.nextInt();

    node1 temp;

    node1 ptr=this;

    for(int i=1;i<n;i++)

    {

        temp=new node1();

        System.out.println("enter next data");

        temp.data=s1.nextInt();

        temp.link=null;

        ptr.link=temp;

        temp=null;

        ptr=ptr.link;

    }

}

node1 insertbeg(node1 start,int x)

{

    node1 temp=new node1();

//    System.out.println("enter element for the new list");

    temp.data=x;

//     temp.link=null;

     temp.link=start;

     start=temp;

//     temp=null;

	return start;

    }

    void insertmid(node1 start,int x,int n)

    {

        node1 temp=new node1();

//        System.out.println("enter elements for new list");

        temp.data=x;

        temp.link=null;

        node1 ptr=start;

        int c=0;

        while(c<n)

        {

            ptr=ptr.link;

            c++;

        }

        temp.link=ptr.link;

        ptr.link=temp;

    }

       void insertend(node1 start,int x)

        

       {

            node1 temp=new node1();

//            System.out.println("enter element for new list");

            temp.data=x;

            temp.link=null;

            node1 ptr=start;

            while(ptr.link!=null)

            {

                ptr=ptr.link;

            }

            ptr.link=temp;

            temp=ptr=null;

        }

        node1 delete(node1 start,int n)

        {

            node1 ptr=start;

            node1 ptr1=ptr;

            int c=ptr.data;

	    if(c == n)

	    {

		start = start.link;

		return start;

	    }

            while(c!=n)

            {

                ptr1=ptr;

                ptr=ptr.link;

		c = ptr.data;

            }

            ptr1.link=ptr.link;

            ptr.link=null;

            ptr=ptr1=null;

	    return start;

        }

        void display()

        {

            node1 ptr=this;

            while(ptr!=null)

            {

                System.out.println(ptr.data);

                ptr=ptr.link;

            }

        }

        void recdisplay(node1 start)

        {

		if(start != null)

		{

		        System.out.println(start.data);

			recdisplay(start.link);

		}

        }

        

    public static void main(String arg[])throws IOException

    {

        

        int k,p,ch;

        InputStreamReader r1=new InputStreamReader(System.in);

        BufferedReader in=new BufferedReader(r1);

        Scanner s1=new Scanner(System.in);

        node1 first=new node1();

        node1 abc=new node1();

        do

        {

            System.out.println("mainmenu");

            System.out.println("1.Create a list");

            System.out.println("2.Insert a list in beginning");

            System.out.println("3.Insert list in end");

            System.out.println("4.Insert in middle");

            System.out.println("5.delete a list");

            System.out.println("6.Display the list");

            System.out.println("7.exit");

            System.out.println("enter your choice");

            ch=Integer.parseInt(in.readLine());

            switch(ch)

            {

                case 1:

	                first.create();

        	        break;

                case 2:

                	System.out.println("enter data for new node");

	                k=Integer.parseInt(in.readLine());

        	        first = first.insertbeg(first,k);

                	break;

                case 3:

	                System.out.println("Enter Data for End");

        	        k=Integer.parseInt(in.readLine());

                	first.insertend(first,k);

	                break;

                case 4:

        	        System.out.println("Enter data for new node");

                	k=Integer.parseInt(in.readLine());

	                System.out.println("Enter node no after which node is to be inserted");

        	        p=Integer.parseInt(in.readLine());

                	first.insertmid(first,k,p);

	                break;

                case 5:

        	        System.out.println("enter node number to be deleted");

                	k=Integer.parseInt(in.readLine());

	                first = first.delete(first,k);

			break;

                case 6:

        	        System.out.println("data in list");

                	first.recdisplay(first);

			break;

            }

        }

        while(ch!=7);

    }

}
