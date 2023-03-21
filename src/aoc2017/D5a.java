package aoc2017;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class D5a {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        try {
            BufferedReader reader = new BufferedReader(new FileReader("src/aoc2017/inputs2017/d5.txt"));
            String line = "";
            while ((line = reader.readLine()) !=null){
                int value = Integer.parseInt(line);
                list.add(value );
            }


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        int maxIndex = list.size() - 1;
        int i = 0;
        int result = 0;
        while (i <= maxIndex) {
            int curValue = list.get(i);
            list.set(i, curValue+1);
            i = i+ curValue;

            result++;
        }
        System.out.println(result);
    }

}

