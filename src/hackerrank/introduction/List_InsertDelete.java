package hackerrank.introduction;

import java.util.ArrayList;
import java.util.Scanner;

public class List_InsertDelete {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList<>();
        int n = sc.nextInt();
        for (int i = 0; i<n ; i++){
            arr.add(sc.nextInt());
        }

        int q = sc.nextInt();
        // System.out.println(q);
        //query
        for (int i = 0; i < q; i++) {
            String s = sc.next();
            // System.out.println(s);
            switch(s){
                case "Insert"  :
                    int x = sc.nextInt();
                    int y = sc.nextInt();
                    arr.add(x, y);
                    break;
                case "Delete":
                    int ind = sc.nextInt();
                    arr.remove(ind);
                    break;
            }
        }

        for (int i = 0; i < arr.size(); i++) {
            System.out.print(arr.get(i) + " ");
        }

    }
}
