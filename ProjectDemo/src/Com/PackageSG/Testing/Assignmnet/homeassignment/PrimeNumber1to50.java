package Com.PackageSG.Testing.Assignmnet.homeassignment;

public class PrimeNumber1to50 {
    public static void main(String[] args) {
        int primecount=0;
        int sum = 0;
        for (int j = 1; j <50 ; j++) {
            int num = j ;
            int count= 0;

            for (int i = 1; i < num; i++)
            {
                   if(num % i == 0)
                {
                    count++;
                }
            }
            if(count == 2) //if(count!=2)
            {
                primecount++;
                sum = sum+num;
                System.out.println(num + "is a prime number");
            }
        }
        System.out.println("The count of primenumber is:" +primecount);
        System.out.println("The sum of primenumber is:" +sum);
    }
}
