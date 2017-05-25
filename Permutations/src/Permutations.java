/**
 * Created by aishpratap on 5/24/17.
 */

import java.util.ArrayList;
import java.util.List;

public class Permutations {

  public static void main(String[] args){

    int[] nums = new int[]{1,2,3};

    List<List<Integer>> list = new ArrayList<>();
    getPermutations(list, new ArrayList<Integer>(), nums);

    for (List<Integer> perm:list){
      for (Integer i:perm){
        System.out.print(i);
      }
      System.out.println();
    }

  }

  public static void getPermutations(List<List<Integer>> list, List<Integer> temp, int[] array){

    if(temp.size() == array.length){
      list.add(new ArrayList<>(temp));
    }else{
      for (int i = 0; i < array.length; i ++ ){
        if (temp.contains(array[i])) continue;
        temp.add(array[i]);
        getPermutations(list, temp, array);
        temp.remove(temp.size() - 1);
      }
    }
  }

}
