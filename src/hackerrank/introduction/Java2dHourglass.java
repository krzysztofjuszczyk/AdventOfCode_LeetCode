package hackerrank.introduction;

import java.util.List;

public class Java2dHourglass {
    public static void main(String[] args) {
    }

    static void countHourglassSum (List<List<Integer>> arr){
        int ans = 0;

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                int currentSum = 0;
                int firstLine = arr.get(i).get(j) + arr.get(i).get(j+1) + arr.get(i).get(j+2);
                int secondLine = arr.get(i+1).get(j+1);
                int thirdLine = arr.get(i+2).get(j) + arr.get(i+2).get(j+1) + arr.get(i+2).get(j+2);
                currentSum = firstLine+secondLine+thirdLine;
                ans = currentSum > ans ? currentSum : ans;
                // System.out.println( currentSum);
            }
        }
    }

}
