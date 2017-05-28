/**
 * Created by aishpratap on 5/28/17.
 */
public class ReverseInt {

  public static void main(String[] args){

    System.out.println(reverseNumber(321));

  }

  public static int reverseNumber(int number){
    long rev = 0;

    while (number!=0){
      rev = rev*10 + number%10;
      number = number/10;

      if (rev > Integer.MAX_VALUE || rev < Integer.MIN_VALUE){
        return 0;
      }
    }

    return (int) rev;
  }

}
