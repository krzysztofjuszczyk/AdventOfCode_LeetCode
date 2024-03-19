package hackerrank.introduction;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CountingSort1 {
    public static List<Integer> countingSort(List<Integer> arr) {

        // n integers of 1- 100
        int len = arr.size();
        ArrayList<Integer> ans = new ArrayList<Integer>(100);
        for (int i = 0; i < 100; i++) {
            ans.add(0);
        }


        for (int i = 0; i < len; i++) {
            int val = arr.get(i);
            ans.set(val, (ans.get(val)+1));
        }
        return ans;
    }

    public static void main(String[] args) {
        ArrayList<Integer> in = new ArrayList<>();
        in.add(4);
        in.add(2);
        in.add(3);
        in.add(2);
        in.add(2);
        in.add(2);
        in.add(1);
        in.add(1);

        ;
        System.out.println(CountingSort1.countingSort(in));
    }
}
