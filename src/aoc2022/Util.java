package aoc2022;

import java.util.*;

public class Util {

    public static int findIndexOfFirstRepeatable (String input){
        List<Character> characterList = new ArrayList<>();
        int index=-1;
        for (char ch:input.toCharArray()
        ) {
            index++;
            if (!characterList.contains(ch)){
                characterList.add(ch);
            }
            else{
                return index;
            }
        }
        return -1;
    }

    public static char findFirstRepeatable (String input){
        List<Character> characterList = new ArrayList<>();
        for (char ch:input.toCharArray()
        ) {
            if (!characterList.contains(ch)){
                characterList.add(ch);
            }else {
            return  ch;}
        }
        return Character.MIN_VALUE;
    }


    // do POPRAWY bo przekracza input.length
    public static int day6IndexAfterNNonrepeat (String  input, int howMany){
        int index = 0;
        int tmpIndex = 0;
        int count =0;
        Set<Character> set = new HashSet<>();

        for (int i   = 0; i < input.length(); i++) {
            for (char ch :
                    input.substring(i,i+howMany).toCharArray()) {
                set.add(ch);
            }
            if (set.size() == howMany) return i+howMany;
            else set.clear();
        }

        return -1;
    }
}
