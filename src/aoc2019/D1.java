package aoc2019;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class D1 {
    public static void main(String[] args) throws FileNotFoundException {
        BufferedReader br = new BufferedReader(new FileReader("src/aoc2019/inputs/d1.txt"));
        int result =0;


        try {
            String line = br.readLine();
            while (line!=null){
                System.out.println("LINE:" + line);
                int tmp = Integer.parseInt(line);
                while (tmp > 6){
                    tmp = tmp / 3 -2;
                    System.out.println(result + " + " + tmp + " = " + (result+tmp));
                    result += tmp;

                }

                line = br.readLine();
            }



        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println(result);
    }
}
