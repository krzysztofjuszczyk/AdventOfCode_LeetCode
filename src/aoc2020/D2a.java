package aoc2020;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class D2a {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("src/aoc2020/inputs/d2.txt"));
        String line = reader.readLine();
        int result = 0;
        int resultB = 0;

        while (line!= null){
            String [] l = line.split(" ");

            String[] l1 = l[0].split("-");
            int from = Integer.parseInt(l1[0]);
            int to = Integer.parseInt(l1[1]);
            int indexA = from-1;
            int indexB = to-1;

            int howMany = 0;

            char c = l[1].charAt(0);
            for (int i = 0; i < l[2].length(); i++) {
                if (l[2].charAt(i) == c){
                    howMany++;
                }
            }
            if (howMany>=from && howMany<=to){
                result++;
            }
            if ((l[2].charAt(indexA) == c) ^ (l[2].charAt(indexB) == c)){
                resultB++;
            }

            line = reader.readLine();
        }
        System.out.println("valid passwords: "+ result);
        System.out.println("valid passwords B: "+ resultB);
//part 2
   }
}
