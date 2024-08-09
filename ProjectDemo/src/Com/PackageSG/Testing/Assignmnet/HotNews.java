package Com.PackageSG.Testing.Assignmnet;
class DailyNews {
    String DailyNews_Firstname;
    String DailyNews_type;
    int DailyNews_number;
    DailyNews(String DailyNews_Firstname,String DailyNews_type,int DailyNews_number){
        this.DailyNews_Firstname=DailyNews_Firstname;
        this.DailyNews_type=DailyNews_type;
        this.DailyNews_number=DailyNews_number;
        System.out.println("DailyNews_Firstname="+DailyNews_Firstname);
        System.out.println("DailyNews_type="+DailyNews_type);
        System.out.println("DailyNews_number="+DailyNews_number);
        System.out.println();
    }

}
class Magazine{
    String Magazine_Firstname;
    String Magazine_type;
    int Magazine_number;
    Magazine(String Magazine_Firstname,String Magazine_type,int Magazine_number){
        this.Magazine_Firstname=Magazine_Firstname;
        this.Magazine_type=Magazine_type;
        this.Magazine_number=Magazine_number;
        System.out.println("Magazine_Firstname="+Magazine_Firstname);
        System.out.println("Magazine_type="+Magazine_type);
        System.out.println("Magazine_number="+Magazine_number);
        System.out.println();
    }
}
class Comics {
    String Comics_name;
    String Comics_type;
    int Comics_number;

    Comics(String Comics_name, String Comics_type, int Comics_number) {
        this.Comics_name = Comics_name;
        this.Comics_type = Comics_type;
        this.Comics_number = Comics_number;
        System.out.println("Comics_name = "+Comics_name);
        System.out.println("Comics_type ="+ Comics_type);
        System.out.println("Comics_number ="+ Comics_number);
        System.out.println();
    }
}
public class HotNews {
    public static void main(String[] args) {
        DailyNews re = new DailyNews("Vijay karnataka", "crime", 8);
        Magazine b1 = new Magazine("clebs talks", "Movies ", 9);
        Comics D1=new Comics("panchatantara","Mythology",55);
    }
}
