import java.util.ArrayList;
import java.util.List;

/**
 * Created by aishpratap on 5/28/17.
 */
public class RevString {

  public static void main(String[] args){

    String s = "abcd";
    int k = 2;
    System.out.println(reverse(s, k));
  }

  public static String reverse(String s, int k){

    List<String> strs = new ArrayList<>();

    int n = s.length()/(2*k);

    if (s.length()%(2*k) > 0)
      n++;

    int counter = 0;

    while(counter < n){

      if (counter + 1 == n && s.length()%(2*k) < k && s.length()%(2*k) > 0)
        strs.add(rev(s.substring(counter*2*k)));
      else if (counter + 1 == n && s.length()%(2*k) >= k)
        strs.add(rev(s.substring(counter*2*k, counter*2*k + k)) + s.substring(counter*2*k + k));
      else
        strs.add(rev(s.substring(counter*2*k, counter*2*k + k)) + s.substring(counter*2*k + k, counter*2*k + 2*k));
      counter++;
    }

    String reversed = "";

    for (String s1:strs)
      reversed += s1;
    return reversed;
  }

  public static String rev (String s){
    StringBuilder sb = new StringBuilder(s.length());

    for (char c:s.toCharArray())
      sb.append(c);

    return sb.reverse().toString();
  }

}
