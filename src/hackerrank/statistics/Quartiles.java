package hackerrank.statistics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Quartiles {

    public static void main(String[] args) {
        List<Integer> list = List.of(3,5,7,8,12,14,14,15,18,21);
        List<Integer> ans = quartiles(list);
    }

    public static List<Integer> quartiles(List<Integer> arr) {
        // Write your code here
        int q1=0, q2=0, q3=0;
        int[] arr2 = arr.stream().mapToInt(i->i).toArray();
        Arrays.sort(arr2);
        int len = arr2.length;

        q1 = findMedian(Arrays.copyOfRange(arr2,0,len/2));
        q3 = findMedian(Arrays.copyOfRange(arr2,len/2, len));

        if (len %2 == 0 ){
            q2 =( (arr2[len/2]) + (arr2[len/2-1]) )/2;
            q3 = findMedian(Arrays.copyOfRange(arr2,len/2, len));
        } else{
            q2 = arr2[len/2];
            q3 = findMedian(Arrays.copyOfRange(arr2,len/2+1, len));
        }
        List<Integer> ans = new ArrayList<>(3);
        ans.add(q1);
        ans.add(q2);
        ans.add(q3);
        return ans;
    }

    private static int findMedian(int[] array){
        int len = array.length;
        int median = 0;
        if (len%2 == 1){
            median = array[len/2];
        } else{
            median = (array[len/2-1] + array[len/2])/ 2;
        }
        return median;
    }
}
