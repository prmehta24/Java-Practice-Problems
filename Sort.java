class Sort
{
    String Str;
    
    char b[];
    int len;
    Sort()
    {
        Str="";
        len=0;
        
    }
    void readword(String a)
    {
       Str=a.toLowerCase();
       len=a.length();
       b=new char[len];
    }
    void arrange()
    {
        for(int i=0;i<len;i++)
        {
            b[i]=Str.charAt(i);
        }
        
         for(int i=0;i<len-1;i++)
        {
            for(int j=i+1;j<len;j++)
            {
                
            if(b[i]>b[j])
            {
                char c=b[i];
                b[i]=b[j];
                b[j]=c;
            }
        }
        }
       
       
        
        
        
    }
    void display()
    {
        System.out.println("Original:-");
        System.out.println(Str);
        System.out.println("Arranged:-");
        for(int i=0;i<len;i++)
        {
            System.out.print(b[i]);
        }
        
     }
}