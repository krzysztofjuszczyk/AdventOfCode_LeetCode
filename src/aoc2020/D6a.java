package aoc2020;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

public class D6a {
    public static void main(String[] args) throws FileNotFoundException {
        BufferedReader br = new BufferedReader(new FileReader("src/aoc2020/inputs/d6.txt"));
    int result = 0;
    int groupCount = 0;
    int no = 1;
    Set<Character> characterSet = new HashSet<Character>();
        try {
            String line = br.readLine();
            while (line != null){

                // new group of clients
                if (line.isEmpty()){
                    result += groupCount;
                    System.out.println("group " + no + ": " + groupCount);
                    groupCount = 0;
                    characterSet.clear();
                    no++;
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
