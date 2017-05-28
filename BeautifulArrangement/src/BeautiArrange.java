import java.util.ArrayList;
import java.util.List;

/**
 * Created by aishpratap on 5/28/17.
 */
public class BeautiArrange {

  public static void main(String[] args){

    System.out.println(countArrangement(3));

  }

  public static int countArrangement(int N) {

    List<List<Integer>> integerList = new ArrayList<>();

    arrangements(N, new boolean[N], new ArrayList<>(),integerList);

    return integerList.size();
  }

  public static void arrangements(int n, boolean[] used, List<Integer> temp, List<List<Integer>> integerList){

    if (temp.size() == n){
      integerList.add(temp);
    }
    else {
      for (int i = 1; i <= n; i++) {

        int index = temp.size() + 1;

        if (((index > 0 && (i % index == 0 || index % i == 0)) || index == 0) && !used[i-1]) {

          temp.add(i);
          used[i-1] = true;
          arrangements(n, used, temp, integerList);
          used[i-1] = false;
          temp.remove(temp.size() - 1);

        }
      }
    }
  }
}
