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
        Map<Integer, Guard> map = new HashMap<>();

        int currentGuardNo = 0;
        String previousDay = "";
        String previousTime = "";

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
                String time = tmp[0].split(" ")[1];

                char c = tmp[1].charAt(0);

                switch (c) {
                    case 'G':
                        String[] x = tmp[1].split(" ");
                        currentGuardNo = Integer.parseInt(x[1].substring(1));
                        if (!map.containsKey(currentGuardNo)) {
                            Guard guard = new Guard(currentGuardNo);
                            map.put(currentGuardNo, guard);
                        }
                        previousDay = day;
                        previousTime = time;
                        break;

                    case 'f': // falls asleep
                        Guard guard = map.get(currentGuardNo);
                        int work = 0;
                        if (previousDay.equals(day)) {
                            work = Integer.parseInt(time.substring(time.length() - 2)) - Integer.parseInt(previousTime.substring(previousTime.length() - 2));
                        } else
                        {

                        }

                        guard.workingTime += work;

                        break;

                    case 'w':
                        Guard guard1 = map.get(currentGuardNo);
                        int sleep = 0;
                        if (previousDay.equals(day)) {
                            sleep = Integer.parseInt(time.substring(time.length() - 2)) - Integer.parseInt(previousTime.substring(previousTime.length() - 2));
                        } else
                        {

                        }
                        guard1.asleepTime += sleep;
                        break;

                    default: break;
                }

                previousDay = day;
                previousTime = time;


            }

            System.out.println("guard 10 asleep: " + map.get(10).asleepTime +" working: " + map.get(10).workingTime );


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    static class Guard {
        int no;
        int asleepTime;
        int workingTime;

        public Guard (int no){
            this.no = no;
            asleepTime =0;
            workingTime = 0;
        }

    }

}
