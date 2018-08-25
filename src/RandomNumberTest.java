/**
 * Create an example that will print out 100 random number from a range
 */

import java.security.SecureRandom;

public class RandomNumberTest {
    public static void main(String[] args) {
        // Create an object of SecureRandom class

        SecureRandom random = new SecureRandom();

        for(int i = 0; i < 100; i++) {


            int num1 = random.nextInt(10); // This generates a random number between 0 - 9
            System.out.println("num1 = " + num1);

            // To generate number between 1 and 10, add 1 to the generated number
            int num2 = random.nextInt(10) + 1; // this results in number between 1 and 10

            System.out.println("num2 = " + num2);
        }

    }
}
