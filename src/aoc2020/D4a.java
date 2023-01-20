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
        if (containsAllFields(p) &&
        byrValid(p)    && iyrValid(p)     && eyrValid(p)  &&
        hgtValid(p)     && hclValid(p)      && eclValid(p) && pidValid(p)) return true;

        else return false;
    }

    private static boolean containsAllFields(InnerObj p) {
        return (p.fields.containsKey("byr")) && (p.fields.containsKey("iyr")) &&
                (p.fields.containsKey("eyr")) && (p.fields.containsKey("hgt")) &&
                (p.fields.containsKey("hcl")) && (p.fields.containsKey("ecl")) &&
                (p.fields.containsKey("pid"));
    }

    private static boolean byrValid(InnerObj p) {
        String x = p.fields.get("byr");
        if ((x.length()==4) && (Integer.parseInt(x)>=1920) && (Integer.parseInt(x)<=2002))
            return true;
        return false;
    }
    private static boolean iyrValid(InnerObj p) {
        String x = p.fields.get("iyr");
        if ((x.length()==4) && (Integer.parseInt(x)>=2010) && (Integer.parseInt(x)<=2020))
            return true;
        return false;

    }
    private static boolean eyrValid(InnerObj p) {
        String x = p.fields.get("eyr");
        if ((x.length()==4) && (Integer.parseInt(x)>=2020) && (Integer.parseInt(x)<=2030))
            return true;
        return false;

    }

    private static boolean hgtValid(InnerObj p) {
        String x = p.fields.get("hgt");
        String last2 = x.substring(x.length()-2);
        String height = x.substring(0, x.length()-2);

        if ( last2.equals("cm")
            && Integer.parseInt(height)>=150 && Integer.parseInt(height)<=193)
            return true;

        if (last2.equals("in") &&
        Integer.parseInt(height)>=59 && Integer.parseInt(height)<=76)
            return true;

        return false;

    }
    private static boolean hclValid(InnerObj p) {
        String x = p.fields.get("hcl");
        if (x.matches("#[0-9a-f]{6}"))return true;
        return false;
    }
    private static boolean eclValid(InnerObj p) {
        String x = p.fields.get("ecl");
        if (x.equals("amb") || x.equals("blu") || x.equals("brn") ||
                x.equals("gry") ||x.equals("grn") ||x.equals("hzl") ||x.equals("oth") ) return true;
        return false;
    }

    private static boolean pidValid(InnerObj p) {
        String x = p.fields.get("pid");
        if (x.length() == 9) return true;
        return false;
    }

}
