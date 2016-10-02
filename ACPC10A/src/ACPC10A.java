/**
 * Created by aishpratap on 10/2/16.
 */

import java.util.Scanner;

public class ACPC10A {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNext()){
            String input = scanner.nextLine();
            String[] strArray = input.split(" ");
            int[] numbers = new int[strArray.length];

            int zeroCount = 0;

            for (int i = 0; i<strArray.length; i++){
                numbers[i] = Integer.parseInt(strArray[i]);
                if (numbers[i] == 0)
                    zeroCount ++;
            }

            if (zeroCount == 3){
                break;
            }

            ACPC10A obj = new ACPC10A();

            if (obj.isAP(numbers)){
                System.out.println("AP " + (numbers[2]+(numbers[2] - numbers[1])));
            }else{
                System.out.println("GP " + (numbers[2]*(numbers[2]/numbers[1])));
            }
        }
    }

    private boolean isAP(int[] numbers){
        if (numbers[1] - numbers[0] == numbers[2] - numbers[1]){
            return true;
        }

        return false;
    }
}
