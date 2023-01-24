package aoc2019;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class D3 {
    public static void main(String[] args) throws FileNotFoundException {
        BufferedReader br = new BufferedReader(new FileReader("src/aoc2019/inputs/d3.txt"));
        try {
            int minDist = Integer.MAX_VALUE;
            int startRow = 10000;
            int startCol = 10000;
            String line = br.readLine();
            String[] c1 = line.split(",");
            line = br.readLine();
            String[] c2 = line.split(",");

            int[][] array = new int[30000][30000];
//            int[][] array = new int[10  ][11];


            for (int x = 0; x < 2; x++) {
                int row = startRow;
                int col = startCol;
                String [] cmd = c1;

                if (x == 1){cmd = c2;}
                for (int i = 0; i < cmd.length; i++) {

                    char command = cmd[i].charAt(0);
                    int steps = Integer.parseInt(cmd[i].substring(1));
                    for (int j = 0; j < steps; j++) {

                        switch (command) {
                            case 'R':
                                array[row][++col] += 1;
                                if (array[row][col] == 2) {
                                    //calculate Manhattan distance
                                    int dist = Math.abs(row - startRow) + Math.abs(col - startCol);
                                    System.out.println("row:"+ row + ", col: " + col + ", dist: " + dist);

                                    if (dist< minDist){minDist = dist;}

                                }
                                break;

                            case 'L':
                                array[row][--col] += 1;
                                if (array[row][col] == 2) {
                                    //calculate Manhattan distance

                                    int dist = Math.abs(row - startRow) + Math.abs(col - startCol);
                                    System.out.println("row:"+ row + ", col: " + col + ", dist: " + dist);
                                    if (dist< minDist){minDist = dist;}

                                }
                                break;

                            case 'U':
                                array[--row][col] += 1;
                                if (array[row][col] == 2) {
                                    //calculate Manhattan distance
                                    int dist = Math.abs(row - startRow) + Math.abs(col - startCol);
                                    System.out.println("row:"+ row + ", col: " + col + ", dist: " + dist);

                                    if (dist< minDist){minDist = dist;}

                                }
                                break;

                            case 'D':
                                array[++row][col] += 1;
                                if (array[row][col] == 2) {
                                    //calculate Manhattan distance
                                    int dist = Math.abs(row - startRow) + Math.abs(col - startCol);
                                    System.out.println("row:"+ row + ", col: " + col + ", dist: " + dist);

                                    if (dist< minDist){minDist = dist;}

                                }
                                break;

                            default:
                                break;
                        }
                    }
                }

            }

            //print arrays
//            for (int i = 0; i < array.length; i++) {
//                for (int j = 0; j < array[0].length; j++) {
//                    System.out.print(array[i][j]);
//                }
//                System.out.println();
//            }
            System.out.println(minDist);



        } catch (IOException e) {
            e.printStackTrace();
        }

    }




}

