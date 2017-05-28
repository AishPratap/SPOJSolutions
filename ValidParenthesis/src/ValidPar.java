import java.util.Stack;

/**
 * Created by aishpratap on 5/28/17.
 */
public class ValidPar {

  public static void main(String[] args){

    System.out.println(isValid("]"));

  }

  public static boolean isValid(String s){
    Stack<Character> stack = new Stack();

    for(char c: s.toCharArray()){
      switch(c){
        case ')':
          if(stack.size() == 0 || stack.peek() != '(')
            return false;
          else
            stack.pop();
          break;
        case '}':
          if(stack.size() == 0 || stack.peek() != '{')
            return false;
          else
            stack.pop();
          break;
        case ']':
          if(stack.size() == 0 || stack.peek() != '[')
            return false;
          else
            stack.pop();
          break;
        default:
          stack.push(c);
          break;
      }
    }

    if (stack.size() > 0)
      return false;
    return true;
  }

}
