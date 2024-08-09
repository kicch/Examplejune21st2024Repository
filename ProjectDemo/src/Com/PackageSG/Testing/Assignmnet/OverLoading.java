package Com.PackageSG.Testing.Assignmnet;

class Product {
    Product(String Name) {
        System.out.println(Name);
    }

    Product(int Age) {
        System.out.println(Age);
    }

    Product(int Rate,String colour) {
        System.out.println(colour+Rate);
    }
}
    public class OverLoading {
        public static void main(String[] args) {
            Product P  = new  Product("GoodDay");
            Product p1 = new Product(10);
            Product p2 = new Product(99,"Blue");
        }
    }