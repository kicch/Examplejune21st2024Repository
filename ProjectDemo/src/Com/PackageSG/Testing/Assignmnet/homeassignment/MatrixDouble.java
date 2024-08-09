package Com.PackageSG.Testing.Assignmnet.homeassignment;

public class MatrixDouble {
    public static double[][] createDoubleMatrix() {
        // Creating and initializing a 2D double array
        double[][] matrix = {
                {1.1, 2.2, 3.3},
                {4.4, 5.5, 6.6},
                {7.7, 8.8, 9.9}
        };

        return matrix;
    }

    public static void main(String[] args) {
        // Calling the method and getting the 2D double array
        double[][] matrix = createDoubleMatrix();

        // Printing the 2D double array
        for (double[] row : matrix) {
            for (double element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }
}
