package Com.PackageSG.Testing.Assignmnet.homeassignment.test.staticandnonstatic;

public class Animal {
    int x=10;
    static int y=8;
}
class Animal2  {
    public void disp() {
        Animal n= new Animal();
        System.out.println(n.x);
        System.out.println(Animal.y);//DOUBT
    }
}
class Animlas {
    public static void main(String[] args) {
        Animal2 A= new Animal2();
        A.disp();

    }
}
