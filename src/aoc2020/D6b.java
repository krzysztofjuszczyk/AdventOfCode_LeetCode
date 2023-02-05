package aoc2020;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

public class D6b {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("src/aoc2020/inputs/d6.txt"));
        boolean groupCreated = false;
        Set<Character> tmpSet = new HashSet<>();
        int result = 0;
        int no =1;
        Set<Character> commonElements = new HashSet<>();
        try {
            String line = br.readLine();
            while (line != null) {
                // end of GROUP
                if (line.isEmpty()) {
                    result += commonElements.size();
                    System.out.println("group " + no + " Elements: " + commonElements);
                    no++;
                    commonElements.clear();
                    groupCreated = false;
                    line = br.readLine();
                    continue;
//
                }
                tmpSet.clear();

                for (char c : line.toCharArray()) {
                    tmpSet.add(c);
                }

                if (commonElements.isEmpty() && !groupCreated) {
                    commonElements.addAll(tmpSet);
                    groupCreated = true;
                }
                else {
                    commonElements.retainAll(tmpSet);
                }


                line = br.readLine();
                }

            System.out.println("RESULT: " + result);


            // BAD results: 4380

        } catch(IOException ioException){
            ioException.printStackTrace();
        }}



}
