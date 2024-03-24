package hackerrank.introduction;

import java.util.Scanner;

public class JavaStringTokens {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        // Write your code here.
        // String[] arr = s.split("[A-Za-z]+");
        s = s.replaceAll("[^A-Za-z]+", " ");
        s = s.replaceAll("\\s+", " ");
        s = s.trim();
        if (s.isEmpty()) {
            System.out.println("0");}
        else {
            String[] arr = s.split(" ");

            System.out.println(arr.length);
            for (int i = 0; i < arr.length; i++) {
                System.out.println(arr[i]);
            }
        }
        scan.close();
    }
}
