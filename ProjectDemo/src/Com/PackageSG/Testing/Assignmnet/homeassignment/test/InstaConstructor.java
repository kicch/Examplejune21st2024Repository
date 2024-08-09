package Com.PackageSG.Testing.Assignmnet.homeassignment.test;
//2st question
public class InstaConstructor {
    {
        System.out.println("Hi its a instance block ");
    }
   InstaConstructor(){
       System.out.println("Hi its a constructor");
    }

    public static void main(String[] args) {
        InstaConstructor r=new InstaConstructor();
    }
}
