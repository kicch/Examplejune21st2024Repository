package Com.PackageSG.Testing.Assignmnet;
class Purchasing_Agent{
    Purchasing_Agent(String Name,String Address){
        System.out.println("Name="+Name+"Address="+Address);
    }
    Purchasing_Agent(String Dealer_name,int cost_of_deal){
        System.out.println("Dealer_name="+Dealer_name+" "+"cost_of_deal="+cost_of_deal);
    }
    Purchasing_Agent(int rent,String Month,int year){
        System.out.println("rent="+rent+" "+"Month="+Month+" "+"year="+year);
    }
}
public class Suppier {
    public static void main(String[] args) {
        Purchasing_Agent p1= new Purchasing_Agent("Gopalan Buyers","L-3939 4th cross banglore");
        Purchasing_Agent P2= new Purchasing_Agent("Madusudhan rao",5600000);
        Purchasing_Agent p3=new Purchasing_Agent(700000,"feb",2020);
    }
}
