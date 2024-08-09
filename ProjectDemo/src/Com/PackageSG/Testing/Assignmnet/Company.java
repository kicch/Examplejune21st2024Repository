package Com.PackageSG.Testing.Assignmnet;
class Customer
{
    String customer_Name;
    String customer_Country;
    String customer_requrement;
}
    class project
    {
        String project_name;
        String project_use;
        String project_deadline;
        int project_amount;
}
   class Task
   {
        String Task_name;
        String Task_Type;
        String Task_deadline;
}
public class Company {
    public static void main(String[] args) {
        Customer obj1=new Customer();
        obj1.customer_Country="england";
        obj1.customer_Name="Sphera";
        obj1.customer_requrement="To automate the process for sign feature";
        System.out.println("custom country ="+obj1.customer_Country);
        System.out.println("customer name= "+obj1.customer_Name);
        System.out.println("customer req="+obj1.customer_requrement);
        System.out.println("*****************************************************************************8");

        project  obj2=new project();
        obj2.project_name="auto";
        obj2.project_use="to Automate and save time for sign";
        obj2.project_deadline="13days";
        obj2.project_amount=400000;
        System.out.println("project_name ="+obj2.project_name);
        System.out.println("project use="+obj2.project_use);
        System.out.println("project deadline = "+obj2.project_deadline);
        System.out.println( obj2.project_amount);
        System.out.println("**********************************************************************");
        Task obj3=new Task();
        obj3.Task_name="Killtime";
        obj3.Task_Type="java";
        obj3.Task_deadline="31days";
        System.out.println("Task name "+obj3.Task_name);
        System.out.println("Task type "+obj3.Task_Type);
        System.out.println("Task deadline="+obj3.Task_deadline);


    }
}
