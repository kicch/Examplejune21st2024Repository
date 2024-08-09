package Com.PackageSG.Testing.Assignmnet.homeassignment.abstraction;
abstract class MyAbstractClass1 {
    public static void staticMethod1() {
        System.out.println("Static method in abstract class executed.");
    }
}

public class Mainclass {
    public static void main(String[] args) {
        MyAbstractClass1.staticMethod1();
    }
}
