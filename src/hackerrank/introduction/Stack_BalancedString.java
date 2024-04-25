package hackerrank.introduction;

import java.util.Scanner;
import java.util.Stack;

public class Stack_BalancedString {
    static boolean balancedString2(String s) {
        // no additional space
        while (true) {
            int len = s.length();
            s = s.replace("()", "");
            s = s.replace("[]", "");
            s = s.replace("{}", "");
            int newlen = s.length();
            if (len == newlen) {
                break;
            }

        }
        return s.length()==0;
    }

    static boolean balancedString(String s){
        String left = "{[(";
        String right = "}])";

        Stack<Character> st = new Stack<>();

        // System.out.println(input);
        //Complete the code
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            // System.out.println(c);

            // char is left
            if (c == '{' || c =='(' || c == '[') {
                st.push(s.charAt(i));
            }

            // char is right
            else {
                if (st.isEmpty()) {
                    return false;
                }
                char popped = st.pop();
                // System.out.println("popped "+popped);
                if (right.indexOf(c) != left.indexOf(popped)){
                    return false;}
            }
        }

        // debugging
        // for (int i = 0; i < st.size(); i++) {
        //     System.out.print(st.pop());
        // }
        // System.out.println(st.size());
        if (st.size() == 0){
            return true;}
        else return false;

    }


    public static void main(String []argh)
    {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String input=sc.next();
            String ans = balancedString(input) == true ? "true" : "false";
            System.out.println(ans);

        }
    }
}

