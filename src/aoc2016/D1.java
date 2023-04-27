package aoc2016;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static java.lang.Math.abs;

public class D1 {
    public static void main(String[] args) {
        List<String> instructions = new ArrayList<>();
//        String[] directions = new String[]{"N", "E", "S", "W"}; // 0, 1, 2, 3
        int x =0;
        int y = 0;
        int currentDir = 0;
        try {
            BufferedReader br = new BufferedReader(new FileReader("src/aoc2016/inputs2016/d1.txt"));
            String line = br.readLine();
            String[] l = line.split(", ");
            instructions = Arrays.stream(l).toList();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        for (String i :
                instructions) {
            char turn = i.charAt(0);
            int howManyTimes = Integer.parseInt(i.substring(1));

            if (turn=='L'){
                currentDir = (currentDir==0)? 3 : --currentDir;
            }
            else{
                currentDir = (currentDir==3)? 0 : ++currentDir;
            }

            switch (currentDir) {
                case 0:
                    y += howManyTimes;
                    break;
                case 1:
                    x += howManyTimes;
                    break;
                case 2:
                    y -= howManyTimes;
                    break;
                case 3:
                    x -= howManyTimes;
                    break;
            }
        }
        int result = abs(x) + abs(y);
        System.out.println(result);

    }
}
