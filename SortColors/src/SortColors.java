/**
 * Created by aishpratap on 1/7/17.
 */
public class SortColors {

  public static void main (String[] args){

    SortColors sort = new SortColors();
    int[] array = {1,2,0};

    sort.sortColors(array);

  }

  public void sortColors(int[] nums) {

    int finalIndex = nums.length-1;
    int initial = 0;
    for(int i = 0; i <= finalIndex; i ++){
      while(nums[i] == 2 && i < finalIndex){
        nums[i] = nums[finalIndex];
        nums[finalIndex] = 2;
        finalIndex--;
      }
      while(nums[i] == 0 && i > initial){
        nums[i] = nums[initial];
        nums[initial] = 0;
        initial++;
      }
    }

    System.out.println(nums);

  }


}
