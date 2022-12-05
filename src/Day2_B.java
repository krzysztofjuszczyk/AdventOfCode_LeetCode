import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Day2_B {
    public static void main(String[] args) {


        Day2_RPS day2_rps = new Day2_RPS();

        day2_rps.createMap();
        day2_rps.createResults();
        day2_rps.createResults2();

        BufferedReader reader;

        try {
            int score = 0;
            reader = new BufferedReader(new FileReader("src/day2_strategy.txt"));
            String line = reader.readLine();

            while (line != null) {
                // variant 1
                //         score += day2_rps.results.get(line);

                //variant 2
                score += day2_rps.results2.get(line);
                line = reader.readLine();
            }
            System.out.println("Result = " + score);

        } catch (
                FileNotFoundException e) {
            e.printStackTrace();
        } catch (
                IOException e) {
            e.printStackTrace();
        }
    }
    }
