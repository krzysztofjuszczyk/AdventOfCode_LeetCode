package aoc2018;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class D3 {
    public static void main(String[] args) {
        int[][] array = new int[1000][1000];
        int l = 0;
        int[] result = new int[1358];
        boolean partBisOK = true;

        try {
//            BufferedReader reader = new BufferedReader(new FileReader("src/aoc2018/inputs/d3test.txt"));
            BufferedReader reader = new BufferedReader(new FileReader("src/aoc2018/inputs/d3.txt"));

            String line;
            while ((line = reader.readLine()) != null) {
                ++l;
                String[] line2 = line.split("@");
                String[] coordinates = line2[1].split(",");
                int col = Integer.parseInt(coordinates[0].trim());
                String[] tmp = coordinates[1].split(":");
                int row = Integer.parseInt(tmp[0]);
                tmp[1] = tmp[1].trim();
                int h = Integer.parseInt(tmp[1].split("x")[0]);
                int w = Integer.parseInt(tmp[1].split("x")[1]);

                for (int i = 0; i < w; i++) {
                    for (int j = 0; j < h; j++) {
                        if (array[row + i][col + j] != 0) {
                            // part B 1st ver
//                            int x = array[row + i][col + j];
//                            result[l] = 1;
//                            result[x] = 1;

                            // part B 2nd ver
                            partBisOK = false;
                        }
                        array[row + i][col + j]++;

//                        array[row+i][col+j]= l;   / for debugging
                    }

                }

//                if (partBisOK){
//                    System.out.println(l);
//            }
            }


// part B my 1st version -array of results
//            for (int i = 0; i < result.length; i++) {
//                if (result[i] == 0) {
//                    System.out.println(i);
//                }
//            }

            int res = 0;
            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array[0].length; j++) {
                    if (array[i][j] > 1) {
                        ++res;
                    }
//                    System.out.print(array[i][j]    );
                }
//                System.out.println();
            }
            System.out.println(res);

           reader = new BufferedReader(new FileReader("src/aoc2018/inputs/d3.txt"));
            l = 0;
            while ((line = reader.readLine()) != null) {
                partBisOK = true;
                ++l;
                String[] line2 = line.split("@");
                String[] coordinates = line2[1].split(",");
                int col = Integer.parseInt(coordinates[0].trim());
                String[] tmp = coordinates[1].split(":");
                int row = Integer.parseInt(tmp[0]);
                tmp[1] = tmp[1].trim();
                int h = Integer.parseInt(tmp[1].split("x")[0]);
                int w = Integer.parseInt(tmp[1].split("x")[1]);
                for (int i = 0; i < w; i++) {
                    for (int j = 0; j < h; j++) {
                        if (array[row + i][col + j] >1) {
                            partBisOK = false;
                        }
                    }
                }

                if (partBisOK){
                    System.out.println("PART B: " + l);
                }
            }


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}