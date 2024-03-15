package hackerrank.introduction;

import java.util.List;

public class PlusMinus {
    public static void plusMinus(List<Integer> arr) {
        int tmpB = 0;
        int tmp0 = 0;
        int tmpA = 0;

        for (Integer integer : arr) {
            if (integer <0) {tmpB++;}
            else if (integer >0 ){tmpA++;}
            else {tmp0 ++;}

        }
        System.out.println(String.format("%.6f", (double)tmpA/arr.size()));
        System.out.println(String.format("%.6f", (double)tmpB/arr.size()));
        System.out.println(String.format("%.6f", (double)tmp0/arr.size()));
    }

}

