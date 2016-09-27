import java.io.BufferedInputStream;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    static ArrayList<String> stack = new ArrayList();

    public static void main(String[] args) {
	// write your code here
        Scanner scanner = new Scanner(new BufferedInputStream(System.in));
        int testCaseCount = scanner.nextInt();
        scanner.nextLine();

        for(int i = 0; i<testCaseCount; i++){
            int inputNumber1 = scanner.nextInt();
            System.out.println(factorial(inputNumber1));
        }
    }

    static BigInteger factorial(int input){

        BigInteger fact = BigInteger.valueOf(input);
        if (input == 1 || input == 0){
            fact = fact.multiply(BigInteger.ONE);
        }else{
            fact = fact.multiply(factorial(input-1));
        }

        return fact;
    }
}
