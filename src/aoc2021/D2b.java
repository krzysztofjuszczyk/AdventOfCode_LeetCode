package aoc2021;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class D2b {
    public static void main(String[] args) throws FileNotFoundException {
        BufferedReader reader = new BufferedReader(new FileReader("src/aoc2021/inputs/d2.txt"));
        try {
            int x = 0;
            int depth = 0;
            int horiz = 0;
            int aim = 0;
            String line = reader.readLine();
            while (line != null){
                String[] cmd = line.split(" ");
                x = Integer.parseInt(cmd[1]);

                if (cmd[0].equals("forward")){
                    horiz += x;
                    depth += aim * x;
                }
                else if (cmd[0].equals("up")){
                    aim -= x;
                }
                else if (cmd[0].equals("down")){
                    aim += x;
                }
                System.out.println(horiz+" " + depth);
                line = reader.readLine();
            }
            System.out.println(depth*horiz);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
