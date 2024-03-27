package hackerrank.days30ofCode;

public class d9_RecursionFactorial {
    public static int factorial(int n) {
        // Write your code here
        if (n == 0 || n ==1) {return 1;}
        else return n* factorial(n-1);
    }
}
