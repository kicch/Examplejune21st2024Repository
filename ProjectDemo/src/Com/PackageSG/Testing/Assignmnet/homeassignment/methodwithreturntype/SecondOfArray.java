package Com.PackageSG.Testing.Assignmnet.homeassignment.methodwithreturntype;

public class SecondOfArray {
    public static void main(String[] args) {

            int arr[] = {10, 20, 30, 40, 50, 60, 70};
            SecondOfArray soa = new SecondOfArray();
            int result = soa.SecondOfArray1(arr);
            System.out.println("The second element from the middle is: " + result);
    }
    int SecondOfArray1(int arr[]) {
        if (arr.length > 0) {
            int halfarray = arr.length / 2;

            // Ensure the array has at least one element starting from the middle
            if (arr.length > halfarray) {
                // Print the elements from the middle
                for (int i = halfarray; i < arr.length; i++) {
                    System.out.println(arr[i]);
                }
                // Return the second element from the middle
                return arr[halfarray];
            }
        }
        // If array length is less than 2 elements, return -1 (or some default value)
        return -1; // Or handle as needed
    }
}

