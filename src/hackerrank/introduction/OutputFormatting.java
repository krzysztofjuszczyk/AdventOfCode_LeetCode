package hackerrank.introduction;

import java.util.Scanner;

public class OutputFormatting {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("================================");
        for(int i=0;i<3;i++)
        {
            String s1=sc.next();
            int x=sc.nextInt();
            System.out.printf("%-15s%03d\n",s1, x);

            // -15 left allignment, width 15 chars
            // 03 width 3 chars with leading zeroes
        }
        System.out.println("================================");

    }
}
