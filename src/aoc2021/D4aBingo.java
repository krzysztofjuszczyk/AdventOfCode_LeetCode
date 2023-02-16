package aoc2021;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

public class D4aBingo {
    public static void main(String[] args) {
        int result = 0;
        Set<Card> set = new HashSet<>();

        try {
            BufferedReader br = new BufferedReader(new FileReader("src/aoc2021/inputs/d4.txt"));
            String line = br.readLine();
            String[] tmp = line.split(",");
            int[] cmds = new int[tmp.length];

            for (int i = 0; i < tmp.length; i++) {
                cmds[i] = Integer.parseInt(tmp[i]);
            }

            line = br.readLine();
            while (line!=null){
                line = br.readLine();
                Card card = new Card();

                for (int i = 0; i < 5; i++) {
                    String[] cardLineTMP = line.trim().split("\\s+");

                    for (int j = 0; j < 5; j++) {
                        int x = Integer.parseInt(cardLineTMP[j]);
                        card.values[i][j]= x;
                        card.valuesLeft.add(x);
                    }
                    line = br.readLine();
                }
                set.add(card);
            }

            // END of creating set of cards
            // start of checking results

            for (int number :
                    // we check numbers
                    cmds) {
                    // in each card
                for (Card c :
                        set) {
                    if (c.valuesLeft.contains(number)){
                        c.mark(number);
                        if (c.isBingo){
                            result = c.calculateResult() * number;
                            System.out.println(result);
                        }

                    }
                }
            }


        } catch (IOException e) {
            e.printStackTrace();
        }




    }
}
class Card {
    int[][] values = new int[5][5];
    int[][] results = new int [5][5];
    Set<Integer> valuesLeft = new HashSet<>();
    boolean isBingo;

    public int calculateResult() {
        int result = 0;
        for (int x :
                valuesLeft) {
            result += x;
        }
        return result;
    }

    public void mark(int number) {
       valuesLeft.remove(number);
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
            if (values[i][j] == number){
                results[i][j] = 1;
                checkRow(i);
                checkColumn(j);
            }
            }
        }

    }

    private void checkRow(int x) {
        int sum = 0;
        for (int i = 0; i < 5; i++) {
            sum += results[x][i];
        }
        if (sum == 5) {
            isBingo = true;
        }
    }

    private void checkColumn(int x) {
        int sum = 0;
        for (int i = 0; i < 5; i++) {
            sum += results[i][x];
        }
        if (sum == 5) {
            isBingo = true;
        }

    }

}
