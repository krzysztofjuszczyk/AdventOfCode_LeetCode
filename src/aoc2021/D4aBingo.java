package aoc2021;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class D4aBingo {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new FileReader("src/aoc2021/inputs/d4.txt"));
            String line = br.readLine();
            String[] tmp = line.split(",");
            int[] cmds = new int[tmp.length];

            for (int i = 0; i < tmp.length; i++) {
                cmds[i] = Integer.parseInt(tmp[i]);
            }

            br.readLine();
            while (line!=null){
                if (line.isEmpty()){
                    // new card
                }
            }


        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
