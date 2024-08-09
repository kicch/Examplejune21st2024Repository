package Com.PackageSG.Testing.Assignmnet.homeassignment;

public class ByteArrayToIntArray {
    public static void main(String[] args) {
        // Define a byte array
        byte[] byteArray = {10, 20, 30, 40, 50};

        // Create an int array of the same length as the byte array
        int[] intArray = new int[byteArray.length];

        // Assign each element of the byte array to the int array
        for (int i = 0; i < byteArray.length; i++) {
            intArray[i] = byteArray[i];
        }

        // Display the elements of the int array
        System.out.println("Elements of the int array:");
        for (int element : intArray) {
            System.out.print(element + " ");
        }
    }
}
