import java.util.Scanner;

/**
 * Created by aishpratap on 10/10/16.
 */
public class Main {

    public static void main(String args[]){

        Scanner scanner = new Scanner(System.in);
        int testCases = scanner.nextInt();

        for (int tests=0; tests<testCases; tests++){
            int marriageCount = scanner.nextInt();

            int[][] womenPreference = new int[marriageCount][marriageCount+1];
            int[][] menPreference = new int[marriageCount][marriageCount+1];

            for (int i=0; i<2*marriageCount; i++){

                int j = 0;

                while (j<=marriageCount) {

                    if (i >= marriageCount) {
                        menPreference[i-marriageCount][j] = scanner.nextInt();
                    } else {
                        womenPreference[i][j] = scanner.nextInt();
                    }
                    j++;
                }
            }

            Main obj = new Main();
            obj.setupStableMatching(menPreference,womenPreference);
        }
    }

    private void setupStableMatching(int[][] menPreference, int[][] womenPreference){

        int[] men = new int[menPreference.length];
        int[] women = new int[womenPreference.length];

        for (int i=0; i<menPreference.length; i++){
            men[i] = -1;
            women[i] = -1;
        }

        while (true){

            int freeWoman = this.findNextFreeWoman(women);

            if (freeWoman == -1){
                break;
            }

            for (int m=0; m<men.length; m++){

                if (men[m] == -1){
                    men[m] = freeWoman+1;
                    women[freeWoman] = m+1;
                    break;
                }

                if (this.isBetterMatch(menPreference,men[m],freeWoman+1,m)){
                    women[men[m]-1] = -1;
                    women[freeWoman] = m+1;
                    men[m] = freeWoman+1;
                    break;
                }

            }

        }

        this.showResults(men,women);
    }

    private int findNextFreeWoman(int[] women){

        for (int i=0; i<women.length; i++){

            if (women[i] == -1){
                return i;
            }
        }
        return -1;
    }

    private boolean isBetterMatch(int[][] menPreference, int currentPartner, int newPartner, int man){

        int currentPartenerIndex = -1;
        int newPartenerIndex = -1;

        for (int i=1; i<menPreference[0].length; i++){

            if (menPreference[man][i] == currentPartner){
                currentPartenerIndex = i;
            }
            if (menPreference[man][i] == newPartner){
                newPartenerIndex = i;
            }
        }

        if (newPartenerIndex<currentPartenerIndex){
            return true;
        }

        return false;
    }

    private void showResults(int[] men, int[] women){
        for (int i = 0; i<men.length; i++){
            System.out.println((i+1) + " " + men[i]);
        }
    }
}
