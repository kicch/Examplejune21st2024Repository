package Com.PackageSG.Testing.Assignmnet;
class Twowheeler
{
     String vehical_Name;
     String vehical_weight;
     int vehical_speed;
}
    class FourWheeler{
    String vehical_Name;
    String vehical_colour;
    int vehical_speed;
    int vehical_Num;
    }
    class HeavyWheels{
    String vehical_Name;
    String vehical_weight;
    String vehical_colour;
    }
public class Transport {
    public static void main(String[] args) {
        Twowheeler  obj1=new Twowheeler();
        obj1.vehical_Name="Bullet";
        obj1.vehical_speed=300;
        obj1.vehical_weight="70000";
        System.out.println("Vehical name ="+obj1.vehical_Name);
        System.out.println("Vehical speed="+obj1.vehical_speed);
        System.out.println("Vehical weight"+obj1.vehical_weight);
        System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
        FourWheeler obj2=new FourWheeler();
        obj2.vehical_Name="maruthi 800";
        obj2.vehical_colour="red";
        obj2.vehical_speed=700;
        obj2.vehical_Num=90000000;
        System.out.println("Vehical name ="+obj2.vehical_Name);
        System.out.println("Vehical colour ="+obj2.vehical_colour);
        System.out.println("Vehical speed ="+obj2.vehical_speed);
        System.out.println("Vehical number ="+obj2.vehical_Num);
        System.out.println("*********************************************************************");
        HeavyWheels obj3=new HeavyWheels();
        obj3.vehical_Name="VRL Bus";
        obj3.vehical_colour="yellow";
        obj3.vehical_weight="400000";
        System.out.println("Vehical name ="+obj3.vehical_Name);
        System.out.println("Vehical colour ="+obj3.vehical_colour);
        System.out.println("Vehical weight ="+obj3.vehical_weight);
    }
}
