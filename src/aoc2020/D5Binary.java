package aoc2020;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class D5Binary {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("src/aoc2020/inputs/d5.txt"));
        String line = reader.readLine();
//        String line = "BBFFBBFRLL";
//        System.out.println(line);
        int[] allSeatsIDs = new int[816];
        int result = 0;
        int lineNo =0;

        while (line!= null){
            line = line.replace('B','1');
            line = line.replace('F','0');
            line = line.replace('R','1');
            line = line.replace('L','0');

            int seatID = Integer.parseInt(line,2);
            System.out.print("seat id: "+ seatID);
            if (seatID > result){
                System.out.println(" MAX MAX ");
                result = seatID;
            }
            else System.out.println(   );
            allSeatsIDs[lineNo++] = seatID;
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
