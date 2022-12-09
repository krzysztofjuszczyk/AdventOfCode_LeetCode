import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class Day8 {
    public static void main(String[] args) throws FileNotFoundException {
        //visible trees
        BufferedReader reader = new BufferedReader(new FileReader("src/inputs/test8.txt"));

//        BufferedReader reader = new BufferedReader(new FileReader("src/inputs/day8.txt"));
        int row = 0;
        int visible = 0;

//        int[] test0 = {3,2,3,4,1,6,0,5,1,2};
//        int[] test1 = {1,2,3,4,8,7,0,5,1,2};
//        System.out.println(howManyVisibleFromLeftOrRight(test0));
//        System.out.println(howManyVisibleFromLeftOrRight(test1));

        try {
            // creating 2D array from input;
            String line = reader.readLine();
            int rows = 5;
            int columns = line.length();
            int[][] inputArray = new int[rows][columns];

            while (line != null) {
                for (int j = 0; j < columns; j++) {
                    inputArray[row][j] = (line.charAt(j)) - '0';
                }
                row++;
                line = reader.readLine();
            }

            Arrays.stream(inputArray).forEach((i) -> {
                Arrays.stream(i).forEach((j) -> System.out.print(j + " "));
                System.out.println();
            });

            // check each row for how many are visible from L / R
            int visFromLeftOrRight = 0;


            for (int i = 1; i < rows - 1; i++) {
                   visFromLeftOrRight += howManyVisibleFromLeftOrRight(inputArray[i]);
                }

            int visibleOuter = 2 * columns + 2 * row - 4;
            visible = visibleOuter + visFromLeftOrRight ;
            System.out.println("Visible trees inside the forest: " + visFromLeftOrRight);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //excluding first and last position
    private static int howManyVisibleFromLeftOrRight(int[] line){
        int maxHeight = line[0];
        int result = 0;
        int indexOfLastLeft = 0;
        // from left
        for (int i = 1; i <line.length-1; i++) {
            if (line[i] > maxHeight){
                result++;
                maxHeight = line[i];
                indexOfLastLeft = i;
            }
        }
        // now from right

        maxHeight = line[line.length-1];
        for (int i = line.length-2; i >indexOfLastLeft ; i--) {
            if (line[i] > maxHeight){
                result++;
                maxHeight = line[i];
            }
        }
            return result;
    }



}

