package leetCode.easy;

import java.util.HashMap;

public class L13_RomanToInteger {
    public static void main(String[] args) {
        System.out.println(romanToInt("MCMXCIV"));
    }
    public static int romanToInt(String s) {
        int result = 0;
        int curValue = 0;
        int prevValue = 0;
        HashMap <Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        for (int i = s.length()-1; i >=0 ; i--) {
            curValue = map.get(s.charAt(i));
            if (curValue<prevValue){
                result -= curValue;
            }
            else result+=curValue;
            prevValue = curValue;

        }

        return result ;
    }
}
