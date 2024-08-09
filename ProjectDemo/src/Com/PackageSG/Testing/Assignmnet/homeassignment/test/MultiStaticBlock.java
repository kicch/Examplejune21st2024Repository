package Com.PackageSG.Testing.Assignmnet.homeassignment.test;
class Student{
    //1st question
    static {
        System.out.println("static block 1");
    }
    static {
        System.out.println("static block 2");
    }
}
public class MultiStaticBlock {
    public static void main(String[] args) {
        Student s=new Student();
    }
}
