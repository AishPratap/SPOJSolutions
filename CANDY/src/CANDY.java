/**
 * Created by aishpratap on 10/2/16.
 */

import java.util.Scanner;
import java.util.stream.IntStream;

public class CANDY {

    public static void main(String args[]){

        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNextInt()){
            int numberOfBoxes = scanner.nextInt();
            int[] candyCount = new int[10001];

            for (int i = 0; i < numberOfBoxes; i++){
                candyCount[i] = scanner.nextInt();
            }

            CANDY candyObject = new CANDY();
            candyObject.distributeCandies(candyCount, numberOfBoxes);
        }
    }

    private void distributeCandies(int[] candies, int candyBoxes){
        long sum = IntStream.of(candies).asLongStream().sum();

        if (sum%candyBoxes != 0){
            System.out.println("-1");
        }else{

            long avg = sum/candyBoxes;
            int moveNums = 0;
            for (int i = 0; i < candyBoxes; i++){
                if (candies[i]<avg){
                    moveNums += avg - candies[i];
                }
            }
            System.out.println(moveNums);
        }
    }
}
