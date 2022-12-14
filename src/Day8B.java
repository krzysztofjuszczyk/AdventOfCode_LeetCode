import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class Day8B {
    public static void main(String[] args) throws FileNotFoundException {
        //visible trees

        BufferedReader reader = new BufferedReader(new FileReader("src/inputs/day8.txt"));
        int row = 0;


        try {
            // creating 2D array from input;
            String line = reader.readLine();
            int rows = 99;
            int max = 0;
            int columns = line.length();
            int[][] tree = new int[rows][columns];

            while (line != null) {

                // converting into array of integers
                for (int j = 0; j < columns; j++) {
                    tree[row][j] = (line.charAt(j)) - '0';
                }
                row++;
                line = reader.readLine();
            }

            // print array
            Arrays.stream(tree).forEach((i) -> {
                Arrays.stream(i).forEach((j) -> System.out.print(j + " "));
                System.out.println();
            });
            System.out.println();

            for (int i = 1; i < rows - 1; i++) {
                for (int j = 1; j < columns - 1; j++) {
                    // checking values for every tree;
                    int height = tree[i][j];
                    int value = 1;
                    int vLeft = 1;
                    int vRight = 1;
                    int vUp = 1;
                    int vDown = 1;
                    // value Right
                    for (int k = j + 1; k < columns-1; k++) {
                        if ( height > tree[i][k]) {
                            vRight++;
                        } else break;
                    }
                    // value Left
                    for (int k = j - 1; k > 0; k--) {
                            if (height > tree[i][k]) {

                                vLeft++;
                        } else break;
                    }
                        // value Up
                        for (int l = i - 1; l > 0; l--) {
                            if (height > tree[l][j]) {
                                vUp++;
                            } else break;
                        }

                        // value Down
                        for (int m = i + 1; m < rows-1; m++) {
                            if (height > tree[m][j]) {
                                vDown++;
                            } else break;
                        }

                        value = vLeft * vRight * vUp * vDown;
                    System.out.println(tree[i][j] + ":"+value);
                        if (value > max){ max = value;}

                    }
                }


            System.out.println(max);

            } catch(IOException e){
                e.printStackTrace();
            }
        }

    }
