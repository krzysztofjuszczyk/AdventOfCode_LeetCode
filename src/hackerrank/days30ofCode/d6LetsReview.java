package hackerrank.days30ofCode;

import java.util.Scanner;

public class d6LetsReview {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < t; i++) {
            String line = sc.nextLine();
            int l = line.length();
            StringBuilder sb1 = new StringBuilder();
            StringBuilder sb2 = new StringBuilder();

            for (int j = 0; j < l; j++) {
                if (j%2 == 0){
                    sb1.append(line.charAt(j));
                } else sb2.append(line.charAt(j));
            }
            System.out.println(sb1 + " " + sb2);
        }
    }
}
