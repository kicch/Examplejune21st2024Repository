package Com.PackageSG.Testing.Assignmnet.homeassignment;

public class SecondHalfArray {
    public static void main(String[] args) {
        // Define a 1-D integer array
        int[] numbers = {10, 20, 30, 40, 50, 60, 70, 80,90,100};

        // Check if the array has elements
        if (numbers.length > 0) {
            // Calculate the starting index for the second half
            int startIndex = numbers.length / 2;//50,60,70,80,90

            // Display the elements from the second half of the array
            System.out.println("Second half of the array:");
            for (int i = startIndex; i < numbers.length; i++) {
                System.out.print(numbers[i] + " ");
            }
        }
    }
}