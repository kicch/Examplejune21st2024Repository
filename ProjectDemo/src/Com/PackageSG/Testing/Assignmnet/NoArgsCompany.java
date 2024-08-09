package Com.PackageSG.Testing.Assignmnet;
class Employee2{
    String Emp_name;
    int Emp_age;
    String Emp_roles;
    String Emp_ctc;

    Employee2(){
        Emp_name= "Rohit";
        Emp_age=29;
        Emp_roles="QA";
        Emp_ctc="44,0000000";

        System.out.println("Employee name="+Emp_name);
        System.out.println("Employee age="+Emp_age);
        System.out.println("Employee role="+Emp_roles);
        System.out.println("Employee CTC="+Emp_ctc);
        System.out.println("**************************HI********************************");

    }

}
 class Department2{
    String dept_name;
    String dept_HOD;
    int dept_batchCount;

    Department2(){
        String dept_name= "SCIENCE";
        String dept_HOD="DR.Strange";
        int dept_batchCount=41;
        System.out.println("Department Name="+dept_name);
        System.out.println("Department HOD="+dept_HOD);
        System.out.println("Department count="+dept_batchCount);
        System.out.println("***********************************HI*********************************8");


    }
}
class Insurence{
   String insurence_name;
   String insurence_type;
   int insurence_amount;

   Insurence(){
       insurence_name="Jeevan adhar";
       insurence_amount=800;
       insurence_type="health";
       System.out.println("insurence name="+insurence_name);
       System.out.println("insurence amount="+insurence_type);
       System.out.println("insurence type="+insurence_amount);
   }

}
public class NoArgsCompany {
    public static void main(String[] args) {
         Employee2 obj1 = new Employee2();
         Department2 obj2= new Department2();
         Insurence007 obj3  = new Insurence007();



    }

    }
