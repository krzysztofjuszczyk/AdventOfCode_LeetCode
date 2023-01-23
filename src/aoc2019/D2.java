package aoc2019;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class D2 {
    public static void main(String[] args) throws FileNotFoundException {
        BufferedReader br = new BufferedReader(new FileReader("src/aoc2019/inputs/d2.txt"));
        try {
            String line = br.readLine();
            String[] array = line.split(",");
            int[] a = new int[array.length];
            for (int i = 0; i < array.length; i++) {
                a[i] = Integer.parseInt(array[i]);
            }
            a[1] = 12;
            a[2] = 2;

            int i = 0;
            int cmd = a[i];

            while (cmd != 99) {
                int where = a[i+3];

                    switch (cmd) {
                        case 1:
                            a[where] = a[a[i+1]] + a[a[i+2]];
                            break;
                        case 2:
                            a[where] = a[a[i+1]] * a[a[i+2]];
                            break;

                    }

                    i += 4;
                    cmd = a[i];

            }
            System.out.println(a[0]);
        } catch (IOException e) {
            e.printStackTrace();
        }


    }


}

