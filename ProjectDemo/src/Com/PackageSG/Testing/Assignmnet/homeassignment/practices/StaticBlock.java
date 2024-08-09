package Com.PackageSG.Testing.Assignmnet.homeassignment.practices;
class Students {
    static String First_Name;
    static Integer age;

    static {
        First_Name="King";
        age=20;
        showFN();
        show_age();
    }
    static void  showFN(){
        System.out.println("First_Name="+First_Name);
    }
    static void show_age(){
        System.out.println("show_age="+age);
    }
    Students(){

    }
}
public class StaticBlock {
    public static void main(String[] args) {
        System.out.println(Students.age);
    }
    }
