package Com.PackageSG.Testing.Assignmnet.homeassignment;

public class CallByValue {
    public static void main(String[] args) {
        int value = 10;//Global variable
        System.out.println("Original value after method call: " + value); // Output: 10
        modifyPrimitive(value);
    }

    // Method to attempt to modify the primitive value
    public static void modifyPrimitive(int value) {
        value = 20; // This only changes the local copy
        System.out.println(value);
    }
}
