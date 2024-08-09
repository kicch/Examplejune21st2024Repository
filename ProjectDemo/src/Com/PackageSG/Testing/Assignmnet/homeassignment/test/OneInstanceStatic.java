package Com.PackageSG.Testing.Assignmnet.homeassignment.test;
//4st question
public class OneInstanceStatic {

    static void disp1(){

        System.out.println("Hi I am Instance method");
    }
    static void disp2(){

        System.out.println("Hi i am static method ");
    }
    static {
        disp2();
    }
    public static void main(String[] args) {
        OneInstanceStatic v= new OneInstanceStatic();
        disp1();
    }

}
