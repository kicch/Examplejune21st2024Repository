package Com.PackageSG.Testing.Assignmnet.homeassignment;

public class SomeOfSquares {
        public static void main(String[] args) {
            int sum = 0;

            // Loop through numbers from 1 to 10
            for (int i = 1; i <= 10; i++) {
                // Calculate the square of the current number
                int square = i * i;

                // Add the square to the sum
                sum += square;
            }

            // Display the sum of squares
            System.out.println("The sum of the squares of numbers from 1 to 10 is: " + sum);
        }
    }
