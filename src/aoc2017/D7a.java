package aoc2017;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import java.util.*;

public class D7a    {
    public static void main(String[] args) throws FileNotFoundException {
        BufferedReader reader = new BufferedReader(new FileReader("src/aoc2017/inputs2017/d7test.txt"));
        String line = "";
        ArrayList<String> lines = new ArrayList();
        ArrayList<String> candidates = new ArrayList();
        Map<String, Integer> map = new HashMap<>();


            try {
                while ((line= reader.readLine()) != null){
                    lines.add(line);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
//        lines.forEach((n) -> System.out.println(n));

//        fwft (72) -> ktlj, cntj, xhth
//        qoyq (66)

//        while (!lines.isEmpty()){
        int size = lines.size();
        for (int i = 0; i < size ; i++) {

            String[] data= lines.get(i).split(" ");
            String key = data[0];

                if (lines.get(i).contains("->")){
                    if (map.containsKey(key)){

                    }
                    continue;
                }

                int val = Integer.parseInt(data[1].substring(1, data[1].length()-1));
                map.put(key,val);
                lines.remove(i--);
                size--;

            }
            System.out.println("map");


//            }
        }
        }
