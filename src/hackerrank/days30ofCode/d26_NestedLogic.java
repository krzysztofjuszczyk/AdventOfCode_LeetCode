package hackerrank.days30ofCode;

import java.util.Scanner;

public class d26_NestedLogic {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */


        Scanner sc = new Scanner(System.in);

        int actualDay = sc.nextInt();
        int actualMonth = sc.nextInt();
        int actualYear = sc.nextInt();
        int expectedDay = sc.nextInt();
        int expectedMonth = sc.nextInt();
        int expectedYear = sc.nextInt();

        int fine;
        if (actualYear > expectedYear) {
            fine = 10000;
        } else if (actualMonth > expectedMonth && (actualYear >= expectedYear)) {
            fine = 500 * (actualMonth - expectedMonth);
        } else if (actualDay > expectedDay && (actualMonth >= expectedMonth) && (actualYear >= expectedYear)) {
            fine = 15 * (actualDay - expectedDay);
        } else {
            fine = 0;
        }
        System.out.println(fine);

        sc.close();

    }
}
