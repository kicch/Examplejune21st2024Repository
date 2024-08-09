package Com.PackageSG.Testing.Assignmnet;
class FlowerTwo {
    String flower_name;
    String flower_colour;
    int flower_count;
    String flower_oder;

    FlowerTwo(){
        String flower_name="Lilly";
        String flower_colour="Pink";
        int flower_count= 34;
        String flower_oder="Greet";
        System.out.println("flowers name="+flower_name);
        System.out.println("flowers colour="+flower_colour);
        System.out.println("flowers count by num ="+flower_count);
        System.out.println("flowers oder=" +flower_oder);
        System.out.println("********************************Hare krishna***************************************");
    }
}
class Fruits2{
    String Fruit_name;
    String Fruit_taste;
    String Fruit_colour;
    int Fruit_size;

    Fruits2(){
        String Fruit_name="Apple";
        String Fruit_taste="ok ok";
        String Fruit_colour="Not sure because all are chemically cotted ";
        int Fruit_size=12;
        System.out.println("Fruit name="+Fruit_name);
        System.out.println("fruit Colour="+Fruit_colour);
        System.out.println("fruit taste="+Fruit_taste);
        System.out.println("fruit size="+Fruit_size);
        System.out.println("******************Hare Rama******************8");
    }

}
class GreenLeaf{
    String GreenLeaf_name;
    String GreenLeaf_taste;
    String GreenLeaf_colour;
    int GreenLeaf_cost;


    GreenLeaf(){
        String GreenLeaf_name="curry-leaf";
        String GreenLeaf_taste="does not matter but it good for eyes and its improves food tast as well";
        String GreenLeaf_colour="How stupid!! Name it slf say its all";
        int GreenLeaf_cost=34;
        System.out.println("Leaf_name="+GreenLeaf_name);
        System.out.println("Leaf_colour="+GreenLeaf_colour);
        System.out.println("Leaf_taste="+GreenLeaf_taste);
        System.out.println("leaf_cost="+GreenLeaf_cost);
        System.out.println("*****************Rama Rama ... Hare hare..****************************************");
    }
}
public class Market2 {
    public static void main(String[] args) {
        FlowerTwo lill = new FlowerTwo();
        Fruits2 fru = new Fruits2();
        GreenLeaf green = new GreenLeaf();
    }
}

