import java.util.HashMap;

/**
 * Created by aishpratap on 1/7/17.
 */
public class RemoveDuplicate {

  public static void main (String[] args){
    RemoveDuplicate remDupli = new RemoveDuplicate();
    System.out.println(remDupli.removeDuplicate("aabbccddeeff"));
  }

  public String removeDuplicate(String inputString){

    HashMap<Character, Integer> charMap = new HashMap();
    StringBuilder sb = new StringBuilder();


    for (Character character:inputString.toCharArray()){
      if (!charMap.containsKey(character)){
        charMap.put(character,1);
        sb.append(character);
      }
    }

    return sb.toString();
  }
}
