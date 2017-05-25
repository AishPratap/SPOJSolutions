import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by aishpratap on 5/25/17.
 */
public class PermuDupli {

  public static void main(String[] args){

    int[] nums = new int[] {1,1,1};
    List<List<Integer>> list = new ArrayList<>();
    Arrays.sort(nums);
    getPermutations(list, new ArrayList<Integer>(), nums, new boolean[nums.length]);

    for (List<Integer> perm:list){
      for (Integer i:perm)
        System.out.print(i);
      System.out.println();
    }
  }

  public static void getPermutations(List<List<Integer>> list, List<Integer> temp, int[] nums, boolean[] used){
    if (temp.size() == nums.length){
      list.add(new ArrayList<>(temp));
    }else {
      for (int i = 0; i < nums.length; i ++){
        // next line is important to get rid of the duplicate permutations cuz of duplicate values
        if (used[i] || i > 0 && nums[i] == nums[i-1] && !used[i-1]) continue;
        used[i] = true;
        temp.add(nums[i]);
        getPermutations(list, temp, nums, used);
        used[i] = false;
        temp.remove(temp.size() - 1);
      }
    }
  }
}
