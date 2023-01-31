package aoc2020;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class D5test {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("src/aoc2020/inputs/d5.txt"));
        String line = reader.readLine();
//        String line = "BBFFBBFRLL";
        System.out.println(line);

        int result = 0;
        int lineNo =1;

        while (line!= null){
            System.out.print(lineNo++ + " ");

            char[] lineArr = line.toCharArray();

            // 0 - 6 row
            int begin = 0;
            int end = 127;

            for (int i= 0; i < 6; i++) {
                int howManySeats = end - begin +1;
                if (lineArr[i] == 'B'){
                    begin = begin + howManySeats / 2 ;
                }
                else {
                    end = end - howManySeats/2;
                }

                System.out.println("begin " + begin + " end " + end + " diff " + howManySeats);
            }
            int row = (lineArr[6] == 'F') ? begin : end;

//        System.out.println("ROW: " +row);

            // 7-9 col
            begin = 0;
            end = 7;

            for (int i = 7; i < 9 ; i++) {
                int howManySeats = end - begin +1;
                if (lineArr[i] == 'R'){
                    begin =  begin + (howManySeats / 2);
                }
                else {
                    end = end - howManySeats/2 ;
                }
                System.out.println(lineArr[i] + " begin " + begin + " end " + end + " diff " +howManySeats);

            }
                int col = (lineArr[9] == 'R') ? end : begin;


//                System.out.println("column: " +col);
            int seatID = 8* row + col;
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
