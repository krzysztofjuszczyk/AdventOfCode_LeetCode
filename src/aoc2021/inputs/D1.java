package aoc2021.inputs;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class D1 {
    public static void main(String[] args) throws FileNotFoundException {
        BufferedReader reader = new BufferedReader(new FileReader("src/aoc2021/inputs/d1.txt"));
        try {
            int count =0;
            String line = reader.readLine();
            int l1 = Integer.parseInt(line);
            line = reader.readLine();
            while (line != null){
                int l2 = Integer.parseInt(line);
                if (l2>l1){
                    count++;
                }
                l1 = l2;
                line = reader.readLine();
            }
            System.out.println(count);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
