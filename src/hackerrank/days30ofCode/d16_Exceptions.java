package hackerrank.days30ofCode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class d16_Exceptions {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        try {
            String S = bufferedReader.readLine();
            System.out.println(Integer.parseInt(S));
        }

        catch (NumberFormatException e) {
            System.out.println("Bad String");;
        }

        bufferedReader.close();
    }
}
