import java.util.Stack;

public class ValidParentheses {
  public static boolean isValid(String s) {
    Stack<Character> stack = new Stack<>();

    for (char c : s.toCharArray()) {
      if (c == '(' || c == '[' || c == '{') {
        stack.push(c);
      } else {
        if (stack.isEmpty()) {
          return false;
        }

        char top = stack.pop();
        if (c == ')' && top != '(') {
          return false;
        }
        if (c == ']' && top != '[') {
          return false;
        }
        if (c == '}' && top != '{') {
          return false;
        }
      }
    }

    return stack.isEmpty();
  }

  public static void main(String[] args) {
    String s1 = "()";
    String s2 = "()[]{}";
    String s3 = "(]";
    String s4 = "([)]";
    String s5 = "{[]}";

    System.out.println(isValid(s1));
    System.out.println(isValid(s2));
    System.out.println(isValid(s3));
    System.out.println(isValid(s4));
    System.out.println(isValid(s5));
  }
}
