package Com.PackageSG.Testing.Assignmnet.homeassignment;

public class MatrixColumn {
        public static int[] getFirstColumn(int[][] matrix) {
            // Check if the matrix is 3x3
            if (matrix.length != 3 || matrix[0].length != 3) {
                throw new IllegalArgumentException("Matrix must be 3x3.");
            }

            int[] firstColumn = new int[3];

            // Extracting the first column
            for (int i = 0; i < 3; i++) {
                firstColumn[i] = matrix[i][0];
            }

            return firstColumn;
        }

        public static void main(String[] args) {
            // Example 3x3 matrix
            int[][] matrix = {
                    {1, 2, 3},
                    {4, 5, 6},
                    {7, 8, 9}
            };

            // Getting the first column
            int[] firstColumn = getFirstColumn(matrix);

            // Printing the first column
            for (int element : firstColumn) {
                System.out.println(element);
            }
        }
}
