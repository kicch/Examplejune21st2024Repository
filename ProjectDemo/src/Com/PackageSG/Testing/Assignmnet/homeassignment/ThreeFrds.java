package Com.PackageSG.Testing.Assignmnet.homeassignment;
class Friends33{
    String[] display_friends(){
        String[] frd={"kiccha","ankith","lion"};
        return frd;
    }
}
public class ThreeFrds {
    public static void main(String[] args) {
        Friends33 FRD=new Friends33();
      String[] F=FRD.display_friends();
        for(String frdname:F){
            System.out.println(frdname);
        }


    }

}
