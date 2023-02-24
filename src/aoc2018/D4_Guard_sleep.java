package aoc2018;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

//[1518-11-01 00:00         / Guard #10 begins shift
//[1518-11-01 00:05] falls asleep
//[1518-11-01 00:25] wakes up

public class D4_Guard_sleep {
    public static void main(String[] args) {
        String line;
        int currentGuardNo = 0;
        Map<Integer, Guard> map = new HashMap<>();

        try {
            BufferedReader br = new BufferedReader(new FileReader("src/aoc2018/inputs/d4test.txt"));
            while ((line = br.readLine()) != null){
                //sort



                String [] tmp = line.split("]");
                tmp[1] = tmp[1].trim();
//                String[] cmds = new String[6];
//                cmds[0] = tmp[0].split(" ")[0];
//                cmds[1] = tmp[0].split(" ")[1];
                String day = tmp[0].split(" ")[0];
                String hour = tmp[0].split(" ")[1];

                char c = tmp[1].charAt(0);

                switch (c) {
                    case 'G':
                        String [] x = tmp[1].split(" ");
                        currentGuardNo = Integer.parseInt(x[1].substring(1));
                        if (!map.containsKey(currentGuardNo)){
                            Guard guard = new Guard(currentGuardNo);
                            map.put(currentGuardNo, guard);
                        }
                        break;

                    case 'f':

                        break;

                    case 'w':

                        break;

                    default: break;
                }




            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    static class Guard {
        int no;
        int asleep;
        int wake;

        public Guard (int no){
            this.no = no;
            asleep =0;
            wake = 0;
        }

    }

}
