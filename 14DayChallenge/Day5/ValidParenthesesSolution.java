//Aswin solution 

import java.util.Stack;
class ValidParenthesesSolution{
    public boolean isValidPara(String s){
        Stack<Character> stk = new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch == '(' || ch == '{' || ch == '['){
                stk.push(ch);
            }
            else{
                if(stk.isEmpty()) return false;
                char top = stk.peek(); // peek() means stack top value
                if(top == '(' && ch == ')') stk.pop();
                else if(top == '{' && ch == '}') stk.pop();
                else if(top == '[' && ch == ']') stk.pop();
                else return false;
            }
        }
        return stk.isEmpty(); // if stack empty means all paranthesis closed correctly so true otherwise false (return true or false bcz function datatype is boolean)
    }
    public static void main(String[] args){
        ValidParenthesesSolution obj = new ValidParenthesesSolution();
        String s1 = "()";
        System.out.println(obj.isValidPara(s1));

    }
}