package aoc2017;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class D2 {
    public static void main(String[] args) {
        String line = "";
        int result = 0 ;

        try {
            BufferedReader br = new BufferedReader(new FileReader("src/aoc2017/inputs2017/d2.txt"));

            while ((line = br.readLine()) != null){
                String[] l = line.split("\t");
                int max = 0;
                int min = 10000;
                for (String value :
                        l) {
                    value = value.trim();
                    int v = Integer.parseInt(value);
                    max = (v>max)? v : max;
                    min = (v<min)? v : min;
                }
                result += (max - min);

            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(result);

    }
}
