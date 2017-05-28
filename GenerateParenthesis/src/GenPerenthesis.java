import java.util.ArrayList;
import java.util.List;

/**
 * Created by aishpratap on 5/28/17.
 */
public class GenPerenthesis {

  public static void main(String[] args){

    List<String> strings = generateParenthesis(3);

    for (String s:strings)
      System.out.println(s);

  }

  public static List<String> generateParenthesis(int n) {

    List<String> list = new ArrayList<>();

    parenthesis(n, "", list, 0, 0);

    return list;
  }

  public static void parenthesis(int n, String paren, List<String> list, int open, int close){

    if (paren.length() == 2*n){
      list.add(paren);
    }else {

      if (open<n)
        parenthesis(n,paren + "(", list, open + 1, close);
      if (close < open)
        parenthesis(n,paren + ")", list, open, close + 1);
    }
  }
}
