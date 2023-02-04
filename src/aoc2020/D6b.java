package aoc2020;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

public class D6b {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("src/aoc2020/inputs/d6.txt"));
        int result = 0;
        int groupSize = 0;
        int no = 1;
        Set<Character> tmpSet = new HashSet<>();
        Set<Character> tmp2Set = new HashSet<>();
        Set<Character> commonElements = new HashSet<>();
        Set<Character> soloSet = new HashSet<>();
        try {
            String line = br.readLine();
            while (line != null) {
                // end of GROUP
                if (line.isEmpty()) {
                    if (groupSize == 1) {
                        result += soloSet.size();
                        soloSet.clear();

                    } else {
                        System.out.println("group " + no + " Elements: " + commonElements);
                        soloSet.clear();
                        result += commonElements.size();
                        groupSize = 0;

                        commonElements.clear();
                        no++;
                    }
                }

                groupSize++;
                tmpSet.clear();
                for (char c : line.toCharArray()) {
                    tmpSet.add(c);
                }

                if (groupSize == 1) {
                    for (char c : line.toCharArray()) {
                        soloSet.add(c);
                    }

                } else if (groupSize == 2) {
                    commonElements = findCommonElements(soloSet, tmpSet);

                } else {
                    tmp2Set.clear();
                    for (char ch : commonElements) {
                        tmp2Set.add(ch);
                    }
                    commonElements.clear();
                    commonElements = findCommonElements(tmp2Set, tmpSet);
                }




                line = br.readLine();

            }

            System.out.println("RESULT: " + result);


    } catch(IOException ioException){
        ioException.printStackTrace();
    }}

    public static Set<Character> findCommonElements(Set<Character> set1, Set<Character> set2) {
        Set<Character> result = new HashSet<>();
        for (Character s :
                set1) {
            if (set2.contains(s)) {
                result.add(s);
            }
        }
        return result;
    }

}
