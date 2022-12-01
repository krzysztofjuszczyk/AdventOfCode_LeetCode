import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
public class Main {

    public static void main(String[] args) {
        int thisElf = 0;
        int maxValue = 0;
        BufferedReader reader;

        try {
            reader = new BufferedReader(new FileReader("src/day1_calories.txt"));
            String line = reader.readLine();

            while (line != null) {
                if (line.equals("")) {
                    thisElf = 0;

                }
                else {
                    System.out.println(line);
                    int value = Integer.parseInt(line);
                    thisElf += value;
                }

                if (thisElf > maxValue){
                    maxValue = thisElf;
                }

                line = reader.readLine();
            }

            System.out.println("Max Value = " + maxValue);
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
