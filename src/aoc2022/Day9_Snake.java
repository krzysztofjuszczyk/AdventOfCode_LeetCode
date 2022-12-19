package aoc2022;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Day9_Snake {
    ArrayList<Node> snake = new ArrayList<>();

    static class Node {
        int r;
        int c;

        final char name;
        private static int counter;

        Node(int r, int c) {
            name = (char) (counter + 65);
            counter++;
            this.r = r;
            this.c = c;

        }

        public String toString() {
            return r + "," + c;
        }

        private void move(char cmd) {
            if (cmd == 'U') {
                r -= 1;
            } else if (cmd == 'D') {
                r += 1;
            } else if (cmd == 'L') {
                c -= 1;
            } else if (cmd == 'R') {
                c += 1;
            } else return;
        }

//        private void moveCloser(Node node) {
//            // horizontally
//            if (node.r == r) {
//                c = (c + node.c) / 2;
//            }
//
//            // vertically
//            else if (node.c == c) {
//                r = (r + node.r) / 2;
//            }
//
//            // diagonally
//            else {
//                // vertical diag.
//                if (Math.abs(r - node.r) > Math.abs(c - node.c)) {
//                    r = (r + node.r) / 2;
//                    c = node.c;
//                } else {
//                    // horiz.diag
//                    c = (c + node.c) / 2;
//                    r = node.r;
//                }
//            }
//        }

        //        private boolean isTooFar(Node node) {
//
//            if (node.r > r + 1 || node.r < r - 1
//                    || node.c > c + 1 || node.c < c - 1) return true;
//            else return false;
//        }
//    }
        private void follow(Node node) {
            this.c = node.c;
            this.r = node.r;
        }
    }

//    public static void main(String[] args) {
//        List<Node> snake = new LinkedList<>();
//        int totalNodes = 10;
//        int startingRow = 20;
//        int startingCol = 12;
//        int rows = 30;
//        int columns = 30;
//        int result = 0;
//        Node head = new Node(startingRow, startingCol);
//        snake.add(head);
//        int[][] resultsArray = new int[rows][columns];
//
//        try {
//            BufferedReader reader = new BufferedReader(new FileReader("src/aoc2022/inputs/test9.txt"));
//            String line = reader.readLine();
//
//            while (line != null) {
//                String[] lineA = line.split(" ");
//                char cmd = line.charAt(0);
//                int x = Integer.parseInt(lineA[1]);
//
//                // we set 10 segments starting at the same points after each other
//                // MOVING HEAD x times
//
//                for (int i = 0; i < x; i++) {
//                    char[][] currentView = new char[rows][columns];
//                    Node tmpNode = snake.add(head);
//                    head.move(cmd);
////                    currentView[head.r][head.c] = head.name;
//
//                    if (Node.counter < totalNodes) {
//                        snake.add(new Node(startingRow, startingCol));
//                    }
//
//                    // each time the whole snake moves;
//                    for (int j = 0; j < snake.size() - 1; j++) {
//                        Node front = tmpNode;
//                        Node back = snake.get(j + 1);
//                        currentView[front.r][front.c] = front.name;
////                        currentView[back.r][back.c] = back.name;
//
//
//
//                        // if visited by tail
//                        if (back.name == 'J') {
//                            if (resultsArray[back.r][back.c] == 0) {
//                                resultsArray[back.r][back.c] = 1;
//                            }
//                        }
//
//                    }
//                    // printing current state
//                    for (int k = 0; k < rows; k++) {
//                        System.out.println();
//                        for (int l = 0; l < columns; l++) {
//
//                            System.out.print(currentView[k][l]);
//                        }
//                    }
//                    System.out.println();
//                    System.out.println();
//                    System.out.println();
//
//                }
//
//                line = reader.readLine();
//            }
//
//
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//
//        //calculate visited by tail
//        for (int i = 0; i < rows; i++) {
//            System.out.println();
//            for (int j = 0; j < columns; j++) {
//                System.out.print(resultsArray[i][j]);
//                result += resultsArray[i][j];
//            }
//        }
//        System.out.println();
//        System.out.println("visited by tail:" + result);
//
//
//    }
}


