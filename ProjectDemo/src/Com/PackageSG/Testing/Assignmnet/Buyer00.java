package Com.PackageSG.Testing.Assignmnet;
class Shope {
    Shope(String name) {
        System.out.println("Name="+name);
    }
    Shope(int salefor) {
        System.out.println("salefor rupes="+salefor);
    }
    Shope(int Rate,String colour) {
        System.out.println("Rate="+Rate+":"+"colour="+colour);
    }
}
public class Buyer00 {
    public static void main(String[] args) {
        Shope P = new Shope("Arun pan shop");
        Shope p1 = new Shope(100000000);
        Shope p2 = new Shope(102020,"yellow");
    }
}
