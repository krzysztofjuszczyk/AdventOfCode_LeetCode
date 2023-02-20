package aoc2018;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class D2 {
    public static void main(String[] args) {
        try {
            int checksum = 0;
            int twos = 0;
            int threes = 0;
            Map<Character, Integer> map = new HashMap<>();
            BufferedReader reader = new BufferedReader(new FileReader("src/aoc2018/inputs/d2.txt"));
            String line;
            while ((line = reader.readLine()) != null) {
                for (int i = 0; i < line.length(); i++) {
                    char ch = line.charAt(i);
                    if (map.containsKey(ch)) {
                        int val = map.get(ch);
                        map.put(ch, ++val);
                    } else {
                        map.put(ch, 1);
                    }
                }
                // line mapped
                // checking count
                boolean already2 = false;
                boolean already3 = false;

                for (int count :
                        map.values()) {
                    if (count == 2 && !already2) {
                        ++twos;
                        already2 = true;
                        continue;
                    }

                if (count == 3 && !already3) {
                    ++threes;
                    already3 = true;
                    continue;
                }

            }
            map.clear();


        }
        checksum = twos * threes;
        System.out.println("checksum: " + checksum);

    } catch(
    FileNotFoundException e)

    {
        e.printStackTrace();
    } catch(
    IOException e)

    {
        e.printStackTrace();
    }
}
}
