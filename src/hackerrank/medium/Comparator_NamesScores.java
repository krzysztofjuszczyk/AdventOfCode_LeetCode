package hackerrank.medium;

import java.util.Comparator;

public class Comparator_NamesScores {
    class Checker implements Comparator<Player> {
        @Override
        public int compare(Player p1, Player p2) {
            if (p1.score > p2.score){return -1;}
            else if (p1.score<p2.score){return 1;}
            else {
                return (p1.name.compareTo(p2.name));
            }

        }
    }

    class Player{
        String name;
        int score;

        Player(String name, int score){
            this.name = name;
            this.score = score;
        }
    }

}
