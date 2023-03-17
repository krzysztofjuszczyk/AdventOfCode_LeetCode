package aoc2017;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class D2a {
    public static void main(String[] args) {
        String line = "";
        int result = 0 ;

        try {
            BufferedReader br = new BufferedReader(new FileReader("src/aoc2017/inputs2017/d2.txt"));

            while ((line = br.readLine()) != null){
                String[] l = line.split("\t");

                for (int i = 0; i < l.length; i++) {
                    for (int j = 0; j < l.length; j++) {
                        int a = Integer.parseInt(l[i]);
                        int b = Integer.parseInt(l[j]);
                        if (a!=b && a%b==0){
                            System.out.println(a + " / " + b + " = " + (a/b));
                            result += (a/b);
                        }
                    }

                }
                }




        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(result);

    }
}
