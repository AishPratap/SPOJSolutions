/**
 * Created by aishpratap on 5/28/17.
 */
public class Reverse {

  public static void main(String[] args){

    String str = "This is a sample string";

    String[] components = str.split(" ");

    String reverse = "";

    for (String s:components){
      StringBuilder sb = new StringBuilder(s.length());

      for (char c:s.toCharArray()){
        sb.append(c);
      }

      reverse += sb.reverse().toString() + " ";
    }

    System.out.println(reverse);
  }
}
