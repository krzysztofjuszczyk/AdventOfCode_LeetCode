package aoc2017;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import java.util.*;

public class D7a    {
    static Map<String, Tower> map;


    public static void main(String[] args) throws FileNotFoundException {
        BufferedReader reader = new BufferedReader(new FileReader("src/aoc2017/inputs2017/d7.txt"));
        String line = "";
        ArrayList<String> lines = new ArrayList();
        ArrayList<String> candidates = new ArrayList();
         map = new HashMap<>();


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
//        int size = lines.size();
//        for (int i = 0; i < size ; i++) {
//            if (lines.get(i).contains("->")){
//                candidates.add(lines.get(i));
//                continue;
//            }
//            String[] data= lines.get(i).split(" ");
//            String key = data[0];
//
//                int val = Integer.parseInt(data[1].substring(1, data[1].length()-1));
//                map.put(key,val);
//                lines.remove(i--);
//                size--;
//
//            }
        int size = lines.size();
            while (!lines.isEmpty()) {
                for (int i = 0; i < size; i++) {
                    String[] data = lines.get(i).split(" ");
                    String name = data[0];
                    int val = Integer.parseInt(data[1].substring(1, data[1].length() - 1));
                    boolean removable = true;

                    //if doesnt' exist create new
                    if (!map.containsKey(name)) {
                        Tower tower = new Tower(name, val);
                        map.put(name, tower);
                    }

                    if (lines.get(i).contains("->")) {

                        for (int j = 3; j < data.length; j++) {
                            String childName = data[j].replace(",", "");
                            if (!map.get(name).children.contains(childName)) {
                                map.get(name).children.add(childName);
                            }
                            // watch out for recursion -child might not be in map yet
                            if (!map.containsKey(childName)) {
                                removable = false;
                                break;
                            } else {
                                map.get(childName).parent = name;
                            }
                        }
                    }


                    if (removable) {
                        lines.remove(i--); // remove a tower from arraylist and decr index to keep on going
                        size--;
                    }
                }
            }
            System.out.println("map of towers created");
        //check which hasn't got any parents
        String result = "";
        for (Map.Entry<String, Tower> entry : map.entrySet()) {
            String k = entry.getKey();
            Tower v = entry.getValue();
            System.out.println("Key: " + k + " Parent: " + v.parent);
            if (v.parent.equals("")) result = k;
        }

        System.out.println();
        System.out.println("RESULT: " + result);


//            }
        }

    static class Tower {
        String name;
        int weight;
        int totalAboveWeight;
        Set<String> children;
        String parent;
        boolean isBalanced;

        public Tower(String name, int weight ) {
            this.weight = weight;
            this.name = name;
            this.children = new HashSet<>();
            this.parent = "";
        }

        public int calculateTotalWeight(){
            for (String child :
                    children) {
                int tmpWeight = map.get(child).weight;
                this.totalAboveWeight += tmpWeight;
            }
            return totalAboveWeight;
        }
        }

}


