package hackerrank.introduction;

import java.util.List;

public class DiagonalDifference {
    /*
     * Complete the 'diagonalDifference' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts 2D_INTEGER_ARRAY arr as parameter.
     */

    public static int diagonalDifference(List<List<Integer>> arr) {
        int res =0;
        int len = arr.size();
        int diag1=0;
        int diag2 =0;

        for (int i = 0; i < len; i++) {
            diag1 += arr.get(i).get(i);
            System.out.println(arr.get(i).get(i) + " " + arr.get(i).get(len-1-i));
            diag2 += arr.get(i).get(len-1-i);
        }

        res = Math.abs(diag1-diag2);
        return res;
    }
}
