package hackerrank.introduction;

public class TimeConversion {
        public static String timeConversion(String s) {
            int hour = Integer.parseInt(s.substring(0,2)) %12;
            System.out.println(hour);
            if (s.charAt(8)== 'P'){hour += 12;}
            System.out.println(hour);

            return String.format("%02d", hour)+ s.substring(2,8);
        }
    }

