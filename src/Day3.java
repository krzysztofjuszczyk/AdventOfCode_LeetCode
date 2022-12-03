import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

public class Day3 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("src/day3.txt"));
        String line = reader.readLine();
        int sum =0;
        int c = 1;
        Set <Character> set = new HashSet<>();
        Set <Character> potentialBadges = new HashSet<>();
        char badge =' ';
        while (line!=null) {
                //  //A
//            System.out.print(findRepeatedChar(line));
//            System.out.println(priorityValue(findRepeatedChar(line)));
//            sum+= priorityValue(findRepeatedChar(line));
//
//            line = reader.readLine();

            //find badge = common in 3
            if (c%3 == 1){
                set.clear();
                for (var ch : line.toCharArray()
                        ) {
                    set.add(ch);
                }
            } //dodajemy do setu

            //szukamy wspólnych
            if (c%3 == 2){
                potentialBadges.clear();
                for (var ch : line.toCharArray()
                ) {
                   if (set.contains(ch)) potentialBadges.add(ch);
                }
            }

            if (c%3 == 0){
                for (var ch : line.toCharArray()
                ) {
                    if (potentialBadges.contains(ch)) {
                        badge = ch;
                        System.out.println("badge: " + badge);
                        sum += priorityValue(badge);
                        break;
                    };
                }
            }
            c++;
            line = reader.readLine();
        }
        System.out.println(sum);

    }

    public static char findRepeatedChar (String str){
        Set<Character> half = new HashSet <>();
        for (int i = 0; i < str.length()/2; i++) {
            half.add(str.charAt(i));
        }

        for (int i = str.length()/2; i < str.length(); i++) {
            if (half.contains(str.charAt(i))) {
                return str.charAt(i);
            }
        }
        return ' ';
    }

    public static int priorityValue (char ch){  //wartości zgodnie z zadaniem
        if (ch >=97){       // małę litery
            return ch-96;
        }
        else
            return ch-38;

    }

}
