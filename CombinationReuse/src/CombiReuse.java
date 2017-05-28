/**
 * Created by aishpratap on 5/25/17.
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombiReuse {

  public static void main(String[] args){

    int[] nums = new int[]{2,4,5,6};
    int result = 23;
    List<List<Integer>> list = new ArrayList<>();
    Arrays.sort(nums);
    findCombinations(list, new ArrayList<Integer>(), nums, result, 0);

    for (List<Integer> comb:list){
      for (Integer i:comb){
        System.out.print(i + " ");
      }
      System.out.println();
    }
  }

  public static void findCombinations(List<List<Integer>> list,
                                      List<Integer> temp,
                                      int[] array,
                                      int remainder,
                                      int start){
    if (remainder == 0){
      list.add(new ArrayList<>(temp));
    }else if (array[0] > remainder){
      return;
    }else {
      for (int i = start; i < array.length; i++){
        temp.add(array[i]);
        findCombinations(list,temp,array, remainder - array[i], i);
        temp.remove(temp.size() - 1);
      }
    }
  }
}
