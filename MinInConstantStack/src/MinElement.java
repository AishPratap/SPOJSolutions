/**
 * Created by aishpratap on 1/9/17.
 */
public class MinElement {

  StackNode[] stackNodes = new StackNode[6];

  int pointer = -1;

  public static void main(String[] args){

    MinElement minelement = new MinElement();
    minelement.push(6);
    minelement.push(2);
    minelement.push(5);
    minelement.push(1);
    minelement.push(3);
    System.out.println(minelement.min());
    minelement.pop();
    System.out.println(minelement.min());
    minelement.pop();
    System.out.println(minelement.min());
  }


  public void push(int value){

    pointer++;
    StackNode newNode;
    if (pointer > 0){
      StackNode previous = stackNodes[pointer-1];
      if (previous.minValue > value){
        newNode = new StackNode(value,value);
      }else {
        newNode = new StackNode(previous.minValue,value);
      }

    }else {
      newNode = new StackNode(value,value);
    }

    stackNodes[pointer] = newNode;

  }

  public void pop(){
    stackNodes[pointer] = new StackNode(-1,-1);
    pointer--;
  }

  public int min(){
    return stackNodes[pointer].minValue;
  }

  private class StackNode{

    int minValue;
    int value;

    StackNode(int min, int val){
      minValue = min;
      value = val;
    }

  }

}
