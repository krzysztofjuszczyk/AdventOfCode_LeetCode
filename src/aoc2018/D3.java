package aoc2018;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class D3 {
    public static void main(String[] args) {
        int[] [] array = new int[10000][10000];
        int l=0;

        try {
//            BufferedReader reader = new BufferedReader(new FileReader("src/aoc2018/inputs/d3test.txt"));
            BufferedReader reader = new BufferedReader(new FileReader("src/aoc2018/inputs/d3.txt"));

            String line;
            while((line = reader.readLine()) != null) {
                ++l;
                String [] line2 = line.split("@");
                String [] coordinates = line2[1].split(",");
                int col = Integer.parseInt(coordinates[0].trim());
                String [] tmp = coordinates[1].split(":");
                int row = Integer.parseInt(tmp[0]);
                tmp[1]= tmp[1].trim();
                int w = Integer.parseInt(tmp[1].split("x")[0]);
                int h = Integer.parseInt(tmp[1].split("x")[1]);

                for (int i = 0; i < w; i++) {
                    for (int j = 0; j < h; j++) {
                        ++array[row+i][col+j];

//                        array[row+i][col+j]= l;   / for debugging
                    }

                }

            }
            int result = 0;
            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array[0].length; j++) {
                    if (array[i][j] > 1){
                        ++result;
                    }
//                    System.out.print(array[i][j]    );
                }
//                System.out.println();
            }
            System.out.println(result);




        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
