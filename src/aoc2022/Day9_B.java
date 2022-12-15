package aoc2022;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;

public class Day9_B {
    LinkedList<Node> snake = new LinkedList<>();

    static class Node{
        int r;
        int c;
        Node (int r, int c){
            this.r = r;
            this.c = c;
        }
        public String toString (){
            return r + ","+ c;
        }

        private void move (char cmd){
            if (cmd == 'U') {
                r -= 1;
            }
            else if (cmd=='D'){
                r += 1;
            }
            else if (cmd == 'L'){
                c -= 1;
            }
            else if (cmd == 'R'){
                c += 1;
            }
            else return;
        }

        private void moveCloser (Node node) {
            String move;
            // check
            // horizontally
            if (node.r == r) {
                c = (c + node.c) / 2;
            }

            // vertically
            else if (node.c == c) {
                r = (r + node.r) / 2;
            }

            // diagonally
            else {
                // vertical diag.
                if (Math.abs(r - node.r) > Math.abs(c - node.c)) {
                    r = (r + node.r) / 2;
                    c = node.c;
                } else {
                    // horiz.diag
                    c = (c + node.c) / 2;
                    r = node.r;
                }
            }
        }

        private boolean isTooFar (Node node){

            if (node.r> r+1 || node.r < r-1
                    || node.c > c+1 || node.c < c-1) return true;
            else return false;
        }
    }


    public static void main(String[] args) {
        Day9 day9 = new Day9();
        LinkedList <int[][]> coordinates = new LinkedList<>();
        int rows = 1000;
        int columns = 1000;
        int result = 0;
        Node head = new Node(500,500);
        Node tail = new Node(500,500);
        int[][] resultsArray = new int[rows][columns];




        try {
            BufferedReader reader = new BufferedReader(new FileReader("src/aoc2022/inputs/day9.txt"));
            String line = reader.readLine();

            while (line != null){
                String []  lineA = line.split(" ");
                char cmd = line.charAt(0);
                int x = Integer.parseInt(lineA[1]);

                // MOVING x times

                for (int i = 0; i < x; i++) {
                    head.move(cmd);
                    if (head.isTooFar(tail)) {
                        tail.moveCloser(head);
                    }
                    // if visited by tail
                    if (resultsArray[tail.r][tail.c] == 0){
                        resultsArray[tail.r][tail.c] = 1;
                    }
                }
//                switch (cmd){
//
//                    case 'U':
//                        for (int i = 0; i < x; i++) {
//
//                        }
//                        break;
//
//                    case 'D':
//                        break;
//
//                    case 'R':
//                        break;
//
//                    case 'L':
//                        break;
//                }

                line = reader.readLine();
            }



        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        //calculate visited by tail
        for (int i = 0; i < rows; i++) {
            System.out.println();
            for (int j = 0; j < columns; j++) {
                System.out.print(resultsArray[i][j]);
                result += resultsArray[i][j];
            }
        }
        System.out.println();
        System.out.println("visited by tail:" + result);


    }




}
