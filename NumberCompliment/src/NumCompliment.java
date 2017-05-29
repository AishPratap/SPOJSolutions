/**
 * Created by aishpratap on 5/28/17.
 */
public class NumCompliment {

  public static void main(String[] args){

    int num = 30;

    int mask = num;

    mask |= mask>>1;
    mask |= mask>>2;
    mask |= mask>>4;
    mask |= mask>>16;

    System.out.println(num^mask);
  }
}
