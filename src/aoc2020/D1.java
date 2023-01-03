package aoc2020;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

public class D1 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("src/aoc2020/inputs/d1.txt"));
        String line = reader.readLine();
        Set<Integer> set = new HashSet();

        while (line!= null){
            int no = Integer.parseInt(line);
            set.add(no);
//// part A
//            if (no>350){
//                set.add(no);
//            }
//                else {
//                int remainder = 2020 - no;
//                if (set.contains(remainder)) {
//                    System.out.println(no + " * " + remainder + " = " + (no*remainder));
//                }
//
//
//            }
            line = reader.readLine();
        }
//part 2
        for (int x      : set
             ) {
            for (int y: set
                 ) {
                int remainder = 2020 - x - y;
                if (set.contains(remainder)){
                    System.out.println(x + "*" + y+ "*" + remainder + " = " + (x*y*remainder));
                }
            }
        }

    }
}
