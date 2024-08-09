package Com.PackageSG.Testing.Assignmnet.homeassignment.methodwithreturntype;
class Addition {
    public static int getadd(int x, int y) {
        return (x + y);
    }
}
class Substraction {
    public static int getSub(int x, int y) {
        int res1 = (x - y);
        return res1;
    }
}
public class Maths1 {
    public static void main(String[] args) {
        int x2 = Addition.getadd(89, 9);
        System.out.println(x2);
        int y2 = Substraction.getSub(77, 9);
        System.out.println(y2);
    }
}
