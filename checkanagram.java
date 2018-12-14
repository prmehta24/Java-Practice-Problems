import java.util.*;
class checkanagram
{
   int Check(int m,int n)
   {
       if(n==1)
       return -m--;
       else
       return ++m+Check(m,--n);
    }
}