package Com.PackageSG.Testing.Assignmnet.methods;
 class Rate
 {
     int Work(int cost) {
         return cost;
     }
 }
public class Laptop {
    public static void main(String[] args) {
        Rate o1=new Rate();
       int j=o1.Work(5600);
        System.out.println(j);
    }
}