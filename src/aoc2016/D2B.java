package aoc2016;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class D2B {

        public static void main(String[] args) throws IOException {
            String[] instr = new String[5];         // length
            String[][] keys = new String[][]{
                    {" ", " ", "1", " ", " "},
                    {" ", "2", "3", "4", " "},
                    {"5", "6", "7", "8", "9"},
                    {" ", "A", "B", "C", " "},
                    {" ", " ", "D", " ", " "},
            };
            int i = 0;
            BufferedReader reader = new BufferedReader(new FileReader("src/aoc2016/inputs2016/d2.txt"));
            String line = reader.readLine();
            while (line != null) {
                instr[i++] = line;
                line = reader.readLine();
            }
            int row = 2;
            int col = 0;
            StringBuilder result = new StringBuilder("");

            for (String instruction :
                    instr) {
                for (int j = 0; j < instruction.length(); j++) {
                    char c = instruction.charAt(j);
                    switch (c) {
                        case 'U':
                            row = (row == 0) || (keys[row-1][col]==" ") ? row : --row;
                            break;
                        case 'D':
                            row = (row == 4) || (keys[row+1][col]==" ") ? row : ++row;
                            break;
                        case 'L':
                            col = (col==0) || (keys[row][col-1]==" ") ? col       : --col;
                            break;
                        case 'R':
                            col = (col==4)  || (keys[row][col+1]==" ") ? col       : ++col;
                            break;
                    }
                }
                String r = keys[row][col];
                result.append(r);

            }

            System.out.println(result);


        }
    }
