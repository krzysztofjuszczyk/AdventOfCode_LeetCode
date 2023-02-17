package aoc2018;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

public class D1 {
    public static void main(String[] args) {
        try {
            int[] cmds = new int[957];
            BufferedReader br = new BufferedReader(new FileReader("src/aoc2018/inputs/d1.txt"));
            String line = br.readLine();
            int result=0;
            Set<Integer> set = new HashSet<>();

            int l = 0;
            while (line != null) {
                int x = Integer.parseInt(line);
                cmds[l++] = x;
                result += x;
                System.out.println("line " + (l - 1) + " " + result);
                if (set.contains(result)) {
                    System.out.println("reached AAA: " + result);
                } else {
                    set.add(result);
                }

                line = br.readLine();
            }


            System.out.println("FIRST LOOP " + result);
            for (int i = 0; i < cmds.length; i++) {
                result += cmds[i];
                System.out.println("i: "+ i + " cmd: " + cmds[i] + " result: " + result);
                if (set.contains(result)){
                    System.out.println("reached twice: "+ result);
                    break;
            }
            set.add(result);
                if (i== 956){
                    i = -1;
                }

            }



        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
