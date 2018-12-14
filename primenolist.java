class primenolist
{
    public static void main(long limit)
    {
        System.out.println("Prime Numbers:- ");
        for(long i=0;i<limit;i++)
        {
            long c=0;
            for(long j=2;j<i;j++)
            {
                if(i%j==0)
                c++;
            }
            if(c==0)
            System.out.println(i);
        }
    }
}