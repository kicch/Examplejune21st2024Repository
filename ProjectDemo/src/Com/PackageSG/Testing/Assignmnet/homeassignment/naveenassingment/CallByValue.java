package Com.PackageSG.Testing.Assignmnet.homeassignment.naveenassingment;

public class CallByValue
{
    public static void modifyPrimitive(int value) {
    value = 20; // This only changes the local copy
      System.out.println(value);
}
    public static void main(String[] args)
    {
        int realvalue = 10;
        System.out.println("Original value after method call: " + realvalue); // Output: 10
        modifyPrimitive(realvalue);
    }
}
/*In this example, the modifyPrimitive method receives a copy of originalvalue.
Changing value inside the method does not affect the real originalvalue variable.*/
