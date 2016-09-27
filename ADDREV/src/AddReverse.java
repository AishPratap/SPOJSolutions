/**
 * Created by aishpratap on 9/26/16.
 */
import java.io.BufferedInputStream;
import java.util.Scanner;

public class AddReverse {

    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(new BufferedInputStream(System.in));
        int testCaseCount = scanner.nextInt();
        scanner.nextLine();

        for(int i = 0; i<testCaseCount; i++){
            int inputNumber1 = reverseDigits(scanner.nextInt());
            int inputNumber2 = reverseDigits(scanner.nextInt());

            int sum = reverseDigits(inputNumber1 + inputNumber2);
            System.out.println(sum);
        }
    }

    static int reverseDigits(int number){

        int resultNumber = 0;

        while(number>0){
            resultNumber = resultNumber*10;
            resultNumber = resultNumber + number%10;
            number = number/10;
        }

        return resultNumber;
    }
}
