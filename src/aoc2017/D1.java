package aoc2017;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class D1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader("src/aoc2017/inputs2017/d1.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        String line = br.readLine();
        int l = line.length();
        int x = l/2;
        int result = 0;
//        if (line.charAt(0) == line.charAt(line.length()-1)) { result += line.charAt(0) - 48;
//        }

        for (int i = 0; i < l; i++) {

            char cur = line.charAt(i);
            char next = line.charAt((i+x)%l);
            if (cur == next){
                int valCur = cur - 48;
                result += valCur;
            }
        }

        System.out.println(result);
    }
}
