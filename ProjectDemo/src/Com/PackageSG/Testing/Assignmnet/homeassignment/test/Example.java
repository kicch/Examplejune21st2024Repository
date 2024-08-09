package Com.PackageSG.Testing.Assignmnet.homeassignment.test;

//7th programe
public class Example {

    private int instanceVar1;
    private int instanceVar2;
    private static int staticVar;
    public Example(int value1, int value2) {

        this.instanceVar1 = value1;
        this.instanceVar2 = value2;
        staticVar = value1 + value2;
    }

    public void displayValues() {
        System.out.println("Instance Variable 1: " + instanceVar1);
        System.out.println("Instance Variable 2: " + instanceVar2);
        System.out.println("Static Variable: " + staticVar);
    }

    public static void main(String[] args) {
        Example example1 = new Example(10, 20);
        example1.displayValues();
        Example example2 = new Example(30, 40);
        example2.displayValues();
        System.out.println("Static Variable accessed from the class: " + Example.staticVar);
    }
}
