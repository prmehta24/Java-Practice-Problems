class Salary
{
    float basic;
    Salary(float b)
    {
        basic=b;
        }
        void calculate()
        {
            float da=(10/100)*basic;
            float hra=(15/100)*basic;
            float salary=basic+da+hra;
            float pf=(8/100)*salary;
            float netsalary=salary-pf;
        }

}