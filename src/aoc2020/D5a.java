package aoc2020;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class D5a {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("src/aoc2020/inputs/d5.txt"));
        String line = reader.readLine();
//        String line = "BFFFBBFRRR";
        System.out.println(line);

        int result = 0;
        int l =1;

        while (line!= null){
            System.out.print(l++ + " ");
            int row = 0;
            int col = 0;

            char[] lineArr = line.toCharArray();

            // 0 - 6 row
            int begin = 0;
            int end = 128;
            int diff = end - begin + 1;
            for (int i= 0; i < 7; i++) {
                if (lineArr[i] == 'B'){
                    begin = end - diff / 2;
                    row = end;
                }
                else {
                    end = end - diff/2;
                    row = begin;
                }
                diff = end - begin;
//                System.out.println("begin " + begin + " end " + end + " diff " +diff);
            }
//        System.out.println("ROW: " +row);

            // 7-9 col
             begin = 0;
             end = 7;
             diff = end - begin + 1;
            for (int i = 7; i < 10 ; i++) {

                if (lineArr[i] == 'R'){
                    begin =  end - (diff / 2) + 1;
                    col = end;
                }
                else {
                    end = end - diff/2;
                    col = begin;
                }
                diff = end - begin;
//                System.out.println(lineArr[i] + " begin " + begin + " end " + end + " diff " +diff);

            }

//                System.out.println("column: " +col);

            int seatID = 8*row + col;
            if (seatID > result){
                System.out.print(" MAX MAX ");
                result = seatID;
            }
        System.out.println(row + " " + col + " seat : " + seatID);

            line = reader.readLine();
        }

        System.out.println("RESULT" + result);


    }
}
