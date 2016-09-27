/**
 * Created by aishpratap on 9/26/16.
 */
import java.io.BufferedInputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class NumberSteps {
    static ArrayList<String> stack = new ArrayList();

    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(new BufferedInputStream(System.in));
        int testCaseCount = scanner.nextInt();
        scanner.nextLine();

        for(int i = 0; i<testCaseCount; i++){
            int inputNumber1 = scanner.nextInt();
            int inputNumber2 = scanner.nextInt();

            int remainder = inputNumber1/2;

            if (inputNumber1 == inputNumber2){

                System.out.println(remainder*2 + inputNumber1);

            }else if(inputNumber1 == inputNumber2 + 2){

                System.out.println((remainder-1)*2 + inputNumber1);

            }else{

                System.out.println("No Number");

            }
        }
    }
}
