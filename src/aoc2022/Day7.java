package aoc2022;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Stack;

public class Day7 {
    /*
    public static void main(String[] args) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader("src/aoc2022/inputs/day7.txt"));
            String line = reader.readLine();
            Stack<String> path = new Stack<>();
            path.push("/");
            int size;


            while (line !=null){
                String [] cmd = line.split(" ");
                //
                if (cmd[0] == "$" && cmd[1]== "ls"){
                    line = reader.readLine();   // czyt nastepna
                    cmd = line.split(" ");
                    while (cmd[0] != "$"){
                        if (cmd[0] == "dir"){

                        }
                        else {
                            size += cmd[0];

                        }
                    }
                    size = Integer.parseInt(cmd[0]);


                }
                if (cmd[0] == "$" && cmd[1]== "cd" && cmd[2] == ".."){
                    path.pop();
                    // create a tree
                }

                line = reader.readLine();
            }




        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static String[] readCmds(String line){
        return line.split(" ");
    }
    */
}
