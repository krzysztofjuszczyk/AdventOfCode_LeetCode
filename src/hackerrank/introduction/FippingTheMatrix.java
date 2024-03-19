package hackerrank.introduction;

import java.util.List;

public class FippingTheMatrix {
    public static int flippingMatrix(List<List<Integer>> matrix) {
        // Write your code here
        int quadLen = matrix.size()/2;

        int ans = 0;

        for (int row = 0; row < quadLen; row++) {
            for (int col = 0; col < quadLen; col++) {
                int max = 0;
                max = Math.max(matrix.get(row).get(col),max);
                max = Math.max(matrix.get(row).get(2*quadLen-1-col),max);
                max = Math.max(matrix.get(2*quadLen-1-row).get(col),max);
                max = Math.max(matrix.get(2*quadLen-1-row).get(2*quadLen-1-col),max);
                ans += max;
            }

        }
        return ans;

    }
}
