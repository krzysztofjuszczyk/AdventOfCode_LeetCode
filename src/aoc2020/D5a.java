package aoc2020;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class D5a {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("src/aoc2020/inputs/d5.txt"));
        String line = reader.readLine();
//        String line = "BBFFBBFRLL";
//        System.out.println(line);
        int[] allSeatsIDs = new int[816];
        int result = 0;
        int lineNo =0;

        while (line!= null){

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

//                System.out.println("begin " + begin + " end " + end + " diff " + howManySeats);
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
//                System.out.println(lineArr[i] + " begin " + begin + " end " + end + " diff " +howManySeats);

            }
                int col = (lineArr[9] == 'R') ? end : begin;


//                System.out.println("column: " +col);
            int seatID = 8* row + col;
            allSeatsIDs[lineNo++] = seatID;
            if (seatID > result){
                System.out.print(" MAX MAX ");
                result = seatID;
            }
            System.out.println(row + " " + col + " seat : " + seatID);

            line = reader.readLine();
        }

        System.out.println("RESULT: " + result);
        Arrays.sort(allSeatsIDs);
        for (int i = 1; i < allSeatsIDs.length-1; i++) {
            if ((allSeatsIDs[i] != allSeatsIDs[i-1] + 1) || (allSeatsIDs[i] != allSeatsIDs[i+1] -1)) {
                System.out.println("your seat ID is: " + (allSeatsIDs[i]+1));
                break;

            }

        }



    }
}
