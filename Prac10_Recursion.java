import java.util.*;
class Prac10_Recursion
{
    int result;
    int fact(int n)
    {
        if(n==1)
        return 1;
        result = fact(n-1)*n;
        return result;
    }
}
