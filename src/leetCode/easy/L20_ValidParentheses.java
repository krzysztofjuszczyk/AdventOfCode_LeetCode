package leetCode.easy;

import java.util.Stack;

public class L20_ValidParentheses {
    public boolean isValid(String s) {
                String left = "([{";
                String right = ")]}";
        Stack<Character> stack  = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char current = s.charAt(i);
            if (left.indexOf(current) >= 0 ){
                    stack.push(current);
            }
            else {
                if ((stack.isEmpty()) || (right.indexOf(current) != left.indexOf(stack.pop()))){
                    return false;
                }
            }
        }
        return (stack.isEmpty());
    }

    public static void main(String[] args) {
        L20_ValidParentheses obj = new L20_ValidParentheses();
        String t1 = "()";
        System.out.println(obj.isValid(t1));
    }

}

