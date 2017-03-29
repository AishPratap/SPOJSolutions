import java.util.Arrays;
import java.util.HashMap;

/**
 * Created by aishpratap on 1/7/17.
 */
public class UniqueChars {

  public static void main (String[] args){
    UniqueChars unique = new UniqueChars();
    if(unique.isUnique("qwertyuiop")){
      System.out.println("All Unique");
    }else{
      System.out.println("Not Unique");
    }
  }

  public boolean isUnique(String inputString){


    String[] characters = inputString.split("");

    Arrays.sort(characters);
    System.out.println(Arrays.toString(characters));

    HashMap<Character,Integer> charCount = new HashMap();

    for (Character character:inputString.toCharArray()){
      if(charCount.containsKey(character)){
        return false;
      }else {
        charCount.put(character,1);
      }
    }

    return true;
  }

}
