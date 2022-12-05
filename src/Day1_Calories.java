import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Day1_Calories {
    public static void ex1() {
        int thisElf = 0;
        int maxValue = 0;
        int max1 = 0;
        int max2 = 0;
        int max3 = 0;
        BufferedReader reader;

        try {
            reader = new BufferedReader(new FileReader("src/inputs/day1_calories.txt"));
            String line = reader.readLine();

            while (line != null) {
                if (line.equals("")) {
                    thisElf = 0;

                } else {
//                    System.out.println(line);
                    int value = Integer.parseInt(line);
                    thisElf += value;
                }

                if (thisElf > maxValue) {
                    maxValue = thisElf;
                }
                if (thisElf > max1) {
                    max1 = thisElf;
                    if (thisElf > max2) {
                        max1 = max2;
                        max2 = thisElf;
                        if (thisElf > max3) {
                            max2 = max3;
                            max3 = thisElf;
                        }
                    }
                }

                line = reader.readLine();
            }
            System.out.println("Ex.1 Calories");
            System.out.println("Max Value = " + maxValue);
            System.out.println("Max1 = " + max1);
            System.out.println("Max2 = " + max2);
            System.out.println("Max3 = " + max3);
            System.out.println("Sum: = " + (max1 + max2 + max3));

            reader.close();
        } catch (
                IOException e) {
            e.printStackTrace();
        }
    }
}
