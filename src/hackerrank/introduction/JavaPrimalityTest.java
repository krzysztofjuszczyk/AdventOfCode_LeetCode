package hackerrank.introduction;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class JavaPrimalityTest {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String n = bufferedReader.readLine();

        BigInteger n2 = new BigInteger(n);
        System.out.println(n2.isProbablePrime(3) ? "prime" : "not prime");
        bufferedReader.close();
    }
}
