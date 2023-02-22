package aoc2018;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class D2 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        try {
            int checksum = 0;
            int twos = 0;
            int threes = 0;
            Map<Character, Integer> map = new HashMap<>();
            BufferedReader reader = new BufferedReader(new FileReader("src/aoc2018/inputs/d2.txt"));
            String line;
            while ((line = reader.readLine()) != null) {
                list.add(line);
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
        System.out.println("PART 1 checksum: " + checksum);
        System.out.println("PART 2");
        int diff = 0;
            for (int i = 0; i < list.size(); i++) {

                String line1 = list.get(i);
                for (int j = 0; j < list.size(); j++) {
                    int difference = 0;
                    if (j == i){continue;}

                    String line2 = list.get(j);
//                    System.out.println(line1 + " " + line2);

                    for (int k = 0; k < 26; k++) {
                        char a = line1.charAt(k);
                        char b = line2.charAt(k);
                        if (a != b ){difference++;
                            diff = k;
                        }
//                        if (difference >1){
//                            break;dfrgtgtgt
//                        }

                        if (k==25 && difference ==1){
                            System.out.println("RESULT 2: " + line1 +" " +  line2 + " diff: " + diff);
                            System.out.println("result chars:");
                            System.out.print(line1.substring(0,diff)+ line1.substring(diff+1));

                        }
                    }
                }
            }


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
