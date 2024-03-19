package hackerrank.statistics;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MeanMedianMode {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in) ;
        int n = sc.nextInt();
        sc.nextLine();
        String l = sc.nextLine();
        String[] sarr = l.split(" ");
        int len = sarr.length;
        int[] intArr = new int[len];
        int sum = 0;
        Map<Integer,Integer> map = new HashMap<>();

        int mode = 0;
        int modeFreq = 0;

        for (int i = 0; i < len; i++) {
            int currentVal = Integer.parseInt(sarr[i]);
            intArr[i] = currentVal;
            sum += currentVal;
            if(!map.containsKey(currentVal)){
                map.put(currentVal, 1);

            }
            else{
                map.put(currentVal, (map.get(currentVal)+1));
            }

            if (modeFreq<1){
                // first value
                mode = currentVal;
                modeFreq = 1;
            }
            // same frequency - > compare values
            else if((map.get(currentVal) == modeFreq) && (currentVal< mode)){
                mode = currentVal;
            }
            else if(map.get(currentVal) > modeFreq) {
                mode = currentVal;
                modeFreq = map.get(currentVal);
            }

        }
        double mean = ((double)sum / len);
        double median;


        Arrays.sort(intArr);

        if (len%2 == 1){
            median = (double) intArr[len/2];
        } else{
            median = (double) (intArr[len/2-1] + intArr[len/2])/ 2;
        }


        System.out.printf("%.1f%n",mean);
        System.out.printf("%.1f%n",median);
        System.out.println(mode);

    }
}
