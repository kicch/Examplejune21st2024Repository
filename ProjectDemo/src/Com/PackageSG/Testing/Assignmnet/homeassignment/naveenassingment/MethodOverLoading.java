package Com.PackageSG.Testing.Assignmnet.homeassignment.naveenassingment;
public class MethodOverLoading {
   public static int addition(int a ,int b)
    {
        return a+b;
    }
     private int  addition(int a,int b,int c)
    {
       return (a+b+c);
    }
      protected String addition (String name)
    {
        return (name);
    }
    int addition (int arr[]) {
       int sum=0;//3
       for (int i=0;i< arr.length;i++)
       {
           sum=sum+arr[i];//6
       }
       return sum;
    }

    public static void main(String[] args) {
       MethodOverLoading m=new MethodOverLoading() ;
        System.out.println( m.addition(9,49));
        System.out.println( m.addition(9,49,99));
        System.out.println(m.addition("kiccha"));
        System.out.println(m.addition(new int []{3,3,3,3,3,3}));

    }

}

