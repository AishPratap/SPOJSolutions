/**
 * Created by aishpratap on 5/28/17.
 */
public class BitAdd {

  public static void main(String[] args){

    System.out.println(add(4,5));

  }

  public static int add(int a, int b){
    return b==0?a:add(a^b, (a&b)<<1);
  }
}
