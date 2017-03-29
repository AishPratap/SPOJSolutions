import java.util.Arrays;

/**
 * Created by aishpratap on 1/7/17.
 */
public class Anagrams {

  public static void main(String[] args){

    Anagrams ana = new Anagrams();
    if(ana.isAnagram("qwerty", "ytrrwq")){
      System.out.println("Anagrams");
    }else {
      System.out.println("Not Anagrams");
    }

  }

  public boolean isAnagram(String stringOne, String stringTwo){

    if (stringOne.length() != stringTwo.length())
      return false;

    char[] sortedStringOne = stringOne.toCharArray();
    char[] sortedStringTwo = stringTwo.toCharArray();

    Arrays.sort(sortedStringOne);
    Arrays.sort(sortedStringTwo);

    if (String.valueOf(sortedStringOne).equals(String.valueOf(sortedStringTwo))){
      return true;
    }

    return false;
  }
}
