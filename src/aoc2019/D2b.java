package aoc2019;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class D2b {
    public static void main(String[] args) throws FileNotFoundException {
        BufferedReader br = new BufferedReader(new FileReader("src/aoc2019/inputs/d2.txt"));
        try {
            String line = br.readLine();
            String[] array = line.split(",");
            int[] original = new int[array.length];
            for (int i = 0; i < array.length; i++) {
                original[i] = Integer.parseInt(array[i]);
            }
//            int noun = a[1];
//            int verb = a[2];

            for (int i = 0; i <100; i++) {
                for (int j = 0; j < 100; j++) {
                    int[] a = Arrays.copyOf(original,original.length);

                    a[1] = i;
                    a[2] = j;

                    int x = 0;
                    int cmd = a[x];

                    while (cmd != 99) {
                        int where = a[x+3];

                        switch (cmd) {
                            case 1:
                                a[where] = a[a[x+1]] + a[a[x+2]];
                                break;
                            case 2:
                                a[where] = a[a[x+1]] * a[a[x+2]];
                                break;

                        }

                        x += 4;
                        cmd = a[x];

                    }
                    int output = a[0];
                    System.out.println("i:" + i + ", j:"+ j + ", output: " + output);

                    if (output == 19690720) {
                        System.out.println("result: " + (100*a[1] + a[2]));
                        System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
                        i=100; // to break the loop
                        j = 100;


                    }
                }
            }


        } catch (IOException e) {
            e.printStackTrace();
        }


    }


}

