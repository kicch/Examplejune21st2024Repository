package Com.PackageSG.Testing.Assignmnet.homeassignment.test.staticandnonstatic;
class Animals {
    int a = 3;
    static int b = 32;

    static void disp() {
        System.out.println("static method ");
    }

    public void disp2() {
        System.out.println("instance method ");
        System.out.println(a);
    }
}
public class Exapmle2 {
    Exapmle2(){
        Animals n=new Animals();
        System.out.println(n.a);
        n.disp2();
        Animals.disp();
        System.out.println(Animals.b);

    }
    public static void main(String[] args) {
        Exapmle2 U=new Exapmle2();
        Exapmle2 U1=new Exapmle2();
        Exapmle2 U3=new Exapmle2();


    }
}
