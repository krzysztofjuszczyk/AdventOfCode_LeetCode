package hackerrank.introduction;

import java.util.ArrayList;
import java.util.Scanner;

public class JavaArraylist {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<int[]> al = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            int[] lineArr = new int[x];
            for (int j = 0; j < x; j++) {
                lineArr[j] = sc.nextInt();
            }
            al.add(lineArr);
        }

        int q = sc.nextInt();
        for (int i = 0; i < q; i++) {
            try {
                int line = sc.nextInt();
                int col = sc.nextInt();
                if (line <= 0){
                    System.out.println("ERROR!");
                } else {
                    int[] res = al.get(line-1);
                    System.out.println(res[col-1]);
                }


            }
            catch(ArrayIndexOutOfBoundsException e){
                System.out.println("ERROR!");
            }

        }
    }
}
