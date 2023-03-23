import java.util.Stack;
class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        for(int i=0; i< s.length();i++)
        {
            char ch = s.charAt(i);
            if(ch == '(' || ch == '[' || ch == '{'){
                st.push(ch);
            }
            else{
                if(st.isEmpty()) return false;
                char top  = st.peek();
                if(top == '{' && ch == '}') st.pop();
                else if(top == '(' && ch == ')') st.pop();
                else if(top == '[' && ch == ']') st.pop();
                else return false;
            }
        }
        return st.isEmpty();
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        String s1 = "}{}";
        // String s2 = "()[]{}";
        // String s3 = "(]";
        // String s4 = "([)]";
        // String s5 = "{[]}";

        System.out.println(solution.isValid(s1));
        // System.out.println(solution.isValid(s2));
        // System.out.println(solution.isValid(s3));
        // System.out.println(solution.isValid(s4));
        // System.out.println(solution.isValid(s5));
    }
}
