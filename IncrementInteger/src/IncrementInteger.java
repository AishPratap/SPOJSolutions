import java.util.Arrays;

/**
 * Created by aishpratap on 1/7/17.
 */
public class IncrementInteger {

  public static void main(String[] args){

    IncrementInteger incInt = new IncrementInteger();
    int[] number = {1,9,9};
    incInt.incrementInteger(number);

  }

  public void incrementInteger(int[] nums){

    int index = nums.length -1;
    int incDigit = this.addOne(nums[index]);
    nums[index] = incDigit;
    index --;
    while (incDigit == 0 && index >= 0){
      incDigit = this.addOne(nums[index]);
      nums[index] = incDigit;
      index --;
    }

    if (incDigit == 0){
      int[] newArray = new int[nums.length +1];
      for (int i = 0; i < newArray.length; i ++){
        if (i == 0){
          newArray[i] = 1;
        }
        else{
          newArray[i] = nums[i-1];
        }
      }

      nums = newArray;
    }

    System.out.println(Arrays.toString(nums));

  }

  public int addOne(int digit){
    if (digit + 1 > 9){
      return 0;
    }else {
      return digit + 1;
    }
  }

}
