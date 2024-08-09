package Com.PackageSG.Testing.Assignmnet.homeassignment.test.staticandnonstatic;

public class Something {
    int r=39;
    static int y=49;
    static void disp(){
        System.out.println("static ");
    }
    public void diso1(){
        System.out.println("instance");
    }

    public static void main(String[] args) {
        System.out.println(y);
        disp();
        Something s= new Something();
        System.out.println( s.r);
        s.diso1();
    }
}
