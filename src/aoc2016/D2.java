package aoc2016;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class D2 {
    public static void main(String[] args) throws IOException {
        String[] instr = new String[5];
        int[][] keys = new int[][]{
                {1, 2, 3},        //00 - 1    02 = 3
                {4, 5, 6},
                {7, 8, 9}         //20 -7     22 = 9
        };
        int i = 0;
        BufferedReader reader = new BufferedReader(new FileReader("src/aoc2016/inputs2016/d2.txt"));
        String line = reader.readLine();
        while (line != null) {
            instr[i++] = line;
            line = reader.readLine();
        }
        int row = 1;
        int col = 1;
        StringBuilder result = new StringBuilder("");

        for (String instruction :
                instr) {
            for (int j = 0; j < instruction.length(); j++) {
                char c = instruction.charAt(j);
                switch (c) {
                    case 'U':
                        row = (row == 0) ? 0 : --row;
                        break;
                    case 'D':
                        row = (row == 2) ? 2 : ++row;
                        break;
                    case 'L':
                        col = (col==0) ? 0       : --col;
                        break;
                    case 'R':
                        col = (col==2) ? 2       : ++col;
                        break;
                }
            }
            int r = keys[row][col];
            result.append(r);

        }

        System.out.println(result);


    }
}
