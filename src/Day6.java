import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Day6 {
    public static void main(String[] args) throws FileNotFoundException {
        BufferedReader reader = new BufferedReader(new FileReader("src/inputs/day6.txt"));
        try {
            String line = reader.readLine();

            System.out.println("result:" +Util.day6IndexAfterNNonrepeat(line , 14));

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
