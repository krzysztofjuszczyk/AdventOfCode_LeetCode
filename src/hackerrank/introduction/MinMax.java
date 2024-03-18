package hackerrank.introduction;

import java.util.List;

public class MinMax {
    public static void miniMaxSum(List<Integer> arr) {
        long min = arr.get(0);
        long max = arr.get(0);
        long sum = 0;

        for (Integer integer : arr) {
            sum += integer;
            if (integer<min){min = integer;}
            if (integer>max){max = integer;}

        }
        System.out.println((sum-max) + " " + (sum-min));

    }
}
