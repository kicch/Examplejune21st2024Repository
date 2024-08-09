package Com.PackageSG.Testing.Assignmnet.homeassignment;

public class MatrixSum {
    public static int sumOfElements(int[][] matrix) {
        int sum = 0;

        // Summing all elements of the 2D array
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                sum += matrix[i][j];
            }
        }

        return sum;
    }

    public static void main(String[] args) {
        // Example 3x3 matrix
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        // Calculating the sum of all elements
        int totalSum = sumOfElements(matrix);

        // Printing the sum
        System.out.println("Sum of all elements: " + totalSum);
    }
}
