package Com.PackageSG.Testing.Assignmnet;
class user{
  String user_name;
  String user_sex;
  int user_age;
}
class Profile{
    String Profile_name;
    String Profile_stage;
    String Profile_grade;
}
class role{
    String role_name;
    String role_resposible;
}
public class Resume {
    public static void main(String[] args) {
         user obj1= new user();
         obj1.user_name="krishna";
         obj1.user_sex="male";
         obj1.user_age=78;
         System.out.println("Username ="+obj1.user_name);
         System.out.println("sex="+obj1.user_sex);
         System.out.println("age="+obj1.user_age);
         System.out.println("*******************************************************");
         Profile obj2 =new Profile();
         obj2.Profile_name="QA";
         obj2.Profile_stage="2";
         obj2.Profile_grade="A+";
        System.out.println("profile name="+obj2.Profile_name);
        System.out.println("profile satge = "+obj2.Profile_stage);
        System.out.println("profile grade="+obj2.Profile_grade);
        role obj3= new role();
         obj3.role_name="automation";
         obj3.role_resposible=" A feather called sign to be automated ";
        System.out.println( "roles of me="+obj3.role_name);
        System.out.println( obj3.role_resposible);
    }

}
