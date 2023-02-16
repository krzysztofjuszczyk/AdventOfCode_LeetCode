package aoc2021;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

public class D4b {
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
                    if (!c.isBingo && (c.valuesLeft.contains(number))){
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
