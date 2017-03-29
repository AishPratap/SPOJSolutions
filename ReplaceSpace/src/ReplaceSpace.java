/**
 * Created by aishpratap on 1/7/17.
 */
public class ReplaceSpace {

  public static void main(String[] args){
    ReplaceSpace replace = new ReplaceSpace();
    String chars = "%20";
    System.out.println(replace.replaceInString('a',chars, "Hey i am awesome aa"));
  }

  public String replaceInString(char toReplace, String replaceSet, String inputString){

    int len = inputString.length();
    int targetCount = 0;
    int lengthOfReplacement = replaceSet.length() - 1;

    StringBuilder sb = new StringBuilder();

    for (char character:inputString.toCharArray()){
      if (character == toReplace){
        sb.append(replaceSet);
      }else{
        sb.append(character);
      }
    }

    return sb.toString();
  }

}
