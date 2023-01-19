package aoc2020;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class D3 {
    public static void main(String[] args) throws FileNotFoundException {
        BufferedReader reader = new BufferedReader(new FileReader("src/aoc2020/inputs/d3.txt"));
        int result = 0;
        int index = 0;
        int lineCount = 0;
        try {
            String line;
            // length of line 31
            while ((line= reader.readLine()) != null){

                // down 2, right 1
                if (lineCount %2 == 0) {  // reads every 2nd line
                    if (line.charAt(index) == '#') {
                        result++;
                    }
                    index = (index + 1) % 31;
                }
                ++lineCount;
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(result);
    }
}
