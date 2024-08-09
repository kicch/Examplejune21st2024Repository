package Com.PackageSG.Testing.Assignmnet.homeassignment;

public class Friends {
    public static String[] getFriendNames() {
        // Array of three friend names
        String[] friendNames = {"Alice", "Bob", "Charlie"};
        return friendNames;
    }

    public static void main(String[] args) {
        // Calling the method and printing the friend names
        String[] names = getFriendNames();
        for (String name : names) {
            System.out.println(name);
        }
    }

}
