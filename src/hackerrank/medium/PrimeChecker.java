package hackerrank.medium;

import java.util.ArrayList;
import java.util.Scanner;

public class PrimeChecker {

    public static void main(String[] args) {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

    Scanner sc = new Scanner(System.in);
    ArrayList<Integer> list = new ArrayList<>();
    while (sc.hasNext()){
        int n = sc.nextInt();
        Prime p = new Prime();

        if (p.checkPrime(n)) {
            list.add(n);

        }
        for (Integer i : list) {
            System.out.print(i + " ");
        }
        System.out.println();

    }
}
}

class Prime{
    boolean checkPrime(int n){
        if (n<=1){return false;}
        else {
            for (int i = 2; i <= n/2; i++) {
                if (n%i == 0) {return false;}
            }
        }
        return true;
    }
}