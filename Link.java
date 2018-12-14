import java.util.*;
class Link
{
    int lnk[];
    int max;
    int begin;
    int end;
    Link(int mm)
    {
        max=mm;
        lnk=new int[max];
        begin=0;
        end=0;
    }
    void addlink(int v)
    {
       
       if (max == 0 )
       {
       System.out.println("Empty array");
       return;
    }
    else
    {
       if((end==max)&&(begin!=end))
        {
            System.out.println("Outside of size");
        }
        else if((begin==end) && (begin!=0))
        {
            begin=0;
            end=0;
        }
        else
        {
            
            //System.out.println("End(Before)= "+end);
            lnk[end++]=v;
            //System.out.println("End(After)= "+end);
        }
    }
}
    int dellink()
    {
        if (max == 0 )
       {
       System.out.println("Empty array");
       return 0;
    }
        if(begin==end)
        {
            //System.out.println("End= "+end);
            //System.out.println("Begin= "+begin);
            System.out.println("EMPTY");
            begin=0;
            end=0;
            
            return -99;
            
        }
        else
        {
           // System.out.println("Begin(Before)= "+begin);
            return lnk[begin++];
            
        }
    }
    void display()
    {
        if (max == 0 )
       {
        System.out.println("Empty array");
        return;
    }
        //System.out.println("Begin= "+begin);
        //System.out.println("End= "+end);
        System.out.println("List:");
        for(int i=begin;i<end;i++)
        {
            System.out.print(lnk[i]+" ");
        }
        System.out.println();
    }
    public static void main(int n)
    {
        Link l=new Link(n);
        int y=0;
        for(int i=0;i<=n;i++)
        {
            
            l.addlink(y++);
            l.display();
            
        }
        
       
        for(int i=0;i<=n;i++)
        {
            
            l.dellink();
            l.display();
        }
        
        
        
        
    }
    
}