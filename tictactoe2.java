import java.util.*;
class tictactoe2
{
    public static void main()
    {
       int m=0;
        int imp=0;
        int act=1;
        int sign=0;
        String q[]=new String[9];
        for(int i=0;i<9;i++)
        {
            q[i]="";
        }
        String e="";
        Scanner Sc=new Scanner(System.in);
        int b=1,a=1,c=0;
         String ttt[][]=new String[3][3];
         for(int i=0;i<3;i++)
         {
             for(int j=0;j<3;j++)
             {
                 ttt[i][j]=Integer.toString(b);
                 b++;
                }
            }
            System.out.println("Get ready to play Tic Tac Toe!!!");
            System.out.println("Enter name of Player 1");
            String p1=Sc.nextLine();
            System.out.println("Enter name of Player 2");
            String p2=Sc.nextLine();
            
            while(a>0)
            {
                
        System.out.println(ttt[0][0]+"   |"+ttt[0][1]+"   |"+ttt[0][2]+"   "); 
        System.out.println("----|----|----"); 
        System.out.println(ttt[1][0]+"   |"+ttt[1][1]+"   |"+ttt[1][2]+"   ");  
        System.out.println("----|----|----"); 
        System.out.println(ttt[2][0]+"   |"+ttt[2][1]+"   |"+ttt[2][2]+"   ");
        if(c%2==0)
        {act=1;
            while(act>0)
            {
        System.out.println("Player "+p1+" enter your number to mark(if all options done, enter any number).");
        String d=Sc.nextLine();
        imp=0;
   for(int i=0;i<9;i++)
   {
       if(q[i].equals(d))
       imp=1;
    }
    
    if(imp!=1)
    {
    if(d.equals("1"))
    {
    ttt[0][0]="x";
    q[0]=d;
    act=0;
}
    
    else if(d.equals("2"))
    {
    ttt[0][1]="x";
    q[1]=d;
    act=0;
}
    else if(d.equals("3"))
    {
    ttt[0][2]="x";
    q[2]=d;act=0;
}
    else if(d.equals("4"))
    {
    ttt[1][0]="x";
    q[3]=d;act=0;
}
    else if(d.equals("5"))
    {
    ttt[1][1]="x";
    q[4]=d;act=0;
}
    else if(d.equals("6"))
    {
    ttt[1][2]="x";
    q[5]=d;act=0;
}
    else if(d.equals("7"))
    {
    ttt[2][0]="x";
    q[6]=d;act=0;
}
    else if(d.equals("8"))
    {
    ttt[2][1]="x";
    q[7]=d;act=0;
}
    else if(d.equals("9"))
    {
    ttt[2][2]="x";
    q[8]=d;act=0;
}
}
else
{ m=0;
     for(int i=0;i<9;i++)
   {
       
       if(q[i].equals(""))
       {
        }
       else
       {
       m++;
    }
       
    }
    if(m>=8)
    break;
    
    System.out.println("Invalid Option. Reenter choice");
    
}
 if(m>=8)
    break;
}
 if(m>=8)
    break;
    }
    else
    {
        act=1;
        while(act>0)
        {
        System.out.println("Player "+p2+" enter your number to mark.(if all options done, enter any number)");
    imp=0;
    String d=Sc.nextLine();
    for(int i=0;i<9;i++)
   {
       if(q[i].equals(d))
       imp=1;
    }
    if(imp!=1)
    {
    if(d.equals("1"))
    {
    ttt[0][0]="o";
    q[0]=d;
    act=0;
}
    else if(d.equals("2"))
    {
    ttt[0][1]="o";
    q[1]=d;act=0;
}
    else if(d.equals("3"))
    {
    ttt[0][2]="o";
    q[2]=d;act=0;
}
    else if(d.equals("4"))
    {
    ttt[1][0]="o";
    q[3]=d;act=0;
}
    else if(d.equals("5"))
    {
    ttt[1][1]="o";
    q[4]=d;act=0;
}
    else if(d.equals("6"))
    {
    ttt[1][2]="o";
    q[5]=d;act=0;
}
    else if(d.equals("7"))
    {
    ttt[2][0]="o";
    q[6]=d;act=0;
}
    else if(d.equals("8"))
    {
    ttt[2][1]="o";
    q[7]=d;act=0;
}
    else if(d.equals("9"))
    {
    ttt[2][2]="o";
    q[8]=d;act=0;
}
}
else
{
    m=0;
     for(int i=0;i<9;i++)
   {
       
       if(q[i].equals(""))
       {
        }
       else
       {
       m++;
    }
       
    }
    if(m>=8)
    break;
     
    System.out.println("Invalid Option. Reenter choice");
}

 if(m>=8)
    break;
}
 if(m>=8)
    break;
}
if((ttt[0][0].equals(ttt[0][1]))&&((ttt[0][1].equals(ttt[0][2]))))
{
a=0;
e=ttt[0][0];
}
else if((ttt[1][0].equals(ttt[1][1]))&&((ttt[1][1].equals(ttt[1][2]))))
{
a=0;
e=ttt[1][0];}
else if(((ttt[2][0].equals(ttt[2][1]))&&((ttt[2][1].equals(ttt[2][2])))))
{a=0;
e=ttt[2][0];}
else if(((ttt[0][0].equals(ttt[1][0]))&&((ttt[1][0].equals(ttt[2][0])))))
{a=0;
e=ttt[0][0];}
else if(((ttt[0][1].equals(ttt[1][1]))&&((ttt[1][1].equals(ttt[2][1])))))
{a=0;
e=ttt[0][1];}
else if(((ttt[0][2].equals(ttt[1][2]))&&((ttt[1][2].equals(ttt[2][2])))))
{a=0;
e=ttt[0][2];}
else if(((ttt[0][0].equals(ttt[1][1]))&&((ttt[1][1].equals(ttt[2][2])))))
{a=0;
e=ttt[0][0];}
else if(((ttt[0][2].equals(ttt[1][1]))&&((ttt[1][1].equals(ttt[2][0])))))
{a=0;
e=ttt[0][2];}
c++;
      if(m>=8)
    break;  
    }
    if(e.equals("x"))
    System.out.println("Player "+p1+" wins.");
   else if(m>=8)
   System.out.println("Its a draw");
    else
    System.out.println("Player "+p2+" wins.");
    
    System.out.println(ttt[0][0]+"   |"+ttt[0][1]+"   |"+ttt[0][2]+"   "); 
        System.out.println("----|----|----"); 
        System.out.println(ttt[1][0]+"   |"+ttt[1][1]+"   |"+ttt[1][2]+"   ");  
        System.out.println("----|----|----"); 
        System.out.println(ttt[2][0]+"   |"+ttt[2][1]+"   |"+ttt[2][2]+"   ");
        
        
        
        
        
        
    }
}