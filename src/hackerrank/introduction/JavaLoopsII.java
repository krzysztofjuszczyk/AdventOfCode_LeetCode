package hackerrank.introduction;

import java.util.*;
import java.io.*;
//We use the integers a, b, n.
//to create the following series:

public class JavaLoopsII {


    public static void main(String[] argh) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int i = 0; i < t; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            int remainding = 0;
            for (int j = 0; j < n; j++) {
                int current = (int) Math.pow(2, j) * b;
                System.out.print(a + remainding + current + " ");
                remainding = remainding + current;

            }
            System.out.println();
        }
        in.close();
    }
}