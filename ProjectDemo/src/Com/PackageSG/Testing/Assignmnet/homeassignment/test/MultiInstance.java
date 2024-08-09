package Com.PackageSG.Testing.Assignmnet.homeassignment.test;
//3st question
public class MultiInstance {
    {
        System.out.println("instance block 1");
    }
    {
        System.out.println("instance block 2");
    }
    {
        System.out.println("instance block 3");
    }

    public static void main(String[] args) {
        MultiInstance M=new MultiInstance();
    }

  }
