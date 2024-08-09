package Com.PackageSG.Testing.Assignmnet.methods;
class Calculate1 {
    int Add(int a, int b) {
        int result = a + b;
        return result;
    }
    int Sub(int x, int y) {
        int res = x - y;
        return res;
    }
    void Muti(int a,int b){
       int res=a*b;
       System.out.println(res);
    }
}
public class Calculation {
    public static void main(String[] args) {
        Calculate1 C = new Calculate1();
        //int ADDI = C.Add(78, 88);
        // int Sub =  C.Sub(8, 67);
        //C.Muti(ADDI,Sub);
        C.Muti(C.Add(67,8),C.Sub(7,4));
    }
}