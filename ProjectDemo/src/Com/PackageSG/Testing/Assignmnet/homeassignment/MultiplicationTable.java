package Com.PackageSG.Testing.Assignmnet.homeassignment;

public class MultiplicationTable {
    public static void main(String[] args) {
        int number = 20; // The number for which we want to display the multiplication table

        // Display the multiplication table for the number 20
        System.out.println("Multiplication Table for " + number + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " x " + i + " = " + (number * i));
        }
    }
}
