package Com.PackageSG.Testing.Assignmnet.methods;
class Name {
        int kiran(int num) {
        return num;
     }
         int Adult(int age) {
         return age;
        }
    }
public class MethodPrintName {
    public static void main(String[] args) {
         Name nam = new Name();
         int n = nam.kiran(89);
         int h=nam.Adult(99);
         System.out.println(n);
         System.out.println(h);


    }
}