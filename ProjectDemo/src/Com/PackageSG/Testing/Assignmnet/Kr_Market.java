package Com.PackageSG.Testing.Assignmnet;
class shoping{
    String shop_Firstname;
    String shop_type;
    int shop_number;
    shoping(String shop_Firstname,String shop_type,int shop_number){
        this.shop_Firstname=shop_Firstname;
        this.shop_type=shop_type;
        this.shop_number=shop_number;
        System.out.println("shop_Firstname="+shop_Firstname);
        System.out.println("shop_type="+shop_type);
        System.out.println("shop_number="+shop_number);
        System.out.println();
    }

}
class Buyer{
    String Buyer_Firstname;
    String Buyer_type;
    int Buyer_number;
    Buyer(String Buyer_Firstname,String Buyer_type,int Buyer_number){
      this.Buyer_Firstname=Buyer_Firstname;
      this.Buyer_type=Buyer_type;
      this.Buyer_number=Buyer_number;
        System.out.println("Buyer_Firstname="+Buyer_Firstname);
        System.out.println("Buyer_type="+Buyer_type);
        System.out.println("Buyer_number="+Buyer_number);
        System.out.println();

    }

}
class Distributor {
    String Distributor_Firstname;
    String Distributor_type;
    int Distributor_number;

    Distributor(String Distributor_Firstname, String Distributor_type, int Distributor_number) {
        this.Distributor_Firstname = Distributor_Firstname;
        this.Distributor_type = Distributor_type;
        this.Distributor_number = Distributor_number;
        System.out.println("Distributor_Firstname = "+Distributor_Firstname);
        System.out.println("Distributor_type ="+ Distributor_type);
        System.out.println("Distributor_number ="+ Distributor_number);
        System.out.println();
    }

}
public class Kr_Market {
    public static void main(String[] args) {
        shoping k3 = new shoping("arun shop", "vegetable", 1);
        shoping b1 = new shoping("pradeep", "electric", 9);
        Distributor D1=new Distributor("Anil sales","Oganic",8);

    }

}
