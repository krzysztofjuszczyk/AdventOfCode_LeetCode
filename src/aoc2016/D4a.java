package aoc2016;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class D4a {
    public static void main(String[] args) throws IOException {

        int ans = 0;
        List<String> lines = Files.readAllLines(Path.of("src/aoc2016/inputs2016/d4.txt"));

        for (String line : lines
                ) {
            Map<Character, Integer> map = new HashMap<>();
            String[] split = line.split("-");
            String tmp = split[split.length-1];
            tmp = tmp.substring(0,tmp.length()-1);
            String [] tmp2 = tmp.split("\\[");

            int code = Integer.parseInt(tmp2[0]);
            String verification = tmp2[1];
//            System.out.println(code + " " + verification);

            for (int i = 0; i < split.length - 1; i++) {
                String a = split[i];
                for (int j = 0; j < a.length(); j++) {
                    char c = a.charAt(j);
                    if (!map.containsKey(c)){
                        map.put(c, 1);
                    } else {
                        map.put(c, map.get(c) +1);
                    }
                }
            }

            for (Map.Entry<Character,Integer> entry   : map.entrySet()
                    ) {

            }





        }

    }
}
