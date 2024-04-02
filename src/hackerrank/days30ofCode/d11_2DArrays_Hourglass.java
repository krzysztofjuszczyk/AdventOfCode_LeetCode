package hackerrank.days30ofCode;

import java.util.ArrayList;
import java.util.List;

public class d11_2DArrays_Hourglass {
    private static void countHourglass(List<List<Integer>> arr){
        int max = Integer.MIN_VALUE;
        List<Integer> sums = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                // int a = arr.get(i).get(j);
                // int b = arr.get(i+1).get(j);
                // int c = arr.get(i+2).get(j);
                // int d = arr.get(i+1).get(j+1);
                // int e = arr.get(i).get(j+2);
                // int f = arr.get(i+1).get(j+2);
                // int g = arr.get(i+2).get(j+2);
                int a = arr.get(i).get(j);
                int b = arr.get(i).get(j+1);
                int c = arr.get(i).get(j+2);
                int d = arr.get(i+1).get(j+1);
                int e = arr.get(i+2).get(j);
                int f = arr.get(i+2).get(j+1);
                int g = arr.get(i+2).get(j+2);

                int sum = a+b+c+d+e+f+g;
                // System.out.println(""+a+b+c+d+e+f+g+ ": " +sum);
                sums.add(sum);
                if (sum >max){max = sum;}

            }
        }
        System.out.println(max);
    }
}
