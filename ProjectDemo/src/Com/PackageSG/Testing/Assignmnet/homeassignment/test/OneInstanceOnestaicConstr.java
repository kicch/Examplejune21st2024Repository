package Com.PackageSG.Testing.Assignmnet.homeassignment.test;
// 5th Question
public class OneInstanceOnestaicConstr {

    void disp()
    {
        System.out.println("I am Instance methode");
    }
   static void disp1(){

        System.out.println("I am a static method");
   }
OneInstanceOnestaicConstr(){
        disp1();
        disp();
}
    public static void main(String[] args) {
        OneInstanceOnestaicConstr s= new OneInstanceOnestaicConstr();

    }
}



