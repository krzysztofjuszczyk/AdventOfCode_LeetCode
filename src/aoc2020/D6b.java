package aoc2020;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

public class D6b {
    public static void main(String[] args) throws FileNotFoundException {
        BufferedReader br = new BufferedReader(new FileReader("src/aoc2020/inputs/d6.txt"));
        int result = 0;
        int groupCount = 0;
        int groupSize = 0;
        int no = 1;
        Set<Character> characterSet = new HashSet<>();
        try {
            String line = br.readLine();
            while (line != null){

                // new group of clients
                if (line.isEmpty()){
                    if (groupSize == 1) {
                        result += groupCount;
                    }
                    else {
                        System.out.println("group " + no + ": " + groupCount);
                        groupCount = commonElements();
                        result += groupCount;
                        groupCount = 0;
                        characterSet.clear();
                        no++;
                    }
                }

                for (int i = 0; i < line.length(); i++) {
                    char current = line.charAt(i);
                    if (!characterSet.contains(current)){
                        characterSet.add(current);
                        groupCount++;
                    }
                }

                line = br.readLine();
            }

            System.out.println("RESULT: " + result);







        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
