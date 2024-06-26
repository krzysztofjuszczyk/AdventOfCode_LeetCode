package hackerrank.days30ofCode;

public class ExceptionHandling_power {
    class MyCalculator {
        /*
         * Create the method long power(int, int) here.
         */
        long power(int n, int p) throws Exception{

            if (n<0 || p<0){
                throw new Exception("n or p should not be negative.");
            }
            else if (n==0 && p == 0){
                throw new Exception("n and p should not be zero.");
            }
            else return (long) Math.pow(n, p);

        }
    }
    }

