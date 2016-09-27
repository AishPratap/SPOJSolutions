/**
 * Created by aishpratap on 9/26/16.
 */
import java.io.BufferedInputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class Feynman {

    static ArrayList<String> stack = new ArrayList();

    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(new BufferedInputStream(System.in));
        while (scanner.hasNextInt()){

            int input = scanner.nextInt();
            if (input > 0){

                int squareCount = 0;

                for (int i = input; i>0; i--){

                    squareCount += i*i;

                }
                System.out.println(squareCount);
            }else{
                break;
            }
        }
    }
}

