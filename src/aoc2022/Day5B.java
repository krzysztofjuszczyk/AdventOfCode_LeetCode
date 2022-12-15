package aoc2022;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Stack;

public class Day5B {
        public static void main(String[] args) throws FileNotFoundException {
            BufferedReader reader = new BufferedReader(new FileReader("src/aoc2022/inputs/day5.txt"));
            Stack<Character>[] stacks = new Stack[9];
            Stack<Character>[] stacksTmp;
            stacksTmp = new Stack[9];
            for (int i = 0; i < 9; i++) {
                stacksTmp[i] = new Stack<Character>();
                stacks[i] = new Stack<Character>();
            }


            String line = null;
            try {
                line = reader.readLine();
                while (line != null && line != " 1   2   3   4   5   6   7   8   9 ") {
                    // creating initial (reversed) stacks
                    var line2 = line.toCharArray();
                    if (line2[1] == '1') {
                        break;
                    }

                    for (int i = 0; i < 9; i++) {
                        var item = line2[1 + (4 * i)];
                        stacksTmp[i].push(item);
                    }
                    line = reader.readLine();
                }
                line = reader.readLine();
                line = reader.readLine();


                //reverse to get initial stack
                for (int j = 0; j < 8; j++) {
                    for (int i = 0; i < 9; i++) {
                        var item2 = stacksTmp[i].pop();
                        if (item2 != ' ') {
                            stacks[i].push(item2);
                        }
                    }
                }


                while (line != null) {

                    // instrukcje
                    //move 3 from 4 to 6
                    String[] instr = line.split(" ");
                    int howManyTimes = Integer.parseInt(instr[1]);
                    int from = (Integer.parseInt(instr[3])) - 1;
                    int to = (Integer.parseInt(instr[5])) - 1;

                    // ile razy

                    char[] tmpArray = new char[howManyTimes];
                    for (int i = 0; i < howManyTimes; i++) {
                        tmpArray[i] = stacks[from].pop();
                    }
                    for (int i = 0; i < howManyTimes; i++) {
                        stacks[to].push(tmpArray[tmpArray.length-1-i]);
                    }

                    line = reader.readLine();
                }
            } catch (IOException ioException) {
                ioException.printStackTrace();
            }

            System.out.println("RESULT part 2:");
            for (int i = 0; i < 9; i++) {
                System.out.print(stacks[i].peek());
            }
        }
    }
