package hackerrank.introduction;

import java.util.Scanner;

public class JavaStringsIntroduction {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        System.out.println(A.length()+B.length());
        int compare = A.compareTo(B);
        String yn = compare >0 ? "Yes" : "No";
        System.out.println(yn);

        String output = A.substring(0,1).toUpperCase() + A.substring(1) +" " +
                B.substring(0,1).toUpperCase() + B.substring(1);
        System.out.println(output);
    }
}
