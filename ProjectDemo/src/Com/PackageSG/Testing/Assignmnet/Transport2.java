package Com.PackageSG.Testing.Assignmnet;

import com.sun.tools.javac.Main;

class TwoWheel2
{
String vehical_Name;
String vehical_weight;
int vehical_speed;

    TwoWheel2(){
        TwoWheel2  obj1=new TwoWheel2();
        vehical_Name="luna";
        vehical_speed=4000;
        vehical_weight="90000";
        System.out.println("Vehical name ="+vehical_Name);
        System.out.println("Vehical speed="+vehical_speed);
        System.out.println("Vehical weight"+vehical_weight);
    }
}
 class Fourwheel2{
     String vehical_Name;
     String vehical_colour;
     int vehical_speed;

     int vehical_Num;
      Fourwheel2(){
          vehical_Name="Audi";
          vehical_colour="red";
          vehical_speed=7090;
          vehical_Num=50000000;
          System.out.println("Vehical name ="+vehical_Name);
          System.out.println("Vehical colour ="+vehical_colour);
          System.out.println("Vehical speed ="+vehical_speed);
          System.out.println("Vehical number ="+vehical_Num);
          System.out.println();
      }
 }
 class HeavyWheeler2{
     String vehical_Name;
     String vehical_weight;
     String vehical_colour;

     HeavyWheeler2(){
         vehical_Name="sugama";
         vehical_colour="red";
         vehical_weight="8900000";
         System.out.println("Vehical name ="+vehical_Name);
         System.out.println("Vehical colour ="+vehical_colour);
         System.out.println("Vehical weight ="+vehical_weight);
     }
 }
public class Transport2 {
    public static void main(String[] args) {
        TwoWheel2 obj11 =new TwoWheel2();
        Fourwheel2 obj2= new Fourwheel2();
        HeavyWheeler2 OBJ3=new HeavyWheeler2();
    }
}
