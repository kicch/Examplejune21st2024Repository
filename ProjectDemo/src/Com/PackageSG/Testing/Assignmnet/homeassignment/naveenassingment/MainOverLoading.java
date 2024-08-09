package Com.PackageSG.Testing.Assignmnet.homeassignment.naveenassingment;

public class MainOverLoading {
    // This is the entry point of the program
    public static void main(String[] args) {
        System.out.println("Hello from the standard main method!");

        // You can call overloaded main methods
        main(5);
        main("Hello");
    }

    // Overloaded main method with an int parameter
    public static void main(int number) {
        System.out.println("Hello from the overloaded main method with int: " + number);
    }

    // Overloaded main method with a String parameter
    public static void main(String str) {
        System.out.println("Hello from the overloaded main method with String: " + str);
    }

}
