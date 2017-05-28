/**
 * Created by aishpratap on 5/28/17.
 */
public class ReverseString {

  public static void main(String[] args){

    System.out.println(reverse("abcdefgh"));

  }

  public static String reverse(String s){

    char[] reverseChars = new char[s.length()];

    for (int i = s.length(); i > 0; i--){
      reverseChars[s.length() - i] = s.charAt(i-1);
    }

    return String.valueOf(reverseChars);
  }
}
