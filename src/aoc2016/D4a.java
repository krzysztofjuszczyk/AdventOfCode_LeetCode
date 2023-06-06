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

            int roomCode = Integer.parseInt(tmp2[0]);
            String verification = tmp2[1];
//            System.out.println(roomCode + " " + verification);
            StringBuilder combined = new StringBuilder();
            for (int i = 0; i < split.length - 1; i++) {
                String a = split[i];
                combined.append(a);
            }

            String combinedString = combined.toString();
            StringBuilder checksum = new StringBuilder();

            for (int j = 0; j < combinedString.length(); j++) {
                    char c = combinedString.charAt(j);

                    if (!map.containsKey(c)){
                        map.put(c, 1);
                    } else {
                        map.put(c, map.get(c) +1);
                    }
                }

            ArrayList<Integer> listOfOccurencies = new ArrayList<>();
            LinkedHashMap<Character, Integer> sortedMap = new LinkedHashMap<>();

            for (Map.Entry<Character, Integer> entry : map.entrySet()) {
                listOfOccurencies.add(entry.getValue());
            }
            Collections.sort(listOfOccurencies);
            Collections.reverse(listOfOccurencies);

            for (int num : listOfOccurencies) {
                StringBuilder checksumForAGivenNoOfOccurences = new StringBuilder();
                for (Map.Entry<Character, Integer> entry : map.entrySet()) {
                    if (entry.getValue().equals(num)) {
                        if(sortedMap.containsKey(entry.getKey())){
                           continue;
                        } else {
                            sortedMap.put(entry.getKey(), num);
                            checksumForAGivenNoOfOccurences.append(entry.getKey());
                        }
                    }
                }
                char[] chars = checksumForAGivenNoOfOccurences.toString().toCharArray();
                Arrays.sort(chars);
                checksum.append(chars);
                checksumForAGivenNoOfOccurences.setLength(0);
            }
            System.out.println(sortedMap);
            System.out.println(checksum);
            String firstFive = checksum.substring(0, Math.min(checksum.length(), 5));
//sorted linked map in descending order


            if (firstFive.equals(verification)){
                ans+= roomCode;
            }
        }
        System.out.println(ans);
    }
}
