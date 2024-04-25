package hackerrank.introduction;

import java.util.Scanner;
import java.util.Stack;

public class Stack_BalancedString {
    public static void main(String []argh)
    {
        Scanner sc = new Scanner(System.in);


        String left = "{[(";
        String right = "}])";

        while (sc.hasNext()) {
            Stack<Character> st = new Stack<>();
            String input=sc.next();
            // System.out.println(input);
            //Complete the code
            for (int i = 0; i < input.length(); i++) {
                char c = input.charAt(i);
                // System.out.println(c);

                // char is left
                if (c == '{' || c =='(' || c == '[') {
                    st.push(input.charAt(i));
                }

                // char is right
                else {
                    if (st.isEmpty()) {
                        System.out.println("false");
                        break;
                    }
                    char popped = st.pop();
                    // System.out.println("popped "+popped);
                    if (right.indexOf(c) != left.indexOf(popped)){
                        System.out.println("false");}
                }
            }

            // debugging
            // for (int i = 0; i < st.size(); i++) {
            //     System.out.print(st.pop());
            // }
            // System.out.println(st.size());
            if (st.size() == 0){
                System.out.println("true");}
            else System.out.println("false");

        }
    }
}
