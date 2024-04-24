package hackerrank.introduction;

import java.util.Scanner;

public class JavaSubarray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        int[] arr = new int[len];
        int ans = 0;

        for (int i = 0; i < len; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < len; i++) {
            int currentSum = 0;

            for (int j = i; j < len; j++) {
                currentSum += arr[j];
                // System.out.println(currentSum);
                if (currentSum < 0) {
                    ans++;
                }
            }

        }

        System.out.println(ans);

    }
}
