package Com.PackageSG.Testing.Assignmnet.homeassignment;
public class FirstAndLastElement {
    public static void main(String[] args) {
        // Define a 1-D integer array
        int[] numbers = {10, 20, 30, 40, 50};

        // Check if the array is not empty
        if (numbers.length > 0) {
            // Display the first element
            System.out.println("First element: " + numbers[0]);

            // Display the last element
            System.out.println("Last element: " + numbers[numbers.length - 1]);
        } else {
            System.out.println("The array is empty.");
        }
    }
}


