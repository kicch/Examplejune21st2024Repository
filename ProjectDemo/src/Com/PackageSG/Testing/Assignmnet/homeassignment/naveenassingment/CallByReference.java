package Com.PackageSG.Testing.Assignmnet.homeassignment.naveenassingment;
class MyObject {
    int value;//global var

    MyObject(int value) {//construtor
        this.value = value;
    }
}
    public class CallByReference {
        public static void main(String[] args) {
            MyObject obj = new MyObject(10);
            System.out.println("Object value after method call: " + obj.value);
            modifyObject(obj);
        }

        public static void modifyObject(MyObject obj) {
            obj.value = 20; // This changes the object's value
        }
    }



/*In this example, the modifyObject method receives a copy of the reference to obj.
 * Modifying obj.value inside the method affects the original object,
 * as both the original reference and the copied reference point to the same object.*/
