/**
 * Created by aishpratap on 9/26/16.
 */
import java.io.BufferedInputStream;
import java.util.Scanner;

public class PRIME1 {
    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(new BufferedInputStream(System.in));
        int testCaseCount = scanner.nextInt();

        for (int i = 0; i < testCaseCount; i++) {
            int lowerLimit = scanner.nextInt();
            int upperLimit = scanner.nextInt();

            for (int j = lowerLimit; j <= upperLimit; j++) {
                if (isPrime(j)) {
                    System.out.println(j);
                }
            }
            System.out.println();
        }
    }

    static boolean isPrime(int number){

        if (number == 1)
            return false;
        if (number == 2)
            return true;
        if (number == 3)
            return true;
        if (number%2 == 0)
            return false;
        if (number%3 == 0)
            return false;

        int initializer = 5;
        int incrementor = 2;
        while (initializer*initializer <= number){
            if (number%initializer == 0)
                return false;

            initializer += incrementor;
            incrementor = 6 - incrementor;
        }

        return true;
    }
}
