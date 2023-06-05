package aoc2016;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;

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
            StringBuilder combined = new StringBuilder();
            for (int i = 0; i < split.length - 1; i++) {
                String a = split[i];
                combined.append(a);
            }

            String combinedString = combined.toString();

            for (int j = 0; j < combinedString.length(); j++) {
                    char c = combinedString.charAt(j);

                    if (!map.containsKey(c)){
                        map.put(c, 1);
                    } else {
                        map.put(c, map.get(c) +1);
                    }
                }

            ArrayList<Integer> list = new ArrayList<>();
            LinkedHashMap<Character, Integer> sortedMap = new LinkedHashMap<>();

            for (Map.Entry<Character, Integer> entry : map.entrySet()) {
                list.add(entry.getValue());
            }
            Collections.sort(list);
            for (int num : list) {
                for (Map.Entry<Character, Integer> entry : map.entrySet()) {
                    if (entry.getValue().equals(num)) {
                        sortedMap.put(entry.getKey(), num);
                    }
                }
            }
            System.out.println(sortedMap);
//sorted linked map in ascending order - now to reverse it

            List<Character> allKeys = new ArrayList<>(sortedMap.keySet());
            // reverse order of keys
            Collections.reverse(allKeys);
            //build a checksum
            StringBuilder checksum = new StringBuilder();
            for(Character strKey : allKeys){
                checksum.append(strKey);
            }
            checksum.toString();





        }

    }
}
