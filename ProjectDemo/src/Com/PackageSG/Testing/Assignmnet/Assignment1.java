package Com.PackageSG.Testing.Assignmnet;
class Tcs {
    String firstname;
    String color;
    int age;
}
class Department {
    String DeptName;
    String DeptHead;
    int DeptNo;
}
public class Assignment1 {
    public static void main(String[] args) {
        Tcs obj1 = new Tcs();
        Department obj2 = new Department();
        obj1.firstname = "Anoop";
        obj1.color = "green";
        obj1.age = 66;
        System.out.println("firstname=" + obj1.firstname);
        System.out.println("colour   =" + obj1.color);
        System.out.println("age      =" + obj1.age);
        System.out.println();
        obj2.DeptHead = "srinivas";
        obj2.DeptName = "Science";
        obj2.DeptNo = 412;
        System.out.println("deptHead    = " + obj2.DeptHead);
        System.out.println("Dept name   = " + obj2.DeptName);
        System.out.println("dept number = " + obj2.DeptNo);
    }
}
