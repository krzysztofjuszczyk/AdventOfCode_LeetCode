package hackerrank.introduction;

import java.util.Arrays;
import java.util.List;

public class FindMedian {
    public static int findMedian(List<Integer> arr) {
        int[] array = arr.stream().mapToInt(i->i).toArray();

        Arrays.sort(array);
        return array[array.length/2];

    }
}
