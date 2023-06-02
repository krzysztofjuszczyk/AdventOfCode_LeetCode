package aoc2015;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class D1 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("src/aoc2015/inputs2015/d1.txt"));
        String line = reader.readLine();
        int ans = 0;
        for (int i=0; i<line.length(); i++){

            if(line.charAt(i) == '('){
                ans++;
            } else {
                ans--;
                if (ans==-1){
                    System.out.println("basement: "+ (i+1));
                }
            }
        }
        System.out.println(ans);
    }
}
