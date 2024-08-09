package Com.PackageSG.Testing.Assignmnet.homeassignment;

public class MatrixString {
    public static String concatenateMatrix(String[][] matrix) {
        StringBuilder result = new StringBuilder();

        // Iterating through the 2D array
        for (String[] row : matrix) {
            for (String element : row) {
                result.append(element).append(" ");
            }
        }

        // Convert StringBuilder to String and trim any trailing whitespace
        return result.toString().trim();
    }

    public static void main(String[] args) {
        // Example 2D string array
        String[][] matrix = {
                {"Hello", "World"},
                {"Java", "Programming"},
                {"is", "fun"}
        };

        // Getting the concatenation result
        String concatenatedString = concatenateMatrix(matrix);

        // Printing the concatenated result
        System.out.println(concatenatedString);
    }
}
