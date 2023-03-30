package aoc2017;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class D6a {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        int l = 16;
        int[] array = new int[l];
        int cycle = 0;

        try {
            BufferedReader reader = new BufferedReader(new FileReader("src/aoc2017/inputs2017/d6.txt"));
            String line = reader.readLine();
            String[] values = line.split("\t");
            int i = 0;
            for (String v :
                    values) {
                array[i++] = Integer.parseInt(v);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        set.add(Arrays.toString(array));


        String representation = "";

        // find largest element and remember its index
        while (!set.contains(representation)) {
            set.add(representation);
            int max = array[0];
            int index = 0;

            for (int i = 1; i < l; i++) {
                if (array[i] > max) {
                    max = array[i];
                    index = i;
                }
            }
            array[index] = 0;
            // distribute evenly max times
            for (int i = 0; i < max; i++) {
                array[(index + 1 + i) % l] += 1;
            }
            cycle++;

            representation = Arrays.toString(array);




        }
        System.out.println("no of cycles: " + cycle);

        //part B
        set.clear();
        cycle = 0;
        while (!set.contains(representation)) {
            set.add(representation);
            int max = array[0];
            int index = 0;

            for (int i = 1; i < l; i++) {
                if (array[i] > max) {
                    max = array[i];
                    index = i;
                }
            }
            array[index] = 0;
            // distribute evenly max times
            for (int i = 0; i < max; i++) {
                array[(index + 1 + i) % l] += 1;
            }
            cycle++;

            representation = Arrays.toString(array);




        }
        System.out.println("no of cycles: " + cycle);

    }




}
