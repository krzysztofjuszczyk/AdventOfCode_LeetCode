package hackerrank.statistics;

import java.util.List;

public class WeightedMean {
    public static void stdDev(List<Integer> arr) {
        // Print your answers to 1 decimal place within this function
        double standardDev = 0;
        double mean = 0.0;
        int sum = 0;
        double sumSquares = 0;

        for (int i = 0; i < arr.size(); i++) {
            sum += arr.get(i);

        }
        mean = sum / arr.size();

        for (int i = 0; i < arr.size(); i++) {
            sumSquares += (arr.get(i) - mean)*(arr.get(i) - mean);
        }

        standardDev = Math.sqrt(sumSquares / arr.size());
        System.out.printf("%.1f",standardDev);

    }
}
