package Com.PackageSG.Testing.Assignmnet.homeassignment;

public class DoubleToIntArray {
    public static void main(String[] args) {
        // Define a 3x3 double 2D array
        double[][] doubleArray = { { 1.1, 2.2, 3.3 },
                { 4.4, 5.5, 6.6 },
                { 7.7, 8.8, 9.9 } };

        // Create a 3x3 int 2D array with the same dimensions
        int[][] intArray = new int[3][3];

        // Assign each element from the double array to the int array
        for (int i = 0; i < doubleArray.length; i++) {
            for (int j = 0; j < doubleArray.length; j++) {
                intArray[i][j] = (int) doubleArray[i][j]; // Convert double to int

            }
        }

        // Display the elements of the int array
        System.out.println("Elements of the int array:");
        for (int i = 0; i < intArray.length; i++) {
            for (int j = 0; j < intArray.length; j++) {
                System.out.print(intArray[i][j] + " ");
            }
            System.out.println();
        }
    }
}
