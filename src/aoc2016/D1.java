package aoc2016;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

import static java.lang.Math.abs;

public class D1 {
    public static void main(String[] args) {
        List<String> instructions = new ArrayList<>();
        Set<Point> visited = new HashSet<>();
        Point starting = new Point(0,0);
        visited.add(starting);
//        String[] directions = new String[]{"N", "E", "S", "W"}; // 0, 1, 2, 3
        int x =0;
        int y = 0;
        int currentDir = 0;
        try {
            BufferedReader br = new BufferedReader(new FileReader("src/aoc2016/inputs2016/d1.txt"));
            String line = br.readLine();
            String[] l = line.split(", ");
            instructions = Arrays.stream(l).toList();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        for (String i :
                instructions) {
            char turn = i.charAt(0);
            int howManyTimes = Integer.parseInt(i.substring(1));

            if (turn=='L'){
                currentDir = (currentDir==0)? 3 : --currentDir;
            }
            else{
                currentDir = (currentDir==3)? 0 : ++currentDir;
            }

            for (int j = 0; j < howManyTimes; j++) {
                switch (currentDir) {
                case 0:
                    ++y;
                    break;
                case 1:
                    ++x;
                    break;
                case 2:
                    --y;
                    break;
                case 3:
                    --x;
                    break;
            }
            Point p = new Point(x,y);
                if (visited.contains(p)){
                    System.out.println("already visited point: "+ p.x + " " + p.y);
                    System.out.println("distance:" + (abs(x) + abs(y)));
                    break;
                } else visited.add(p);
            }


//            //version counting only end points
//            switch (currentDir) {
//                case 0:
//                    y += howManyTimes;
//                    break;
//                case 1:
//                    x += howManyTimes;
//                    break;
//                case 2:
//                    y -= howManyTimes;
//                    break;
//                case 3:
//                    x -= howManyTimes;
//                    break;
//            }
//            Point p = new Point(x,y);


        }
        int result = abs(x) + abs(y);
        System.out.println(result);

    }

    static class Point{
        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Point point = (Point) o;
            return x == point.x && y == point.y;
        }

        @Override
        public int hashCode() {
            return Objects.hash(x, y);
        }

        int x;
        int y;
        Point(int x, int y ){
            this.x = x;
            this.y = y;
        }
    }
}
