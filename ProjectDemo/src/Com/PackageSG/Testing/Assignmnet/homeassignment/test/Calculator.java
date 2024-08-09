package Com.PackageSG.Testing.Assignmnet.homeassignment.test;
//yes we can over load static method but we have to make sure that we have to pass different in signature and argument list and variation in that length of the argument
//8th Question
public class Calculator {

    public static int add(int a, int b) {
        return a + b;
    }

    public static int add(int a, int b, int c) {
        return a + b + c;
    }

    public static double add(double a, double b) {
        return a + b;
    }

    public static double add(int a, double b) {
        return a + b;
    }

    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println(calc.add(10, 20));
        System.out.println(calc.add(10, 20, 30));
        System.out.println(calc.add(10.5, 20.5));
        System.out.println(calc.add(10, 20.5));
    }
}
