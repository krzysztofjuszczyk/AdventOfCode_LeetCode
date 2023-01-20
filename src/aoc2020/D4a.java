package aoc2020;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class D4a {
    private static class InnerObj {
        HashMap <String, String> fields = new HashMap();
//        String byr, iyr, eyr, hgt, hcl, ecl, pid, cid;
    }
    public static void main(String[] args) throws FileNotFoundException {
        BufferedReader bf = new BufferedReader(new FileReader("src/aoc2020/inputs/d4.txt"));

        int validPassportsNo = 0;
        Set <InnerObj> people = new HashSet<>();
        String line;

//        Set <String> fields = new HashSet();
//        Set <String> fieldsObj = new HashSet();
//        fields.add("byr");
//        fields.add("iyr");
//        fields.add("eyr");
//        fields.add("hgt");
//        fields.add("hcl");
//        fields.add("ecl");
//        fields.add("pid");
//        fields.add("cid"); //optional field

        InnerObj person = new InnerObj();

        try {

        while ((line = bf.readLine()) != null) {

            if (line.isEmpty()){
                // new object
                people.add(person);
                System.out.println("NEW OBJ");
                person = new InnerObj();

//                fieldsObj.clear();
                line = bf.readLine();
            }

            String[] lines = line.split(" ");
            for (
                    String s:lines
                 ) {
                System.out.println(s);
                String[] data = s.split(":");
                person.fields.put(data[0],data[1]);
            }
        }
        }
    catch (
    IOException e) {
        e.printStackTrace();
    }

        for (InnerObj p :
                people) {
            if (isValid(p)){
                ++validPassportsNo;
            }
        }
        System.out.println("number of valid passports: " + validPassportsNo);
// sth is wrong - number is too LOW by 1;
}

    private static boolean isValid(InnerObj p) {
        if ((p.fields.containsKey("byr")) && (p.fields.containsKey("iyr")) &&
                (p.fields.containsKey("eyr")) && (p.fields.containsKey("hgt")) &&
                (p.fields.containsKey("hcl")) && (p.fields.containsKey("ecl")) &&
                (p.fields.containsKey("pid")) ) return true;
//            byr, iyr, eyr, hgt, hcl, ecl, pid
        return false;
    }
}
