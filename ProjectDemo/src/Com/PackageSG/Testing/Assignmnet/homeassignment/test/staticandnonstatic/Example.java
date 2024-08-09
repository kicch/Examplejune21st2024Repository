package Com.PackageSG.Testing.Assignmnet.homeassignment.test.staticandnonstatic;

public class Example {
   static int x = 20;
    int y = 30;
    public void disp() {
        System.out.println("instance method ");
    }
    static void disp2(){
        int x=20;//local variable
        System.out.println("static method ");
    }
    public static void main(String[] args) {
       Example e = new Example();
        System.out.println(e.y);
        System.out.println(Example.x);
        disp2();
        e.disp();
    }
}