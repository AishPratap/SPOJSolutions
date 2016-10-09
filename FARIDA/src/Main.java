/**
 * Created by aishpratap on 10/9/16.
 */
import java.math.BigInteger;
import java.util.Scanner;

public class Main {

    public static void main(String args[]){

        Scanner scanner = new Scanner(System.in);
        int testCases = scanner.nextInt();

        for (int tests = 0; tests<testCases; tests++){

            int monsterCount = scanner.nextInt();
            int[] coinCount = new int[monsterCount + 1];
            coinCount[0] = 0;

            for (int i = 1; i <= monsterCount; i++){
                coinCount[i] = scanner.nextInt();
            }

            Main object = new Main();
            BigInteger maxCoins = object.findMaxCoinsCase(coinCount);

            System.out.println("Case "+ (tests+1) +": "+maxCoins);
        }
    }

    private BigInteger findMaxCoinsCase(int[] coins){

        BigInteger[] maxCoins = new BigInteger[coins.length];
        maxCoins[0] = BigInteger.ZERO;

        for (int i = 0; i<coins.length; i++){

            if (i>1){
                maxCoins[i] = (BigInteger.valueOf(coins[i]).add(maxCoins[i-2])).max(maxCoins[i-1]);
            }else{
                maxCoins[i] = BigInteger.valueOf(coins[i]);
            }

        }
        return maxCoins[maxCoins.length-1];
    }
}
