package Com.PackageSG.Testing.Assignmnet;
class Wholesales {
    String Wholesales_Firstname;
    String Wholesales_type;
    int Wholesales_number;
    Wholesales(String Wholesales_Firstname,String Wholesales_type,int Wholesales_number){
        this.Wholesales_Firstname=Wholesales_Firstname;
        this.Wholesales_type=Wholesales_type;
        this.Wholesales_number=Wholesales_number;
        System.out.println("Wholesales_Firstname="+Wholesales_Firstname);
        System.out.println("Wholesales_type="+Wholesales_type);
        System.out.println("Wholesales_number="+Wholesales_number);
        System.out.println();
    }

}
class Retailer{
    String Retailer_Firstname;
    String Retailer_type;
    int Retailer_number;
    Retailer(String Retailer_Firstname,String Retailer_type,int Retailer_number){
        this.Retailer_Firstname=Retailer_Firstname;
        this.Retailer_type=Retailer_type;
        this.Retailer_number=Retailer_number;
        System.out.println("Retailer_number_Firstname="+Retailer_Firstname);
        System.out.println("Retailer_type="+Retailer_type);
        System.out.println("Retailer_number="+Retailer_number);
        System.out.println();

    }
}
class Customer2 {
    String Customer_Firstname;
    String Customer_type;
    int Customer_number;

    Customer2(String Customer_Firstname, String Customer_type, int Customer_number) {
        this.Customer_Firstname = Customer_Firstname;
        this.Customer_type = Customer_type;
        this.Customer_number = Customer_number;
        System.out.println("Customer_Firstname = "+Customer_Firstname);
        System.out.println("Customer_type ="+ Customer_type);
        System.out.println("Customer_number ="+ Customer_number);
        System.out.println();
    }
}
public class Shopping {
    public static void main(String[] args) {
        Wholesales re = new Wholesales("cotton king", "cloths", 100);
        Retailer b1 = new Retailer("kiran kallur", "money minded", 90);
        Customer2 D1=new Customer2("kiccha","Oganic cotton",908);

    }

}