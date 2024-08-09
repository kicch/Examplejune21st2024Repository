package Com.PackageSG.Testing.Assignmnet;
class User1{
    String user_name;
    String user_sex;
    int user_age;

    User1(){
        String user_name="Venu";
        String user_sex="Alpha male";
        int user_age=28;
        System.out.println("Username ="+user_name);
        System.out.println("sex="+user_sex);
        System.out.println("age="+user_age);
        System.out.println("*******************************************************");
    }

}
class Profile2{
    String Profile_name;
    String Profile_stage;
    String Profile_grade;

    Profile2(){
        Profile_name="QA";
        Profile_stage="2";
        Profile_grade="A+";
        System.out.println("profile name="+Profile_name);
        System.out.println("profile satge = "+Profile_stage);
        System.out.println("profile grade="+Profile_grade);
        System.out.println("*******************************************************");
    }

}
class Roles2{
    String role_name;
    String role_resposible;

    Roles2(){
        role_name="automation";
        role_resposible=" A feather called sign to be automated ";
        System.out.println( "roles of me="+role_name);
        System.out.println( "roles of me="+role_resposible);
    }
}
public class ResumeTwo {
    public static void main(String[] args) {
        User1 us= new User1();
        Profile2 pro=new Profile2();
        Roles2 rols=new Roles2();
    }
}
