package aoc2022;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class Day8 {
    public static void main(String[] args) throws FileNotFoundException {
        //visible trees

        BufferedReader reader = new BufferedReader(new FileReader("src/aoc2022/inputs/day8.txt"));
        int row = 0;


        try {
            // creating 2D array from input;
            String line = reader.readLine();
            int rows = 99;
            int columns = line.length();
            int[][] inputArray = new int[rows][columns];
            int [][] resultsArray = new int [rows][columns];
            int [][] resultsLRArray = new int [rows][columns];
            int [][] resultsUDArray = new int [rows][columns];

            while (line != null) {
                // converting into array of integers
                for (int j = 0; j < columns; j++) {
                    inputArray[row][j] = (line.charAt(j)) - '0';
                }
                row++;
                line = reader.readLine();
            }

            // print array
            Arrays.stream(inputArray).forEach((i) -> {
                Arrays.stream(i).forEach((j) -> System.out.print(j + " "));
                System.out.println();
            });
            System.out.println();



            resultsArray = markVisible(inputArray);

            // mark outer trees as visible
            for (int j = 0; j < columns; j++) {
                resultsArray[0][j] = 1;
                resultsArray[rows-1][j] = 1;
            }
            for (int i = 0; i < rows-1; i++){
                resultsArray[i][0] = 1;
                resultsArray[i][columns-1] = 1;
            }
            Arrays.stream(resultsArray).forEach((i) -> {
                Arrays.stream(i).forEach((j) -> System.out.print(j + " "));
                System.out.println();
            });

            System.out.println("Visible trees inside the forest: " + count2DArray(resultsArray));

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

    private static int[] markVisibleFromLeftOrRight(int[] line){
        int maxHeight = line[0];
        int[] result = new int[line.length];

        int indexOfLastLeft = 0;
        // from left
        for (int i = 1; i <line.length-1; i++) {
            if (line[i] > maxHeight){
                result[i] = 1;
                maxHeight = line[i];
                indexOfLastLeft = i;
            }
        }
        // now from right

        maxHeight = line[line.length-1];
        for (int i = line.length-2; i >indexOfLastLeft ; i--) {
            if (line[i] > maxHeight){
                result[i]++;
                maxHeight = line[i];
            }
        }
        return result;
    }

    private static int[][] markVisible(int[][] array){
        // must be rectangular array
        int rows = array.length;
        int columns = array[0].length;
        int[][] result = new int[rows][columns];

        // mark visible from left
        for (int i = 1; i < rows-1; i++) {
            int maxHeight = array[i][0];
            int indexOfLastLeft = 0;
            // from left
            for (int j = 1; j < columns - 1; j++) {
                if (array[i][j] > maxHeight) {
                    result[i][j] = 1;
                    maxHeight = array[i][j];
                    indexOfLastLeft = j;
                }
            }
            // now from right

            maxHeight = array[i][columns - 1];
            for (int j = columns - 2; j > indexOfLastLeft; j--) {
                if (array[i][j] > maxHeight) {
                    result[i][j] = 1;
                    maxHeight = array[i][j];
                }
            }
        }

        // mark visible from top
        for (int j = 1; j < rows - 1; j++) {
            int maxHeight = array[0][j];
            int indexOfLastTop = 0;
            for (int i = 1; i < rows -1; i++) {
                if (array[i][j] > maxHeight){
                    result[i][j] = 1;
                    maxHeight = array[i][j];
                    indexOfLastTop = i;
                }
            }
            // mark visible from down
            maxHeight = array[rows-1][j];
            for (int i = rows -2; i >indexOfLastTop ; i--) {
                if (array[i][j] > maxHeight){
                    result[i][j] = 1;
                    maxHeight = array[i][j];
                }
            }

        }

        return result;
    }


    private static int count2DArray (int [][] array){
        int result = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                if (array[i][j] != 0){
                    result += array[i][j];
                }
            }
        }
        return result;
    }


}

