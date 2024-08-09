package Com.PackageSG.Testing.Assignmnet.homeassignment;

import java.util.ArrayList;
import java.util.List;

public class EvenNumbers {

        public static String getEvenNumbers() {
            // Use a StringBuilder to build the string of even numbers
            StringBuilder result = new StringBuilder();

            // Loop through the range and append even numbers to the result
            for (int i = 10; i <= 20; i++) {
                if (i % 2 == 0) {
                    result.append(i).append(" ");
                }
            }
            // Convert the StringBuilder to a string and trim any trailing whitespace
            return result.toString();
        }

        public static void main(String[] args) {
            // Calling the method and printing the even numbers
            String evens = getEvenNumbers();
            System.out.println("Even numbers from 10 to 20: " + evens);
        }
    }
