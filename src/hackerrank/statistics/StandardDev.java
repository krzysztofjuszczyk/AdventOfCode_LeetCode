package hackerrank.statistics;

import java.util.List;

public class StandardDev {
    public static void stdDev(List<Integer> arr) {
        // Print your answers to 1 decimal place within this function
        float standardDev = 0;
        float mean = 0.0f;
        int sum = 0;
        int sumSquares = 0;

        for (int i = 0; i < arr.size(); i++) {
            sum += arr.get(i);

        }
        mean = sum / arr.size();

        for (int i = 0; i < arr.size(); i++) {
            sumSquares += Math.pow((arr.get(i) - mean),2);
        }

        standardDev = sumSquares / arr.size();
        System.out.println(standardDev);

    }
}
