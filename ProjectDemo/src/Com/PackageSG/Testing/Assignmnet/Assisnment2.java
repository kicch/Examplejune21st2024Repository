package Com.PackageSG.Testing.Assignmnet;
class Employee {
    String EmpName;
    String Emp_role;
    int ID;
}
class Dept{
    String DeptName;
    String DeptHead;
    int DeptNo;

}
class Insurance{
    String ins_name;
    int insurance_age;
    int insurance_amunt;
}

public class Assisnment2 {
    public static void main(String[] args) {
        Department dp = new Department();
        dp.DeptName = "Science";
        dp.DeptHead = "venu";
        dp.DeptNo = 109;
        System.out.println(dp.DeptName);
        System.out.println(dp.DeptHead);
        System.out.println(dp.DeptNo);
        System.out.println("*****************************************************8");
        Insurance in = new Insurance();
        in.insurance_age = 23;
        in.ins_name = "LIC";
        in.insurance_amunt = 200000;
        System.out.println(in.insurance_age);
        System.out.println(in.ins_name);
        System.out.println(in.insurance_amunt);
        System.out.println("************************************************");
        Employee en = new Employee();
        en.EmpName="Ankit";
        en.Emp_role="HR";
        en.ID=89;
        System.out.println( en.EmpName);
        System.out.println(en.Emp_role);
        System.out.println(en.ID);



    }
}
