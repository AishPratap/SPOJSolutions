import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by aishpratap on 1/14/17.
 */
public class Subsets {

  public static void main(String[] args){

    ArrayList<Integer> set = new ArrayList<>(Arrays.asList(1,2,3,4,5));

    for (ArrayList<Integer> sets:getSubsets(set,0)){
      System.out.println(set);
    }

  }

  public static ArrayList<ArrayList<Integer>> getSubsets(ArrayList<Integer> set, int index) {
    ArrayList<ArrayList<Integer>> allsubsets;
    if (set.size() == index) {
      allsubsets = new ArrayList<ArrayList<Integer>>();
      allsubsets.add(new ArrayList<Integer>()); // Empty set
      } else {
      allsubsets = getSubsets(set, index + 1);
      int item = set.get(index);
      ArrayList<ArrayList<Integer>> moresubsets = new ArrayList<ArrayList<Integer>>();
      for(ArrayList<Integer> subset : allsubsets) {
        ArrayList<Integer> newsubset = new ArrayList<Integer>();
        newsubset.addAll(subset); //
        newsubset.add(item);
        moresubsets.add(newsubset);
      }
      allsubsets.addAll(moresubsets);
    }
  return allsubsets;
  }

}
