package Com.PackageSG.Testing.Assignmnet;

class Fruits{
     String Fruits_Name;
     String Fruits_colour;
     String Fruits_Taste;
}
class Vegetable{
     String Vegetable_Name;
     String Vegetable_Curry;
     int Vegetable_Rate;
}
class Flower {
     String flowers_Name;
     String flowers_colour;
     String flowers_use;
}
public class Market {
    public static void main(String[] args) {
        Fruits obj1 = new Fruits();
        obj1.Fruits_Name="Mango";
        obj1.Fruits_colour="yellow";
        obj1.Fruits_Taste="Sweet";
        System.out.println(obj1.Fruits_Name);
        System.out.println(obj1.Fruits_colour);
        System.out.println(obj1.Fruits_Taste);
        System.out.println();

        Vegetable obj2=new Vegetable();
        obj2.Vegetable_Name="palak leaf";
        obj2.Vegetable_Curry="palak panner";
        obj2.Vegetable_Rate=50;
        System.out.println(obj2.Vegetable_Name);
        System.out.println(obj2.Vegetable_Curry);
        System.out.println(obj2.Vegetable_Rate);
        System.out.println();

        Flower obj3=new Flower();
        obj3.flowers_Name="Rose";
        obj3.flowers_colour="red";
        obj3.flowers_use="Rose water";
        System.out.println(obj3.flowers_Name);
        System.out.println(obj3.flowers_colour);
        System.out.println(obj3.flowers_use);

    }
}
