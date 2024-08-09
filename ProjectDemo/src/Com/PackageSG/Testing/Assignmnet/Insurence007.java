package Com.PackageSG.Testing.Assignmnet;
class Insurnence {
    Insurnence(String Insurnence_Name, String Address) {
        System.out.println("Insurnence_Name="+Insurnence_Name);
    }

    Insurnence(String Insurnence_type, int cost_of_Insurnence) {
        System.out.println("Insurnence_type=" + Insurnence_type + "cost_of_Insurnence=" + cost_of_Insurnence);
    }

    Insurnence(int Insurnence_rent, String Insurnence_holdername , int Insurnence_Monthly) {
        System.out.println("Insurance_rent=" + Insurnence_rent + "+  +Insurnence_holdername=" + Insurnence_holdername + "Insurnence_Monthly=" + Insurnence_Monthly);
    }
}
public class Insurence007 {
    public static void main(String[] args) {
        Insurnence I1= new Insurnence("anil","L-988 , 4th cross main road Banglore ");
        Insurnence I2= new Insurnence("Life_Insurnence",600);
        Insurnence I3= new Insurnence(5000,"ravi",07);
    }
}
