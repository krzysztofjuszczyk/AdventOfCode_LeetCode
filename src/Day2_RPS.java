import java.util.HashMap;
import java.util.Map;

public class Day2_RPS {
        Map<Character,Integer> map = new HashMap<>();
    int draw = 3;
    int loose = 0;
    int win = 6;

        public void createMap(){
            map.put('A', 1);
            map.put('B', 2);
            map.put('C', 3);
            map.put('X', 1);
            map.put('Y', 2);
            map.put('Z', 3);
        }

      Map<String, Integer> results = new HashMap<>();
        public void createResults (){
            results.put("A X", draw + map.get('X'));
            results.put("A Y", win + map.get('Y'));
            results.put("A Z", loose + map.get('Z'));

            results.put("B X", loose + map.get('X'));
            results.put("B Y", draw + map.get('Y'));
            results.put("B Z", win + map.get('Z'));

            results.put("C X", win + map.get('X'));
            results.put("C Y", loose + map.get('Y'));
            results.put("C Z", draw + map.get('Z'));
        }

    Map<String, Integer> results2 = new HashMap<>();
    public void createResults2 (){
        results2.put("A X", loose + map.get('Z'));
        results2.put("A Y", draw + map.get('X'));
        results2.put("A Z", win + map.get('Y'));

        results2.put("B X", loose + map.get('X'));
        results2.put("B Y", draw + map.get('Y'));
        results2.put("B Z", win + map.get('Z'));

        results2.put("C X", loose+ map.get('Y'));
        results2.put("C Y", draw + map.get('Z'));
        results2.put("C Z", win + map.get('X'));
    }



//    public static int myScore (char opponent, char my) {
//        return 0;
//    }
}
