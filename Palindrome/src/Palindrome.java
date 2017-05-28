import java.util.ArrayList;
import java.util.List;
/**
 * Created by aishpratap on 5/25/17.
 */
public class Palindrome {

  public static void main(String[] args){

    String string = "aabcc";
    List<List<String>> palins = new ArrayList<>();
    findPalindrome(palins, new ArrayList<String>(), string, 0);

    for (List<String> list:palins)
    {
      for (String s: list)
        System.out.print(s + " ");
      System.out.println();
    }
  }

  public static void findPalindrome(List<List<String>> palins, List<String> temp, String s, int start){

    if (s.length() == start){
      palins.add(new ArrayList<>(temp));
    }else {
      for (int i = start; i < s.length(); i++) {
        if (isPalin(s, start, i)) {
          temp.add(s.substring(start, i + 1));
          findPalindrome(palins, temp, s, i + 1);
          temp.remove(temp.size() - 1);
        }
      }
    }
  }

  public static boolean isPalin(String s, int low, int high){

    while(low < high){
      if(s.charAt(low++) != s.charAt(high--))
        return false;
    }

    return true;
  }
}
