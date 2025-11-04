package hackerrank.medium;

import java.util.*;

public class ScheduleMaxMeetingsCorrect {
    public class Solution {

        public int countMeetings(List<Integer> firstDay, List<Integer> lastDay) {
            List<Investor> investors = new ArrayList<>();

            // Tworzymy listę inwestorów
            for (int i = 0; i < firstDay.size(); i++) {
                investors.add(new Investor(firstDay.get(i), lastDay.get(i)));
            }

            // Sortowanie: najpierw po firstDay, potem po lastDay
            Collections.sort(investors);

            Set<Integer> days = new HashSet<>();
            int ans = 0;

            // Przechodzimy po inwestorach
            for (Investor inv : investors) {
                for (int day = inv.firstDay; day <= inv.lastDay; day++) {
                    // Jeśli dzień jest wolny, umawiamy spotkanie
                    if (!days.contains(day)) {
                        days.add(day);
                        ans++;
                        break; // wychodzimy z pętli, inwestor dostał termin
                    }
                }
            }

            return ans;
        }

        static class Investor implements Comparable<Investor> {
            int firstDay;
            int lastDay;

            public Investor(int firstDay, int lastDay) {
                this.firstDay = firstDay;
                this.lastDay = lastDay;
            }

            @Override
            public int compareTo(Investor o) {
                if (this.firstDay == o.firstDay) {
                    return Integer.compare(this.lastDay, o.lastDay);
                }
                return Integer.compare(this.firstDay, o.firstDay);
            }
        }
    }
}
