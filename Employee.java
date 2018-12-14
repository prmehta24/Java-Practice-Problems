class Employee
{
    long empNo;
    String empname;
    String empDesig;
    float basic,netsalary;
    void display()
    {
        System.out.println("Employee Number:- "+empNo);
        System.out.println("Employee Name :- "+empname);
        System.out.println("Employee Designation :- "+empDesig);
        System.out.println("Net Pay :- "+netsalary );
    }
    Employee()
    {
        empNo=0;
        empname="";
        empDesig="";
    }
    Employee(long no,String name,String designation,float b)
    {
        empNo=no;
        empname=name;
        empDesig=designation;
        basic=b;
        netsalary=0;
        
    }


        void calculate()
        {
            float da=(float)(10.0f/100.0f)*basic;
            float hra=(float)(15.0f/100.0f)*basic;
            float salary=basic+da+hra;
            float pf=(float)(8.0f/100.0f)*salary;
            System.out.println(da+" "+hra+" "+salary+" "+pf+" "+netsalary);
            netsalary=salary-pf;
        }

}