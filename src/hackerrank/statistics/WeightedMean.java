package hackerrank.statistics;

import java.util.List;

public class WeightedMean {
    public static void weightedMean(List<Integer> X, List<Integer> W) {
        // Write your code here
        float ans = 0;
        int sumXW = 0;
        int sumW = 0;
        for (int i = 0; i < X.size(); i++) {
            sumXW += X.get(i) * W.get(i);
            sumW += W.get(i);
        }
        System.out.printf("%.1f",(float)sumXW / sumW);

    }
}
