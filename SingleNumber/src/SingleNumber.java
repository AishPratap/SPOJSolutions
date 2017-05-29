/**
 * Created by aishpratap on 5/28/17.
 */
public class SingleNumber {

  public static void main(String[] args){

    int[] nums = new int[]{1,2,3,4,5,5,4,3,1};
    System.out.println(singleNum(nums));

  }

  public static int singleNum(int[] nums){
    int result = 0;
    for(int i:nums){
      result ^= i;
    }

    return result;
  }
}
