package Com.PackageSG.Testing.Assignmnet.homeassignment.methodwithreturntype;
class Even {
    int GetEven(int num) {
        if (num % 2 == 0) {
            System.out.println("Num is even:");
        }else {
            System.out.println("num is odd:");
        }
        return num;
    }
}
      class Odd{
        int getOdd(int num1) {
            if (num1 % 2 == 1) {
                System.out.println("num is odd:");

            }else{
                System.out.println("num is even:");
            }
            return num1;
        }
      }

public class OddEven {
    public static void main(String[] args) {
        Even a1=new Even();
      int x= a1.GetEven(9);
        System.out.println(x);
        Odd O1= new Odd();
       int t= O1.getOdd(8);
        System.out.println(t);

    }
}
