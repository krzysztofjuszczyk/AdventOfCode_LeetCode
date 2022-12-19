package aoc2021;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class D2 {
    public static void main(String[] args) throws FileNotFoundException {
        BufferedReader reader = new BufferedReader(new FileReader("src/aoc2021/inputs/d2.txt"));
        try {
            int depth = 0;
            int forward = 0;
            String line = reader.readLine();
            while (line != null){
                String[] cmd = line.split(" ");
                if (cmd[0].equals("forward")){
                    forward += Integer.parseInt(cmd[1]);
                }
                else if (cmd[0].equals("up")){
                    depth -= Integer.parseInt(cmd[1]);
                }
                else if (cmd[0].equals("down")){
                    depth += Integer.parseInt(cmd[1]);
                }
                System.out.println(forward+" " + depth);
                line = reader.readLine();
            }
            System.out.println(depth*forward);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
