package hackerrank.introduction;

public class CommonDivisor {
    public int divisorSum(int n) {
        int ans = 0;
        if (n==1) {return 1;}
        for (int i = 1; i <= n; i++) {
            if (n%i == 0){ans += i;}
        }
        return ans;
    }
}
