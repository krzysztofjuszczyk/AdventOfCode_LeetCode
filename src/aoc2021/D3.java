package aoc2021;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class D3 {
    public static void main(String[] args) throws FileNotFoundException {
        int[] zeroes = new int[12];
        int[] ones = new int[12];

        BufferedReader reader = new BufferedReader(new FileReader("src/aoc2021/inputs/d3.txt"));
        try {
            String line = reader.readLine();
            while (line!=null){
                System.out.println(line);
                char[] chars = line.toCharArray();
                for (int i = 0; i < 12; i++) {
                    if (chars[i] == '0'){
                        zeroes[i]++;
                    }
                    else ones[i]++;
                }


                line = reader.readLine();
            }
            System.out.println();



        } catch (IOException e) {
            e.printStackTrace();
        }

        String gamma = "";  //most common
        String epsilon = "";
        for (int i = 0; i < 12; i++) {
            if (ones[i] > zeroes[i]){
                gamma += "1";
                epsilon += "0";
            }
            else {
                gamma += "0";
                epsilon += "1";
            }

        }
        System.out.println("gamma:"+ gamma);
        System.out.println("epsilon:"+ epsilon);
        int gammaVal = Integer.parseInt(gamma,2);
        int epsilonVal = Integer.parseInt(epsilon,2);
        int result = gammaVal*epsilonVal;
        System.out.println("result part 1:" + result);



    }
}
