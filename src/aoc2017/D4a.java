package aoc2017;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

public class D4a {
    public static void main(String[] args) {
        String line = "";
        int result = 0 ;
        boolean isValid = true;
        Set<String> set= new HashSet<>();
        try {
            BufferedReader br = new BufferedReader(new FileReader("src/aoc2017/inputs2017/d4.txt"));

            while ((line = br.readLine()) != null){
                isValid = true;
                String[] l = line.split(" ");
                for (String pass :
                        l) {
                    if(set.contains(pass)){
                        isValid = false;
                    }
                    set.add(pass);
                }

                if (isValid){
                    result++;
                }
                set.clear();
                    }


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(result);

    }
}
