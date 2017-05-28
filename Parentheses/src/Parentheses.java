import java.util.Stack;

/**
 * Created by aishpratap on 5/25/17.
 */
public class Parentheses {

  public static void main(String[] args){

    String input = "()(()";

    Stack<Character> stack = new Stack<>();

    int counter = 0;

    for (Character c:input.toCharArray()){
      if (stack.size() > 0 && ((stack.peek() == '(') && (c == ')'))){
        counter += 2;
        stack.pop();
      }else{
        stack.push(c);
      }
    }

    System.out.println(counter);

  }
}
