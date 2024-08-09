package Com.PackageSG.Testing.Assignmnet.homeassignment;

public class DisplayRows {
    public static void main(String[] args) {
        // Define a 4x4 integer array
        int[][] array = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}
        };

        // Display the 3rd and 4th rows (index 2 and 3)
        System.out.println("3rd row elements:");
        for (int j = 0; j < array[2].length; j++) {
            System.out.print(array[2][j] + " ");
        }
        System.out.println();

        System.out.println("4th row elements:");
        for (int j = 0; j < array[3].length; j++) {
            System.out.print(array[3][j] + " ");
        }
        System.out.println();
    }
}
