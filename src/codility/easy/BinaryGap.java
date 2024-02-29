package codility.easy;

public class BinaryGap {
    public int solution(int N) {
        int ans = 0;
        int tmp = 0;
        String rep = Integer.toString(N, 2);

        boolean counting = false;

        for (int i=0; i<rep.length(); i++){
            if (rep.charAt(i)=='0') {
                if(counting) {tmp++;}
            }

            else {
                if (counting) {
                    if (tmp >ans) {ans = tmp;}
                    tmp = 0;

                }
                else {
                    counting = true;
                }
            }
        }

        return ans;
    }
}
