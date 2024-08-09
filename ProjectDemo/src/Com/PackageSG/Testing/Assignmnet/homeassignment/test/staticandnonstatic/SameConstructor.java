package Com.PackageSG.Testing.Assignmnet.homeassignment.test.staticandnonstatic;
public class SameConstructor {
     int a=10;
    static int disp(){
        SameConstructor h=new SameConstructor();
         int b=h.a;
        return b;
    }

    public static void main(String[] args) {
        int g=disp();
        System.out.println(g);

    }
}
