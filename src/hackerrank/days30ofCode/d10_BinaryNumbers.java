package hackerrank.days30ofCode;

public class d10_BinaryNumbers {
    public static void main(String[] args) {
        System.out.println(convertToBinary(8));

    }

    public static String convertToBinary (int n){
        String ans = "";
        while (n > 0) {
            String rem = (n%2 ==0) ? "0" : "1";
            ans = rem + ans;
            n = n/2;
        }
        return ans;
    }

    public static int maxConsecutiveOnes (int n){
        int maxConsecutiveOnes = 0;
        int tmp = 0;

        while (n > 0) {
            if (n%2 ==1){
                tmp++;
                if (tmp>maxConsecutiveOnes){
                    maxConsecutiveOnes = tmp;
                }
            } else {tmp = 0;}
            n = n/2;
        }
        return maxConsecutiveOnes;
    }
}
