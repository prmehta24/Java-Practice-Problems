class exception_handling
{
    public static void main(int number,int divisor)
    {
        try
        {
           
             System.out.println((number/divisor)); 
            
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());

        }
        finally
        {

           System.out.println("Finally Printed");                 
        }
    }
}