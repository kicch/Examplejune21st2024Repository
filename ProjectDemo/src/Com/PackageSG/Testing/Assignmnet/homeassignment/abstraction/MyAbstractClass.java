package Com.PackageSG.Testing.Assignmnet.homeassignment.abstraction;
public class MyAbstractClass {
    {
        System.out.println("Instance block in abstract class executed.");
    }
    public static void main(String[] args) {
        MyAbstractClass obj = new MySubclass();
    }
}


class MySubclass extends MyAbstractClass {
    // No need to override or add anything here
}

