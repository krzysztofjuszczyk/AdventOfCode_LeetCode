package aoc2021;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class D1_B {
    public static void main(String[] args) throws FileNotFoundException {
        BufferedReader reader = new BufferedReader(new FileReader("src/aoc2021/inputs/d1.txt"));
        int[] inputs = new int[2000];
        int result =0;
        try {
            int count =0;
            String line = reader.readLine();

            for (int i = 0; i < 2000; i++) {
                inputs[i]   = Integer.parseInt(line);
                line = reader.readLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        int sumPrev = inputs[0] + inputs[1]+ inputs[2];
        for (int i = 3; i < 2000 ; i++) {
            int sumAct = inputs[i] + inputs[i-1] + inputs[i-2];
            if (sumAct>sumPrev){
                result++;

            }
            sumPrev = sumAct;

        }
        System.out.println(result);
    }
}
