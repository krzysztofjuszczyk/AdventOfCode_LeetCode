package hackerrank.medium;

import java.util.*;

public class ScheduleMaxNoOfMeetings {

    public static void main(String[] args) {

            List<String> list = new ArrayList<>();
            list.add("Hello");
            System.out.println(list.size());

    }


    public int countMeetings(List<Integer> firstDay, List<Integer> lastDay){
        int ans = 0;
        List<Investor> investors = new ArrayList<>();
        for (int i = 0; i < firstDay.size(); i++) {
            investors.add(new Investor(firstDay.get(i), lastDay.get(i)));
        }
        Collections.sort(investors);

        // ALTERNATIVE
        Collections.sort(investors, (o1,o2) -> o1.lastDay - o2.lastDay);


//        int day = 1;
//        for (int i = 0; i < firstDay.size(); i++) {
//            if (investors.get(i).firstDay >= day);
//            {
//                day++;
//                ans++;
//            }
//        }


        // INCORRECT VER
        // INCORRECT VER
        // INCORRECT VER
        HashSet<Integer> days = new HashSet<>();
        for (Investor inv: investors){
            if (!days.contains(inv.firstDay)){
                days.add(inv.firstDay);
            } else if (inv.firstDay < inv.lastDay){
                int i = 1;
                do {
                    if(!days.contains(inv.firstDay + i)){
                        days.add(inv.firstDay + i);
                        i++;
                        ans++;
                    }
                } while (inv.firstDay + i < inv.lastDay);
            }
        }
        return ans;
    }
    // INCORRECT VER


    class Investor implements Comparable<Investor>{
        int firstDay;
        int lastDay;

        public Investor(int firstDay, int lastDay) {
            this.firstDay = firstDay;
            this.lastDay = lastDay;
        }

        @Override
        public int compareTo(Investor o) {
            int result;
            if (this.firstDay == o.firstDay){
                result = this.lastDay > o.lastDay ? 1 : -1;
            }
                else result = this.firstDay > o.firstDay ? 1 : -1;
            return result;
        }
    }

}
