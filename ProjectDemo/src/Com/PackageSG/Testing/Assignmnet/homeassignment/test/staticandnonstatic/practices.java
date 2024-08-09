package Com.PackageSG.Testing.Assignmnet.homeassignment.test.staticandnonstatic;

public class practices {
    static int a = 10;// its a static variable
    int b = 24;// its a instance variable

    static void method1() {
        int a = 20; // its either static nor non static explain(local var)
        System.out.println(a);
    }

    void disp() {
        System.out.println("Hi am instance method ");
    }
}
    class main {
        public static void main(String[] args) {
            practices.method1();
            practices p = new practices();
            System.out.println(p.b);
            System.out.println(practices.a);
            p.disp();
        }
    }