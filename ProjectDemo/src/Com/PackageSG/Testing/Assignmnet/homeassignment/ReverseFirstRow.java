package Com.PackageSG.Testing.Assignmnet.homeassignment;

public class ReverseFirstRow {
    public static void main(String[] args) {
        // Define a 2D double array
        double[][] array = { { 1.1, 2.2, 3.3, 4.4, 5.5 },
                { 6.6, 7.7, 8.8, 9.9, 10.10 },
                { 11.11, 12.12, 13.13, 14.14, 15.15 } };

        // Check if the array is not empty and has at least one row
        if (array.length > 0 && array[0].length > 0) {
            System.out.println("First row in reverse order:");
            // Loop through the first row in reverse order
            for (int i = array[0].length - 1; i >= 0; i--) {
                System.out.print(array[0][i] + " ");
            }
        } else {
            System.out.println("The array is empty or does not have any rows.");
        }
    }
}
