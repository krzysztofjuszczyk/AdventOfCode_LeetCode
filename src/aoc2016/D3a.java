package aoc2016;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class D3a {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("src/aoc2016/inputs2016/d3.txt"));
        String line;
        int ans =0;
        int [] triangle = new int[3];
        int x= 0;

        while (( line=reader.readLine()) != null){
            String l[] = line.trim().split("  ");
            for (int i = 0; i < 3; i++) {
                if (l[i] == ""){        // in case there were more than 2 spaces
                    l[i] = l[i+1];
                }
                triangle[i]= Integer.parseInt(l[i].trim());
            }
            Arrays.sort(triangle);
            System.out.println(++x + Arrays.toString(triangle));
            if (triangle[0] + triangle[1] >triangle[2]){
                ans++;
            }
            System.out.println(ans);

        }


    }
}
