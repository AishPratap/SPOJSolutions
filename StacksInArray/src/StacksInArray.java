import java.util.Arrays;

/**
 * Created by aishpratap on 1/9/17.
 */
public class StacksInArray {

  int stackSize = 2;
  int stackCount = 3;
  int[] stackArray = new int[stackSize*stackCount];
  int[] stackPointer = {-1,-1,-1};

  public static void main(String[] args){

    StacksInArray stArray = new StacksInArray();
    stArray.push(1,2);
    stArray.push(2,3);
    stArray.push(2,4);
    stArray.push(0,5);
    stArray.push(1,6);
    stArray.push(0,7);

    System.out.println(Arrays.toString(stArray.stackArray));

    stArray.pop(0);
    stArray.pop(1);
    stArray.pop(2);

    System.out.println(Arrays.toString(stArray.stackArray));
  }

  public boolean push(int stackNumber, int value){

    if (stackSize > stackPointer[stackNumber] + 1){
      int index = stackNumber*stackSize + stackPointer[stackNumber] + 1;
      stackArray[index] = value;
      stackPointer[stackNumber]++;
      return true;
    }

    return false;
  }

  public boolean pop(int stackNumber){

    if (stackPointer[stackNumber] >= 0){
      int index = stackNumber*stackSize + stackPointer[stackNumber];
      stackArray[index] = -1;
      stackPointer[stackNumber]--;
      return true;
    }

    return false;
  }

}
