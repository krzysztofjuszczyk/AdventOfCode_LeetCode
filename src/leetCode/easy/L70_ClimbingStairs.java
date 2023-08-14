package leetCode.easy;

public class L70_ClimbingStairs {
    public static void main(String[] args) {
        L70_ClimbingStairs climbingStairs = new L70_ClimbingStairs();
        System.out.println(climbingStairs.climbStairs(5));
    }
    public int climbStairs(int n) {
        //Fibonacci sequence
        int a = 0, b = 1;
            int tmp = 0;
            while(n-- > 0) {
                tmp = a + b;
                a = b;
                b = tmp;
                System.out.println("n"+ n + " | tmp:" + tmp + " | a:" + a + " | b:" + b );

            }
            return tmp;
        }
}
