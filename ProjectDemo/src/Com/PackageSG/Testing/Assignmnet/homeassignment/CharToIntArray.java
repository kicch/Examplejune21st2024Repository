package Com.PackageSG.Testing.Assignmnet.homeassignment;

public class CharToIntArray {
    public static void main(String[] args) {
        // Define a 2D char array (3x3)
        char[][] charArray = {
                {'a', 'b', 'c'},
                {'d', 'e', 'f'},
                {'g', 'h', 'i'}
        };
        // Create a 2D int array (3x3)
        int[][] intArray = new int[3][3];
        // Convert each character in the char array to its ASCII value in the int array
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                intArray[i][j] = (int) charArray[i][j];
            }
        }
        // Display the elements of the int array
        System.out.println("Elements of the int array (ASCII values):");
        for (int[] row : intArray) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }
}

