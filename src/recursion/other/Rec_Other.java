package recursion.other;

public class Rec_Other {
    public static void main(String[] args) {
        System.out.println(isPalindromeR("kayak"));
        System.out.println(isPalindromeR("kay3k"));
        System.out.println(isPalindromeR("poqweewqop"));
        System.out.println(retBinaryR(63,""));
        System.out.println(sumOfNaturalNums(5));

        System.out.println(toBinary(5));

    }

    static boolean isPalindromeR (String s){
        if (s.isEmpty() || s.length()==1) return true;
        else if (s.charAt(0) == s.charAt(s.length()-1)) return
                isPalindromeR(s.substring(1,s.length()-1));
        return false;

    }

    static String retBinaryR (int decimal, String result)
    {
        if (decimal == 0) return result;
        int remainder = decimal%2;
        result = remainder + result;
        return retBinaryR(decimal /2, result);
    }

    static int sumOfNaturalNums (int num){
        if (num <0) return -1;
        if (num == 0) return 0;
        if (num == 1) return 1;

        return num + sumOfNaturalNums(num-1);
    }

    int factorial(int n){
        if (n==0 || n==1){return 1;}
        return n * factorial(n - 1);
    }

    int sumToN(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n + sumToN(n - 1);
        }
    }

    int stringLength(String s) {
        if (s.isEmpty()) {
            return 0;
        }
        return 1 + stringLength(s.substring(1));
    }

    int stringLength2(String s) {
        return (s.isEmpty()) ? 0 : 1 + stringLength(s.substring(1));
    }

    String reverseString(String s) {
        if (s.isEmpty()) {
            return "";
        }
        return reverseString(s.substring(1)) + s.charAt(0);
    }

    int sumArray(int[] arr, int i){
        if (i== arr.length) return 0;
        return arr[i]+ sumArray(arr, i+1);
    }

    int maxInArray(int[] arr, int i){
        if (i==arr.length -1) return arr[i];
        return Math.max(maxInArray(arr, i+1),arr[i]);
    }

    int countOccurrences(int[] arr, int i, int val){
        if (i == arr.length) return 0;
        int curr = arr[i] == val? 1 : 0;
        return curr + countOccurrences(arr, i+1, val);
    }

    // convert a string to binary
    static String toBinary(int n){
        if (n == 1) return "1";
        if (n == 0) return "0";
        String first = n%2 == 0 ? "0" : "1";
        return toBinary(n/2) + first;}

    // Fibonacci
    int fib(int n){
        if (n ==0) return 0;
        if (n==1 || n==2) return 1;
        return fib(n-1)+fib(n-2);
    }

    boolean isPalindrome(String s, int left, int right){

        return false;
    }

    int countDigits(int n){
        if (n<10) return 1;
        return 1+countDigits(n/10);
    }

    int power(int a, int b){
        if (b ==0) return 1;
        return a * power(a, b-1);
    }
}
