package Com.PackageSG.Testing.Assignmnet.homeassignment.methodwithreturntype;
class student {
    String getname(){
       return "venu";
    }
}
public class Name {
    public static void main(String[] args) {
        student s1= new student();
        String nameof=s1.getname();
        System.out.println(nameof);
    }
}

