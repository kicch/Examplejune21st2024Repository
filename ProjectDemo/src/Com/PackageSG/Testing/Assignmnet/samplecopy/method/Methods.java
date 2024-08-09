package Com.PackageSG.Testing.Assignmnet.samplecopy.method;
class MethodONFacto {
    void facto(int num) {
        int fact = 1;
        for (int i = num; i >=1; i--) {
             fact = fact * i;
        }
        System.out.println(fact);
    }
}
public class Methods {
    public static void main(String[] args) {
        MethodONFacto M= new MethodONFacto();
        M.facto(5);
        M.facto(9);
        M.facto(8);
    }
}
