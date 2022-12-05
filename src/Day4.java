import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Day4 {
    public static void main(String[] args) throws FileNotFoundException {
        BufferedReader reader = new BufferedReader(new FileReader("src/inputs/day4.txt"));

        try {
            int result = 0;
            String line = reader.readLine();
            int a1 = 0;
            int a2 = 0;
            int b1 = 0;
            int b2 = 0;
            while (line != null) {

                String[] pairs = line.split(",");
                String[] ta1 = pairs[0].split("-");
                a1 = Integer.parseInt(ta1[0]);
                a2 = Integer.parseInt(ta1[1]);

                String[] ta2 = pairs[1].split("-");
                b1 = Integer.parseInt(ta2[0]);
                b2 = Integer.parseInt(ta2[1]);

                // PArt 1
                //   1 included in 2 or 2 included in 1
                //                if((a1>=b1 && a2<=b2) || (b1>=a1 && b2 <=a2)){
                //                    result++;

                // Part Two
                // better to do with NEGaTION
                if (        (a1 >= b1 && a1 <= b2)
                        || (a2 >= b1 && a2 <= b2)
                        || (b1 >= a1 && b1 <= a2)
                        || (b2 >= a1 && b2 <= a1))
                {
                    result++;

                }

                line = reader.readLine();
            }
            System.out.println("Result: " + result);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
