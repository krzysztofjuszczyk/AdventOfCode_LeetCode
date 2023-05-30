package aoc2016;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class D3a {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("src/aoc2016/inputs2016/d3.txt"));
        String line;
        int ans =0;
        int ansB = 0;
        int [] triangle = new int[3];
        int x= 0;
        int array[][] = new int[1908][3];
        int row = 0;

        int[] triangleB = new int[3 ];

        while (( line=reader.readLine()) != null) {
            String l[] = line.trim().split("\\s+");
            for (int i = 0; i < 3; i++) {
//                if (l[i] == "") {        // in case there were more than 2 spaces
//                    l[i] = l[i + 1];
//                }
                triangle[i] = Integer.parseInt(l[i].trim());
                array[row][i] = Integer.parseInt(l[i].trim());
            }
            row++;

            Arrays.sort(triangle);
            System.out.println(++x + Arrays.toString(triangle));

            if (triangle[0] + triangle[1] > triangle[2]) {
                ans++;
            }

            System.out.println("Part A: " + ans);
        }


            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 1908; j+=3) {
                    triangleB[0] = array[j][i];
                    triangleB[1] = array[j+1][i];
                    triangleB[2] = array[j+2][i];
                    System.out.println(Arrays.toString(triangleB));

                    Arrays.sort(triangleB);
                    if (triangleB[0] + triangleB[1] >triangleB[2]){
                        ansB++;
                        System.out.println("OK "+ ansB);
                    }
                }

            }
        System.out.println("Part B: " + ansB);

        }


    }

